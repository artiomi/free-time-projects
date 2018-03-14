package office.plan;

import java.util.ArrayList;
import java.util.List;

public class Flat {
	private int flatNumber;
	private List<Room> rooms;

	public Flat(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	public List<Room> getRooms() {
		return new ArrayList<>(rooms);
	}


	public void addRoom(Room room) {
		if (this.rooms == null)
			this.rooms = new ArrayList<>();
		this.rooms.add(room);
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + flatNumber;
		result = prime * result + ((rooms == null) ? 0 : rooms.hashCode());
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
		Flat other = (Flat) obj;
		if (flatNumber != other.flatNumber)
			return false;
		if (rooms == null) {
			if (other.rooms != null)
				return false;
		} else if (!rooms.equals(other.rooms))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flat [flatNumber=");
		builder.append(flatNumber);
		builder.append(", rooms=");
		builder.append(rooms);
		builder.append("]");
		return builder.toString();
	}
}
