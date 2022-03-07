package chapter7_statepattern;

public class SLEEPING implements State {
	private static SLEEPING sleeping = new SLEEPING();

	public static SLEEPING getInstance() {
		return sleeping;
	}

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light ON");
		light.setState(ON.getInstance());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off");
		light.setState(OFF.getInstance());
	}

}
