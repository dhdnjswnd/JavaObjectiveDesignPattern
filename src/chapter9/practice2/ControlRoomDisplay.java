package chapter9.practice2;

public class ControlRoomDisplay implements Observer {
	private ElevatorController elevatorController;

	public ControlRoomDisplay(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	public void update() {
		int level = elevatorController.getCurFloor();
		System.out.println("ControllRoomDisplay : " + level);
	}
}
