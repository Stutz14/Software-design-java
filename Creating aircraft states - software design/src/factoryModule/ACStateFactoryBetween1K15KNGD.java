package factoryModule;


import stateModule.Between1K15KNGD;
import stateModule.IAircraftState;

public class ACStateFactoryBetween1K15KNGD extends ACStateFactory {
	public IAircraftState create() {
		return new Between1K15KNGD();
	}

}
