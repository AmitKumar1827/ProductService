package com.product.product_service.Controller;


import com.product.product_service.Entity.ProductEntity;
import com.product.product_service.Response.Response;
import com.product.product_service.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/product")
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
    public Response<List<ProductEntity>> getProductByCategory(@RequestParam("category") @Valid String category ){
        List<ProductEntity> productEntity= productService.getAllProductsByCategory(category);
        if(productEntity !=null){
            return new Response<>(productEntity);
        }else{
            return new Response<>(1001 , "not result found");
        }
    }

    @PostMapping("/addproduct")
    public Response<Boolean> addProducts(@RequestBody ProductEntity product){
        Boolean isAdded = productService.addProducts(product);
        if(isAdded){
            return new Response<>(true);
        }else {
            return new Response<>(1001 , "not added");
        }

    }



}

