package factory;

import template.TemplateC;

public class TemplateCFactory implements ITemplateFactory {

	@Override
	public TemplateC create() {
		// TODO Auto-generated method stub
		return new TemplateC();
	}

}
