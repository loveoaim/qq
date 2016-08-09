package com.scienjus.smartqq.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 讨论组消息
 * @author ScienJus
 * @date 15/12/19.
 */
@Data
public class DiscussMessage {

    private long discussId;

    private long time;

    private String content;

    private long userId;

    private Font font;

    public DiscussMessage(JSONObject json) {
        JSONArray content = json.getJSONArray("content");
        this.font = content.getJSONArray(0).getObject(1, Font.class);
        this.content = content.getString(1);
        this.time = json.getLongValue("time");
        this.discussId = json.getLongValue("did");
        this.userId = json.getLongValue("send_uin");
    }

    /**
     * discussId.
     *
     * @return  the discussId
     */
    public long getDiscussId() {
        return discussId;
    }

    /**
     * discussId.
     *
     * @param   discussId    the discussId to set
     */
    public void setDiscussId(long discussId) {
        this.discussId = discussId;
    }

    /**
     * time.
     *
     * @return  the time
     */
    public long getTime() {
        return time;
    }

    /**
     * time.
     *
     * @param   time    the time to set
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * content.
     *
     * @return  the content
     */
    public String getContent() {
        return content;
    }

    /**
     * content.
     *
     * @param   content    the content to set
     */
    public void setContent(String content) {
        this.content = content;
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
     * font.
     *
     * @return  the font
     */
    public Font getFont() {
        return font;
    }

    /**
     * font.
     *
     * @param   font    the font to set
     */
    public void setFont(Font font) {
        this.font = font;
    }

}
