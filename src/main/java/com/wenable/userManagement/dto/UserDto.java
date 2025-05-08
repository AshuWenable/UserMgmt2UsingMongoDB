package com.wenable.userManagement.dto;



public class UserDto {
	private String uName;
	private long userContact;

	@Override
	public String toString() {
		return "User [uName=" + uName + ", userContact=" + userContact + "]";
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public long getUserContact() {
		return userContact;
	}
	public void setUserContact(long userContact) {
		this.userContact = userContact;
	}
	
	

}
