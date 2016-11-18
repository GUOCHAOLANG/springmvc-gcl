package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	// 获得数据库连接
	public static Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/springmvc";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, "root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("数据库驱动加载出错");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("数据库出错");
		}
		return conn;
	}

	// 关闭相关通道
	public static void close(ResultSet rs, PreparedStatement p, Connection conn) {
		try {
			rs.close();
			p.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("数据关闭出错");
		}
	}
}
