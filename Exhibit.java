package ZooManagement;

import java.util.ArrayList;

abstract class Exhibit { //
	protected final int CAPACITY = 4; //maximum number of animal in an exhibit
	protected ArrayList<Animal> animals = new ArrayList<Animal>(); //the array list that will hold all the animals
	protected String exhibitType; //type of the environment
	
	public void setExhibitType(String exhibitType) {
		this.exhibitType = exhibitType;
	}
	
	public String getExhibitType() {
		return this.exhibitType;
	}
	
	private boolean validate(Animal animal) {
		if(animals.size() ==  CAPACITY) {
			System.out.println("The exhibit already have 4 animals!");
			return false;
		}
		
		if(!animals.isEmpty() && animals.get(0).getAnimalType() != animal.getAnimalType()) {
			System.out.println("Only " + animals.get(0).getAnimalType() + " can exist in this exhibit!");
			return false;
		}
		
		if(animal.getExhibitType() != this.getExhibitType()) {
			System.out.println("umm ... a " + animal.getAnimalType().toLowerCase() + " can't be placed there. They need an " + animal.getExhibitType().toLowerCase() + " exhibit.");
			return false;
		}
		
		return true;
	}
	
	public boolean add(Animal animal) {
		if(validate(animal)) {
			animals.add(animal);
			return true;
		}
		return false;
	}
	
	public int getSize() {
		return animals.size();
	}
	
	public boolean isEmpty() {
		return animals.isEmpty();
	}
	
	public Animal getAnimal(int index) {
		return animals.get(index);
	}
}
