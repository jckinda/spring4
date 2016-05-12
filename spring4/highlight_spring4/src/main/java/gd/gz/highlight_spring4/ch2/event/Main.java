package gd.gz.highlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
			
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		
		demoPublisher.publish("Hello application event");

		context.close();
	}

}
