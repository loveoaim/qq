package com.scienjus.smartqq.model;

import lombok.Data;

/**
 * 讨论组成员
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class DiscussUser {

    private long uin;

    private String nick;

    private int clientType;

    private String status;

    @Override
    public String toString() {
        return "DiscussUser{" +
                "uin=" + uin +
                ", nick='" + nick + '\'' +
                ", clientType='" + clientType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

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
     * nick.
     *
     * @return  the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * nick.
     *
     * @param   nick    the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
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
    
}
