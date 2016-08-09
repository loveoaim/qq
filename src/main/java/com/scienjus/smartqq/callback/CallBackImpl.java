/**
 * File Name: com.scienjus.smartqq.callback.CallBackImpl.java
 * 类简述
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月6日下午8:50:16
 * @see (optional) 
 * @Copyright (c) 2016, 广电运通信息科技有限公司  All Rights Reserved.
 */
package com.scienjus.smartqq.callback;

import com.scienjus.smartqq.model.DiscussMessage;
import com.scienjus.smartqq.model.GroupMessage;
import com.scienjus.smartqq.model.Message;

/**
 * File Name: com.scienjus.smartqq.callback.CallBackImpl.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月6日下午8:50:16
 * @see (optional) 
 * @Copyright (c) 2016, 广电运通信息科技有限公司  All Rights Reserved.
 */
public class CallBackImpl implements MessageCallback {

    /**
     * 
     * @see com.scienjus.smartqq.callback.MessageCallback#onMessage(com.scienjus.smartqq.model.Message)
     */
    @Override
    public void onMessage(Message message) {
        // TODO Auto-generated method stub

    }

    /**
     * 
     * @see com.scienjus.smartqq.callback.MessageCallback#onGroupMessage(com.scienjus.smartqq.model.GroupMessage)
     */
    @Override
    public void onGroupMessage(GroupMessage message) {
        // TODO Auto-generated method stub

    }

    /**
     * 
     * @see com.scienjus.smartqq.callback.MessageCallback#onDiscussMessage(com.scienjus.smartqq.model.DiscussMessage)
     */
    @Override
    public void onDiscussMessage(DiscussMessage message) {
        // TODO Auto-generated method stub

    }

}
