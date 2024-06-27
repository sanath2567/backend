package com.product.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Control {
    @Bean
    public pizza vegpizza() {
        return new vegpizza();
    }
}
