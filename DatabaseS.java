import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class DatabaseS extends JFrame implements ActionListener 
{
	Container conn = getContentPane();
	Connection con = null;
	ResultSet rs = null, rs1 = null;
	String  name;

	public DatabaseS( String productName)
	{
		name = productName;
		
		
	//Container con = getContentPane();

	JTextField txt1, txt2, txt3,txt4, txt5, txt6; 
	
	//JOptionPane.showMessageDialog(null,"Please Enter Product Name to Search");
			//System.out.println("Here Code is Checked now it will go into databaseRClass");
			//DatabaseR db = new DatabaseR(txt1.getText(),txt2.getText(),txt3.getText(),txt4.getText(),txt5.getText(), txt6.getText());
				//JOptionPane.showMessageDialog(null,"Your data has been Inserted");
		Font f = new Font("SHOWCARD GOTHIC", Font.BOLD,20);
		JLabel lb = new JLabel(" Searching data ");
		lb.setBounds(100,5,400,35);
		lb.setFont(f);
		
	
		
		Font L = new Font("Lucida Handwriting", Font.BOLD,10);
		JLabel lb1 = new JLabel("Product ID");
		lb1.setBounds(50,50,100,30);
		
		lb1.setFont(L);
		lb1.setForeground(Color.red);
		
		
		JLabel lb3 = new JLabel("Brand ID");
		lb3.setBounds(50,100,100,30);
		lb3.setForeground(Color.red);
		lb3.setFont(L);
		
		JLabel lb4 = new JLabel("Model Year");
		lb4.setBounds(50,150,100,30);
		lb4.setForeground(Color.red);
		lb4.setFont(L);
		
		JLabel lb5 = new JLabel("Price");
		lb5.setBounds(50,200,100,30);
		lb5.setForeground(Color.red);
		lb5.setFont(L);
		

		JLabel lb6 = new JLabel("Brand Name");
		lb6.setBounds(50,250,100,30);
		lb6.setForeground(Color.red);
		lb6.setFont(L);
		
		txt1 = new JTextField();
		txt1.setBounds(200,50,180,30);
		txt3 = new JTextField();
		txt3.setBounds(200,100,180,30);
		txt4 = new JTextField();
		txt4.setBounds(200,150,180,30);
		txt5 = new JTextField();
		txt5.setBounds(200,200,180,30);
		
		txt6 = new JTextField();
		txt6.setBounds(200,250,180,30);
		
		
		Font M = new Font("Lucida Handwriting",Font.BOLD,12);
		JButton  back;
		
		
		back = new JButton("back");
		back.setBounds(300,400,200,50);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.white);
		back.setFont(M);
		
		add(lb5);
		add(txt5);
		add(back);
		add(lb);
		add(lb1);
		add(lb3);
		add(lb4);
		add(txt1);
		add(txt3);
		add(txt4);
		add(txt6);
		add(lb6);
		back.addActionListener(this);
		setVisible(true);
		

		






		try
		{
										
								
					 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_inventory_management", "root", ""); 
					
					
					String sql = "Select * from products where product_name = ?";
					String sql1 = "Select * from brands where brand_id = ?";
					PreparedStatement pstatement = con.prepareStatement(sql);
					
					pstatement.setString(1,name);
					 rs = pstatement.executeQuery();
					if(rs.next())
					{
							txt1.setText(rs.getString("product_id"));
							txt3.setText(rs.getString("brand_id"));
							txt4.setText(rs.getString("model_year"));
							txt5.setText(rs.getString("price"));
							//System.out.println(txt3.getText());
									
					}
					PreparedStatement pstatement1 = con.prepareStatement(sql1);
								
								pstatement1.setString(1, txt3.getText());
								rs1 = pstatement1.executeQuery();
								
					if(rs1.next())
								{
									txt6.setText(rs1.getString("brand_name"));
								}
					
					
					else
					{
						JOptionPane.showMessageDialog(null, "Record not Found");
					}

							
					
					
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
	public void actionPerformed(ActionEvent ae)
	{
		JButton btn =  (JButton)ae.getSource();
	if(btn.getText().equals("back"))
		{
			setVisible(false);
			new window("Inventory Management System ");
		}
	}
}