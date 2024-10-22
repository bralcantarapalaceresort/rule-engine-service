package com.palaceresorts.rule_engine_service.controller;

import com.palaceresorts.rule_engine_service.model.request.RequestPayloadOrchestrator;
import com.palaceresorts.rule_engine_service.service.OrchestratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/orchestrator")
public class OrchestratorController {

    @Autowired
    private OrchestratorService orchestratorService;

    @PostMapping("/process")
    public String processData(@RequestBody RequestPayloadOrchestrator requestPayloadOrchestrator) {

        String respuesta = orchestratorService.processRequest(requestPayloadOrchestrator);

        return respuesta;
    }
}
