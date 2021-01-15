package com.cake.manager.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import com.cake.manager.controller.CakeController;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Configuration
@Slf4j
public class CakeAspect {
	
	/**
	 * 
	 * @param joinPoint
	 */
	  @Before("execution(* com.cake.manager.service.interfaces.CakeService.findAll())")
	public void beforeAdvice(JoinPoint joinPoint) {
		
		log.info("================================================================");
		
	    Signature signature = joinPoint.getSignature();
	    String methodName = signature.getName();
	    
	    String arguments = Arrays.toString(joinPoint.getArgs());
	    log.info("Before handler:" + joinPoint.getSignature()+" - We are just about to call method: "
	        + methodName + " with arguments " + arguments);
	    log.info("================================================================");
		
	}
	  
	  

}
