package gd.gz.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {
	private static final SimpleDateFormat dateFormaet = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void repoerCurrentTime(){
		System.out.println("每隔五秒执行一次"+ dateFormaet.format(new Date()));
	}
	
	@Scheduled(cron="0 12 23 ? * *")
	public void fixTimeExecution(){
		System.out.println("在指定时间"+dateFormaet.format(new Date()));
	}
}
