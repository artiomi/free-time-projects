package office.plan;

import java.util.Random;

import builders.FlatBuilder;

public class BuildingFactory {
	private int flatsNumber = 6;

	public Building getBuildingOnAddress(String address) {
		Building building = new Building();
		addFlats(building, 6);

		if (flatsNumber > 2)
			building = new BuildingWithElevator(building);
		return building;
	}

	private void addFlats(Building building, int nrOfFlats) {
		Random rand = new Random();
		FlatBuilder flatBuilder = new FlatBuilder();
		for (int i = 1; i <= nrOfFlats; i++) {
			building.addFlat(flatBuilder.buildFlat(rand.nextInt(10), i));
		}
	}
}
