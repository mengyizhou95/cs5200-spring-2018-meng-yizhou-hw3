package edu.northeastern.cs5200.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.northeastern.cs5200.JDM.developer;

public class DeveloperDao {
	public static DeveloperDao instance = null;
	public static DeveloperDao getInstance() {
		if(instance == null) {
			instance = new DeveloperDao();
		}
		return instance;
	}
	private DeveloperDao() {}
	
	public void createDeveloper(developer developer) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "INSERT INTO person(id, firstName, lastName, userName, password, email, dob, type) "
					+ "VALUES ('" + developer.getId() + "', '" + developer.getFirstName() + "', '" + developer.getLastName() + "', '" + developer.getUsername() + "', '"+ developer.getPassword() + "',"
							+ " '" + developer.getEmail() + "', " + developer.getDob() + ", '" + developer.getType() + "')";
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
	
	public List<developer> findAlldevelopers(){
		List<developer> list = new ArrayList<>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM person WHERE type = 'developer'";
			results = statement.executeQuery(sql);
			while(results.next()) {		
				int id = results.getInt("id");
				String firstName = results.getString("firstName");
				String lastName = results.getString("lastName");
				String username = results.getString("username");
				String password = results.getString("password");
				String email = results.getString("email");
				Date dob = results.getDate("dob");
				String type = results.getString("type");
				developer cur = new developer(id, firstName, lastName, username, password, email, dob, type);
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
	
	public developer findDeveloperById(int developerId) {
		developer list = new developer();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM person WHERE id = '" + developerId + "'";
			results = statement.executeQuery(sql);
			if(results.next()) {		
				int id = results.getInt("id");
				String firstName = results.getString("firstName");
				String lastName = results.getString("lastName");
				String username = results.getString("username");
				String password = results.getString("password");
				String email = results.getString("email");
				Date dob = results.getDate("dob");
				String type = results.getString("type");
				list = new developer(id, firstName, lastName, username, password, email, dob, type);
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
	
	public developer findDeveloperByUsername(String username) {
	developer list = new developer();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM person WHERE username = '" + username + "'";
			results = statement.executeQuery(sql);
			if(results.next()) {		
				int id = results.getInt("id");
				String firstName = results.getString("firstName");
				String lastName = results.getString("lastName");
				//String username = results.getString("username");
				String password = results.getString("password");
				String email = results.getString("email");
				Date dob = results.getDate("dob");
				String type = results.getString("type");
				list = new developer(id, firstName, lastName, username, password, email, dob, type);
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
	
	public developer findDeveloperByCredentials(String username, String password) {
		developer list = new developer();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM person WHERE username = '" + username + "' AND password = '" + password + "'";
			results = statement.executeQuery(sql);
			if(results.next()) {		
				int id = results.getInt("id");
				String firstName = results.getString("firstName");
				String lastName = results.getString("lastName");
				//String username = results.getString("username");
				//String password = results.getString("password");
				String email = results.getString("email");
				Date dob = results.getDate("dob");
				String type = results.getString("type");
				list = new developer(id, firstName, lastName, username, password, email, dob, type);
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
	
	public void updateDeveloper(int developerId, developer developer) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "UPDATE person"
					+ "SET id = '" + developer.getId() + "', firstName = '" + developer.getFirstName() + "', lastName = '" + developer.getLastName() + "', username = '" + developer.getUsername() + "', password = '"+ developer.getPassword() + "',"
							+ " email = '" + developer.getEmail() + "', Dob = '" + developer.getDob() + "', type = '" + developer.getType() + "' WHERE id = '" + developerId + "'";
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
	
	public void deleteDeveloper(int developerId) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM person WHERE id = '"+ developerId + "'";
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
