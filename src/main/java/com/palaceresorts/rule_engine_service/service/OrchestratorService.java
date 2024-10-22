package com.palaceresorts.rule_engine_service.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.palaceresorts.rule_engine_service.model.request.RequestPayloadOrchestrator;
import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OrchestratorService {

    public String processRequest(RequestPayloadOrchestrator requestPayloadOrchestrator) {

        return "Proceso completado variables procesadas";
    }
}
