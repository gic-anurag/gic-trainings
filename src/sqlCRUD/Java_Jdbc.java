package sqlCRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Java_Jdbc {

	public static void main( String[] args){
    	String jdurl="jdbc:postgresql://localhost:5432/company";
    	String user="postgres";
    	String password="root";
    	try {
			Connection con=DriverManager.getConnection(jdurl,user,password);
			System.out.println("connected");
			String sql="INSERT INTO emp (id,name,age,add,sal)" + "VALUES('03','ganesh','1200','evrywer','1222')";
			PreparedStatement st=con.prepareStatement(sql);			
					int row=st.executeUpdate();
					System.out.println(row);
			} catch (SQLException e) {
			
			System.out.println("404 not found");
  			e.printStackTrace();
		}
    }
}
