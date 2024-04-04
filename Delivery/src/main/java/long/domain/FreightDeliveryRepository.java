package long.domain;

import long.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="freightDeliveries", path="freightDeliveries")
public interface FreightDeliveryRepository extends PagingAndSortingRepository<FreightDelivery, Long>{
}