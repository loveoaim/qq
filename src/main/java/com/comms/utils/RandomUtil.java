package com.comms.utils;

import java.util.Random;

/**
 * com.comms.utils.RandomUtil.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日下午7:14:48
 */
public class RandomUtil {
    
    /**
     * 获得 [0,n] 之前的随机数
     *
     * 2016年8月8日 下午7:16:22
     * @param n
     * @return
     * @author Administrator/zzwen6
     */
    public static int getRandom(int n){
        return new Random().nextInt(n);
    }
    
}
