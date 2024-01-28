package client;

import java.util.HashMap;

import factory.*;
import invoker.*;
import template.*;
import utilities.*;
import command.*;

public class TheClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TemplateIDReader aReader = TemplateIDReader.getInstance();
		
		TemplateFactoryRepo aRepo = TemplateFactoryRepo.getInstance();
		aRepo.setTheFactoryRepo(new HashMap<String, ITemplateFactory>());
		
		TemplateFactoryRepoPopulator aPopulator = TemplateFactoryRepoPopulator.getInstance();
		aRepo = aPopulator.populate(aRepo);
		String theInput = aReader.readIDFromUser();
		ITemplateFactory aFactory = aRepo.getTheFactoryRepo().get(theInput);
		GeneralTemplate aTemplate = aFactory.create();
		TheInvoker anInvoker = TheInvoker.getInstance();
		AbsCommand aCommand = new CommandA();
		aCommand.setaReceiver(aTemplate);
		anInvoker.setaCommand(aCommand);
		anInvoker.execute();
		
	
		
		

	}

}
