public interface UserInteraction {

	void checkTicket();

	void searchRoute();

	/**
	 * 
	 * @param BusID
	 */
	void searchRoute(int BusID);

	void buyTicket();

	void editTimeTable();

	/**
	 * 
	 * @param BusID
	 */
	void editRoute(int BusID);

	void pickRoute();

}