import java.sql.*;
class NativeAPI{

	public static void main(String[] args) {
		
		try{

			Class.forName("oracle.jdbc.driver.MySqlDriver");

			Connection con=DriverManager.getConnection(
				"jdbc:")
		}
	}
	

}