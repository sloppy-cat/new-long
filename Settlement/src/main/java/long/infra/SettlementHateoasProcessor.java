package long.infra;
import long.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class SettlementHateoasProcessor implements RepresentationModelProcessor<EntityModel<Settlement>>  {

    @Override
    public EntityModel<Settlement> process(EntityModel<Settlement> model) {

        
        return model;
    }
    
}
