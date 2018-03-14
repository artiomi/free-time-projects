package client;

import java.util.Optional;

import office.plan.Building;
import office.plan.BuildingWithElevator;
import office.plan.Door;
import office.plan.Elevator;
import office.plan.Flat;
import office.plan.Room;
import registries.BuildingRegistry;

public class Guest {

	private String name;

	public String getName() {
		return name;
	}

	public Guest(String name) {
		this.name = name;
	}

	public Building reachBuilding(String adress) {
		return BuildingRegistry.getBuilding(adress);
	}

	public Door findTheDoor(Building building) {
		return building.getEntryDoor();
	}

	public Room findRoom(String roomName, Flat flat) {
		Optional<Room> roomOption = flat.getRooms().stream().filter(room -> room.getName().equals(roomName))
				.findFirst();
		if (roomOption.isPresent())
			return roomOption.get();
		throw new RuntimeException(String.format("Room [%s] not found", roomName));
	}

	public Flat reachFlat(Building building, int flatNumber) {
		Flat targetFlat = null;
		if (building instanceof BuildingWithElevator) {
			targetFlat = arriveToFlat((BuildingWithElevator) building, flatNumber);
		} else {
			throw new RuntimeException("Not implemetned!!!");
		}
		return targetFlat;
	}

	private Flat arriveToFlat(BuildingWithElevator building, int flatNumber) {
		Elevator elevator = building.getElevator();
		boolean isFlatReached = elevator.reachFlat(flatNumber);
		if (isFlatReached) {
			Optional<Flat> flatOption = building.getFlats().stream().filter(flat -> flat.getFlatNumber() == flatNumber)
					.findFirst();
			if (flatOption.isPresent())
				return flatOption.get();
		}
		throw new RuntimeException("Missing Flat");
	}

	public void enterInBuilding(Building building) {
		building.enterInTheBuilding();
	}
}
