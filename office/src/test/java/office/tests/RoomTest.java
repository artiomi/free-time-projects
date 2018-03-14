package office.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import client.Guest;
import office.plan.Building;
import office.plan.Flat;
import office.plan.Room;

public class RoomTest {
	private Building building;
	private String adress = "Address 1";
	private Guest guest;
	int flatNumber = 5;
	private Room room;
	private Flat flat;

	@Before
	public void init() {
		guest = new Guest("Chuck");
		building = guest.reachBuilding(adress);
		flat = guest.reachFlat(building, flatNumber);
	}

	@Test
	public void testRoomCheck() {
		room = guest.findRoom("Room nr. " + (flatNumber * 100 + 1), flat);
		assertNotNull(room);
	}
}
