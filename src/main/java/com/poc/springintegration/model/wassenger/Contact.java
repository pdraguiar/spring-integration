
package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {

    private String displayName;
    private String formattedName;
    private String formattedShortName;
    private String id;
    private String imageUrl;
    private String name;
    private String phone;
    private String shortName;
    private LocalDateTime syncedAt;
    private ContactType type;

}
