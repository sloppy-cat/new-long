package long.domain;

import long.domain.DeliveryStarted;
import long.domain.DeliveryCompleted;
import long.domain.DeliveryTimeHasPassed;
import long.domain.DeliveryReceived;
import long.domain.DeliveryCanceled;
import long.DeliveryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="FreightDelivery_table")
@Data

//<<< DDD / Aggregate Root
public class FreightDelivery  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private Long freightId;
    
    
    
    
    private Long carOwnerId;
    
    
    
    
    private Date createdAt;
    
    
    
    
    private String state;
    
    
    
    
    private Boolean isRecieved;
    
    
    
    
    private Long freightOwnerId;

    @PostPersist
    public void onPostPersist(){


        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();

    }
    @PostUpdate
    public void onPostUpdate(){


        DeliveryCompleted deliveryCompleted = new DeliveryCompleted(this);
        deliveryCompleted.publishAfterCommit();


        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.


        long.external.FreightDelivery freightDelivery = new long.external.FreightDelivery();
        // mappings goes here
        DeliveryApplication.applicationContext.getBean(long.external.FreightDeliveryService.class)
            .completeDelivery(freightDelivery);


        DeliveryTimeHasPassed deliveryTimeHasPassed = new DeliveryTimeHasPassed(this);
        deliveryTimeHasPassed.publishAfterCommit();



        DeliveryReceived deliveryReceived = new DeliveryReceived(this);
        deliveryReceived.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        DeliveryCanceled deliveryCanceled = new DeliveryCanceled(this);
        deliveryCanceled.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static FreightDeliveryRepository repository(){
        FreightDeliveryRepository freightDeliveryRepository = DeliveryApplication.applicationContext.getBean(FreightDeliveryRepository.class);
        return freightDeliveryRepository;
    }






}
//>>> DDD / Aggregate Root
