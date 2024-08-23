package ir.freeland.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Aspect for logging execution.
 *
 */
@Aspect
@Component
public class LoggingAspect {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	
	@After("execution(* ir.freeland.spring.aop.service.EmployeeService.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint){
		LOGGER.debug("****LoggingAspect.logAfterAllMethods() : " + joinPoint.getSignature().getName());
    }
	
	@Before("execution(* ir.freeland.spring.aop.service.EmployeeService.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint){
		LOGGER.debug("****LoggingAspect.logBeforeAllMethods() : " + joinPoint.getSignature().getName());
    }
    
	@AfterThrowing(pointcut = "execution(* ir.freeland.spring.aop.service.EmployeeService.*(..))", throwing = "ex")
	public void logAfterThrowingAllMethods(Exception ex) throws Throwable {
		LOGGER.debug("****LoggingAspect.logAfterThrowingAllMethods(): The exception is" , ex);
	}
	
	@Around("execution(* ir.freeland.spring.aop.service.EmployeeService.*(..))")
    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable{
		LOGGER.debug("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            //Do Something useful, If you have
        }
        LOGGER.debug("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }
 
}
