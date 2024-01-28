package factoryModule;

import java.util.HashMap;

public class ACStateFactoryRepo {
	private static ACStateFactoryRepo instance = null;
	
	private HashMap<Integer, ACStateFactory> acStateRepo = null;
	
	private ACStateFactoryRepo ACStateFactoryRepo() {
		return new ACStateFactoryRepo();
	}
	
	public static ACStateFactoryRepo getInstance() {
		if(instance == null) {
			instance = new ACStateFactoryRepo();
		}
		return instance;
	}

	public HashMap<Integer, ACStateFactory> getAcStateRepo() {
		return acStateRepo;
	}

	public void setAcStateRepo(HashMap<Integer, ACStateFactory> acStateRepo) {
		this.acStateRepo = acStateRepo;
	}

}
