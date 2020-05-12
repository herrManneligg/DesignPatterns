package CompositePattern;

import java.util.ArrayList;

// Group of objects

public class Composite {

	private ArrayList<Leaf> children; // Storing the leaves
	private String name;

	Composite(String n) {
		this.name = n;
		children = new ArrayList<>();
	}

	public Double compPrice(Double discount) {
		
		Double price = 0.0;
		
		// ArrayList can be iterated...
		
		for (Leaf a : children) {
			price += a.calculate(discount);
		}
		return price;
	}

	// Add and remove just call the ArrayList methods
	public void add(Leaf a) {
		children.add(a);
	}

	public void remove(Leaf a) {
		children.remove(a);
	}

	// A nice toString method that displays the composite name
	// and the children names
	public String toString() {
		
		String totalString = name;
		totalString += " {";

		for (Leaf a : children) {
			// Invokes toString on children..
			totalString += a + ",";
		}
		
		totalString += "}";
		return totalString;
	}

}
