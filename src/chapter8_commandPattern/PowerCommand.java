package chapter8_commandPattern;

// concrete Command¿¡ ÇØ´ç.
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
