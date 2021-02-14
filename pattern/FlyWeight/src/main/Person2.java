package main;

public class Person2 implements Car{
	private String name;//attributo intrinseco

	private String car;
	
	public Person2(){
		name="Francesco";
	}
	
	@Override
	public void assignCar(String car) {
		this.car=car;
	}

	@Override
	public void assign() {
		System.out.println("Person "+name+" " + car);
	}
}
