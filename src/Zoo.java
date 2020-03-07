
public class Zoo {
	private Exhibit[] exhibits;
	private int numExhibits;
	private int maxExhibits;
	
	public Zoo (int maxExhibits, int maxEmployees) {
		this.exhibits = new Exhibit[maxExhibits];
		this.maxExhibits = maxExhibits;
	}
	
	public Exhibit[] getExhibits() {
		return this.exhibits;
	}
	
	public void addExhibit(Exhibit e) {
		if (numExhibits == maxExhibits) {
			System.out.println("Sorry, zoo is full.");
			return;
		}
		this.exhibits[this.numExhibits] = e;
		this.numExhibits += 1;
	}
}
