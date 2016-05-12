package gd.gz.highlight_spring4.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loader;
	
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		this.loader=resourceLoader;
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName=name;
	}
	
	public void outputResulut(){
		System.out.println("bean的名称为:"+beanName);
		
		Resource resource = loader.getResource("classpath:highlight_spring4/ch3/aware/text.txt");
		
		try {
			System.out.println("ResourceLoader加载的文件内容为:"+IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
