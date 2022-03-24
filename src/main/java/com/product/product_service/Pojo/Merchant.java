package com.product.product_service.Pojo;

public class Merchant {


    private Integer id;


    private String MerchantName;
    private String MerchantEmail;
    private Integer Phone;

    public Merchant() {
    }

    public Integer getId() {
        return id;
    }

    public Merchant(Integer id, String merchantName, String merchantEmail, Integer phone, String password, Integer merchantTotalProduct) {
        this.id = id;
        MerchantName = merchantName;
        MerchantEmail = merchantEmail;
        Phone = phone;
        Password = password;
        MerchantTotalProduct = merchantTotalProduct;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
    }

    public String getMerchantEmail() {
        return MerchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        MerchantEmail = merchantEmail;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Integer getMerchantTotalProduct() {
        return MerchantTotalProduct;
    }

    public void setMerchantTotalProduct(Integer merchantTotalProduct) {
        MerchantTotalProduct = merchantTotalProduct;
    }

    private String Password;
    private Integer MerchantTotalProduct;

}
