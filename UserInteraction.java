public interface UserInteraction {

	/**
	 * 
	 * @param user
	 */
	void checkTicket(User user);

	void searchRoute();

	/**
	 * 
	 * @param busID
	 */
	void searchRoute(int busID);

	void buyTicket();

	String editTimeTable();

	/**
	 * 
	 * @param busID
	 */
	String editRoute(int busID);

	void selectRoute();

	/**
	 * 
	 * @param user
	 * @param fineID
	 */
	void payFine(User user, int fineID);

	/**
	 * 
	 * @param user
	 * @param fine
	 */
	void generateFine(User user, Fine fine);

	String editBus();

	void trackLocation();

	void trackRoute();

	void checkLatancy();

	void writeReport();

}