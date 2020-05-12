package AdapterWrapper;

public class FishingBoatAdapter implements RowingBoat {
	
	private FishingBoat boat;

	public FishingBoatAdapter() {
		// here we create the new fishing boat within the adapter
		this.boat = new FishingBoat();
	}
	
	@Override
	public void row() {
		// we adapt the method to rowing
		boat.sail();
	}
}
