package long.domain;

import long.domain.*;
import long.infra.AbstractEvent;
import java.util.*;
import lombok.*;
import java.time.LocalDate;


//<<< DDD / Domain Event
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

    public FreightSelected(Freight aggregate){
        super(aggregate);
    }
    public FreightSelected(){
        super();
    }
}
//>>> DDD / Domain Event