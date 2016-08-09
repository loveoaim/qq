package com.main.test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.eastrobot.ask.sdk.AskRequest;
import com.eastrobot.ask.sdk.AskResponse;
import com.eastrobot.ask.sdk.AskService;
import com.eastrobot.ask.sdk.CloudNotInitializedException;
import com.eastrobot.ask.sdk.CloudServiceFactory;
import com.eastrobot.ask.utils.Constant;

public class sample {

	public static void main(String[] args) throws MalformedURLException,
			IOException {
		String appKey = "zZ91tzoZrwmg";
		String appSecret = "ToTa2kDgYTnSjoDGTga2";
		List<String> questions = new ArrayList<String>();
		questions.add("你系不系傻");
		questions.add("表哥你好牛逼哦");
		questions.add("老表");
		questions.add("表哥");
		questions.add("大表哥");
		questions.add("小表哥");
		//智能问答
		for (String question : questions) {
            
		    AskRequest askRequest = new AskRequest(appKey, appSecret, question,
		            Constant.PRIMARY_TYPE, null, Constant.CUSTOM_PLATFORM);
		    AskService askService = CloudServiceFactory.getInstance()
		            .createAskService();
		    askService.init(null);
		    AskResponse askResponse = null;
		    try {
		        askResponse = askService.ask(askRequest);
		        System.out.println(askResponse.getContent());
		    } catch (CloudNotInitializedException e) {
		        e.printStackTrace();
		    }
        }
		 
	}

}
