package gd.gz.highlight_spring4.ch2.prepost;

public class BeanWayService {
	public void init() {
		System.out.println("@bean-init-method");
	}

	public BeanWayService() {
		System.out.println("初始化BeanWayService");
	}

	public void destroy() {
		System.out.println("@bean-destroy-method");
	}
}
