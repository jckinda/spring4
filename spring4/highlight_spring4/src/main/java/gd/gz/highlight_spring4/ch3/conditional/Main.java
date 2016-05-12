package gd.gz.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

		ListService listService = context.getBean(ListService.class);

		System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为" + listService.showLisCmd());

	}

}
