package com.veb.inventoryservice.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
@ConfigurationProperties
@Data
public class VaultConfiguration {

	private String username;
	private String password;
}
