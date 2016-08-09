/**
 * com.xiaoi.util.XiaoiUtil.java
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日上午10:22:07
*/
package com.xiaoi.util;

import com.eastrobot.ask.sdk.AskRequest;
import com.eastrobot.ask.sdk.AskResponse;
import com.eastrobot.ask.sdk.AskService;
import com.eastrobot.ask.sdk.CloudNotInitializedException;
import com.eastrobot.ask.sdk.CloudServiceFactory;

/**
 * com.xiaoi.util.XiaoiUtil.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日上午10:22:07
 */
public class XiaoiUtil {
    
    
    /**
     * 获得答案的一个服务
     *
     * 2016年8月7日 下午8:23:28
     * @param question
     * @return
     * @author Administrator/zzwen6
     */
    public static String getAnswerService(String question) {
        //智能问答
        AskRequest askRequest = new AskRequest(Constant.appKey, Constant.appSecret, question,
                com.eastrobot.ask.utils.Constant.PRIMARY_TYPE, null, com.eastrobot.ask.utils.Constant.CUSTOM_PLATFORM);
        AskService askService = CloudServiceFactory.getInstance()
                .createAskService();
        askService.init(null);
        AskResponse askResponse = null;
        try {
            askResponse = askService.ask(askRequest);
            return askResponse.getContent().trim();
        } catch (CloudNotInitializedException e) {
            return "看不懂你说什么，sb";
        }
    }
}
