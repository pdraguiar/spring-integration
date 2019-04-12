
package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Chat {

    private Contact contact;
    private LocalDateTime date;
    private String id;
    private Stats stats;
    private ChatType type;
    private String name;

}
