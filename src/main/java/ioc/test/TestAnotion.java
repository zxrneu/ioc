package ioc.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ioc.pojo.Category;

@ContextConfiguration(name="classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestAnotion {
	@Autowired
    Category c;
	@Test
	public void test() {
		System.out.println(c.getName());
	}
}
