package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long freightId;
    private Long carOwnerId;
    private Date createdAt;
    private String state;
    private Boolean isRecieved;
    private Long freightOwnerId;

    public DeliveryCanceled(FreightDelivery aggregate){
        super(aggregate);
    }
    public DeliveryCanceled(){
        super();
    }
}
//>>> DDD / Domain Event