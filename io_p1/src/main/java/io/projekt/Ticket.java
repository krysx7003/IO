package io_p1.src.main.java.io.projekt;
import java.time.LocalDateTime;

public class Ticket {

	private LocalDateTime expirationDate;

	public LocalDateTime getExpirationDate() {
		return this.expirationDate;
	}

	/**
	 * 
	 * @param expirationDate
	 */
	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

}