package edu.northeastern.cs5200.JDM;

import java.sql.Date;
import java.util.List;

public class developer extends Person{
	private int developerId;
	private String developerKey;
	private List<Website> websiteList;
	private List<Role> roleList;
	private List<Priviledge> priviledgeList;
	
	public developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public developer(int id, String firstName, String lastName, String username, String password, String email,
			Date dob, String type) {
		super(id, firstName, lastName, username, password, email, dob, type);
		// TODO Auto-generated constructor stub
	}
	
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public String getDeveloperKey() {
		return developerKey;
	}
	public void setDeveloperKey(String developerKey) {
		this.developerKey = developerKey;
	}
	//
	public void addWebsite(Website website) {
		this.websiteList.add(website);
	}
	public void removeWebsite(Website website) {
		this.websiteList.remove(website);
	}
	public void addRole(Role role) {
		this.roleList.add(role);
	}
	public void removeRole(Role role) {
		this.roleList.remove(role);
	}
	public void addPriviledge(Priviledge priviledge) {
		this.priviledgeList.add(priviledge);
	}
	public void removePriviledge(Priviledge priviledge) {
		this.priviledgeList.remove(priviledge);
	}
}
