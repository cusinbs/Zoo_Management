package ZooManagement;

abstract class Animal {
	protected String animalType;
	protected String exhibitType;
	
	public String getAnimalType() {
		return animalType;
	}
	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
	public String getExhibitType() {
		return exhibitType;
	}
	public void setExhibitType(String exhibitType) {
		this.exhibitType = exhibitType;
	}
	
}
