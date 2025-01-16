package io.projekt;
public interface UpdateData {

	/**
	 * 
	 * @param bus
	 */
	void addBus(Bus bus);

	/**
	 * 
	 * @param route
	 * @return 
	 */
	int addRoute(Route route,int lineID) ;

	/**
	 * 
	 * @param timeTable
	 */
	void addTimeTable(TimeTable timeTable);

	/**
	 * 
	 * @param user
	 */
	void addUser(User user);

	/**
	 * 
	 * @param userID
	 * @param ticket
	 */
	void addTicket(int userID, Ticket ticket);

	/**
	 * 
	 * @param bus
	 * @param busID
	 */
	void updateBus(Bus bus, int busID);

	/**
	 * 
	 * @param route
	 * @param routeID
	 * @return 
	 */
	int updateRoute(Route route, int routeID,int lineID);

	/**
	 * 
	 * @param timeTable
	 * @param lineID
	 */
	void updateTimeTable(TimeTable timeTable, int lineID);

	/**
	 * 
	 * @param user
	 * @param userID
	 */
	void updateUser(User user, int userID);

	/**
	 * 
	 * @param busID
	 */
	void deleteBus(int busID);

	/**
	 * 
	 * @param routeID
	 * @return 
	 */
	int deleteRoute(int routeID,int lineID);

	/**
	 * 
	 * @param lineID
	 */
	void deleteTimeTable(int lineID);

	/**
	 * 
	 * @param userID
	 */
	void deleteUser(int userID);

	/**
	 * 
	 * @param ticketID
	 */
	void deleteTicket(int ticketID);

	/**
	 * 
	 * @param report
	 */
	void addReport(String report);

	/**
	 * 
	 * @param report
	 * @param reportID
	 */
	void updateReport(String report, int reportID);

	/**
	 * 
	 * @param reportID
	 */
	void deleteReport(int reportID);

}