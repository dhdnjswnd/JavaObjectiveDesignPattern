package chapter8_commandPattern;

public class Client {

	public static void main(String[] args) {
		TwoButtonController controller = new TwoButtonController();
		TV tv= new TV();
		
		PowerCommand pCommand = new PowerCommand(tv);
		controller.setCommand(pCommand, pCommand);
		System.out.println("2-5");
		controller.button1Pressed();
		controller.button2Pressed();
		controller.button1Pressed();
		controller.button1Pressed();
		controller.button2Pressed();
		controller.button1Pressed();
		// 2-5 결과
//		Power On
//		Power Off
//		Power On
//		Power Off
//		Power On
//		Power Off
		
		controller = new TwoButtonController();
		tv= new TV();
		
		pCommand = new PowerCommand(tv);
		MuteCommand mCommand = new MuteCommand(tv);
		
		System.out.println("2-6");
		controller.setCommand(mCommand, pCommand);
		controller.button1Pressed();
		controller.button2Pressed();
		controller.button1Pressed();
		controller.button1Pressed();
		controller.button2Pressed();
		controller.button1Pressed();
		// 2-6 결과
//		Power On
//		Mute On
//		Mute Off
//		Power Off
		
	}

}
