import java.util.ArrayList;
public class Route {

	private int ID;
	private ArrayList busStops = new ArrayList<BusStop>();
	private int busID;

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

	public ArrayList getBusStops() {
		return this.busStops;
	}

	/**
	 * 
	 * @param busStops
	 */
	public void setBusStops(ArrayList busStops) {
		this.busStops = busStops;
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

}