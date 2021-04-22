package oap.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.service.FactoryService;
import aop.service.ShapeService;


public class AppMain {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aspect.xml");
		//ShapeService shapeService = context.getBean("shapeService",ShapeService.class);
		//System.out.println(shapeService.getTriangle().setName("isoceless"));
		ShapeService shapeService = (ShapeService) context.getBean("shapeService");
		System.out.println(shapeService.getCircle().getName());
		//System.out.println(shapeService.getCircle().getDia());
		//shapeService.getCircle().setName("incircle");
		//System.out.println(shapeService.getTriangle().getName());
		//System.out.println(shapeService.getCircle().getDia());
		//shapeService.getCircle().setName("semi circle");
}

}
