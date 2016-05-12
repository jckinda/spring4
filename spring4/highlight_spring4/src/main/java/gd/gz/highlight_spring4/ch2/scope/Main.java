package gd.gz.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);

			DemoSingleonService s1 = context.getBean(DemoSingleonService.class);
			DemoSingleonService s2 = context.getBean(DemoSingleonService.class);
			
			DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
			DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);

			System.out.println("s1 & s2 相等？"+s1.equals(s2));
			System.out.println("p1 & p2 相等？"+p1.equals(p2));

		context.close();
	}

}
