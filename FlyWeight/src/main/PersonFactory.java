package main;

import java.util.HashMap;

public class PersonFactory {

	private static HashMap<String, Car> sc = new HashMap<String, Car>();

	public static Car getCar(String type) {
		Car c = null;

		if (sc.containsKey(type))
			c = sc.get(type);
		else {
			switch (type) {
			case "Person1":
				System.out.println("Person1 created");
				c = new Person1();
				break;
			case "Person2":
				System.out.println("Person1 created");
				c = new Person2();
				break;
			default:
				System.out.println("Error");
			}
			sc.put(type,c);
		}
		return c;
	}
}
