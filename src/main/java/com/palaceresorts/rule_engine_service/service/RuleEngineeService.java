package com.palaceresorts.rule_engine_service.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.palaceresorts.rule_engine_service.client.RuleUtilsClient;
import com.palaceresorts.rule_engine_service.model.response.ResponseGeneral;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Map;

import static com.palaceresorts.rule_engine_service.utils.Constants.*;

@Service
@Log4j2
@RequiredArgsConstructor
public class RuleEngineeService {
    private final RuleUtilsClient ruleUtilsClient;
    private final ObjectMapper objectMapper;

    public ResponseGeneral getProcessByNameTest(String name) throws JsonProcessingException {
        var pet = ruleUtilsClient.getProcessByName(name).block();

        Map<String, Object> responseMap = objectMapper.readValue(pet, new TypeReference<Map<String, Object>>() {});

        log.info("Pet found: " + pet);
        return ResponseGeneral.builder().code(N0).message(SUCCESS).response(responseMap).build();
    }
}
