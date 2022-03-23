package com.product.product_service.Controller;


import com.product.product_service.Entity.ProductEntity;
import com.product.product_service.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import javax.validation.Valid;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class MainController
{

    @Autowired
    ProductService productService;

    @GetMapping("/getallproduct")
    public List<ProductEntity> getAllProducts(){

        return productService.getAllProducts();
    }
    @GetMapping("/getproductbyid")
    public ProductEntity getProductById(@RequestParam("id") @Valid Integer id ){
       return productService.getProductById(id);
    }
    @GetMapping("/getproductbycategory")
    public List<ProductEntity> getProductByCategory(@RequestParam("category") @Valid String category ){
        return productService.getAllProductsByCategory(category);
    }

    @PostMapping("/addproduct")
    public void addProducts(@RequestBody ProductEntity product){
        productService.addProducts(product);

    }



}

