package chapter7_statepattern;

public class client {

	public static void main(String[] args) {
		Light light = new Light();
		light.on_button_pushed();
		light.on_button_pushed();
		light.on_button_pushed();
		light.off_button_pushed();
	}

}
