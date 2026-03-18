package com.istad.spring.Controller;

import com.istad.spring.dto.CreateProductRequest;
import com.istad.spring.dto.ProductResponse;
import com.istad.spring.dto.UpdateProductRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/api/v1/products")
@Slf4j
public class ProductController {
    @GetMapping
    public List<ProductResponse> getAllProducts(
            @RequestParam(required = false,defaultValue = "0") int pageNumber,
            @RequestParam(required = false,defaultValue = "20") int PageSize
    ){
        log.info("pageNumber : {}, PageSize : {}", pageNumber, PageSize);
        return List.of();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void createNewProduct(
            @RequestBody CreateProductRequest createProductRequest){
        log.info("createNewProduct : {}",createProductRequest);
    }

    @GetMapping("/{code}")
    public ProductResponse getByCode(@PathVariable String code) {
        log.info("getByCode: {}", code);
        return null;
    }

    @PutMapping("/{code}")
    public ProductResponse updateProductByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest){
        log.info("updateProductByCode : {},with new Data {}",code,updateProductRequest);
        return null;
    }

    @PatchMapping("/{code}")
    public ProductResponse updateProductPartiallyByCode(
            @PathVariable String code,
            @RequestBody UpdateProductRequest updateProductRequest){
        log.info("updateProductPartiallyByCode : {},with new Data {}",code,updateProductRequest);

        return null;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{code}")
    public void deleteProductByCode (@PathVariable String code){
    }
}
