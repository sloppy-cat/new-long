package long.infra;
import long.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class FreightDeliveryHateoasProcessor implements RepresentationModelProcessor<EntityModel<FreightDelivery>>  {

    @Override
    public EntityModel<FreightDelivery> process(EntityModel<FreightDelivery> model) {

        
        return model;
    }
    
}
