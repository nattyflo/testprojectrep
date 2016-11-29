package de.nathalie.newproject;

import java.util.Scanner; 

public class testProgram {
	
	public static void main(String[] args) {
		System.out.println("Eingabe von Buchstaben wird erwartet:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.println(input.toUpperCase());
		scanner.close();
	}

}