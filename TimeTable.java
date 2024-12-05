import java.util.ArrayList;
public class TimeTable {

	private int ID;
	private int lineID;
	private ArrayList routeList = new ArrayList<Route>();

	public int getID() {
		// TODO - implement TimeTable.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement TimeTable.setID
		throw new UnsupportedOperationException();
	}

	public int getLineID() {
		return this.lineID;
	}

	/**
	 * 
	 * @param lineID
	 */
	public void setLineID(int lineID) {
		this.lineID = lineID;
	}

	public ArrayList getRouteList() {
		return this.routeList;
	}

	/**
	 * 
	 * @param routeList
	 */
	public void setRouteList(ArrayList routeList) {
		this.routeList = routeList;
	}

}