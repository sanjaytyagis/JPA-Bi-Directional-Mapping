package com.example.TestPosgress;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundException ex) {
		
        String message = ex.getMessage();
        
        ApiResponse response = new ApiResponse();
        
        response.setMessage("Tum Pagal Ho");
        response.setStatus(HttpStatus.NOT_FOUND);
        response.setSuccess(true);
        
        return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);

    }
}
