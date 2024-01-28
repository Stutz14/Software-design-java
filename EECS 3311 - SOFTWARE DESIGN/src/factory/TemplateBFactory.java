package factory;

import template.TemplateB;

public class TemplateBFactory implements ITemplateFactory {

	@Override
	public TemplateB create() {
		// TODO Auto-generated method stub
		return new TemplateB();
	}

}
