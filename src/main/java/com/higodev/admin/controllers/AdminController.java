package com.higodev.admin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/logout")
    public String logout(){
        return "Bye, bye...";
    }

}
