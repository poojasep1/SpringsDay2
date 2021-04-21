package basics.annotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Car implements Vehicle{
	/*public void drive() {
		System.out.println("driving car");
	}*/
	public Car() {
		System.out.println("Car- constructor");
	}
	
	@Autowired
	Tyre tyre;
	
	
	public Tyre getTyre() {
		return tyre;
	}


	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}


	public void drive() {
		System.out.println("driving car with tyre"+tyre);
	}

}
