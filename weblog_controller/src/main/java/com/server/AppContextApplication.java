package com.server;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@MapperScan(basePackages = "com.weblog.mapper")
//不配置ComponentScan，service注入不进去，因为加载问题
@ComponentScan(basePackages = "com")
public class AppContextApplication {

    @ResponseBody
    @RequestMapping(value = "/")
    String home(){
        return "Controller Server Start Success!";
    }

    public static void main(String[] args) {
        SpringApplication.run(AppContextApplication.class, args);
    }


}
