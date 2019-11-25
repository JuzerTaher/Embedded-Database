package com.noesisinformatica.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectingdb {

public static Connection createDatabaseConnection()
throws SQLException, ClassNotFoundException {
String driver = "org.apache.derby.jdbc.EmbeddedDriver";
Class.forName(driver);
String url = "jdbc:derby:sampleDB";
Connection c = DriverManager.getConnection(url);
return c;

}

}