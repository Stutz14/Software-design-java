package factoryModule;

import stateModule.Below1KNGD;
import stateModule.IAircraftState;

public class ACStateFactoryBelow1KNGD extends ACStateFactory {

	public IAircraftState create() {
		return new Below1KNGD();
	}
}
