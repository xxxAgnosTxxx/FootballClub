package com.prokhorov.demo.services_test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.Objects;

public class CustomRequestUtil {
    private CustomRequestUtil() {

    }
    //возврат ответа для get-запросов
    public static ResponseEntity<Object> getResponseEntity(Object o) {
        if (o instanceof Collection && !((Collection<?>) o).isEmpty()) {
            return new ResponseEntity<>(o, HttpStatus.OK);
        } else if (!Objects.isNull(o)) {
            return new ResponseEntity<>(o, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
