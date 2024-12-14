import java.util.ArrayList;

public class Bus {

	private int ID;
	private int driverID;
	private Route currentRoute;
	private ArrayList<Route> busRouteList;

	public int getID() {
		// TODO - implement Bus.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement Bus.setID
		throw new UnsupportedOperationException();
	}

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