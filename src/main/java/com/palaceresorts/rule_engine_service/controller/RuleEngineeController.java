package com.palaceresorts.rule_engine_service.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.palaceresorts.rule_engine_service.service.RuleEngineeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.palaceresorts.rule_engine_service.utils.FunctionUtils.responseEntity;

@RestController
@RequestMapping(path = "/v1")
@RequiredArgsConstructor
public class RuleEngineeController {

    private final RuleEngineeService ruleEngineeService;

    @GetMapping("/process/{name}")
    public ResponseEntity<Object> getProcessByNameTest(@PathVariable(name = "name") String name) throws JsonProcessingException {
        return responseEntity(ruleEngineeService.getProcessByNameTest(name));
    }
}
