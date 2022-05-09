package chapter9.practice2;

public class Client {

	public static void main(String[] args) {
		ElevatorController eController = new ElevatorController();
		ElevatorDisplay eDisplay = new ElevatorDisplay(eController);
		FloorDisplay fDisplay = new FloorDisplay(eController);
		VoiceNotice vNotice = new VoiceNotice(eController);
		ControlRoomDisplay crDisplay = new ControlRoomDisplay(eController);

		eController.attach(eDisplay);
		eController.attach(vNotice);
		eController.attach(fDisplay);
		eController.attach(crDisplay);
		
		eController.gotoFloor(5);
		eController.gotoFloor(10);
	}

}
