package edu.northeastern.cs5200.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.northeastern.cs5200.JDM.Website;

public class WebsiteDao {
	public static WebsiteDao instance = null;
	public static WebsiteDao getInstance() {
		if(instance == null) {
			instance = new WebsiteDao();
		}
		return instance;
	}
	private WebsiteDao() {}
	
	public void createWebsiteForDeveloper(int developerId, Website website) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "INSERT INTO website(id, name, description, created, updated, visits, id_person) "
					+ "VALUES ('" + website.getId() + "', '" + website.getName() + "', '" + website.getDescription() + "', " + website.getCreated() + ", "+ website.getUpdated() + ","
							+ " '" + website.getVisits() + "', '" + developerId + "')";
			statement.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public List<Website> findAllWebsites(){
		List<Website> list = new ArrayList<>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "SELECT * FROM website";
			results = statement.executeQuery(sql);
			while(results.next()) {		
				int id = results.getInt("id");
				String name = results.getString("name");
				String description = results.getString("description");
				Date created = results.getDate("created");
				Date updated = results.getDate("updated");
				int visits = results.getInt("visits");
				//int developerId = results.getInt("id_person");
				
				Website cur = new Website(id, name, description, created, updated, visits, null, null, null, null);
				list.add(cur);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public List<Website> findWebsitesForDeveloper(int developerId){
		List<Website> list = new ArrayList<>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM website WHERE id_person = '" + developerId + "'";
			results = statement.executeQuery(sql);
			while(results.next()) {		
				int id = results.getInt("id");
				String name = results.getString("name");
				String description = results.getString("description");
				Date created = results.getDate("created");
				Date updated = results.getDate("updated");
				int visits = results.getInt("visits");
				//int developerId = results.getInt("id_person");
				Website cur = new Website(id, name, description, created, updated, visits, null, null, null, null);
				list.add(cur);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public Website findWebsiteById(int websiteId) {
		Website list = new Website();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM website WHERE id = '" + websiteId + "'";
			results = statement.executeQuery(sql);
			if(results.next()) {		
				int id = results.getInt("id");
				String name = results.getString("name");
				String description = results.getString("description");
				Date created = results.getDate("created");
				Date updated = results.getDate("updated");
				int visits = results.getInt("visits");
				//int developerId = results.getInt("id_person");
				list = new Website(id, name, description, created, updated, visits, null, null, null, null);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public void updateWebsite(int websiteId, Website website) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "UPDATE website"
					+ "SET id = '" + website.getId() + "', name = '" + website.getName() + "', description = '" + website.getDescription() + "', created = '" + website.getCreated() + "', updated = '"+ website.getUpdated() + "',"
							+ " visits = '" + website.getVisits() + "' WHERE id = '" + websiteId + "'";
			statement.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void deleteWebsite(int websiteId) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM website WHERE id = '"+ websiteId + "'";
			statement.executeUpdate(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
