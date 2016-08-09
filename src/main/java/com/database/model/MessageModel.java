package com.database.model;

import java.io.Serializable;

/**
 * com.database.model.MessageModel.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日下午3:38:53
 */
public class MessageModel implements Serializable {
    private String mid;

    private String questionContent;

    private String answerContent;

    public MessageModel() {
    }

    public MessageModel(String mid, String questionContent, String answerContent) {
        super();
        this.mid = mid;
        this.questionContent = questionContent;
        this.answerContent = answerContent;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    /**
     * 
     */
    @Override
    public String toString() {
        return "MessageModel [mid=" + mid + ", questionContent=" + questionContent + ", answerContent=" + answerContent
                + "]";
    }

}
