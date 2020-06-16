package com.example.consumingwebservice.business.application;

import com.example.consumingwebservice.business.wsdl.GetCountryResponse;
import com.example.consumingwebservice.domain.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    private CurrencyService currencyService;

    public GetCountryResponse getCountry(String country){
        return currencyService.getCountry(country);
    }
}
