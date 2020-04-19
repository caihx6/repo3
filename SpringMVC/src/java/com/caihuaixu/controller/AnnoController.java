package com.caihuaixu.controller;

import com.caihuaixu.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Map;

/**
 * 常用的注解
 */
@Controller
@SessionAttributes(value = {"abc"}) //把abc存到session中
@RequestMapping("/anno")
public class AnnoController {

    @RequestMapping("/toAnno")
    public String toAnno() {
        return "anno";
    }

    /**
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username) {
        System.out.println("执行了。。。。");
        System.out.println(username);
        return "success";
    }

    /**
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{sid}")
    public String testPathVariable(@PathVariable(name = "sid") String id) {
        System.out.println("执行了。。。。");
        System.out.println(id);
        return "success";
    }

    /**
     * 获得cookie的值
     *
     * @param cookieValue
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String cookieValue) {
        System.out.println("执行了。。。。");
        System.out.println(cookieValue);
        return "success";
    }
    /**
     * ModleAttribute

     @RequestMapping("/ModleAttribute") public String testModleAttribute()
     {
     System.out.println("执行了。。。。");
     return "success";
     }*/

    /**
     * 该方法会先执行
     *
     * @ModelAttribute public Account showUser(String username)
     * {
     * System.out.println("showUser执行了。。。");
     * Account account=new Account();
     * account.setUsername(username);
     * account.setPassword("123456");
     * account.setMoney(100.0);
     * return account;
     * }
     */

    @RequestMapping("/ModleAttribute")
    public String testModleAttribute(@ModelAttribute("abc") Account account) {
        System.out.println("执行了。。。。");
        return "success";
    }

    /**
     * 不带返回值
     */
    @ModelAttribute
    public void showUser(String username, Map<String, Account> map) {
        System.out.println("showUser执行了。。。");
        Account account = new Account();
        account.setUsername(username);
        account.setPassword("123456");
        account.setMoney(100.0);
        map.put("abc", account);
    }

    /**
     * SessionAttributes
     * @param
     * @return
     */
    @RequestMapping("/SessionAttributes")
    public String testSessionAttributes(Model model) {
        System.out.println("执行了。。。。");
        model.addAttribute("abc","123");
        return "success";
    }
    /**
     *
     * session实现共享数据
     */
    @RequestMapping("/getSessionAttributes")
    public String testGetSessionAttributes(ModelMap modelmap) {
        System.out.println("执行了。。。。");
       System.out.println(modelmap.get("abc"));
        return "success";
    }
    /**
     * 删除session数据
     */
    @RequestMapping("/deleteSessionAttributes")
    public String deleteSessionAttributes(SessionStatus sessionStatus) {
        System.out.println("执行了。。。。");
        sessionStatus.setComplete();
        return "success";
    }
}
