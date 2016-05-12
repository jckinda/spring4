package gd.gz.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

	public DemoAnnotationService() {
		// TODO Auto-generated constructor stub
	}
	
	@Action(name="注解式拦截的ADD操作")
	public void add(){
		
	}
}
