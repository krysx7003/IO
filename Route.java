import java.util.ArrayList;

public class Route {

	private ArrayList<BusStop> busStops;
	private int busID;
	private boolean active = true;

	public BusStop getBusStops() {
		// TODO - implement Route.getBusStops
		throw new UnsupportedOperationException();
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

	public void getAttribute() {
		// TODO - implement Route.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		// TODO - implement Route.setAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param list
	 */
	public void parseRoute(ArrayList<String> list) {
		// TODO - implement Route.parseRoute
		throw new UnsupportedOperationException();
	}

}