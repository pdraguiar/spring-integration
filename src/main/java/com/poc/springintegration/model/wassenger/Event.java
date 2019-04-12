package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Event {
    @JsonProperty("message:in:new")
    MESSAGE_IN_NEW("message:in:new");

    private String value;
}
