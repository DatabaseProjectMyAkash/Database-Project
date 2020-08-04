import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class DatabaseR 
{
	static Connection con = null;
	String id, name, brand, modelY, priceP, brand_name;

	public DatabaseR(String productID, String productName, String brandID, String modelYear, String price, String brandName)
	{
		id = productID;
		name = productName;
		brand = brandID;
		modelY = modelYear;
		priceP = price;
		brand_name = brandName;
		try
		{
					System.out.println("data has come into DatabaseR class");
					
								
					
					
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_inventory_management", "root", ""); 
					
					System.out.println("Connection established");
					String sql1 = "Insert into brands(brand_id, brand_name) values ( ?, ?)";
					String sql = "Insert into products(product_id, product_name, brand_id, model_year, price) values ( ?, ? ,?, ?, ?)";
					PreparedStatement pstatement1 = con.prepareStatement(sql1);
					pstatement1.setInt(1, Integer.parseInt(brand));
					pstatement1.setString(2, brand_name);
					PreparedStatement pstatement = con.prepareStatement(sql);
					pstatement.setInt(1,Integer.parseInt(id));
					pstatement.setString(2, name);
					pstatement.setInt(3,Integer.parseInt(brand));
					pstatement.setInt(4,Integer.parseInt(modelY));
					pstatement.setInt(5,Integer.parseInt(priceP));
					pstatement1.executeUpdate();
					pstatement.executeUpdate();
					System.out.print("Recorded");
			
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