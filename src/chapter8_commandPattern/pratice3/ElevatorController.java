package chapter8_commandPattern.pratice3;

public class ElevatorController {
	private int id;
	private int curFloor;

	public ElevatorController(int id) {
		this.id = id;
	}

	public void gotoFloor(int dest) {
		System.out.println("curFloor: " + curFloor + " - > destFloor : " + dest);
		curFloor = dest;
	}

	public int getId() {
		return id;
	}
}
