package basics.annotations;

public class Tyre {
private String brand;
	
	public Tyre() {
		System.out.println("tyre constructor");
	}
	
	

	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {      //  <property name="brand" value="MRF"></property>

		this.brand = brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tyre brand = "+ brand;
				//super.toString();
	}
	/*private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tyre brand = "+ brand;
				//super.toString();
	}*/

}
