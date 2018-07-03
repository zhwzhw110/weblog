package com.domain.model;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: zhangHaiWen
 * @date : 2018/7/3 0003 上午 10:53
 * @DESC :
 */

public class LogTest {
    private  static  final Log log = LogFactory.getLog(LogTest.class);

    public void print(String name, HttpServletRequest request){
        if(log.isTraceEnabled()){ //如果启动了log trance机制
            log.trace("传入的参数是："+name);
            request.getRemoteAddr();
            request.getRemoteUser();
        }
        try{

        }catch (Exception e){
            if(log.isErrorEnabled()){ //如果启动了log error机制
                log.error("出错啦",e);
            }
        }
    }

}
