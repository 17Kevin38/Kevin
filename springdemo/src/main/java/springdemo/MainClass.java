package springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beancon.xml");
		beanFactory.getBean("ClassA");
	}

}
