package office.plan;

import java.util.List;

public class BuildingWithElevator extends Building {
	private Elevator elevator;
	private Building buildingImpl;

	public BuildingWithElevator(Building building) {
		this.buildingImpl = building;
		this.elevator = new Elevator(building.getFlats().size());
	}

	public Elevator getElevator() {
		return elevator;
	}

	public List<Flat> getFlats() {
		return buildingImpl.getFlats();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BuildingWithElevator [elevator=");
		builder.append(elevator);
		builder.append(", buildingImpl=");
		builder.append(buildingImpl);
		builder.append("]");
		return builder.toString();
	}

}
