package office.tests;

import org.junit.Before;
import org.junit.Test;

import client.Guest;
import office.plan.Building;
import office.plan.Flat;
import office.plan.Room;
import office.plan.WindoOpenMode;

public class WindowTest {
	private Building building;
	private String adress = "Address 1";
	private Guest guest;
	int flatNumber = 5;
	private Room room;

	@Before
	public void init() {
		guest = new Guest("Chuck");
		building = guest.reachBuilding(adress);
		Flat flat = guest.reachFlat(building, flatNumber);
		room = guest.findRoom("Room nr. " + (flatNumber * 100 + 1), flat);
	}

	@Test
	public void enterInBuilding() {
		room.getWindows().get(0).open(WindoOpenMode.COMPLETE);
	}
}
