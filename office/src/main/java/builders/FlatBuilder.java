package builders;

import office.plan.Door;
import office.plan.Flat;
import office.plan.Room;
import office.plan.Window;

public class FlatBuilder {

	public Flat buildFlat(int roomsCount, int flatNumber) {
		Flat flat = new Flat(flatNumber);
		RoomBuilder roomBuilder = new RoomBuilder();
		int i = 1;
		do {
			Room room = roomBuilder.buildRoom(flatNumber * 100 + i, 10, 5);
			flat.addRoom(room);
			i++;
		} while (i <= roomsCount);

		return flat;
	}

	public static class RoomBuilder {

		public Room buildRoom(int roomId, int windowsCount, int doorsCount) {
			Room room = new Room("Room nr. " + roomId);
			addDoors(room, doorsCount);
			addWindows(room, windowsCount);
			return room;
		}

		private void addDoors(Room room, int doorsCount) {
			for (int i = 1; i <= doorsCount; i++) {
				Door door = Door.createDoor("Door " + i);
				room.addDoor(door);
			}
		}

		private void addWindows(Room room, int WindowsCount) {
			for (int i = 1; i <= WindowsCount; i++) {
				Window window = new Window();
				room.addWindow(window);
			}
		}
	}
}
