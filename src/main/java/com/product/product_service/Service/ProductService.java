package com.product.product_service.Service;

import com.product.product_service.Entity.ProductEntity;

import java.util.List;

public interface ProductService {


    List<ProductEntity> getAllProducts();
    List<ProductEntity> getAllProductsByCategory(String productCategory);
    ProductEntity getProductById(Integer id);
    void addProducts(ProductEntity product);
    void updateProducts(ProductEntity product);
    void deleteProducts(ProductEntity product);




}
