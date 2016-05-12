package gd.gz.highlight_spring4.ch3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		DemoService demoService = context.getBean(DemoService.class);

		demoService.outputResult();

		context.close();
	}

}
