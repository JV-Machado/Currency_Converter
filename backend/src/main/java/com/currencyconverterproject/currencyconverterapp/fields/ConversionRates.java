package com.currencyconverterproject.currencyconverterapp.fields;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConversionRates {

	@JsonProperty("base_code")
	private String base_code;
	
	@JsonProperty("target_code")
	private String target_code;
	
	@JsonProperty("conversion_rate")
	private double conversion_rate;
	
	@JsonProperty("conversion_result")
	private double conversion_result;

	
}
