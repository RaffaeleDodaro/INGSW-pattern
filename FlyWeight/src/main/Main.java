package main;

import java.util.Scanner;

public class Main {

	private static String[] personType = {"Person1","Person2"};
	private static String[] carName= {"Audi","BMW"};
	
	
	public static void main(String[] args) {
		for(int i = 0;i<2;i++)
		{
			Car c = Factory.getCar(personType[i]);
			c.assignCar(carName[i]);
			c.assign();
			System.out.println();
		}

	}

}
