package my_decorator_pattern;

public class TestMain {
	public static void main(String[] args) {
		Car sportsCar= new SportCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("========================================");
		Car luxuryCar = new LuxuryCar(new BasicCar());
		luxuryCar.assemble();
	}

}
