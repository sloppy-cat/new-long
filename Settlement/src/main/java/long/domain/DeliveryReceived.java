package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryReceived extends AbstractEvent {

    private Long id;
    private Long freightId;
    private Long carOwnerId;
    private Date createdAt;
    private String state;
    private Boolean isRecieved;
    private Long freightOwnerId;
}


