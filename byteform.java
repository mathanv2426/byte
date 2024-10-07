import java.sql.*;



public class byteform {

		public static void main(String args[]) throws Exception
		{
			String url="jdbc:mysql://localhost:3306/maddy";
			String user="root";
			String pass="Maddy2426";
			String query="select * from students";
			
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
			
				System.out.println(rs.getString(2));
			}
			
			
			
			con.close();
					
		}
}
