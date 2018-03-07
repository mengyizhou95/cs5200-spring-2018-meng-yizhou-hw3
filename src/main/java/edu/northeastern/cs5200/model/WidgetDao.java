package edu.northeastern.cs5200.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.northeastern.cs5200.JDM.Widget;

public class WidgetDao {
	public static WidgetDao instance = null;
	public static WidgetDao getInstance() {
		if(instance == null) {
			instance = new WidgetDao();
		}
		return instance;
	}
	private WidgetDao() {}
	
	public void createWidgetForPage(int pageId, Widget widget){
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "INSERT INTO widget(id, name, width, height, cssClass, cssStyle, text, order, id_page) "
					+ "VALUES ('" + widget.getId() + "', '" + widget.getName() + "', '" + widget.getWidth() + "', '" + widget.getHeight() + "', '"+ widget.getCssClass() + "',"
							+ " '" + widget.getCssStyle() + "', '"+ widget.getText() + "', '" + widget.getOrder() + "', '" + pageId + "')";
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
	
	public List<Widget> findAllWidget(){
		List<Widget> list = new ArrayList<>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "SELECT * FROM widget";
			results = statement.executeQuery(sql);
			while(results.next()) {		
				int id = results.getInt("id");
				String name = results.getString("title");
				int width = results.getInt("width");
				int height = results.getInt("height");
				String cssClass = results.getString("cssClass");
				String cssStyle = results.getString("cssStyle");
				String text = results.getString("text");
				int order = results.getInt("order");
				
				Widget cur = new Widget(id, name, width, height, cssClass, cssStyle, text, order, null);
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
	
	public Widget findWidgetById(int widgetId){
		Widget list = new Widget();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM widget WHERE id = '" + widgetId + "'";
			results = statement.executeQuery(sql);
			if(results.next()) {		
				int id = results.getInt("id");
				String name = results.getString("title");
				int width = results.getInt("width");
				int height = results.getInt("height");
				String cssClass = results.getString("cssClass");
				String cssStyle = results.getString("cssStyle");
				String text = results.getString("text");
				int order = results.getInt("order");
				
				list = new Widget(id, name, width, height, cssClass, cssStyle, text, order, null);
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
	
	public List<Widget> findWidgetsForPage(int pageId) {
		List<Widget> list = new ArrayList<>();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet results = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "select * FROM widget WHERE id_page = '" + pageId + "'";
			results = statement.executeQuery(sql);
			while(results.next()) {		
				int id = results.getInt("id");
				String name = results.getString("title");
				int width = results.getInt("width");
				int height = results.getInt("height");
				String cssClass = results.getString("cssClass");
				String cssStyle = results.getString("cssStyle");
				String text = results.getString("text");
				int order = results.getInt("order");
				
				Widget cur = new Widget(id, name, width, height, cssClass, cssStyle, text, order, null);
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
	
	public void updateWidget(int widgetId, Widget widget) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "UPDATE widget"
					+ "SET id = '" + widget.getId() + "', name = '" + widget.getName() + "', width = '" + widget.getWidth() + "', height = '" + widget.getHeight() + "', cssClass = '"+ widget.getCssClass() + "',"
							+ " cssStyle = '" + widget.getCssStyle() + "', text = '"+ widget.getText() + "', order = '"+ widget.getOrder() + "' WHERE id = '" + widgetId + "'";
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
	
	public void deleteWidget(int widgetId) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://cs5200-spring2018-meng.clieztqurfyj.us-east-2.rds.amazonaws.com/hw2_Meng_Yizhou_spring_2018", "Yizhou", "dhsqj320311yzm");
			statement = connection.createStatement();
			String sql = "DELETE FROM widget WHERE id = '"+ widgetId + "'";
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
