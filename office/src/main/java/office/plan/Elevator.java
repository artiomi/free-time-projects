package office.plan;

public class Elevator {
	private int numberOfFlats;

	public Elevator(int numberOfFlats) {
		if (numberOfFlats < 0)
			throw new RuntimeException("Invalid number, less than 0");
		this.numberOfFlats = numberOfFlats;
	}

	public int getNumberOfFlats() {
		return numberOfFlats;
	}

	public boolean reachFlat(int targetFlatNumber) {
		if (numberOfFlats < targetFlatNumber || targetFlatNumber < 0)
			throw new RuntimeException("you selected wrong flat: " + targetFlatNumber + "] .Choose another one.");
		System.out.println("Arriving to selected flat");
		return true;
	}
}
