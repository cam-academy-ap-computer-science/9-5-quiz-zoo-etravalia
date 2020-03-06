
public class Animal {
	private String name;
	private String food;
	private String says;
	
	public Animal (String myName, String myFood, String ISay) {
		this.name = myName;
		this.food = myFood;
		this.says = ISay;
	}
	
	public String getType() {
		Object o = this;
		if (o instanceof Seal) {
			return "Seal";
		} else if (o instanceof Whale) {
			return "Whale";
		} else if (o instanceof Seagull) {
			return "Seagull";
		} 
		return "Hmm... What is this thing?";
	}	
	public String getName() {
		return this.name;
	}
	public String getFood() {
		return this.food;
	}
	public String getSays() {
		return this.says;
	}
	
	public String toString() {
		return "This " + getType() + " named " + getName() + " says " + getSays() + " and likes to eat " + getFood();
	}
}
