package adapterStates;

import backEndServices.BackEndService2;
import utilities.RequestObject;

public class AdapterState2 extends AdapterState {

	public void invokeBackEnd(RequestObject aRequest) {

		BackEndService2 aBackEndService = new BackEndService2();
		aBackEndService.do2();

	}
}
