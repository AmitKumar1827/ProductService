package com.product.product_service.Service;


import com.product.product_service.Entity.ProductEntity;
import com.product.product_service.FiegnInterface.MerchantInterface;
import com.product.product_service.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductImpl implements ProductService{

    @Autowired
    ProductRepo productRepo;


    @Autowired
    MerchantInterface merchantInterface;










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
        List<ProductEntity> productEntities =  productRepo.findByProductCategory(productCategory);
        if(productEntities.size()!=0){
            return productEntities;
        }
        return null;

    }

    @Override
    public ProductEntity getProductById(Integer id) {

        Optional<ProductEntity> productEntities =  productRepo.findById(id);
        if(productEntities.isPresent()){
            ProductEntity productEntity = productEntities.get();

        }
        return null;



    }

    @Override
    public Boolean addProducts(ProductEntity product) {

        ProductEntity productEntity = productRepo.save(product);
        if(productEntity.getProductId()!=null){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public void updateProducts(ProductEntity product) {

    }

    @Override
    public void deleteProducts(ProductEntity product) {

    }



}
