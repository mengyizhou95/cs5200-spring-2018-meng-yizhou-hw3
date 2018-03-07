package edu.northeastern.cs5200.JDM;

import java.sql.Date;

public class User extends Person{
	private int userId;
	private boolean userAgreement;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String firstName, String lastName, String username, String password, String email, Date dob,
			String type) {
		super(id, firstName, lastName, username, password, email, dob, type);
		// TODO Auto-generated constructor stub
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public boolean isUserAgreement() {
		return userAgreement;
	}
	public void setUserAgreement(boolean userAgreement) {
		this.userAgreement = userAgreement;
	}
	
	
}
