package com.tka.utility;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MesssageAspects {

		@After("execution (public void deposit())")
		public void sendSms() {
			System.out.println("SMS Send to client....");
		}
		
//		@After("execution (public void deposit1(..))")
//		public void sendSmsMoney(JoinPoint jt) {
//			System.out.println("SMS Send To the Client..... U Amount is "+Arrays.toString(jt.getArgs()));
//			}
		
		
		@Before("execution (public void withdraw())")
		public void pinValid() {
			System.out.println("Pin is validatated");
		} 
		
		@Around("execution (* com.tka.entity.Account.*(..))")
		public void arroundMessage(ProceedingJoinPoint p)  {
			
			System.out.println("======== before Method Pin is validatated==============");
			//pin validation logic 
			
			// end of pin validation logic 
			
			try {
				p.proceed();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// Send SMS Logic 
			
			System.out.println("========After Method Send SMS Logic=====");
			
			
			
			
		}
		
		
		
		
	
}
