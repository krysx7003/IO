package io_p1.src.main.java.io.projekt;
import java.util.ArrayList;

public class Bus {

	private int driverID;
	private Route currentRoute;
	private ArrayList<Route> busRouteList;

	public int getDriverID() {
		return this.driverID;
	}

	/**
	 * 
	 * @param driverID
	 */
	public void setDriverID(int driverID) {
		this.driverID = driverID;
	}

	public Route getRoute() {
		// TODO - implement Bus.getRoute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param currentRoute
	 */
	public void setRoute(Route currentRoute) {
		// TODO - implement Bus.setRoute
		throw new UnsupportedOperationException();
	}

	public ArrayList<Route> getBusRouteList() {
		return this.busRouteList;
	}

	/**
	 * 
	 * @param BusRouteList
	 */
	public void setBusRouteList(ArrayList<Route> BusRouteList) {
		this.busRouteList = BusRouteList;
	}

}