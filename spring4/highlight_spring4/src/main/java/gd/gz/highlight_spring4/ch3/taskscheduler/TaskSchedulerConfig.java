package gd.gz.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("highlight_spring4.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
