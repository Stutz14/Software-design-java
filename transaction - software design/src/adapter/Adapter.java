package adapter;

import utilities.*;
import adapterStates.*;



public class Adapter {
	
	private static Adapter instance = null;
	private static AdapterState hasAdapterState = null;
	
	private Adapter Adapter() {
		return new Adapter();
	}
	
	public static Adapter getInstance() {
		if(instance == null) {
			instance = new Adapter();	
		}
		return instance;
		
	}
	
	public void invoke(RequestObject aRequest) {
		
		hasAdapterState.invokeBackEnd(aRequest);

	}

	public AdapterState getHasAdapterState() {
		return hasAdapterState;
	}

	public void setHasAdapterState(AdapterState hasAdapterState) {
		this.hasAdapterState = hasAdapterState;
	}
	

}
