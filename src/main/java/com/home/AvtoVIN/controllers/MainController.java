package com.home.AvtoVIN.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MainController {

    @GetMapping
    public String getMainPage() {
        return "mainmenu";
    }

    @GetMapping("/where_vin")
    public String getWhereVinPage() {
        return "wfv";
    }

    @GetMapping("/registration")
    public  String getRegistrationPage() {
        return "registration";
    }
    @GetMapping("/login")
    public  String getLoginPage() {
        return "login";
    }
}
