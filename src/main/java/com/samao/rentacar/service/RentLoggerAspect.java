package com.samao.rentacar.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by hsamao on 11/20/15.
 */

@Aspect
public class RentLoggerAspect {

    @Pointcut ("within(com.samao.rentacab.service..*)")
    public void loggerPointCut(){

    }

    @Before(value = "loggerPointCut()")
    public void log(){
        System.out.println("I was called before rent..... ");
    }
}
