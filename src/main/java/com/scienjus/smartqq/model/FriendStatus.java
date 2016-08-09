package com.scienjus.smartqq.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 好友状态
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class FriendStatus {

    private long uin;

    private String status;

    @JSONField(name = "client_type")
    private int clientType;

    /**
     * uin.
     *
     * @return  the uin
     */
    public long getUin() {
        return uin;
    }

    /**
     * uin.
     *
     * @param   uin    the uin to set
     */
    public void setUin(long uin) {
        this.uin = uin;
    }

    /**
     * status.
     *
     * @return  the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * status.
     *
     * @param   status    the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * clientType.
     *
     * @return  the clientType
     */
    public int getClientType() {
        return clientType;
    }

    /**
     * clientType.
     *
     * @param   clientType    the clientType to set
     */
    public void setClientType(int clientType) {
        this.clientType = clientType;
    }

}
