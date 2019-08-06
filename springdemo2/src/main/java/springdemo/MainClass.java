package springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("BEAN FACTORY 1");
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beancon.xml");
		ClassA ClassA1 = (ClassA)beanFactory.getBean("ClassA");
		ClassA ClassA2 = (ClassA)beanFactory.getBean("ClassA");
		System.out.println(ClassA1);
		System.out.println(ClassA2);
		System.out.println(ClassA1.getB());
		System.out.println(ClassA2.getB());
		//System.out.println(beanFactory.getBean("ClassA"));
		//System.out.println(beanFactory.getBean("ClassA")); 
		System.out.println("BEAN FACTORY 2");
		BeanFactory beanFactory2 = new ClassPathXmlApplicationContext("beancon.xml");
		ClassA ClassA3 = (ClassA)beanFactory2.getBean("ClassA");
		ClassA ClassA4 = (ClassA)beanFactory2.getBean("ClassA");
		System.out.println(ClassA3);
		System.out.println(ClassA4);
		System.out.println(ClassA3.getB());
		System.out.println(ClassA4.getB());
	}

}
