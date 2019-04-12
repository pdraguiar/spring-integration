
package com.poc.springintegration.model.wassenger;


import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Instant;

@lombok.Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageEvent {
    private String id;
    private Instant created;
    private Data data;
    private Device device;
    private Event event;
    private String object;
}
