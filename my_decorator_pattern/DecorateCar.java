package my_decorator_pattern;

public class DecorateCar implements Car {
	protected Car car;

	public DecorateCar(Car car) {
		super();
		this.car = car;
	}


	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		this.car.assemble();
		
	}

}
