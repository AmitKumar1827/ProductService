package com.product.product_service.FiegnInterface;

import com.product.product_service.Pojo.Merchant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "merchant-service", url = "http://localhost:8999")
public interface MerchantInterface {

    @RequestMapping(method = RequestMethod.GET,value = "/merchant/getMerchantById")
    public Merchant getSellerById(int id);





}
