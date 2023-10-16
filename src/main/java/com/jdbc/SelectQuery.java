package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery 
{
	static void selectData() throws ClassNotFoundException,SQLException
	{
		// 1. Load the driver,
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Establish the connection,
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nandidb","root","boss");
		
		// 3. Create the statement,
			Statement st = con.createStatement();
						ResultSet rs = st.executeQuery("SELECT * FROM TABLE2");
						
						while(rs.next())
						{
							int id = rs.getInt("bikeId");
							String name = rs.getString("bikeName");
						}
		// 4. Close the connection,
			con.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		System.out.println("\n SELECT * FROM TABLENAME");
		selectData();
	}

}
