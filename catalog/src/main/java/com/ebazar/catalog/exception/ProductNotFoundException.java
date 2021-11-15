package com.ebazar.catalog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Product not found in the catalog")
public class ProductNotFoundException extends RuntimeException{
}
