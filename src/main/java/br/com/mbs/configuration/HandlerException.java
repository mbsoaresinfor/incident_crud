package br.com.mbs.configuration;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.mbs.exception.ValidationException;
import br.com.mbs.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ControllerAdvice
public class HandlerException {

	
	@ResponseBody
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<Error> IllegalArgumentExceptionHandler(Exception ex) {
		Error error = new Error();
		error.setMessage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
	    		body(error);
	}
	
	@ResponseBody
	@ExceptionHandler(ValidationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<Error> ValidacaoExceptionHandler(Exception ex) {
		Error error = new Error();
		error.setMessage(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).
	    		body(error);	    		
	}
	
}
