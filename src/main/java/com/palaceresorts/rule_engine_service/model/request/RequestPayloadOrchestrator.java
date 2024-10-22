package com.palaceresorts.rule_engine_service.model.request;


import lombok.*;

import java.util.Map;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RequestPayloadOrchestrator {

    private String inputString;
    private Map<String, Object> inputData;
}
