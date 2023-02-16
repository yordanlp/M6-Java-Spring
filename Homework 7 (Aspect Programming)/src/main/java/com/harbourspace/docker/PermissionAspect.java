package com.harbourspace.docker;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
@Aspect
public class PermissionAspect {

    @Around("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public Object checkReadPermission(ProceedingJoinPoint joinPoint) throws Throwable{
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String header = request.getHeader("x-permission");
        if( !isUserAllowed("read") )
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);

        var proceed = joinPoint.proceed();
        return proceed;
    }

    @Around("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    public Object checkWritePermission(ProceedingJoinPoint joinPoint) throws Throwable{

        if( !isUserAllowed("write") )
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);

        var proceed = joinPoint.proceed();
        return proceed;
    }

    private boolean isUserAllowed( String permission ){
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

        String header = request.getHeader("x-permission");
        if( !permission.equals(header) )
            return false;
        return true;
    }

}
