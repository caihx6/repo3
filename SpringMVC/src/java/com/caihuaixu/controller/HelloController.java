package com.caihuaixu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//控制器类
@Controller
public class HelloController {
    @RequestMapping(path="/hello")
    public  String sayHelloWord(String userName)
    {
        System.out.println("hello world!"+userName);
        return "success";
    }

}
