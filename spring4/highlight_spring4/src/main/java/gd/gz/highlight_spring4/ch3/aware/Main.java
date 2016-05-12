package gd.gz.highlight_spring4.ch3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

		AwareService awareService = context.getBean(AwareService.class);
		
		awareService.outputResulut();
		
		context.close();
	}

}
