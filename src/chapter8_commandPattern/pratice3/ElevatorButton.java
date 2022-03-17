package chapter8_commandPattern.pratice3;

public class ElevatorButton {
	private Command command;
	
	public void pressed() {
		command.execute();
	}
	
	public ElevatorButton(Command command) {
		this.command=command;
	}
	
	public void setCommand(Command command) {
		this.command=command;
	}
}
