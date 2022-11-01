package ru.rtu_mirea.apipractice5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavigateController {
    @GetMapping("/")
    public String mainPage(){
        return "index";
    }

    @GetMapping("/postNew")
    public String postNew(){
        return "postNew";
    }
}
