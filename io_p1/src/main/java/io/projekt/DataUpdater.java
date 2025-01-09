package io_p1.src.main.java.io.projekt;
public class DataUpdater implements UpdateData {
	Data data = new Data();
	/**
	 * 
	 * @param bus
	 */
	public void addBus(Bus bus) {
		// TODO - implement DataUpdater.addBus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param route
	 */
	public void addRoute(Route route,int lineID) {
		TimeTable timeTable = data.timeTableList.get(lineID);
		timeTable.routeList.add(route);
		data.timeTableList.set(lineID, timeTable);
	}

	/**
	 * 
	 * @param timeTable
	 */
	public void addTimeTable(TimeTable timeTable) {
		// TODO - implement DataUpdater.addTimeTable
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		// TODO - implement DataUpdater.addUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userID
	 * @param ticket
	 */
	public void addTicket(int userID, Ticket ticket) {
		data.userList.get(userID).tickets.add(ticket);
	}

	/**
	 * 
	 * @param bus
	 * @param busID
	 */
	public void updateBus(Bus bus, int busID) {
		// TODO - implement DataUpdater.updateBus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param route
	 * @param routeID
	 */
	public void updateRoute(Route route, int routeID,int lineID) {
		TimeTable timeTable = data.timeTableList.get(lineID);
		if(routeID<timeTable.routeList.size()){
			timeTable.routeList.set(routeID,route);
		}
		data.timeTableList.set(lineID, timeTable);
	}

	/**
	 * 
	 * @param timeTable
	 * @param lineID
	 */
	public void updateTimeTable(TimeTable timeTable, int lineID) {
		// TODO - implement DataUpdater.updateTimeTable
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param user
	 * @param userID
	 */
	public void updateUser(User user, int userID) {
		// TODO - implement DataUpdater.updateUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param busID
	 */
	public void deleteBus(int busID) {
		// TODO - implement DataUpdater.deleteBus
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param routeID
	 */
	public void deleteRoute(int routeID,int lineID) {
		TimeTable timeTable = data.timeTableList.get(lineID);
		if(routeID<timeTable.routeList.size()){
			timeTable.routeList.remove(routeID);
		}
		data.timeTableList.set(lineID, timeTable);
	}

	/**
	 * 
	 * @param lineID
	 */
	public void deleteTimeTable(int lineID) {
		// TODO - implement DataUpdater.deleteTimeTable
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userID
	 */
	public void deleteUser(int userID) {
		// TODO - implement DataUpdater.deleteUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ticketID
	 */
	public void deleteTicket(int ticketID) {
		// TODO - implement DataUpdater.deleteTicket
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param report
	 */
	public void addReport(String report) {
		// TODO - implement DataUpdater.addReport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param report
	 * @param reportID
	 */
	public void updateReport(String report, int reportID) {
		// TODO - implement DataUpdater.updateReport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reportID
	 */
	public void deleteReport(int reportID) {
		// TODO - implement DataUpdater.deleteReport
		throw new UnsupportedOperationException();
	}

}