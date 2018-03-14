package office.plan;

import java.util.ArrayList;
import java.util.List;

public class Room {

	private int width = 100;
	private int height = 2;
	private int length = 200;
	private String name;
	private List<Door> doors;
	private List<Window> windows;

	public Room(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Door> getDoors() {
		return doors;
	}

	public void addDoor(Door door) {
		if (this.doors == null) {
			this.doors = new ArrayList<>();
		}
		this.doors.add(door);
	}

	public List<Window> getWindows() {
		return new ArrayList<Window>(windows);
	}

	public void addWindow(Window window) {
		if (this.windows == null)
			this.windows = new ArrayList<>();
		this.windows.add(window);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getLength() {
		return length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doors == null) ? 0 : doors.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((windows == null) ? 0 : windows.hashCode());
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
		Room other = (Room) obj;
		if (doors == null) {
			if (other.doors != null)
				return false;
		} else if (!doors.equals(other.doors))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (windows == null) {
			if (other.windows != null)
				return false;
		} else if (!windows.equals(other.windows))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", length=");
		builder.append(length);
		builder.append(", name=");
		builder.append(name);
		builder.append(", doors=");
		builder.append(doors);
		builder.append(", windows=");
		builder.append(windows);
		builder.append("]");
		return builder.toString();
	}

}
