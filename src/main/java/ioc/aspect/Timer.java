package ioc.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Timer {
	@Around(value="execution(* ioc.service.CalService.*(..))")
	public Object calRunTime(ProceedingJoinPoint joinPoint) throws Throwable {
		Date begin = new Date();
        System.out.println("start time:" +begin.toLocaleString());
        Object object = joinPoint.proceed();
        Date end = new Date();
        System.out.println("end time:" + end.toLocaleString());
        int runTime =(int) (end.getTime()-begin.getTime());
        System.out.println(joinPoint.getSignature().getName()+"的运行时间:"+runTime);
        return object;
    }

}
