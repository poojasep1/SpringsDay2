package oap.service;
import oap.aspects.LoggingAspect;
import oap.model.Circle;
public class ShapeServiceProxy extends ShapeService {
	@Override
	public Circle getCircle() {
		new LoggingAspect().myLogginAdvice(); //2.aop will insert this line
		return super.getCircle();
	}
}
