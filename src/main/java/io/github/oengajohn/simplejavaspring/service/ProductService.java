package io.github.oengajohn.simplejavaspring.service;

import io.github.oengajohn.simplejavaspring.model.ProductResDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductService {
    
    Flux<ProductResDto> listAll();

    Mono<ProductResDto> getProduct(String productCode);
}
