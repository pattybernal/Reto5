package com.mt.Reto5C4.crudRepository;

import com.mt.Reto5C4.model.Gadget;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author  Olga Patricia Bernal
 * @since   2021-12-14
 */
public interface GadgetCrudRepository extends MongoRepository<Gadget, Integer> {
    public List <Gadget> findByPrice (double price);
    
    
    
}
