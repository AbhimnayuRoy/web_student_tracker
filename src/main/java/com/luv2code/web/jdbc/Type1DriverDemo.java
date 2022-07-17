package com.luv2code.web.jdbc;

/**
 * 7 steps to connect to database using jdbc
 * 
 *  1.import java.sql.*;package
 *  2.load and register Driver ---- Translator
 *  3.Establish connection between java application and database --- Road
 *  4.create statement object -- vehicle
 *  5.send and execute sql query -- vehicle send to collect gold and return back with boxes
 *  6.process result from resultset --- open the boxes containing gold
 *  7.close the connection
 */

//Step 1 : importing the sql package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



//working properly Read operation
public class Type1DriverDemo {
	public static void main(String[] args) throws Exception{
		//Step 2 : load and register driver optional
//		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Step 3 : establish connection between database and java application
		String url = "jdbc:mysql://localhost:3306/company";
		String userName = "root";
		String pass = "Abhimanyu@97";
		Connection con = DriverManager.getConnection(url,userName,pass);
		
		//Step 4 : create statement object
		Statement st = con.createStatement();
		
		//Step 5 : send and execute sql query
		ResultSet rs = st.executeQuery("select * from employee");
		
		//Step 6 : process result from resultset
//		int i = 1;
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " | " + rs.getString(2)+" | " + rs.getString(3)+ " | " + rs.getString(4));
//			System.out.println("Got the result" + i++);
		}
		
		//Step 7 : closing the connection
		con.close();
		
	}
}
