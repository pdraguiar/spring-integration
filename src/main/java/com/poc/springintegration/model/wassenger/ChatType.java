package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ChatType {
    @JsonProperty("chat")
    CHAT("chat"),
    @JsonProperty("group")
    GROUP("group");

    private String value;
}
