package chapter8_commandPattern.pratice3;

public class Client {
	public static void main(String[] args) {
		ElevatorController controller1 = new ElevatorController(1);
		ElevatorController controller2 = new ElevatorController(2);

		ElevatorManager em = new ElevatorManager(2);
		em.addController(controller1);
		em.addController(controller2);
		// 1번 엘레베이터 1층 위치.
		Command destinationCommand1stController = new DestinationSelectionCommand(1, controller1);
		ElevatorButton destinationButton1stFloor = new ElevatorButton(destinationCommand1stController);
		destinationButton1stFloor.pressed();
//		Command destinationCommand4thController = new DestinationSelectionCommand(4, controller1);
//		destinationButton1stFloor.setCommand(destinationCommand4thController);
//		destinationButton1stFloor.pressed();
		
		// 2번 엘레베이터 2층 위치시키려는 목적의 목적지 층 버튼
		Command destinationCommand2ndController = new DestinationSelectionCommand(2, controller2);
		ElevatorButton destinationButton2ndFloor = new ElevatorButton(destinationCommand2ndController);
		destinationButton2ndFloor.pressed();
		
		// 1번 엘레베이터 2층에서 아래로 이동시키려는 엘레베이터 요청 버튼.
		Command reqeustDownCommand = new ElevatorRequestCommand(2, Direction.DOWN, em);
		ElevatorButton requestDownFloorButton2ndFloor = new ElevatorButton(reqeustDownCommand);
		requestDownFloorButton2ndFloor.pressed();
	}
}
