package chapter8_commandPattern.pratice3;

public class DestinationSelectionCommand implements Command {
	private int destination;
	private ElevatorController controller;
	@Override
	public void execute() {
		controller.gotoFloor(destination);
	}
	
	public DestinationSelectionCommand(int destination, ElevatorController controller) {
		this.destination=destination;
		this.controller=controller;
	}

}
