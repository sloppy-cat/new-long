package long.infra;
import long.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/freightDeliveries")
@Transactional
public class FreightDeliveryController {
    @Autowired
    FreightDeliveryRepository freightDeliveryRepository;






}
//>>> Clean Arch / Inbound Adaptor
