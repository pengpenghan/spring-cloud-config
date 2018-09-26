package com.hpp.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

	@Value("${public-key}")
	private String publicKey;
	
	@RequestMapping(value = "config")
	public String getConfig(){
		return publicKey;
	}
	
}
