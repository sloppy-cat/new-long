package long.infra;
import long.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class FreightHateoasProcessor implements RepresentationModelProcessor<EntityModel<Freight>>  {

    @Override
    public EntityModel<Freight> process(EntityModel<Freight> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/").withRel(""));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/selectfreight").withRel("selectfreight"));

        
        return model;
    }
    
}
