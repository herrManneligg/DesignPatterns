package CreationalPatterns;

public class Door implements MapSite {

	Room roomOne;
	Room roomTwo;

	public Door(Room r1, Room r2) {
		roomOne = r1;
		roomTwo = r2;
	}

	public Room otherSide(Room r) {
		return null;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}
}
