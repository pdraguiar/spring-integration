
package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stats {

    private Long inboundMessages;
    private Long localMessages;
    private Long outboundMessages;

}
