package ZooManagement;

import java.util.Random;
import java.util.Scanner;

public class Main {
	//Initialized the exhibits
	static Savanna savanna1 = new Savanna();
	static Savanna savanna2 = new Savanna();
	static Arctic arctic1 = new Arctic();
	static Arctic arctic2 = new Arctic();
	static Ocean ocean1 = new Ocean();
	static Ocean ocean2 = new Ocean();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Zoo Management System");
		String choice = null;
		do {
			Animal randAnimal = getRandomAnimal(); //generate a random animal
			boolean isSuccess = false; //an indicator to keep user in the loop if they can't place the animal correctly
			while(!isSuccess) {
				System.out.println("\nA new " + randAnimal.getAnimalType().toLowerCase() + " is ready to be placed. Select an exhibit: ");
				choice = menu().toLowerCase();
				switch(choice) {
					case "a":
						isSuccess = savanna1.add(randAnimal);
						break;
					case "b":
						isSuccess = savanna2.add(randAnimal);
						break;
					case "c":
						isSuccess = arctic1.add(randAnimal);
						break;
					case "d":
						isSuccess = arctic2.add(randAnimal);
						break;
					case "e":
						isSuccess = ocean1.add(randAnimal);
						break;
					case "f":
						isSuccess = ocean2.add(randAnimal);
						break;
					case "exit":
						isSuccess = true;
						continue; //if a valid option is selected, go back to the beginning of the loop to avoid print out the error message below.
					default:
						isSuccess = false;
						System.out.println("Please select a valid option!");
						continue; //if a valid option is selected, go back to the beginning of the loop to avoid print out the error message below.
				}
				if(isSuccess) {
					System.out.println("Fantastic! The " + randAnimal.getAnimalType().toLowerCase() + " seems pleased with his new home!");
				}
			}
		}while(!"exit".equals(choice));
	}
	
	private static String menu() {
		Scanner in = new Scanner(System.in);
		System.out.println("Savanna 1 (a) - " + savanna1.getSize() + " animals " + (savanna1.isEmpty() ? "" : "(" + savanna1.getAnimal(0).getAnimalType().toLowerCase() + ")"));
		System.out.println("Savanna 2 (b) - " + savanna2.getSize() + " animals " + (savanna2.isEmpty() ? "" : "(" + savanna2.getAnimal(0).getAnimalType().toLowerCase() + ")"));
		System.out.println("Arctic 1 (c) - " + arctic1.getSize() + " animals " + (arctic1.isEmpty() ? "" : "(" + arctic1.getAnimal(0).getAnimalType().toLowerCase() + ")"));
		System.out.println("Arctic 2 (d) - " + arctic2.getSize() + " animals " + (arctic2.isEmpty() ? "" : "(" + arctic2.getAnimal(0).getAnimalType().toLowerCase() + ")"));
		System.out.println("Ocean 1 (e) - " + ocean1.getSize() + " animals " + (ocean1.isEmpty() ? "" : "(" + ocean1.getAnimal(0).getAnimalType().toLowerCase() + ")"));
		System.out.println("Ocean 2 (f) - " + ocean2.getSize() + " animals " + (ocean2.isEmpty() ? "" : "(" + ocean2.getAnimal(0).getAnimalType().toLowerCase() + ")"));
		System.out.println("Enter \"exit\" to terminate the program");
		System.out.print("Your choice: ");
		return in.nextLine();
	}
	
	private static Animal getRandomAnimal() { //Use the random function to get random animals
		int animalType = new Random().nextInt(6);
		Animal toReturn = null;
		switch(animalType) {
		case 0:
			toReturn = new Elephant();
			break;
		case 1:
			toReturn = new Lion();
			break;
		case 2:
			toReturn = new PolarBear();
			break;
		case 3:
			toReturn = new Penguin();
			break;
		case 4:
			toReturn = new Whale();
			break;
		case 5:
			toReturn = new Dolphin();
			break;
		}
		return toReturn;
	}

}
