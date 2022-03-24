package com.product.product_service.Entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Document(collection = "product")
public class ProductEntity implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Integer productId;

    String productName;
    String productCategory;
    String productImage;
    String productTitle;
    String productDescription;
    Integer defaultMerchantId;
    String defaultMerchantName;
    Integer defaultMerchantPrice;

    public ProductEntity(Integer productId, String productName, String productCategory, String productImage, String productTitle, String productDescription, Integer defaultMerchantId, String defaultMerchantName, Integer defaultMerchantPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productDescription = productDescription;
        this.defaultMerchantId = defaultMerchantId;
        this.defaultMerchantName = defaultMerchantName;
        this.defaultMerchantPrice = defaultMerchantPrice;
    }

    public ProductEntity() {
    }


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getDefaultMerchantId() {
        return defaultMerchantId;
    }

    public void setDefaultMerchantId(Integer defaultMerchantId) {
        this.defaultMerchantId = defaultMerchantId;
    }

    public String getDefaultMerchantName() {
        return defaultMerchantName;
    }

    public void setDefaultMerchantName(String defaultMerchantName) {
        this.defaultMerchantName = defaultMerchantName;
    }

    public Integer getDefaultMerchantPrice() {
        return defaultMerchantPrice;
    }

    public void setDefaultMerchantPrice(Integer defaultMerchantPrice) {
        this.defaultMerchantPrice = defaultMerchantPrice;
    }
}
