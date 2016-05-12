package gd.gz.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

		TaskSchedulerConfig bean = context.getBean(TaskSchedulerConfig.class);

	}

}
