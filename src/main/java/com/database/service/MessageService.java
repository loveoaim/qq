package com.database.service;

import java.util.List;
import java.util.UUID;

import com.comms.utils.UUIDUtil;
import com.database.dao.MessageDao;
import com.database.model.MessageModel;

/**
 * com.database.service.MessageService.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日下午3:50:13
 */
public class MessageService {
    
    private MessageDao dao;
    
    public MessageService() {
        dao = new MessageDao();
    }
    /**
     * 关键字查询
     *
     * 2016年8月8日 下午6:26:42
     * @param message
     * @return
     * @author Administrator/zzwen6
     */
    public List<MessageModel> findMessageLike(String message){
        return dao.findMessage(message);
    }
    
    /**
     * 新增一个条目
     *
     * 2016年8月8日 下午6:27:00
     * @param message
     * @return
     * @author Administrator/zzwen6
     */
    public boolean saveMessage(MessageModel message){
        if (message.getMid() == null || "".equals(message.getMid())) {
            message.setMid(UUIDUtil.getUUID());
        }
        return dao.saveMessage(message);
        
    }
    
    
}
