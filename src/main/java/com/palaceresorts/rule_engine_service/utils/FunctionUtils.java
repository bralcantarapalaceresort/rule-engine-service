package com.palaceresorts.rule_engine_service.utils;

import com.palaceresorts.rule_engine_service.model.response.ResponseGeneral;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class FunctionUtils {

    public static ResponseEntity<Object> responseEntity(ResponseGeneral responseGeneral) {
        return switch (responseGeneral.getCode()) {
            case 10 -> new ResponseEntity<>(responseGeneral, HttpStatus.CREATED);
            case 500 -> new ResponseEntity<>(responseGeneral, HttpStatus.INTERNAL_SERVER_ERROR);
            default -> new ResponseEntity<>(responseGeneral, HttpStatus.OK);
        };
    }
}
