package chapter9.practice2;

public class VoiceNotice implements Observer {
	private ElevatorController elevatorController;

	public VoiceNotice(ElevatorController elevatorController) {
		this.elevatorController = elevatorController;
	}

	public void update() {
		int level = elevatorController.getCurFloor();
		System.out.println("VoiceNotice : " + level);
	}
}
