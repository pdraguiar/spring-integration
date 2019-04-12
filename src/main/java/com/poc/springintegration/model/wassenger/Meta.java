
package com.poc.springintegration.model.wassenger;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Meta {

    private Boolean containsEmoji;
    private Boolean isBizNotification;
    private Boolean isBroadcast;
    private Boolean isDoc;
    private Boolean isFailed;
    private Boolean isForwarded;
    private Boolean isGif;
    private Boolean isGroup;
    private Boolean isLinkPreview;
    private Boolean isLive;
    private Boolean isNotification;
    private Boolean isPSA;
    private Boolean isRevoked;
    private Boolean isStar;
    private Boolean isUnreadType;
    private String notifyName;
    private Boolean rtl;

}
