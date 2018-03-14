package office.plan;

public class Window {
	private int width = 50;
	private int height = 100;

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

	public void open(WindoOpenMode mode) {
		System.out.printf("Someone opened [%s] the window", mode);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Window [width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
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
		Window other = (Window) obj;
		if (height != other.height)
			return false;
		if (width != other.width)
			return false;
		return true;
	}

}
