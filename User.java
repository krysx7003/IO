import java.util.ArrayList;

public class User {

	private int ID;
	private String name;
	private String surname;
	private Role role;
	private ArrayList<Ticket> tickets;
	private ArrayList<Fine> fines;

	public int getID() {
		// TODO - implement User.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement User.setID
		throw new UnsupportedOperationException();
	}

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

}