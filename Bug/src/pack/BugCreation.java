package pack;

import java.util.Date;

public class BugCreation extends Bug {

	private String emailAddress;
	private String ownerName;
	private int priority;
	private STATUS status;
	private Date createdDate;
	private Date complitedDate;
	private String discription;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS string) {
		this.status = string;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getComplitedDate() {
		return complitedDate;
	}
	public void setComplitedDate(Date complitedDate) {
		this.complitedDate = complitedDate;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	
}
