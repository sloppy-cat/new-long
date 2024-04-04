package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FreightSelected extends AbstractEvent {

    private Integer id;
    private String origin;
    private String destination;
    private String status;
    private Integer freightOwnerId;
    private String carOwnerId;
    private Double fee;
}


