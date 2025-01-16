package io.projekt;
public interface DisplayInformations {

	void showTimeTable();

	void showRoute();

	/**
	 * 
	 * @param BusID
	 */
	void showRoute(int BusID);

	void showTicket();

	void showBus();

	void showUser();

	void showOptions();

	void showFineList();

}