package basics.annotations;
import org.springframework.stereotype.Component;

public class Bike implements Vehicle {
	public void drive() {
		System.out.println("riding bike");
	}

}
