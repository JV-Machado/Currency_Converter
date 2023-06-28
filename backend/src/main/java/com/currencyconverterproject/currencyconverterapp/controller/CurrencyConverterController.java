package com.currencyconverterproject.currencyconverterapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.currencyconverterproject.currencyconverterapp.fields.ConversionRates;


@RestController
@RequestMapping("/currency_convert")
public class CurrencyConverterController {

	@GetMapping("/{base}/{target}/{amount}")
	public ConversionRates currencyResult(@PathVariable("base") String base, @PathVariable("target") String target, @PathVariable("amount") double amount) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ConversionRates> resp = restTemplate.getForEntity(
				"https://v6.exchangerate-api.com/v6/d1d5860e887d5944f36a8385/pair/"+base+"/"+target+"/"+amount,
				ConversionRates.class);
		return resp.getBody();
	}
	
}
