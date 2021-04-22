package oap.service;
import oap.model.Circle;
import oap.model.Triangle;
public class FcatoryService {
	public Object getBean(String beanType) {
		if(beanType.equals("shapeService")) return new ShapeServiceProxy(); //3. ShapeService();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("triangle")) return new Triangle();
		else 	return null;
	}


}
