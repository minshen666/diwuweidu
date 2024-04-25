package com.diwuweidu.Config;


import com.diwuweidu.Entity.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
@Slf4j
public class CommonExceptionAdvice {
    @ExceptionHandler(CommonException.class)
    public Object handleBadRequestException(CommonException e) {
        log.error("自定义异常 -> {} , 异常原因：{}  ",e.getClass().getName(), e.getMessage());
        log.debug("", e);
        return processResponse(e);
    }
    private ResponseEntity<Result> processResponse(CommonException e){
        return ResponseEntity.status(e.getCode()).body(Result.fail(String.valueOf(e)));
    }
}
