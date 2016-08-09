/**
 * com.main.test.TestDemo.java
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日下午1:18:10
*/
package com.main.test;

import java.util.Random;


/**
 * com.main.test.TestDemo.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日下午1:18:10
 */
public class TestDemo {
    public static void main(String[] args) {
        
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
             
        }
        
        
    }
}
