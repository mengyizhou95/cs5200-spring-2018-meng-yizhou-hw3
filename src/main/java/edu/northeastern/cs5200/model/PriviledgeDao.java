package edu.northeastern.cs5200.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PriviledgeDao {
	public static PriviledgeDao instance = null;
	public static PriviledgeDao getInstance() {
		if(instance == null) {
			instance = new PriviledgeDao();
		}
		return instance;
	}
	private PriviledgeDao() {}
	
	public void assignWebsitePriviledge(int developerId, int websiteId, int priviledgeId){
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "INSERT INTO websitepriviledge(id, id_person, id_website, id_priviledge) "
					+ "VALUES ('" + priviledgeId + "', '" + developerId + "', '" + websiteId + "', '" + priviledgeId + "')";
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
	
	public void assignPagePriviledge(int developerId, int pageId, int priviledgeId){
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "INSERT INTO pagepriviledge(id, id_person, id_page, id_priviledge) "
					+ "VALUES ('" + priviledgeId + "', '" + developerId + "', '" + pageId + "', '" + priviledgeId + "')";
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

	public void deleteWebsitePriviledge(int developerId, int websiteId, int priviledgeId){
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM websitepriviledge WHERE id_developer = '"+ developerId + "' AND id_website = '" + websiteId + "'";
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
	
	public void deletePagePriviledge(int developerId, int pageId, int priviledgeId) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM pagepriviledge WHERE id_developer = '"+ developerId + "' AND id_page = '" + pageId + "'";
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
