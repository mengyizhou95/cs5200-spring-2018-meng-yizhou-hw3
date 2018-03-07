package edu.northeastern.cs5200.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RoleDao {
	public static RoleDao instance = null;
	public static RoleDao getInstance() {
		if(instance == null) {
			instance = new RoleDao();
		}
		return instance;
	}
	private RoleDao() {}
	
	public void assignWebsiteRole(int developerId, int websiteId, int roleId){
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "INSERT INTO websiterole(id, id_person, id_website, id_role) "
					+ "VALUES ('" + roleId + "', '" + developerId + "', '" + websiteId + "', '" + roleId + "')";
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
	
	public void assignPageRole(int developerId, int pageId, int roleId){
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "INSERT INTO pagerole(id, id_person, id_page, id_role) "
					+ "VALUES ('" + roleId + "', '" + developerId + "', '" + pageId + "', '" + roleId + "')";
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

	public void deleteWebsiteRole(int developerId, int websiteId, int roleId) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM websiterole WHERE id_developer = '"+ developerId + "' AND id_website = '" + websiteId + "'";
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
	
	public void deleteWebsiteRole(int websiteId) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM websiterole WHERE AND id_website = '" + websiteId + "'";
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
	
	
	public void deletePageRole(int developerId, int pageId, int roleId) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM pagerole WHERE id_developer = '"+ developerId + "' AND id_page = '" + pageId + "'";
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
