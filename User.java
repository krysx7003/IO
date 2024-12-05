import java.util.ArrayList;
public class User {

	private int ID;
	private String name;
	private String surname;
	private Role role;
	private ArrayList tickets = new ArrayList<Ticket>();

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

	public ArrayList getTickets() {
		return this.tickets;
	}

	/**
	 * 
	 * @param tickets
	 */
	public void setTickets(ArrayList tickets) {
		this.tickets = tickets;
	}

}