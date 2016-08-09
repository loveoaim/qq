package com.scienjus.smartqq.model;

import lombok.Data;

/**
 * 好友
 * @author ScienJus
 * @date 2015/12/18.
 */
@Data
public class Friend {

    private long userId;

    private String markname = "";

    private String nickname;

    private boolean vip;

    private int vipLevel;

    @Override
    public String toString() {
        return "Friend{" +
                "userId=" + userId +
                ", markname='" + markname + '\'' +
                ", nickname='" + nickname + '\'' +
                ", vip=" + vip +
                ", vipLevel=" + vipLevel +
                '}';
    }

    /**
     * userId.
     *
     * @return  the userId
     */
    public long getUserId() {
        return userId;
    }

    /**
     * userId.
     *
     * @param   userId    the userId to set
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * markname.
     *
     * @return  the markname
     */
    public String getMarkname() {
        return markname;
    }

    /**
     * markname.
     *
     * @param   markname    the markname to set
     */
    public void setMarkname(String markname) {
        this.markname = markname;
    }

    /**
     * nickname.
     *
     * @return  the nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * nickname.
     *
     * @param   nickname    the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * vip.
     *
     * @return  the vip
     */
    public boolean isVip() {
        return vip;
    }

    /**
     * vip.
     *
     * @param   vip    the vip to set
     */
    public void setVip(boolean vip) {
        this.vip = vip;
    }

    /**
     * vipLevel.
     *
     * @return  the vipLevel
     */
    public int getVipLevel() {
        return vipLevel;
    }

    /**
     * vipLevel.
     *
     * @param   vipLevel    the vipLevel to set
     */
    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }
    
}
