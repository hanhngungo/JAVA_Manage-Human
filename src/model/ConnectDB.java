package model;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

public class ConnectDB {
        public static Connection connectDB() {
        try {
        String dbURL = "jdbc:sqlserver://LAPTOP-GNH0PENP\\SQLEXPRESS01:1433;"+"user=sa;password=hanhvan18;databaseName=ManageEmployee;encrypt=false";
		Connection conn=DriverManager.getConnection(dbURL);
		return conn;
     }
	catch(SQLException ex)  {
		System.out.println(ex.getMessage());
	}
		return null; 
}
}
