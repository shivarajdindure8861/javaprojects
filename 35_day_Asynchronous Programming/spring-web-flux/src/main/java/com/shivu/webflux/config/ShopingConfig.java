package com.shivu.webflux.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shivu.webflux.dto.UserDb;

@Configuration
public class ShopingConfig {

    @Bean
    public UserDb userDb() {
        return new UserDb();
    }
}
