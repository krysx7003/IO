package io.projekt;
import java.util.ArrayList;
import java.util.Arrays;

public class Presenter implements UserInteraction {

	private User currentUser;
	private DataUpdater dataUpdater = new DataUpdater();

	/**
	 * 
	 * @param user
	 */
	public void checkTicket(User user) {
		// TODO - implement Presenter.checkTicket
		throw new UnsupportedOperationException();
	}

	public void searchRoute() {
		// TODO - implement Presenter.searchRoute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param busID
	 */
	public void searchRoute(int busID) {
		// TODO - implement Presenter.searchRoute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ticket
	 */
	public void buyTicket(Ticket ticket) {
		int userID = currentUser.getUserID();
		dataUpdater.addTicket(userID, ticket);
	}

	public String editTimeTable() {
		// TODO - implement Presenter.editTimeTable
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param data
	 */
	public void editRoute(String data) {
		Role role = currentUser.getRole();
		if(role == Role.ITemployee){
			ArrayList<String> dataArray = new ArrayList<String>(Arrays.asList(data.split(","))); 
			String operation;
			int lineID,routeID;
			if (dataArray.size() >= 2) {
				operation = dataArray.get(0);
				dataArray.remove(0);
				lineID = Integer.parseInt(dataArray.get(0));
				dataArray.remove(0);
				routeID = Integer.parseInt(dataArray.get(0));
				dataArray.remove(0);
				if(operation == "delete"){
					dataUpdater.deleteRoute(routeID,lineID);
					return;
				}
				Route route = new Route();
				route.parseRoute(dataArray);
				if(operation == "add"){
					dataUpdater.addRoute(route,lineID);
				}else if(operation == "change"){
					dataUpdater.updateRoute(route,lineID,lineID);
				}
			}
		}
		//TODO - Kody błędu
	}

	public void selectRoute() {
		// TODO - implement Presenter.selectRoute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param args
	 */
	public void main(String[] args) {
		// TODO - implement Presenter.main
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param user
	 * @param fineID
	 */
	public void payFine(User user, int fineID) {
		// TODO - implement Presenter.payFine
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param user
	 * @param fine
	 */
	public void generateFine(User user, Fine fine) {
		// TODO - implement Presenter.generateFine
		throw new UnsupportedOperationException();
	}

	public String editBus() {
		// TODO - implement Presenter.editBus
		throw new UnsupportedOperationException();
	}

	public void trackLocation() {
		// TODO - implement Presenter.trackLocation
		throw new UnsupportedOperationException();
	}

	public void trackRoute() {
		// TODO - implement Presenter.trackRoute
		throw new UnsupportedOperationException();
	}

	public void writeReport() {
		// TODO - implement Presenter.writeReport
		throw new UnsupportedOperationException();
	}

	public void checkLatancy() {
		// TODO - implement Presenter.checkLatancy
		throw new UnsupportedOperationException();
	}

	public void logIn() {
		// TODO - implement Presenter.logIn
		throw new UnsupportedOperationException();
	}

	public User getCurrentUser() {
		return this.currentUser;
	}

	/**
	 * 
	 * @param currentUser
	 */
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}

}