package ioc.service;

import org.springframework.stereotype.Component;

@Component("cal")
public class CalService {
	public void doSomeService(){
        long sum=0L;
        long l=10000L;
        for (int i = 0; i < l; i++) {
			for (int j = 0; j < i; j++) {
				sum +=i*j+Math.pow(i, 3);
			}
		}
        System.out.println("cal:"+sum);
         
    }
}
