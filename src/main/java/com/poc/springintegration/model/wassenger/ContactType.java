package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ContactType {
    @JsonProperty("user")
    USER("user"),
    @JsonProperty("group")
    GROUP("group");

    private String value;
}
