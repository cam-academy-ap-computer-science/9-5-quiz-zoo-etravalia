
public class Main {

	public static void main(String[] args) {
		// Create a zoo object
		Zoo thisZoo = new Zoo(10,10);
		int totalAnimals = 0;
		
		populateMyZoo(thisZoo);
		
		// Print out info for all animals in the zoo
		for (Exhibit e: thisZoo.getExhibits()) {
			if (e == null) continue;
			totalAnimals += e.getNumAnimals();
			for (Animal a : e.getAnimals()) {
				if (a == null) continue;
				System.out.println(a.toString());
			}
		}
		// Print out "The total number of animals in the zoo is <number>"
		System.out.println("The total number of animals in the zoo is " + totalAnimals);
	}


	public static void populateMyZoo(Zoo thisZoo) {
		Animal a = new Seagull("garry");
		Animal b = new Seagull("gus");
		Animal c = new Seagull("gill");
		
		Exhibit e1 = new SeaMammalExhibit("seagulls", 10);
		e1.addAnimal(a);
		e1.addAnimal(b);
		e1.addAnimal(c);
		thisZoo.addExhibit(e1);

		Animal d = new Seal("sue");
		Animal e = new Seal("sara");
		Animal f = new Seal("seamore");
		
		Exhibit e2 = new SeaMammalExhibit("seals", 10);
		e2.addAnimal(d);
		e2.addAnimal(e);
		e2.addAnimal(f);
		thisZoo.addExhibit(e2);
		
		Animal g = new Whale("willy");
		Animal h = new Whale("wally");
		Animal i = new Whale("wilber");
		
		Exhibit e3 = new SeaMammalExhibit("whales", 10);
		e3.addAnimal(g);
		e3.addAnimal(h);
		e3.addAnimal(i);
		thisZoo.addExhibit(e3);
		
	}
}
