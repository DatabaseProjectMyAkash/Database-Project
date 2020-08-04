import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class DatabaseC
{
	static Connection con = null;
	String productName, productId, BName;
	public DatabaseC(String name, String id, String BrandName)
	{
		productName = name;
		productId = id;
		BName = BrandName;
	try
		{
			System.out.println("data for cancellation  has come");
					
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_inventory_management", "root", "");
			
			String sql = "Delete from products where product_id = ? and product_name = ?"; 
			String sql1 = "Delete from brands where brand_name = ? ";
			PreparedStatement pstatement = con.prepareStatement(sql);
			PreparedStatement pstatement1 = con.prepareStatement(sql1);
			pstatement.setInt(1, Integer.parseInt(productId));
			pstatement.setString(2, productName);
			pstatement1.setString(1, BName);
			 pstatement.executeUpdate();
			 pstatement1.executeUpdate();
			System.out.print("Record Deleted");
			
		}
		
		
		catch(SQLException sql)
		{
			sql.printStackTrace();
		}
		
		finally{
			try {
					
				con.close();
				}
			catch(Exception exc)
		{
			exc.printStackTrace();
		}

		}

			
		}


}