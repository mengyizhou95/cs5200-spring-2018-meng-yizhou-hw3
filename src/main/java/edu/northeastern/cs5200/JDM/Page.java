package edu.northeastern.cs5200.JDM;

import java.sql.Date;
import java.util.List;

public class Page {
	private int id;
	private String title;
	private String description;
	private Date created;
	private Date updated;
	private int views;
	private Website website;
	private List<Widget> widgetList;
	private List<Role> roleList;
	
	public Page() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Page(int id, String title, String description, Date created, Date updated, int views, Website website,
			List<Widget> widgetList, List<Role> roleList) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.views = views;
		this.website = website;
		this.widgetList = widgetList;
		this.setRoleList(roleList);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public Website getWebsite() {
		return website;
	}
	public void setWebsite(Website website) {
		this.website = website;
	}
	public void addWidget(Widget widget) {
		this.widgetList.add(widget);
	}
	public void removeWidget(Widget widget) {
		this.widgetList.remove(widget);
	}
	public void addRole(Role role) {
		this.getRoleList().add(role);
	}
	public void removeRole(Role role) {
		this.getRoleList().remove(role);
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
}
