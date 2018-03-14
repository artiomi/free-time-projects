package office.plan;

public class Door {
	private int height = 200;
	private int width = 100;
	private String label;

	private Door() {

	}

	public static Door createDoor(String doorLabel) {
		Door doorInstance = new Door();
		doorInstance.setLabel(doorLabel);
		return doorInstance;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void open() {
		System.out.printf("The door [%s] has been opened", this.label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Door [height=");
		builder.append(height);
		builder.append(", width=");
		builder.append(width);
		builder.append(", label=");
		builder.append(label);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + width;
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
		Door other = (Door) obj;
		if (height != other.height)
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (width != other.width)
			return false;
		return true;
	}
}
