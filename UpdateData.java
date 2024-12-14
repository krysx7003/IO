public interface UpdateData {
    public void addBus(Bus bus);
	/**
	 * 
	 * @param route
	 */
	public void addRoute(Route route);

	/**
	 * 
	 * @param timeTable
	 */
	public void addTimeTable(TimeTable timeTable);

	/**
	 * 
	 * @param user
	 */
	public void addUser(User user);

	/**
	 * 
	 * @param UserID
	 */
	public void addTicket(int UserID);

	/**
	 * 
	 * @param bus
	 */
	public void updateBus(Bus bus);

	/**
	 * 
	 * @param route
	 */
	public void updateRoute(Route route);

	/**
	 * 
	 * @param timeTable
	 */
	public void updateTimeTable(TimeTable timeTable);

	/**
	 * 
	 * @param user
	 */
	public void updateUser(User user);

	/**
	 * 
	 * @param busID
	 */
	public void deleteBus(int busID);

	/**
	 * 
	 * @param routeID
	 */
	public void deleteRoute(int routeID);

	/**
	 * 
	 * @param lineID
	 */
	public void deleteTimeTable(int lineID);

	/**
	 * 
	 * @param userID
	 */
	public void deleteUser(int userID);

	/**
	 * 
	 * @param ticketID
	 */
	public void deleteTicket(int ticketID);

	/**
	 * 
	 * @param report
	 */
	public void addReport(String report);

	/**
	 * 
	 * @param reportID
	 */
	public void updateReport(int reportID);

	/**
	 * 
	 * @param reportID
	 */
	public void deleteReport(int reportID);
}