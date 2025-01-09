package io_p1.src.main.java.io.projekt;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class BusStop {

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
		// TODO - implement BusStop.getLocalization
		throw new UnsupportedOperationException();
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

	/**
	 *
	 * @param data
	 */
	public void parseBusStop(String data) {
		ArrayList<String> dataArray = new ArrayList<String>(Arrays.asList(data.split(",")));
		this.name = dataArray.get(0);
		this.localization = Integer.parseInt(dataArray.get(1));
		this.arrivalTime = LocalDateTime.parse(dataArray.get(2));
	}

}