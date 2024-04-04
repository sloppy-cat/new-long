package long.domain;

import long.domain.SettlementPaid;
import long.SettlementApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Settlement_table")
@Data

//<<< DDD / Aggregate Root
public class Settlement  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long carOwnerId;
    
    
    
    
    private Long freightOwnerId;
    
    
    
    
    private Double fee;
    
    
    
    
    private String state;

    @PostPersist
    public void onPostPersist(){


        SettlementPaid settlementPaid = new SettlementPaid(this);
        settlementPaid.publishAfterCommit();

    }

    public static SettlementRepository repository(){
        SettlementRepository settlementRepository = SettlementApplication.applicationContext.getBean(SettlementRepository.class);
        return settlementRepository;
    }




//<<< Clean Arch / Port Method
    public static void createSettlement(DeliveryReceived deliveryReceived){
        
        //implement business logic here:

        /** Example 1:  new item 
        Settlement settlement = new Settlement();
        repository().save(settlement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryReceived.get???()).ifPresent(settlement->{
            
            settlement // do something
            repository().save(settlement);


         });
        */

        
    }
//>>> Clean Arch / Port Method
//<<< Clean Arch / Port Method
    public static void createSettlement(DeliveryTimeHasPassed deliveryTimeHasPassed){
        
        //implement business logic here:

        /** Example 1:  new item 
        Settlement settlement = new Settlement();
        repository().save(settlement);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryTimeHasPassed.get???()).ifPresent(settlement->{
            
            settlement // do something
            repository().save(settlement);


         });
        */

        
    }
//>>> Clean Arch / Port Method


}
//>>> DDD / Aggregate Root
