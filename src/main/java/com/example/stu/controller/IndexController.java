package com.example.stu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping(value = "/login")
    public String login(HttpSession httpSession, HttpServletRequest httpServletRequest){
        httpSession.setAttribute("张三", "100");
        httpServletRequest.setAttribute("李四", "200");
        return "login";
    }
    @RequestMapping(value = "/register")
    public String register(Model model){
        model.addAttribute("success", "注册成功");
        return "register";
    }
    @RequestMapping(value = "/success", method = RequestMethod.GET, params="username")
    public String success(@RequestParam String username){
        return "success";
    }
}
