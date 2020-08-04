import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class DatabaseM
{
	static Connection con = null;
	String id, name, brand, modelY, priceP, brand_name;

	public DatabaseM(String productID, String productName, String brandID, String modelYear, String price, String brandName)
	{
		id = productID;
		name = productName;
		brand = brandID;
		modelY = modelYear;
		priceP = price;
		brand_name = brandName;
		try
		{
					System.out.println("data has come into DatabaseM class");
					
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_inventory_management", "root", ""); 
					
					System.out.println("Connection established");
					String sql = "UPDATE products set product_name = ?, brand_id = ?, model_year = ?, price = ? where product_id = ? ";
					String sql1 = "UPDATE brands set brand_name = ? where brand_id = ?";
PreparedStatement pstatement = con.prepareStatement(sql);
					
PreparedStatement pstatement1 = con.prepareStatement(sql1);

					pstatement1.setString(1, brand_name);
					pstatement1.setInt(2, Integer.parseInt(brand));
					pstatement.setString(1, name);
					pstatement.setInt(2,Integer.parseInt(brand));
					pstatement.setInt(3,Integer.parseInt(modelY));
					pstatement.setInt(4,Integer.parseInt(priceP));
					pstatement.setInt(5,Integer.parseInt(id));
					pstatement1.executeUpdate();
					pstatement.executeUpdate();
//pstatement1.executeUpdate();
					System.out.print("Updated");
			
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