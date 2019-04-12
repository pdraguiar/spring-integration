package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Device {
    private String alias;
    private String id;
    private String phone;
    private String plan;
    private Integer version;

}
