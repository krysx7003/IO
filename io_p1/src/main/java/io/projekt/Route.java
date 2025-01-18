package io.projekt;

import java.util.ArrayList;

public class Route {

	private ArrayList<BusStop> busStops = new ArrayList<>();
	private int busID;
	private boolean active;


	public BusStop getBusStop(int i) {
		return busStops.get(i);
	}

	/**
	 * 
	 * @param busStops
	 */
	public void setBusStops(BusStop busStops) {
		// TODO - implement Route.setBusStops
		throw new UnsupportedOperationException();
	}

	public int getBusID() {
		return this.busID;
	}

	/**
	 * 
	 * @param busID
	 */
	public void setBusID(int busID) {
		this.busID = busID;
	}

	public boolean getActive() {
		return this.active;
	}

	/**
	 * 
	 * @param active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	/**
	 * 
	 * @param list
	 */
	public void parseRoute(ArrayList<String> list) {
		//operacja, lineID, routeID usuwamy wczesniej
		// busID, actice, bus_stops(0), bus_Stops(1)...
		int id = Integer.parseInt(list.get(0));
		if(id<=0){
			throw new IllegalArgumentException();
		}
		this.busID = id;
		if(list.get(1).isEmpty()){
			throw new IllegalArgumentException();
		}
		this.active = Boolean.parseBoolean(list.get(1));
		for(int i = 2; i < list.size(); i++) {
			BusStop busStop = new BusStop();
			busStop.parseBusStop(list.get(i));
			this.busStops.add(busStop);
		}
	}

}