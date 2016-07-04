package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/*
@Aspect
public class Audience {
	
	@Before("execution(** concert.Performance.perform(..))")
	public void silenceCellPhones(){
		System.out.println("Silencing cell Phones");
	}
	
	@Before("execution(** concert.Performance.perform(..))")
	public void takeSeats(){
		System.out.println("Taking seats");
	}
	
	@AfterReturning("execution(** concert.Performance.perform(..))")
	public void applause(){
		System.out.println("CLAP CLAP CLAP");
	}
	
	@AfterThrowing("execution(** concert.Performance.perform(..))")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
}
*/
@Aspect
public class Audience{
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance(){}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		try{
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!!!");
		}catch(Throwable e){
			System.out.println("Deamnding a refund");
		}
	}
}
