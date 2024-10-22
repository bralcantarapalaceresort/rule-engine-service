package com.palaceresorts.rule_engine_service.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@Log4j2
public class WebClientConfig {
    @Bean //Primer Bean configurado para los Microservicios
    public WebClient webClientRuleUtils(WebClient.Builder builder) {
        return builder
                .baseUrl("http://localhost:8082/api/rule/utils")
                .filter((request, next) -> {
                    log.info("Request: " + request.method() + " " + request.url());
                    return next.exchange(request).doOnNext(response -> {
                        log.info("Response: " + response.statusCode());
                    });
                })
                .build();
    }
}
