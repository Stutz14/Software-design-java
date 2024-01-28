package adapterStates;

import backEndServices.BackEndService1;
import utilities.*;

public class AdapterState1 extends AdapterState {
	
	public void invokeBackEnd(RequestObject aRequest) {
		
		BackEndService1 aBackEndService = new BackEndService1();
		aBackEndService.do1();
		
	}

}
