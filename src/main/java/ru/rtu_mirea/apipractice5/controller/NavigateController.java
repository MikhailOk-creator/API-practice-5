package ru.rtu_mirea.apipractice5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NavigateController {
    @GetMapping
    private String mainPage(){
        return "index";
    }
}
