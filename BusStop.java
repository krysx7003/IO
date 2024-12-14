import java.time.LocalDateTime;

public class BusStop {

	private int ID;
	private String name;
	private int localization;
	private LocalDateTime arrivalTime;

	public int getID() {
		// TODO - implement BusStop.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement BusStop.setID
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getLocalization() {
		return this.localization;
	}

	/**
	 * 
	 * @param localization
	 */
	public void setLocalization(int[] localization) {
		// TODO - implement BusStop.setLocalization
		throw new UnsupportedOperationException();
	}

	public LocalDateTime getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 * 
	 * @param arrivalTime
	 */
	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

}