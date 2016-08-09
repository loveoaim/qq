package com.scienjus.smartqq.model;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

/**
 * 消息.
 *
 * @author ScienJus
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @date 15/12/19.
 */
@Data
public class Message {

    private long time;

    private String content;

    private long userId;

    private Font font;

    public Message(JSONObject json) {
        JSONArray cont = json.getJSONArray("content");
        this.font = cont.getJSONArray(0).getObject(1, Font.class);

        final int size = cont.size();
        final StringBuilder contentBuilder = new StringBuilder();
        for (int i = 1; i < size; i++) {
            contentBuilder.append(cont.getString(i));
        }
        this.content = contentBuilder.toString();

        this.time = json.getLongValue("time");
        this.userId = json.getLongValue("from_uin");
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
