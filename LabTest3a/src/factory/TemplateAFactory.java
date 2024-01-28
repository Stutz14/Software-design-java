package factory;

import template.TemplateA;

public class TemplateAFactory implements ITemplateFactory {
	
	public TemplateA create() {
		return new TemplateA();
	}

}
