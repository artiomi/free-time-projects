package office.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import client.Guest;
import office.plan.Building;
import office.plan.Flat;

public class FlatTest {
	private Building building;
	private String adress = "Address 1";
	private Guest guest;
	private int flatNumber = 5;

	@Before
	public void init() {
		guest = new Guest("Chuck");
		building = guest.reachBuilding(adress);
	}

	@Test
	public void testFlatReaching() {
		Flat flat = guest.reachFlat(building, flatNumber);
		assertNotNull(flat);
	}

}
