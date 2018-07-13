package databaseTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.openqa.selenium.By;


public class ClassUtils
{

	
	
	public static Connection con;

	public static void Utils() throws Exception
	{
	     Class.forName("oracle.jdbc.driver.OracleDriver");
	     con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","roja","roja");
	}
	

}
