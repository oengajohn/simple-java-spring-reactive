package io.github.oengajohn.simplejavaspring.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import io.github.oengajohn.simplejavaspring.exception.ProductNotFoundException;
import io.github.oengajohn.simplejavaspring.model.ProductResDto;
import io.github.oengajohn.simplejavaspring.service.ProductService;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService {

        private List<ProductResDto> products = new ArrayList<>();

        @PostConstruct
        public void setup() {
                products.addAll(List.of(
                                ProductResDto.builder().productId(UUID.randomUUID().toString())
                                                .productCode("001")
                                                .productName("Banana").build(),
                                ProductResDto.builder().productId(UUID.randomUUID().toString())
                                                .productCode("002")
                                                .productName("Juice").build(),
                                ProductResDto.builder().productId(UUID.randomUUID().toString())
                                                .productCode("003")
                                                .productName("Apples").build()));
        }

        @Override
        public Flux<ProductResDto> listAll() {
                log.info("Fetching products");
                return Flux.fromIterable(products);
        }

        @Override
        public Mono<ProductResDto> getProduct(String productCode) {
                var optionalProduct = products.stream()
                                .filter(product -> product.getProductCode().equalsIgnoreCase(productCode))
                                .findFirst();
                if (optionalProduct.isPresent()) {
                        return Mono.just(optionalProduct.get());
                }
                throw new ProductNotFoundException("We can not find the product with the supplied code");

        }

}
