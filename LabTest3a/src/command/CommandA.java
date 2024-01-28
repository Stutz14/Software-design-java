package command;

import template.GeneralTemplate;

public class CommandA extends AbsCommand {

	@Override
	public GeneralTemplate getaReceiver() {
		return aReceiver;
	}

	@Override
	public void setaReceiver(GeneralTemplate aNewReceiver) {
		aReceiver = aNewReceiver;
	}

	@Override
	public void doAction() {
		aReceiver.transaction();
	}

}
