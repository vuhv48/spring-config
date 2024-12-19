package com.eazybytes.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "accounts")
public record AccountContactInfoDto(String message) {
}
