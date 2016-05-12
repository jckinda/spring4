package gd.gz.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务:" + i);
	}

	@Async
	public void execcuteAsyncTaskPlus(Integer i) {
		System.out.println("执行迅步 任务+1：" + i);
	}
}
