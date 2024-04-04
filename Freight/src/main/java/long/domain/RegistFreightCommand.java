package long.domain;

import java.util.*;
import lombok.Data;
import java.time.LocalDate;


@Data
public class RegistFreightCommand {

        private Integer id;
        private String origin;
        private String destination;
        private Double fee;
        private String status;
        private Integer freightOwnerId;


}
