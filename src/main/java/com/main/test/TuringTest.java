/**
 * com.main.test.TuringTest.java
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日上午9:33:28
*/
package com.main.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.turing.util.PostServer;

/**
 * com.main.test.TuringTest.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日上午9:33:28
 */
public class TuringTest {

    /**
     *
     * 2016年8月8日 上午9:33:29
     * @param args
     * @author Administrator/zzwen6
    */
    public static void main(String[] args) {
        List<String> questions = new ArrayList<String>();
        questions.add("干你，滚");
        questions.add("干你，滚");
        questions.add("干你，滚");
        questions.add("干你，滚");
        questions.add("干你，滚");
        questions.add("干你，滚");
        String result = "";
        for (String question : questions) {
            String answer = PostServer.receiveResultFromTuring(question);
            System.out.println(answer+"----"); 
            JSONObject json = JSON.parseObject(answer);
            result= json.getString("text");
            if (json.containsKey("url")) {
                result += " " + json.getString("url");
            }
            System.out.println("--"+result);
        }
    }

}
