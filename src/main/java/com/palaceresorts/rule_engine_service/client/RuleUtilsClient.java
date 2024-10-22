package com.palaceresorts.rule_engine_service.client;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class RuleUtilsClient {
    private WebClient webClient;

    @Autowired
    public RuleUtilsClient(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> getProcessByName(String name) {
        return webClient.get()
                .uri("/process/name/{name}", name)
                .retrieve()
                .bodyToMono(String.class);
    }
}
