package professional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbctest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Irfan@1122");
			String insertSQL="REPLACE INTO students VALUES(?,?)";
			PreparedStatement pstmt=con.prepareStatement(insertSQL);
			Object[][]students = {
					{1,"Alice"},
					{2,"Bob"},
					{3,"Charlie"},
					{4,"David"},
					{5,"Eve"},
					{6,"Fiona"}
			};
			for(Object[] student:students) {
				pstmt.setInt(1,(int)student[0]);
				pstmt.setString(2,(String)student[1]);
				pstmt.executeUpdate();
			}
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT*FROM students");
			System.out.println("Students List:");
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			}
			
			con.close();
		}
			catch(Exception e) {
				e.printStackTrace();
			}
	   
	}

}