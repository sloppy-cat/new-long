package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FreightDeleted extends AbstractEvent {

    private Integer id;
    private String origin;
    private String destination;
    private Double fee;
    private String status;
    private Integer freightOwnerId;
}


