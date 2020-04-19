package com.caihuaixu.controller;

import com.caihuaixu.domain.Account;
import com.caihuaixu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/param")
public class ParamController {

    @RequestMapping(path="toParam")
    public String toParam()
    {
        return "param";
    }

    /**
     * 请求参数绑定入门
     * @return
     */
    @RequestMapping(path="/testParam")
    public  String testParam(String userName)
    {
        System.out.println("执行了"+userName);
        return "success";
    }

    /**
     * 请求参数绑定数据到javaBean中
     */
    @RequestMapping(path="/saveAccount")
    public String saveAccount(Account account)
    {
        System.out.println(account.toString());
        return "success";
    }
    /**
     *
     */
    @RequestMapping(path="/saveUser")
    public String saveUser(User user)
    {
        System.out.println(user.toString());
        return "success";
    }

    /**
     * 原生sevetlet的API
     * @return
     */
    @RequestMapping(path="/testSeverlet")
    public String testSeverlet(HttpServletRequest request, HttpServletResponse response)
    {
        System.out.println(request);
        System.out.println(request.getSession());
        return "success";
    }
}
