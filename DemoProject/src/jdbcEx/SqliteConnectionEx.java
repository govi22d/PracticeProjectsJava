package jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqliteConnectionEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		Statement stmt = null;
	    try {
	    	//mysql conn
	    	//Class.forName("com.mysql.jdbc.Driver");
	    	//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
	    	
	    	
	      String url = "jdbc:sqlite:C:/Data/SqlLite/Db/myfirstdb.db";
	      conn = DriverManager.getConnection(url);

	      System.out.println("Connection successful!");
	      
	      stmt = conn.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	      while ( rs.next() ) {
	          int id = rs.getInt("id");
	          String  name = rs.getString("name");
	          int age  = rs.getInt("age");
	          String  address = rs.getString("address");
	          float salary = rs.getFloat("salary");
	          
	          System.out.println( "ID = " + id + "\n" + "NAME = " + name + "\n" +
	        		  "AGE = " + age + "\n" + "ADDRESS = " + address + "\n" + 
	        		  "SALARY = " + salary );
	          
	       }
	       rs.close();
	       
	      stmt.close();
          conn.close();

	    } catch (SQLException e) {
	        throw new Error("Problem", e);
	    } finally {
	      try {
	        if (conn != null) {
	            conn.close();
	        }
	      } catch (SQLException ex) {
	          System.out.println(ex.getMessage());
	      }
	    }
	}
}
