package Library.management.system;


import java.sql.*;

public class conn{
    Connection c;  //session btw java application and database
    Statement s;   //interface provide method to execute queries with the database
    public conn(){  // constructor conn
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/project1","root","root");
            s =c.createStatement();
             
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        new conn();
        System.out.println("Database Connected");
    }
}

/*
5 step to connect any java application with the database using JDBC;
Rigister the Driver class
Create connection
create statement
Execute queries
Close connection
*/