package io_p1.src.main.java.io.projekt;
import java.util.ArrayList;

public class User {

	private String name;
	private String surname;
	private Role role;
	ArrayList<Ticket> tickets;
	ArrayList<Fine> fines;
	private String login;
	private int userID;
	private int attribute;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Role getRole() {
		return this.role;
	}

	/**
	 * 
	 * @param role
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	public Ticket getTickets() {
		// TODO - implement User.getTickets
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tickets
	 */
	public void setTickets(Ticket tickets) {
		// TODO - implement User.setTickets
		throw new UnsupportedOperationException();
	}

	public ArrayList<Fine> getFines() {
		return this.fines;
	}

	/**
	 * 
	 * @param fines
	 */
	public void setFines(ArrayList<Fine> fines) {
		this.fines = fines;
	}

	public String getLogin() {
		return this.login;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	public int getUserID() {
		return this.userID;
	}

	/**
	 * 
	 * @param userID
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void getAttribute() {
		// TODO - implement User.getAttribute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param attribute
	 */
	public void setAttribute(int attribute) {
		this.attribute = attribute;
	}

}