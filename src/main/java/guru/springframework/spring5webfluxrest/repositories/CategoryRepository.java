package guru.springframework.spring5webfluxrest.repositories;

import guru.springframework.spring5webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by Adetola on 10/07/2019
 */
public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
