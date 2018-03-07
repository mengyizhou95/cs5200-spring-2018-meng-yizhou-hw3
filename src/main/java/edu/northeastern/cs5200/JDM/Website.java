package edu.northeastern.cs5200.JDM;

import java.sql.Date;
import java.util.List;

public class Website {
	private int id;
	private String name;
	private String description;
	private Date created;
	private Date updated;
	private int visits;
	private developer developer;
	private List<Page> pageList;
	private List<Role> roleList;
	private List<Priviledge> priviledgeList;
	
	public Website() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Website(int id, String name, String description, Date created, Date updated, int visits,
			edu.northeastern.cs5200.JDM.developer developer, List<Page> pageList, List<Role> roleList,
			List<Priviledge> priviledgeList) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.visits = visits;
		this.developer = developer;
		this.pageList = pageList;
		this.roleList = roleList;
		this.priviledgeList = priviledgeList;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(int visits) {
		this.visits = visits;
	}
	public developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(developer developer) {
		this.developer = developer;
	}
	//
	public void addPage(Page page) {
		this.pageList.add(page);
	}
	public void removePage(Page page) {
		this.pageList.remove(page);
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
