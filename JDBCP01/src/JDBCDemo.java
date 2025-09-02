import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo
{

    public static void main(String[] args) {
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3806/students","root" , "Rigel@2128");
          Statement stmt = conn.createStatement();
          String query =" select * from students";
          ResultSet rs = stmt.executeQuery(query);
      }
      catch(Exception e){
          System.out.println(e.toString());
      }
    }

}
