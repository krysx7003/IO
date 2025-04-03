package io.projekt;
public interface FetchData {

	/**
	 * 
	 * @param params
	 */
	Bus fetchBus(String params);

	/**
	 * 
	 * @param params
	 */
	Route fetchRoute(String params);

	/**
	 * 
	 * @param params
	 */
	TimeTable fetchTimeTable(String params);

	/**
	 * 
	 * @param params
	 */
	User createUser(String params);

	/**
	 * 
	 * @param params
	 */
	Ticket fetchTicket(String params);

	/**
	 * 
	 * @param params
	 */
	boolean routeExists(String params);

}