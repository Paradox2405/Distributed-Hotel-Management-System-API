package com.comsats.restauto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GenericDAO {

	public Connection getDbConnection() throws SQLException {
		// declare a connection by using Connection interface
		Connection connection = null;

		try {
			/*
			 * Create string of connection url within specified format with
			 * machine name, port number and database name. Here machine name id
			 * localhost and database name is restaurant.
			 */
			String connectionURL = "jdbc:mysql://localhost:3307/restaurant";

			// �Load JBBC driver "com.mysql.jdbc.Driver"
			Class.forName("com.mysql.jdbc.Driver").newInstance();

			/*
			 * Create a connection by using getConnection() method that takes
			 * parameters of string type connection url, user name and password
			 * to connect to database.
			 */
			connection = DriverManager.getConnection(connectionURL,
					"root", "");

		} catch (Exception ex) {

			System.out.println("Unable to connect to database.");
		}
		return connection;

	}

	public int executeUpdate(String query) {
		Connection dbConn = null;
		Statement sqlStmt = null;
		int effectedRows = -1;
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			effectedRows = sqlStmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sqlStmt != null) {
					sqlStmt.close();
				}
				if (dbConn != null) {
					dbConn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return effectedRows;
	}

	
	public int executeUpdateWithId(String query) {
		Connection dbConn = null;
		Statement sqlStmt = null;
		@SuppressWarnings("unused")
		int effectedRows = -1;
		int key = -1;
		try {
			dbConn = this.getDbConnection();
			sqlStmt = dbConn.createStatement();
			effectedRows = sqlStmt.executeUpdate(query,Statement.RETURN_GENERATED_KEYS);
			ResultSet rs = sqlStmt.getGeneratedKeys();
			if ( rs.next() ) {
			    // Retrieve the auto generated key(s).
			    key = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (sqlStmt != null) {
					sqlStmt.close();
				}
				if (dbConn != null) {
					dbConn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return key;
	}


}
