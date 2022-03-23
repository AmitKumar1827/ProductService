package com.product.product_service.Service;


import com.product.product_service.Entity.ProductEntity;
import com.product.product_service.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;


    @Override
    public List<ProductEntity> getAllProducts() {
        Iterable<ProductEntity> iterable =  productRepo.findAll();
        List<ProductEntity> productEntityList = new ArrayList<>();
        for(ProductEntity productEntity : iterable){
            productEntityList.add(productEntity);
        }
        return productEntityList;
    }

    @Override
    public List<ProductEntity> getAllProductsByCategory(String productCategory) {
        List<ProductEntity> productEntityList=new ArrayList<>();
        List<ProductEntity> productEntities =  productRepo.findAll();
        for (ProductEntity productEntity: productEntities
                ) {
            if(productEntity.getProductCategory().equals(productCategory)){
                productEntityList.add(productEntity);
            }

        }
        return productEntityList;



    }

    @Override
    public ProductEntity getProductById(Integer id) {

        List<ProductEntity> productEntities =  productRepo.findAll();
        for (ProductEntity productEntity: productEntities
             ) {
            if(productEntity.getProductId()==id){
                return productEntity;
            }

        }
        return null;



    }

    @Override
    public void addProducts(ProductEntity product) {
        productRepo.save(product);

    }

    @Override
    public void updateProducts(ProductEntity product) {

    }

    @Override
    public void deleteProducts(ProductEntity product) {

    }
}
