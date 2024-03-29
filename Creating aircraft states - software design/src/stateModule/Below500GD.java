package stateModule;

import java.util.List;

import controlSurfacesModule.IControlActuator;

public class Below500GD implements IAircraftState {

	@Override
	public void perform(int curLat, int curLon, int nextLat, int nextLon, List<IControlActuator> actuators) {
		System.out.println("Aircraft in State 1");
		System.out.println("------------- Landing State - No actuator is triggered -------------");
	}

	@Override
	public List<IControlActuator> selectActuators(List<IControlActuator> actuators) {
		// Just return the same three actuators 
		return actuators;
	}

}
