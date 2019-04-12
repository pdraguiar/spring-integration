
package com.poc.springintegration.model.wassenger;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Data {

    private String body;
    private Chat chat;
    private LocalDateTime date;
    private String flow;
    private String from;
    private String fromNumber;
    private String id;
    private Meta meta;
    private Long timestamp;
    private String to;
    private String toNumber;
    private MessageType type;
    private Quoted quoted;
}
