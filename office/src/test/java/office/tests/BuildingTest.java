package office.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import client.Guest;
import office.plan.Building;
import office.plan.Door;

public class BuildingTest {

	private Building building;
	private String adress = "Address 1";
	private Guest guest;

	@Before
	public void init() {
		guest = new Guest("Chuck");

	}

	@Test
	public void findTheBuilding() {
		building = guest.reachBuilding(adress);
		assertNotNull(building);

	}

	@Test
	public void enterIntoBuilding() {
		building = guest.reachBuilding(adress);
		Door entrydoor = guest.findTheDoor(building);
		assertNotNull(entrydoor);
		guest.enterInBuilding(building);
	}

}
