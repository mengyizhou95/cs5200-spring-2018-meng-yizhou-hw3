package edu.northeastern.cs5200.JDM;

public class Priviledge {
	private int id;
	private developer developer;
	private Website website;
	private String username;
	private String type;
	
	public Priviledge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Priviledge(int id, edu.northeastern.cs5200.JDM.developer developer, Website website, String username, String type) {
		super();
		this.id = id;
		this.developer = developer;
		this.website = website;
		this.username = username;
		this.type = type;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(developer developer) {
		this.developer = developer;
	}
	public Website getWebsite() {
		return website;
	}
	public void setWebsite(Website website) {
		this.website = website;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
}
