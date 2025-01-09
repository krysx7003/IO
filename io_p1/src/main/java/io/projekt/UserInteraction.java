package io_p1.src.main.java.io.projekt;
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

	/**
	 * 
	 * @param ticket
	 */
	void buyTicket(Ticket ticket);

	String editTimeTable();

	/**
	 * 
	 * @param data
	 */
	void editRoute(String data);

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

	void logIn();

}