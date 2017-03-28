
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Validate{ 
        
     public static boolean checkUser(String Username,String Password) 
     {
      boolean st =false;
      try{


         Class.forName("com.mysql.jdbc.Driver");

 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/Toba","root","");
         PreparedStatement ps =con.prepareStatement
                             ("select * from register where Username=? and Password=?");
         ps.setString(1, Username);
         ps.setString(2, Password);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;          
     }  
}
