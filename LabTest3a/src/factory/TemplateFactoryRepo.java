package factory;

import java.util.HashMap;

public class TemplateFactoryRepo {
	
	private static TemplateFactoryRepo instance = null;
	private HashMap<String, ITemplateFactory> theFactoryRepo;
	
	private TemplateFactoryRepo TemplateFactoryRepo() {
		return new TemplateFactoryRepo();
	}
	
	public static TemplateFactoryRepo getInstance() {
		if(instance == null) {
			instance = new TemplateFactoryRepo();
		}
		return instance;
	}
	
	

	public HashMap<String, ITemplateFactory> getTheFactoryRepo() {
		return theFactoryRepo;
	}

	public void setTheFactoryRepo(HashMap<String, ITemplateFactory> theFactoryRepo) {
		this.theFactoryRepo = theFactoryRepo;
	}
	
	
	public void addFactoryToRepo(String index, ITemplateFactory aFactory) {
		theFactoryRepo.put(index, aFactory);
	}

}
