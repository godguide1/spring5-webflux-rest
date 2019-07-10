package guru.springframework.spring5webfluxrest.repositories;

import guru.springframework.spring5webfluxrest.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by Adetola on 10/07/2019
 */
public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
