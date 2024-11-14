package com.home.AvtoVIN.controllers;

import com.home.AvtoVIN.models.VinNumber;
import com.home.AvtoVIN.services.VinNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private VinNumberService vinNumberService;

    @GetMapping
    public String getMainPage() {
        return "mainmenu";
    }

    @GetMapping("/{vin}")
    public ResponseEntity<VinNumber> getVinInfo(@PathVariable(value = "vin") String vin) {
        return ResponseEntity.ok(vinNumberService.getVinNumber(vin));
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
