package com.example.stu.controller;

import com.example.stu.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/login")
    public String getLogin(Model model){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        model.addAttribute("user", user);
        return "login";
    }

    @RequestMapping("/register")
    public String getRegister(){
        return "register";
    }
}
