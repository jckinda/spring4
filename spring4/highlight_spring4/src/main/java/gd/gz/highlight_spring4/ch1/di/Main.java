package gd.gz.highlight_spring4.ch1.di;

import javax.naming.Context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		System.out.println(useFunctionService.sayHello("di"));
		context.close();
	}
}
