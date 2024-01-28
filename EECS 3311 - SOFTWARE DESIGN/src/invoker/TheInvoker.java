package invoker;

import command.*;

public class TheInvoker {
	private static TheInvoker instance = null;
	private AbsCommand aCommand = null;
	
	private TheInvoker theInvoker() {
		return new TheInvoker();
	}
	
	public static TheInvoker getInstance() {
		if(instance == null) {
			instance = new TheInvoker();
		}
		return instance;
	}
	
	public void execute() {
		aCommand.doAction();
	}

	public AbsCommand getaCommand() {
		return aCommand;
	}

	public void setaCommand(AbsCommand aCommand) {
		this.aCommand = aCommand;
	}

}
