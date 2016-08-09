package com.main.test;

import java.util.List;

import com.database.model.MessageModel;
import com.database.service.MessageService;
import com.scienjus.smartqq.model.Message;

/**
 * com.main.test.SQLTest.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日下午6:28:49
 */
public class SQLTest {

    /**
     *
     * 2016年8月8日 下午6:28:49
     * @param args
     * @author Administrator/zzwen6
    */
    public static void main(String[] args) {
        MessageService service = new MessageService();
        for (int i = 0; i < 20; i++) {
            MessageModel message = new MessageModel(null,"SB","滚");
            service.saveMessage(message);
            
        }
         
    }

}
