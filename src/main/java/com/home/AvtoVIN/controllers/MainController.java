package com.home.AvtoVIN.controllers;

import com.home.AvtoVIN.models.VinNumber;
import com.home.AvtoVIN.services.VinNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String getVinInfo(@PathVariable(value = "vin") String vin,
                             Model model) {
        model.addAttribute("vinInfo", vinNumberService.getVinNumber(vin));
        return "vivod-infomacii";
    }

    @GetMapping("/where_vin")
    public String getWhereVinPage() {
        return "wfv";
    }

    @GetMapping("/vin_number")
    public  String getRegistrationPage() {
        return "vin-number";
    }

    @GetMapping("/about")
    public  String getLoginPage() {
        return "about";
    }
}
