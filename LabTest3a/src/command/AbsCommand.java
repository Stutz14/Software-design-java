package command;

import template.*;

public abstract class AbsCommand {
	
	protected GeneralTemplate aReceiver;
	
	public abstract void doAction();
	
	public abstract GeneralTemplate getaReceiver();
	
	public abstract void setaReceiver(GeneralTemplate aNewReceiver);
	
}
