package CompositePattern;

public class Leaf implements Component {

	// individual object that will implement the component interface
	
	private Double baseNumber;
	private Boolean canReduce;
	
	public Leaf(Double base, Boolean reducible) {
		this.baseNumber = base;
		this.canReduce = reducible;
	}

	@Override
	public Double calculate(Double reduction) {
		return canReduce ? baseNumber*(1.0 - (reduction)/100.0) : baseNumber;
	}
}
