package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MessageType {
    @JsonProperty("text")
    TEXT("text"),
    @JsonProperty("image")
    IMAGE("image"),
    @JsonProperty("video")
    VIDEO("video"),
    @JsonProperty("audio")
    AUDIO("audio"),
    @JsonProperty("revoked")
    REVOKED("revoked");

    private String value;
}
