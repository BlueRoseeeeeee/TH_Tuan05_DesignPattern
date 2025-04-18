package my_decorator_pattern;

public class SportCar extends DecorateCar{

	public SportCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	public void assemble() {
		super.assemble();
		System.out.println("Add feature: Sport Car");
	}

}
