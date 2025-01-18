package io.projekt;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class BusStop {

	private String name;
	private int localization;
	private LocalDateTime arrivalTime;

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

	/**
	 *
	 * @param data
	 */
	public void parseBusStop(String data) {
		ArrayList<String> dataArray = new ArrayList<String>(Arrays.asList(data.split("/")));
		String nam =dataArray.get(0);
		if(nam.isEmpty()){
			throw new IllegalArgumentException();
		}
		this.name = nam;
		this.localization = Integer.parseInt(dataArray.get(1));
		this.arrivalTime = LocalDateTime.parse(dataArray.get(2));
	}

}