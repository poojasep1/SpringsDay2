package basics.annotations;
import org.springframework.stereotype.Component;

public class Car implements Vehicle{
	public void drive() {
		System.out.println("driving car");
	}

}
