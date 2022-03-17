package chapter8_commandPattern;
//concrete Command�� �ش�.
public class MuteCommand implements Command{
	private TV tv;
	@Override
	public void execute() {
		tv.mute();		
	}

	public MuteCommand(TV tv) {
		this.tv=tv;		
	}

}
