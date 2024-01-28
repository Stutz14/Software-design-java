package utilities;

import java.util.HashMap;

import factoryModule.*;

public class ACStateFactoryRepoPolulator {
	
	private static ACStateFactoryRepoPolulator instance = null;
	
	private ACStateFactoryRepoPolulator ACStateFactoryRepoPolulator() {
		return ACStateFactoryRepoPolulator();
	}

	public static ACStateFactoryRepoPolulator getInstance() {
		if(instance == null) {
			instance = new ACStateFactoryRepoPolulator();
		}
		
		return instance;
	}
	public void polulateACStateFactoryRepo() {
	
	ACStateFactoryRepo anACStateFactoryRepo = ACStateFactoryRepo.getInstance();
	
	anACStateFactoryRepo.setAcStateRepo(new HashMap<Integer, ACStateFactory>());
	anACStateFactoryRepo.getAcStateRepo().put(1, new ACStateFactory500GD());
	anACStateFactoryRepo.getAcStateRepo().put(2, new ACStateFactoryBelow1KNGD());
	anACStateFactoryRepo.getAcStateRepo().put(3, new ACStateFactoryBetween1K15KNGD());
	
	}

}
