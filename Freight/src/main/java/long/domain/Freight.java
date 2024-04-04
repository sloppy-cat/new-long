package long.domain;

import long.domain.FreightDeleted;
import long.FreightApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Freight_table")
@Data

//<<< DDD / Aggregate Root
public class Freight  {


    
    @Id
    
    
    
    
    
    private Integer id;
    
    
    
    
    private String origin;
    
    
    
    
    private String destination;
    
    
    
    
    private Double fee;
    
    
    
    
    private String status;
    
    
    
    
    private Integer freightOwnerId;

    @PostRemove
    public void onPostRemove(){


        FreightDeleted freightDeleted = new FreightDeleted(this);
        freightDeleted.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){
    }
    @PreRemove
    public void onPreRemove(){
    }

    public static FreightRepository repository(){
        FreightRepository freightRepository = FreightApplication.applicationContext.getBean(FreightRepository.class);
        return freightRepository;
    }



//<<< Clean Arch / Port Method
    public void registFreight(RegistFreightCommand registFreightCommand){
        
        //implement business logic here:
        
        FreightRegistered freightRegistered = new FreightRegistered(this);
        freightRegistered.publishAfterCommit();

    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public void selectFreight(SelectFreightCommand selectFreightCommand){
        
        //implement business logic here:
        
        FreightSelected freightSelected = new FreightSelected(this);
        freightSelected.publishAfterCommit();

    }
//>>> Clean Arch / Port Method



}
//>>> DDD / Aggregate Root
