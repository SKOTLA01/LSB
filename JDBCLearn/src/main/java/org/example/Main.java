package org.example;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // import -- import javal.sql.*
        //load and register =--its optional ;
        Class.forName ("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/Demo",user="postgres",password="0000";
        //connection
        Connection conn=DriverManager.getConnection(url,user,password);
        System.out.println("Connection established ");
        // create statement
        Statement st=conn.createStatement();
        String query="select * from student where sid=107";
        ResultSet rs=st.executeQuery(query);
        rs.next();
        System.out.println("Roll NO" + rs.getString(1)+"  Sname: "+rs.getString(2));
        conn.close();
        // execute statement
        // close;

    }
}