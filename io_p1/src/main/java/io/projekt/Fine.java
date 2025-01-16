package io.projekt;
import java.time.LocalDateTime;

public class Fine {

	private LocalDateTime issueDate;
	private float rate;

	public LocalDateTime getIssueDate() {
		return this.issueDate;
	}

	/**
	 * 
	 * @param issueDate
	 */
	public void setIssueDate(LocalDateTime issueDate) {
		this.issueDate = issueDate;
	}

	public float getRate() {
		return this.rate;
	}

	/**
	 * 
	 * @param rate
	 */
	public void setRate(float rate) {
		this.rate = rate;
	}

}