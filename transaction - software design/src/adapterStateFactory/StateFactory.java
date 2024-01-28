package adapterStateFactory;

import adapterStates.*;

public class StateFactory {
	
	private static StateFactory instance = null;
	
	private StateFactory StateFactory() {
		return new StateFactory();
	}
	
	public static StateFactory getInstance() {
		if(instance == null) {
			instance = new StateFactory();
		}
		return instance;
	}
	public AdapterState create(int selection) {
		AdapterState theState = new AdapterState1(); // The deafault choice. You can return a NullState too - see refactorings
		
		if(selection == 1) {
			theState =  new AdapterState1();
		}
		if(selection == 2) {
			theState = new AdapterState2();
		}
		if(selection == 3) {
			theState = new AdapterState3();
		}
		
		return theState;
		
		
	}

}
