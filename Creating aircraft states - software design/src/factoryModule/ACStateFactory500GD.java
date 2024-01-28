package factoryModule;

import stateModule.*;

public class ACStateFactory500GD extends ACStateFactory{
	
	public IAircraftState create() {
		return new Below500GD();
	}

}
