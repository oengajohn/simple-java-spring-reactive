package io.github.oengajohn.simplejavaspring.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvise {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> handleIllegalArgumentException(IllegalArgumentException ex){
        Map<String, String> map = new HashMap<>();
        map.put("msg", ex.getLocalizedMessage());
        map.put("success", String.valueOf(false));
        return map;
    }

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handleIllegalArgumentException(ProductNotFoundException ex){
        Map<String, String> map = new HashMap<>();
        map.put("msg", ex.getLocalizedMessage());
        map.put("success", String.valueOf(false));
        return map;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,String> handleException(Exception ex){
        Map<String, String> map = new HashMap<>();
        map.put("msg", ex.getLocalizedMessage());
        map.put("success", String.valueOf(false));
        return map;
    }
    
}
