package com.example.consumingwebservice.business.ui;

import com.example.consumingwebservice.business.application.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CurrencyController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/currency/country/{country}")
    public String getCurrency(@PathVariable String country){
        return countryService.getCountry(country).getCountry().getCurrency().toString();
    }

    @PostMapping(path="/")
    public String postCurrency(@RequestBody String country){
        return countryService.getCountry(country).getCountry().getCurrency().toString();
    }
}
