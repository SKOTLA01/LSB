package org.example;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  void insertCrud(Statement st,int sid,String name,int roll) throws SQLException {
        String Insertquer="insert into student values (114,'sunil',98)";

        System.out.println("Inserted new record Status - "+st.execute(Insertquer));
    }
    public  static  void prepaidStatement(Connection conn,int sid,String name,int marks) throws SQLException {
        String Insertquer="insert into student values (?,?,?)";
        PreparedStatement pre= conn.prepareStatement(Insertquer);
        pre.setInt(1,sid);
        pre.setString(2,name);
        pre.setInt(3,marks);
            pre.execute();
    }
    public  static void deleteCrud(Statement st,int sid) throws SQLException {
        String deleteQuery="delete from student where sid="+sid;
        st.execute(deleteQuery);
        System.out.println("Deleted "+sid +" record Status - ");
    }
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
        // insertCrud(st,114,"sunil",114);
//        deleteCrud(st,102);
        prepaidStatement(conn,109,"sathwik",95);
       String query="select * from student ";
        ResultSet rs=st.executeQuery(query);
        while (rs.next()){
            System.out.println("RollNO - " + rs.getString(1)+"  Sname: "+rs.getString(2)+" Marks - "+rs.getString(3));
        }
        conn.close();
        System.out.println("Connection Closed ");
        // execute statement
        // close;

    }
}