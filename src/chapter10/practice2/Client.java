package chapter10.practice2;

import java.util.HashSet;

public class Client {

	public static void main(String[] args) {
		HashSet<String> options = new HashSet<>();
		BasicCar basicCar = new BasicCar(2000, "Avante");
		CarOptionDecorator decorator = null;

//		options.add("AirBag");
		options.add("Navi");
		options.add("ESC");
		options.add("SCC");
		if (options.size() == 0) {
			System.out.println("차 정보 : " + basicCar.getCarInfo());
			System.out.println("차 값 : " + basicCar.getPrice());
			return;
		}

		CarComponent prevCarComp = basicCar;
		for (String option : options) {
			switch (option) {
			case "AirBag":
				decorator = new AirBagDecorator(prevCarComp, 100);
				break;
			case "SCC":
				decorator = new SCCDecorator(prevCarComp, 200);
				break;
			case "Navi":
				decorator = new NaviDecorator(prevCarComp, 50);
				break;
			case "ESC":
				decorator = new ESCDecorator(prevCarComp, 120);
				break;
			default:
				break;
			}
			prevCarComp = decorator;
		}
		System.out.println("차 정보 : " + decorator.getCarInfo());
		System.out.println("차 값 : " + decorator.getPrice());

	}

}
