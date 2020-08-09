
package com.example.consumingwebservice.business.config;

import com.example.consumingwebservice.domain.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CountryConfiguration {

	@Autowired
	private CurrencyService currencyService;

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com.example.consumingwebservice.business.wsdl");
		return marshaller;
	}

	@Bean
	public CurrencyService currencyService(Jaxb2Marshaller marshaller) {
		currencyService.setDefaultUri("https://zaxawrocp5.execute-api.ap-northeast-2.amazonaws.com/DEV/ws-producer/ws");
		currencyService.setMarshaller(marshaller);
		currencyService.setUnmarshaller(marshaller);
		return currencyService;
	}

}
