package myAnimalsProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[] animals = new String[5];
		

		System.out.println("Enter animal number 1");
		animals[0] = scanner.next();
		
		System.out.println("\n" + "Enter animal number 2");
		animals[1] = scanner.next();
		
		System.out.println("\n" + "Enter animal number 3");
		animals[2] = scanner.next();
		
		System.out.println("\n" + "Animal 1 is: " + animals[0]);
		System.out.println("Animal 2 is: " + animals[1]);
		System.out.println("Animal 3 is: " + animals[2]);
		System.out.println("Animal 4 is: " + animals[3]);
		}
}
