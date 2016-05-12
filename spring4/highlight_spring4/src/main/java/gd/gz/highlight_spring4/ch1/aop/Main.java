package gd.gz.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

		DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
		DemomEthodService ethodService = context.getBean(DemomEthodService.class);

		demoAnnotationService.add();

		ethodService.add();

		context.close();
	}

}
