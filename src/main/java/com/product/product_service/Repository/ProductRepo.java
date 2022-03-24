package com.product.product_service.Repository;

import com.product.product_service.Entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends MongoRepository<ProductEntity,Integer> {

    List<ProductEntity> findByProductCategory(String category);

}
