package adapterStates;

import backEndServices.BackEndService3;
import utilities.RequestObject;

public class AdapterState3 extends AdapterState {

	public void invokeBackEnd(RequestObject aRequest) {

		BackEndService3 aBackEndService = new BackEndService3();
		aBackEndService.do3();

	}
}
