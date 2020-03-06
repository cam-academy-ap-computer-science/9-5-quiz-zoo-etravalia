
public class Exhibit {
	private int numAnimals;
	private int maxAnimals;
	private Animal[] animals;
	private String exhibitName;
	
	public Exhibit (String name, int max) {
		this.exhibitName = name;
		this.maxAnimals = max;
		this.animals = new Animal[maxAnimals];
	}
	public int getNumAnimals() {
		return this.numAnimals; 
	}
	public Animal[] getAnimals() {
		return this.animals;
	}
	public void addAnimal(Animal a) {
		if (numAnimals == maxAnimals) {
			System.out.println("Sorry, this exhibit " + this.exhibitName + " is full.");
			return;
		}
		this.animals[this.numAnimals] = a;
		this.numAnimals += 1;
	}
}
