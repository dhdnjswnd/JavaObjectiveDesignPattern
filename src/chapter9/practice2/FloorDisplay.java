package chapter9.practice2;

public class FloorDisplay implements Observer {
	private ElevatorController elevatorController;

	public FloorDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	public void update() {
		int level = elevatorController.getCurFloor();
		System.out.println("FloorDisplay : " + level);
	}
}
