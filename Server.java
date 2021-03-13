package pro.bchubbs.krypton.server;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pro.bchubbs.krypton.sql.SQLHandler;

public class Server {
	
	private String name;
	
	public Server(String name) {
		this.name = name;
	}
	
	public int getPort() {
		try {
			PreparedStatement statement = SQLHandler.getConnection().prepareStatement("SELECT * FROM servers WHERE name=?");
			statement.setString(1, this.name);
			
			ResultSet results = statement.executeQuery();
			
			if (results.next()) {
				return results.getInt("port");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	
	public String getGroup() {
		try {
			PreparedStatement statement = SQLHandler.getConnection().prepareStatement("SELECT * FROM servers WHERE name=?");
			statement.setString(1, this.name);
			
			ResultSet results = statement.executeQuery();
			
			if (results.next()) {
				return results.getString("group");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String getAnnouncement() {
		try {
			PreparedStatement statement = SQLHandler.getConnection().prepareStatement("SELECT * FROM servers WHERE name=?");
			statement.setString(1, this.name);
			
			ResultSet results = statement.executeQuery();
			
			if (results.next()) {
				return results.getString("announcement");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
