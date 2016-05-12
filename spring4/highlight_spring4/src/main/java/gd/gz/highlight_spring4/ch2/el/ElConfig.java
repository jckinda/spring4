package gd.gz.highlight_spring4.ch2.el;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("highlight_spring4.ch2.el")
@PropertySource("classpath:highlight_spring4/ch2/el/test.properties")
public class ElConfig {
	@Value("I love you")
	private String normal;
	
	@Value("#{systemProperties['os.name']}")
	private String onName;
	
	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNumber;
	
	@Value("#{demoService.another}")
	private String fromAnother;
	
	@Value("classpath:highlight_spring4/ch2/el/test.properties")
	private Resource testFile;
	
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	@Value("${book.name}")
	private String bookName;
	
	@Autowired
	private Environment environment;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@SuppressWarnings("deprecation")
	public void outputResource(){
		try {
			System.out.println(normal);
			System.out.println(onName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
