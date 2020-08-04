import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class canWindow extends JFrame implements ActionListener
{
	JTextField txt1, txt2, txt3;
	Container con = getContentPane();
	canWindow(String title)
	{
		super(title);
		setBounds(230,200,500,520); // x,y,w,h
		setLayout(null);       
		setResizable(false);
		con.setBackground(Color.ORANGE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Font f = new Font("SHOWCARD GOTHIC", Font.BOLD,20);
		JLabel lb = new JLabel(" Deletion Window ");
		lb.setBounds(100,5,400,35);
		lb.setFont(f);
		
		JLabel lb1 = new JLabel("Product Name");
		lb1.setBounds(30,80,200,50);
		lb1.setFont( new Font("Lucida Handwriting",Font.ITALIC,20)); 
		lb1.setForeground(Color.red);
		
		JLabel lb2 = new JLabel("Product ID");
		lb2.setFont( new Font("Lucida Handwriting",Font.ITALIC,20));
		lb2.setForeground(Color.red);
		lb2.setBounds(30,160,200,50);

		JLabel lb3 = new JLabel("Brand Name");
		lb3.setBounds(30,240,200,50);
		lb3.setFont( new Font("Lucida Handwriting",Font.ITALIC,20)); 
		lb3.setForeground(Color.red);
		
		
		
		txt1 = new JTextField();
		txt1.setBounds(230,80,230,40);
		txt2 = new JTextField();
		txt2.setBounds(230,160,230,40);
		txt3 = new JTextField();
		txt3.setBounds(230,240,230,40);
		
		
		Font M = new Font("Lucida Handwriting",Font.BOLD,12);
		
		JButton cn, back;
		cn = new JButton("Delete Product");
		cn.setBounds(10,350,230,50);
		cn.setBackground(Color.BLACK);
		cn.setForeground(Color.white);
		cn.setFont(M);
		
		
		back = new JButton("Back to main window");
		back.setBounds(250,350,230,50);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.white);
		back.setFont(M);
		
		cn.addActionListener(this);
		back.addActionListener(this);
		
		add(lb);
		add(back);
		add(cn);
		add(lb1);
		add(lb2);
		add(txt1);
		add(txt2);
		add(txt3);
		add(lb3);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		JButton btn =  (JButton)ae.getSource();
		if(btn.getText().equals("Delete Product"))
		{
			DatabaseC db = new DatabaseC(txt1.getText(),txt2.getText(), txt3.getText());
			JOptionPane.showMessageDialog(null, "Your Record has been Deleted");
		
		}
		else if(btn.getText().equals("Back to main window"))
		{
			setVisible(false);
			new window("Inventory Management System ");
		}
}

}