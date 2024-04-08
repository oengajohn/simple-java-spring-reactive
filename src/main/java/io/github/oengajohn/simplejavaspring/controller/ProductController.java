package io.github.oengajohn.simplejavaspring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.oengajohn.simplejavaspring.model.ProductResDto;
import io.github.oengajohn.simplejavaspring.service.ProductService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private final ProductService productService;
   

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public Flux<ProductResDto> listAll() {
        return productService.listAll();
    }
    @GetMapping("{productCode}")
    public Mono<ProductResDto> getProduct(@PathVariable("productCode") String productCode) {
        return productService.getProduct(productCode);
    }

}
