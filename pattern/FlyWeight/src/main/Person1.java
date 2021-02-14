package main;

public class Person1 implements Car{
	private String name;//attributo intrinseco

	private String car;

	public Person1() {name="Raffaele";}
	@Override
	public void assignCar(String car) {
		this.car=car;
	}

	@Override
	public void assign() {
		System.out.println("Person "+name+" " + car);
	}
}
