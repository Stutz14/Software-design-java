package utilities;

import factory.*;


public class TemplateFactoryRepoPopulator {
	
	private static TemplateFactoryRepoPopulator instance = null;
	
	private TemplateFactoryRepoPopulator templateFactoryRepoPopulator() {
		return new TemplateFactoryRepoPopulator();
	}
	
	public static TemplateFactoryRepoPopulator getInstance() {
		if(instance == null) {
			instance = new TemplateFactoryRepoPopulator();
		}
		return instance;
		
	}

	public TemplateFactoryRepo populate(TemplateFactoryRepo aRepo) {
		
		aRepo.addFactoryToRepo("A", new TemplateAFactory());
		aRepo.addFactoryToRepo("B", new TemplateBFactory());
		aRepo.addFactoryToRepo("C", new TemplateCFactory());
		
		
		return aRepo;
		
		
	}
}
