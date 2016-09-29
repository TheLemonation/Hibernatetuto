package com.love2code.jdbc;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class testjdbc {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/?user=hbstudent";
		String user = "hbstudent";
		String pass = "hbstudent";
		try {
			System.out.println("connecting to database:" + url);
			Connection con = (Connection) DriverManager.getConnection(url, user, pass);
			System.out.println("Succussfull");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
