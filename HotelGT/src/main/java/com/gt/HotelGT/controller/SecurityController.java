package com.gt.HotelGT.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SecurityController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String postLogin(){
        return "redirect:/rez";
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout";
    }
    @PostMapping("/logout")
    public String getLogout(){
        return "redirect:/home";
    }
}
