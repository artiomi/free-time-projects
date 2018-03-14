package office.plan;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private static final String ENTRY_DOOR = "Entry Door";

	private List<Flat> flats;
	private Door entryDoor;

	protected Building() {
		entryDoor = Door.createDoor(ENTRY_DOOR);
	}

	public List<Flat> getFlats() {
		return new ArrayList<Flat>(flats);
	}

	public void addFlat(Flat flat) {
		if (this.flats == null)
			this.flats = new ArrayList<Flat>();
		this.flats.add(flat);
	}

	public Door getEntryDoor() {
		return entryDoor;
	}

	public void setEntryDoor(Door entryDoor) {
		this.entryDoor = entryDoor;
	}

	public void enterInTheBuilding() {
		entryDoor.open();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entryDoor == null) ? 0 : entryDoor.hashCode());
		result = prime * result + ((flats == null) ? 0 : flats.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		if (entryDoor == null) {
			if (other.entryDoor != null)
				return false;
		} else if (!entryDoor.equals(other.entryDoor))
			return false;
		if (flats == null) {
			if (other.flats != null)
				return false;
		} else if (!flats.equals(other.flats))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Building [flats=");
		builder.append(flats);
		builder.append(", entryDoor=");
		builder.append(entryDoor);
		builder.append("]");
		return builder.toString();
	}

}
