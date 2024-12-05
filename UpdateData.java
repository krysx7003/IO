public interface UpdateData {

	/**
	 * 
	 * @param Bus
	 */
	void addBus(int Bus);

	/**
	 * 
	 * @param Route
	 */
	void addRoute(int Route);

	/**
	 * 
	 * @param TimeTable
	 */
	void addTimeTable(int TimeTable);

	/**
	 * 
	 * @param User
	 */
	void addUser(int User);

	/**
	 * 
	 * @param UserID
	 */
	void addTicket(int UserID);

	/**
	 * 
	 * @param Bus
	 */
	void updateBus(int Bus);

	/**
	 * 
	 * @param Route
	 */
	void updateRoute(int Route);

	/**
	 * 
	 * @param TimeTable
	 */
	void updateTimeTable(int TimeTable);

	/**
	 * 
	 * @param Driver
	 */
	void updateUser(int Driver);

	/**
	 * 
	 * @param BusID
	 */
	void deleteBus(int BusID);

	/**
	 * 
	 * @param RouteID
	 */
	void deleteRoute(int RouteID);

	/**
	 * 
	 * @param LineID
	 */
	void deleteTimeTable(int LineID);

	/**
	 * 
	 * @param UserID
	 */
	void deleteUser(int UserID);

	/**
	 * 
	 * @param TicketID
	 */
	void deleteTicket(int TicketID);

}