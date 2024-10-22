package com.palaceresorts.rule_engine_service.model.response;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseGeneral {
    protected int code;
    protected String message;
    protected Object response;
}
