package receiver;

import autopilotModule.Autopilot;
import commandModule.*;
import frontEnd.*;


public class NavigationReceiver {
	

	public Result perform(NavigationCommand aCommand, NavProxy aProxy) {
		
		NavigationCommand copyCommand = aCommand;
	
		System.out.println("Performing the Action on Receiver");
		
		Autopilot autoP = Autopilot.getInstance();
		autoP.setNextWaypointLatitude(aCommand.getNextLat());
		autoP.setNextWaypointLongitude(aCommand.getNextLong());
		autoP.setProxy(aProxy);
		
		Result aResult = new Result();
		
		for (int i = 1; i < 4; i++) {
			aProxy.navigate(autoP);
			System.out.println(" ");
			System.out.println("====================== NEXT CYCLE ==========================");
			System.out.println(" ");
		}
		
		aResult.setResultData("Navigation Completed");
		return aResult;
	
	}

}
