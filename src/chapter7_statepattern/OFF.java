package chapter7_statepattern;

public class OFF implements State {
	private static OFF off = new OFF();

	public static OFF getInstance() {
		return off;
	}

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light ON");
		light.setState(ON.getInstance());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("���� ����");
	}

}
