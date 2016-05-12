package gd.gz.highlight_spring4.ch1.javaconfig;

import javax.naming.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("java config"));
		context.close();
	}
}
