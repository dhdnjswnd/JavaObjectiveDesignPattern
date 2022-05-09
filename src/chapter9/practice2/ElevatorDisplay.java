package chapter9.practice2;

public class ElevatorDisplay implements Observer {
	private ElevatorController elevatorController;

	public ElevatorDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	public void update() {
		int level = elevatorController.getCurFloor();
		System.out.println("ElevatorDisplay : " + level);
	}
}
