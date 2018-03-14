package registries;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import office.plan.Building;
import office.plan.BuildingFactory;

public class BuildingRegistry {
	private static Map<String, Building> buildingsRegistry = new HashMap<>();

	public static Building getBuilding(String address) {

		Building foundBuilding = null;
		Optional<Building> buildingOption = buildingsRegistry.entrySet().stream()
				.filter(entry -> entry.getKey().equals(address)).map(entry -> entry.getValue()).findFirst();
		if (buildingOption.isPresent())
			foundBuilding = buildingOption.get();
		else {
			foundBuilding = new BuildingFactory().getBuildingOnAddress(address);
			buildingsRegistry.put(address, foundBuilding);

		}
		return foundBuilding;
	}

}
