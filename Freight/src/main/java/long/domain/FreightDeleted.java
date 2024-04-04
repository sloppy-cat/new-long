package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class FreightDeleted extends AbstractEvent {

    private Integer id;
    private String origin;
    private String destination;
    private Double fee;
    private String status;
    private Integer freightOwnerId;

    public FreightDeleted(Freight aggregate){
        super(aggregate);
    }
    public FreightDeleted(){
        super();
    }
}
//>>> DDD / Domain Event