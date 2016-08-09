/**
 * com.comms.utils.UUIDUtil.java
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日上午9:29:45
*/
package com.comms.utils;

import java.util.UUID;

/**
 * com.comms.utils.UUIDUtil.java
 * 
 * @author:zzwen6@grgbanking.com
 * @Date:2016年8月8日上午9:29:45
 */
public class UUIDUtil {
    // 生成一个唯一标识符
    public static String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
