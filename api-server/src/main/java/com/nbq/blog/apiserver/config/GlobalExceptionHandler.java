package com.nbq.blog.apiserver.config;

import com.nbq.blog.apiserver.entity.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Response defaultErrorHandler(Exception e) {
        log.error("------------------>捕捉到全局异常", e);
        return  Response.failBy500();
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Response noHandlerFoundException(NoHandlerFoundException e) {
        log.error("------------------>NoHandlerFoundException", e);
        return  Response.failBy404();
    }

}
