package edu.northeastern.cs5200.JDM;

public class Role {
	private int id;
	private developer developer;
	private Website website;
	private Page page;
	private String username;
	private String type;
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	//for website
	public Role(int id, edu.northeastern.cs5200.JDM.developer developer, Website website, String username, String type) {
		super();
		this.id = id;
		this.developer = developer;
		this.website = website;
		this.username = username;
		this.type = type;
	}
	//for page
	public Role(int id, Website website, Page page, String username, String type) {
		super();
		this.id = id;
		this.website = website;
		this.page = page;
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
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
}
