package CreationalPatterns;

public class MazeGame {

	public final static int NORTH = 1;
	public final static int SOUTH = 2;
	public final static int EAST = 3;
	public final static int WEST = 4;

	MazeGame() {

	}

// Copied the code from the lecturer. There are some errors
//	and this won't compile; will solve later

//	public Maze createMaze() {
//		Maze m = new Maze();
//		Room r1 = new Room(1);
//		Room r2 = new Room(2);
//		Door d = new Door(r1, r2);
//		m.addRoom(r1);
//		m.addRoom(r2);
//		r1.setSide(NORTH, new Wall());
//		r1.setSide(SOUTH, new Wall());
//		r1.setSide(EAST , d);
//		r1.setSide(WEST , new Wall());
//		r2.setSide(NORTH, new Wall());
//		r2.setSide(SOUTH, new Wall());
//		r2.setSide(EAST , new Wall());
//		r2.setSide(WEST , d);
//	}

	// Factory Methods

	Maze makeMaze() {

		return null;
	}

	Maze makeRoom(int no) {

		return null;
	}

	Maze makeDoor(Room r1, Room r2) {

		return null;
	}

}
