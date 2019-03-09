package net.minecraft.src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class mod_SkinFix extends BaseMod{
	
	private Set fetchedUUID;
	private Map<String, String> UUIDBank;
	
	private static mod_SkinFix INSTANCE;

	@Override
	public String getVersion() {
		return "1.1";
	}

	@Override
	public void load() {
		INSTANCE = this;
		fetchedUUID = new HashSet<String>();
		UUIDBank = new HashMap<String, String>();
	}
	
	public static mod_SkinFix getInstance() {
		return INSTANCE;
	}
	
	public Map<String, String> getUUIDBank(){
		return UUIDBank;
	}
	
	public Set<String> getFetchedUUID(){
		return fetchedUUID;
	}

}
