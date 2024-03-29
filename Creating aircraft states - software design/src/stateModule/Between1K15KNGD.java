package stateModule;

import java.util.ArrayList;
import java.util.List;

import controlSurfacesModule.IControlActuator;

public class Between1K15KNGD implements IAircraftState {

	@Override
	public void perform(int curLat, int curLon, int nextLat, int nextLon, List<IControlActuator> actuators) {
		System.out.println("Aircraft in State 3");
		System.out.println("Notify Aileron and Elevator --------------------------");
		List<IControlActuator> currentActuators = new ArrayList<IControlActuator>();
		currentActuators = selectActuators(actuators);
		
		for (IControlActuator anActuator : currentActuators) {
			anActuator.update(curLat, curLon, nextLat, nextLon);
		}

	}

	@Override
	public List<IControlActuator> selectActuators(List<IControlActuator> actuators) {
		List<IControlActuator> currentActuators = new ArrayList<IControlActuator>();
		currentActuators.add(actuators.get(0));
		currentActuators.add(actuators.get(1));

		return currentActuators;

	}

}
