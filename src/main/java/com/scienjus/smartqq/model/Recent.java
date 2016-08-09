package com.scienjus.smartqq.model;

import lombok.Data;

/**
 * 最近会话
 * @author ScienJus
 * @date 2015/12/24.
 */
@Data
public class Recent {

    private long uin;

    //0:好友、1:群、2:讨论组
    private int type;

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
     * type.
     *
     * @return  the type
     */
    public int getType() {
        return type;
    }

    /**
     * type.
     *
     * @param   type    the type to set
     */
    public void setType(int type) {
        this.type = type;
    }

}
