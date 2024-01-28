package client;

import utilities.RequestObject;
import utilities.StateReader;
import adapter.*;
import adapterStateFactory.StateFactory;
import adapterStates.*;

public class Transaction {
	private RequestObject aRequestObject = null;
	
	public void performTransaction() {
		Adapter anAdapter = Adapter.getInstance();
		StateFactory aStateFactory = StateFactory.getInstance();
		StateReader aStateReader = StateReader.getInstance();
		int stateSelection = aStateReader.readStateFromUser();
		AdapterState theAdapterState = aStateFactory.create(stateSelection);
		
		anAdapter.setHasAdapterState(theAdapterState);
		anAdapter.invoke(aRequestObject);
	}

	public RequestObject getaRequestObject() {
		return aRequestObject;
	}

	public void setaRequestObject(RequestObject aRequestObject) {
		this.aRequestObject = aRequestObject;
	}

}
