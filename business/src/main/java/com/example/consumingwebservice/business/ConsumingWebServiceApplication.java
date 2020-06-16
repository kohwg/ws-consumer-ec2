package com.example.consumingwebservice.business;

import com.example.consumingwebservice.business.application.CountryService;
import com.example.consumingwebservice.business.wsdl.Currency;
import com.example.consumingwebservice.domain.CurrencyService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.example.consumingwebservice")
public class ConsumingWebServiceApplication {

	@Autowired
	private CountryService countryService;
	private static final Logger log = LoggerFactory.getLogger(ConsumingWebServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingWebServiceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner lookup(CurrencyService currencyService) {
//		return args -> {
//			String country = "Spain";
//
//			if (args.length > 0) {
//				country = args[0];
//			}
//			Currency response = countryService.getCountry(country).getCountry().getCurrency();
//			log.info("Currency = {}",response.toString());
//		};
//	}

}
