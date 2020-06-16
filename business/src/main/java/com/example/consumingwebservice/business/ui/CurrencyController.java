package com.example.consumingwebservice.business.ui;

import com.example.consumingwebservice.business.application.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/currency/country/{country}")
    public String getCurrency(@PathVariable String country){
        return countryService.getCountry(country).getCountry().getCurrency().toString();
    }
}
