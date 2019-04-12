package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Quoted {
    private ChatType type;
    private String wid;
    private String from;
    private String fromName;
    private LocalDateTime date;
    private Long timestamp;
    private String body;
}
