package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
@Data
@ToString
public class SettlementPaid extends AbstractEvent {

    private Long id;
    private Long carOwnerId;
    private Long freightOwnerId;
    private Double fee;
    private String state;

    public SettlementPaid(Settlement aggregate){
        super(aggregate);
    }
    public SettlementPaid(){
        super();
    }
}
//>>> DDD / Domain Event