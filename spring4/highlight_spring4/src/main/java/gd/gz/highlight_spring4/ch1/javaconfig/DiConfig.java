package gd.gz.highlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("highlight_spring4.ch1.javaconfig")
public class DiConfig {

	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}

	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}

	public DiConfig() {
	}

}
