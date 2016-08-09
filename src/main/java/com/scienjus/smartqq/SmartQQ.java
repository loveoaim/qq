package com.scienjus.smartqq;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSON;
import com.comms.utils.RandomUtil;
import com.database.model.MessageModel;
import com.database.service.MessageService;
import com.eastrobot.ask.sdk.AskRequest;
import com.eastrobot.ask.sdk.AskResponse;
import com.eastrobot.ask.sdk.AskService;
import com.eastrobot.ask.sdk.CloudNotInitializedException;
import com.eastrobot.ask.sdk.CloudServiceFactory;
import com.eastrobot.ask.utils.Constant;
import com.scienjus.smartqq.callback.MessageCallback;
import com.scienjus.smartqq.client.SmartQQClient;
import com.scienjus.smartqq.model.Category;
import com.scienjus.smartqq.model.DiscussMessage;
import com.scienjus.smartqq.model.Friend;
import com.scienjus.smartqq.model.Group;
import com.scienjus.smartqq.model.GroupInfo;
import com.scienjus.smartqq.model.GroupMessage;
import com.scienjus.smartqq.model.GroupUser;
import com.scienjus.smartqq.model.Message;
import com.turing.util.PostServer;

/**
 * @author ScienJus
 * @date 2015/12/18.
 */
public class SmartQQ {

    private MessageService service;

    // 不知道这里为什么要用static回调才起作用
    private static SmartQQClient client;

    public SmartQQ() {
        service = new MessageService();
        initQQ();
    }

    private void initQQ() {
        client = new SmartQQClient(new MessageCallback() {
            @Override
            public void onMessage(Message message) {
                System.out.println(message.getUserId() + "-->" + message.getContent());
                 analysisMessageFromPerson(message);
            }

            @Override
            public void onGroupMessage(GroupMessage message) {
                System.out.println(message.getUserId() + "-->" + message.getContent());
//                if (message == ) {
//                    
//                }
                System.out.println(message.getGroupId());
                analysisMessageFromGroup(message);
            }

            @Override
            public void onDiscussMessage(DiscussMessage message) {
            }
        });
        System.out.println("登录成功=========");
        // 登录成功后便可以编写你自己的业务逻辑了
        List<Category> categories = client.getFriendListWithCategory();
        for (Category category : categories) {
            System.out.println(category.getName());
            for (Friend friend : category.getFriends()) {
                System.out.println("————" + friend.getNickname());
            }
        }
        
        
        List<Group> groups = client.getGroupList();
        for (Group group : groups) {
            GroupInfo info = client.getGroupInfo(group.getCode());
            List<GroupUser> users = info.getUsers();
            for (GroupUser groupUser : users) {
                System.out.println(groupUser.toString());
            }
        }
        
        
    }

    /**
     *
     * 2016年8月7日 下午8:24:26
     * 
     * @param message
     * @author Administrator/zzwen6
     */
    private void analysisMessageFromPerson(Message message) {
        String question = message.getContent().trim();
        String result = PostServer.receiveResultFromTuring(question);

        client.sendMessageToFriend(message.getUserId(), JSON.parseObject(result).getString("text"));
    }

    /**
     * 
     * 2016年8月7日 下午5:18:17
     * 
     * @param message
     * @author Administrator/zzwen6
     */
    private void analysisMessageFromGroup(GroupMessage message) {
        String question = message.getContent();
        // 数据库抽取
        if (!chooseRules(question)) {
            // 数据库
            List<MessageModel> lists = service.findMessageLike(question);
            System.out.println(lists.size());
            if (lists != null && lists.size() > 0) {
                // 随机的抽取一个答案
                MessageModel msg = lists.get(RandomUtil.getRandom(lists.size()));
                client.sendMessageToGroup(message.getGroupId(), msg.getAnswerContent());
                return;
                
            }

        }
        // 当数据库没有，或者选定为机器人时，请求机器人
        String result = PostServer.receiveResultFromTuring(question);
        client.sendMessageToGroup(message.getGroupId(), JSON.parseObject(result).getString("text"));

    }

    private boolean analysisMessage(String message) {

        return true;
    }

    private MessageModel getModelFromMessage(String msg) {
        MessageModel model = new MessageModel();
        try {
            String[] strs = StringUtils.split(msg, "#");
            model.setQuestionContent(strs[0]);
            model.setAnswerContent(strs[1]);
            return model;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 是否从智能机器人处获得解答： rules: 以 ！ !开头的限定为机器人
     *
     * 2016年8月8日 下午7:47:11
     * 
     * @param msg
     * @return 为 ｔｕｒｅ 是机器人
     * @author Administrator/zzwen6
     */
    private boolean chooseRules(String msg) {
        // 开头为 ! ！
        if (msg.trim().substring(0, 1).equals("!") || msg.trim().substring(0, 1).equals("！")) {
            return true;
        }
        // 随机数大于31
        if (RandomUtil.getRandom(100) > 31) {
            return true;
        }

        // 其他条件为false;
        return false;
    }

}
