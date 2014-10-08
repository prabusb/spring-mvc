/**
 *
 */
package com.learn.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Aspect class to print the logging. You can configure whereever you want.
 *
 * @author Prabu S B
 *
 */

@Aspect
public class LoggingAspect {

	/**
	 * Method to print logging before method starts from Controller.
	 * Below point cut is configured to log for all method from controller before accessing.
	 *
	 * @param joinPoint JoinPoint
	 */

	@After("execution(* com.learn.mvc.controller.LearnController.*(..))")
	public void logBefore(JoinPoint joinPoint) {
		System.out.println("Around() is running!");
		System.out.println("method name : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	/*@AfterThrowing(pointcut = "execution(* com.learn.mvc.controller.LearnController.*(..))",  throwing= "error")  
	public Object handleException(JoinPoint joinPoint, Exception error) {
		System.out.println(error.getMessage());		
		return new Object();
	}
	*/

}
