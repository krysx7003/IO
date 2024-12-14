import java.util.ArrayList;

public class Route {

	private int ID;
	private ArrayList<BusStop> busStops;
	private int busID;
	private boolean active = true;

	public int getID() {
		// TODO - implement Route.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement Route.setID
		throw new UnsupportedOperationException();
	}

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

}