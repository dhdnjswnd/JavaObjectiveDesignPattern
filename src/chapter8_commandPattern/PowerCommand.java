package chapter8_commandPattern;

// concrete Command�� �ش�.
public class PowerCommand implements Command {
	private TV tv;

	@Override
	public void execute() {
		tv.power();
	}

	public PowerCommand(TV tv) {
		this.tv = tv;
	}
}
