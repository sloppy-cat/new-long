package long.domain;

import long.ArlimApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;
import java.time.LocalDate;


@Entity
@Table(name="Notification_table")
@Data

//<<< DDD / Aggregate Root
public class Notification  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    private Long id;
    
    
    
    
    private String title;
    
    
    
    
    private String content;
    
    
    
    
    private String target;

    @PostPersist
    public void onPostPersist(){
    }

    public static NotificationRepository repository(){
        NotificationRepository notificationRepository = ArlimApplication.applicationContext.getBean(NotificationRepository.class);
        return notificationRepository;
    }






}
//>>> DDD / Aggregate Root
