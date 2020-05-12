package AdapterWrapper;

public class Captain {

	private RowingBoat rowingBoat;
	
	public Captain(RowingBoat boat) {
		this.rowingBoat = boat;
	}
	
	public void row() {
		rowingBoat.row();
	}
	
	// Inner main method
	public static void main(String[] args) {
		var captain = new Captain(new FishingBoatAdapter());
		captain.row();
	}
	
	
	
}


