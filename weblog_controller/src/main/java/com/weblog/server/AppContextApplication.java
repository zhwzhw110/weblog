package com.weblog.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
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
