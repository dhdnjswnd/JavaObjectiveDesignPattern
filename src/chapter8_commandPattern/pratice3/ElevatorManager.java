package chapter8_commandPattern.pratice3;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class ElevatorManager {
	private int controllerCnt;
	private HashMap<Integer, ElevatorController> controllerList = new HashMap<>();

	public ElevatorManager(int controllerCnt) {
		this.controllerCnt = controllerCnt;
	}

	public void addController(ElevatorController controller) {
		if (controllerList.size() >= controllerCnt)
			return;
		if (!controllerList.containsValue(controller))
			controllerList.put(controller.getId(), controller);
	}

	public void requestElevator(int destination, Direction direction) {
		int selectedElevatorId = selectElevator(destination, direction);
		ElevatorController selectedElevator = controllerList.get(selectedElevatorId);
		selectedElevator.gotoFloor(destination);
	}

	private int selectElevator(int destination, Direction direction) {
		HashSet<Integer> tempSet = new HashSet<>(controllerList.keySet());
		int g = (int) (Math.random() * tempSet.size());
		int flag = 0;

		for (int i : tempSet) {
			if (flag == g)
				return i;
			flag++;
		}
		return 0;
	}

}
