package operation;

import java.sql.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import data.Book;

public class Operatetwo { 
	  public static void operatetwo(){ 
		  Connection con = null;
		    try{  
			    Class.forName("com.mysql.jdbc.Driver");  
			    con = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/","root","infoobjects");  
			 
			    Statement stmt = (Statement) con.createStatement();  
			  
			    stmt.executeUpdate("create database library;");
			    stmt.executeUpdate("use library;");
			    stmt.executeUpdate("create table Book(id int NOT NULL PRIMARY KEY, book varchar(100), author varchar(100),stock int, lent int);");
			    stmt.executeUpdate("create table Issuer(id int NOT NULL PRIMARY KEY, name varchar(100), book varchar(100),issdate varchar(20), duedate varchar(20));");  
			   // con.close();  
			    System.out.println("Database created");
		    }catch(Exception e){ 
		    	System.out.println(e.toString());
		    }
	  }  
	  
	  public static void entry(Book temp) {
		  try {
			  Connection con = (Connection) DriverManager.getConnection( "jdbc:mysql://localhost:3306/library","root","infoobjects");
			  Statement stmt = (Statement) con.createStatement(); 
			  stmt.executeUpdate("Insert into book(id,book,author,stock,lent) values("+temp.getId()+",'"
					  			+temp.getName()+"','"+temp.getAuthor()+"',"+temp.getStock()+","+temp.getLent()+");");
			
		  }catch(Exception e){ 
		    	System.out.println(e.toString());
		  }
	  }
}
