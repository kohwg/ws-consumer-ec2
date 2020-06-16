package com.example.consumingwebservice.domain;

import com.example.consumingwebservice.business.wsdl.GetCountryResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public abstract class CurrencyService extends WebServiceGatewaySupport {
    abstract public GetCountryResponse getCountry(String country);
}
