package com.example.consumingwebservice.infra;

import com.example.consumingwebservice.business.wsdl.GetCountryResponse;
import com.example.consumingwebservice.domain.CurrencyService;
import com.example.consumingwebservice.business.wsdl.GetCountryRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Component
public class CurrencyServiceWsdl extends CurrencyService {

    private static final Logger log = LoggerFactory.getLogger(CurrencyServiceWsdl.class);

    public GetCountryResponse getCountry(String country) {

        GetCountryRequest request = new GetCountryRequest();
        request.setName(country);

        log.info("Requesting location for " + country);

        GetCountryResponse response = (GetCountryResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/countries", request,
                        new SoapActionCallback(
                                "http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));

        return response;
    }
}
