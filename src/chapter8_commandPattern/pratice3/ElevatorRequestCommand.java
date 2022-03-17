package chapter8_commandPattern.pratice3;

public class ElevatorRequestCommand implements Command {
	private int destination;
	private Direction direction;
	private ElevatorManager manager;
	@Override
	public void execute() {
		manager.requestElevator(destination, direction);
	}
	
	public ElevatorRequestCommand(int destination, Direction direction, ElevatorManager manager) {
		this.destination=destination;
		this.direction=direction;
		this.manager=manager;
	}
}
