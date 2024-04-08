package io.github.oengajohn.simplejavaspring.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(String message){
        super(message);
    }
    
}
