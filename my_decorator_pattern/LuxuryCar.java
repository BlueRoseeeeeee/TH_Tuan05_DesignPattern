package my_decorator_pattern;

public class LuxuryCar extends DecorateCar {

	public LuxuryCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	public void assemble() {
		super.assemble();
		System.out.println("Add feature: Luxury Car");
	}
	
	

}
