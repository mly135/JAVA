package user.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AopTest implements IAopTest{
	//@Before("execution (public void user.dao.impl.UserDaoImpl.insertToDb(user.com.bjsxt.User))")
	@Before("execution(* user.dao.IUserDao.*(..))")
	@Override
	public void startMethod(){
		System.out.println("AOP Aspect mothod..Start....");
	}
	@After("execution(* user.dao.IUserDao.*(..))")
	@Override
	public void endMethod() {
		System.out.println("AOP Aspect mothod..End....");
	}
	
	
	
	/**
	 * PointCut
	 */
/*	
	@Pointcut("execution(* user.dao.IUserDao.*(..))")
	public void getMethod(){
		
	}
	
	@Before("getMethod()")
	@Override
	public void startMethod(){
		System.out.println("AOP Aspect mothod..Start....");
	}
	@After("getMethod()")
	@Override
	public void endMethod() {
		System.out.println("AOP Aspect mothod..End....");
	}*/

}
