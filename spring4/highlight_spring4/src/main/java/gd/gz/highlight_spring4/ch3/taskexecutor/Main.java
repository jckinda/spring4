package gd.gz.highlight_spring4.ch3.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecuteConfig.class);

		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);

		for(int i =0;i<10;i++){
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.execcuteAsyncTaskPlus(i);
		}
		context.close();
	}

}
