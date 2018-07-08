package com.domain.utils;

import org.apache.commons.lang3.RandomStringUtils;

/*
 * @author zhangHaiWen
 * @date 2018/7/8 19:08
 * @desc 公共工具类
 * @param  * @param null
 * @return
*/
public class StringUtils {

    /*
     * @author zhangHaiWen
     * @date 2018/7/8 19:16
     * @desc 返回一个4位数的随机字符串
     * @param  * @param null
     * @return
    */
    public static String getRandomStr(int randomLen){
        return RandomStringUtils.randomAlphanumeric(randomLen);//产生5位长度的随机字符串;
    }

    /*
     * @author zhangHaiWen
     * @date 2018/7/8 19:21
     * @desc 判断字符串是不是为null或者空
     * @param  * @param str 输入的字符串
     * @return
    */
    public static boolean isNotNULL(String str){
        if(null==str||str.length()==0){
            return false;
        }
        return true;
    }

}
