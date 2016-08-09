package com.database.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.config.DBUtil;
import com.database.model.MessageModel;

/**
 * com.database.dao.MessageDao.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日下午3:49:51
 */
public class MessageDao {
    
    
    public MessageDao(){
        
    }
    /**
     * 查找有关键字的条目
     *
     * 2016年8月8日 下午3:52:03
     * @return
     * @author Administrator/zzwen6
     */
    public List<MessageModel> findMessage(String message){
        
        String sql = "select * from message where questionContent like concat(concat('%',?),'%')";
        Connection connection = DBUtil.getConn();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<MessageModel> list = new ArrayList<MessageModel>();
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, message);
            resultSet = statement.executeQuery();
            MessageModel m = null;
            while(resultSet.next()){
                m = new MessageModel();
                m.setMid(resultSet.getString("mid"));
                m.setQuestionContent(resultSet.getString("questionContent"));
                m.setAnswerContent(resultSet.getString("answerContent"));
                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    
    public boolean saveMessage(MessageModel message){
        String sql = "insert message (mid,questionContent,answerContent) values (?,?,?)";
        Connection connection = DBUtil.getConn();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setObject(1, message.getMid());
            statement.setObject(2, message.getQuestionContent());
            statement.setObject(3, message.getAnswerContent());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }finally{
            DBUtil.free(statement, connection);
        }
        return true;
        
    }
    
}
