import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class modWindow extends JFrame implements ActionListener
{
	JTextField txt1, txt2, txt3,txt4, txt5, txt6; 
	Container con = getContentPane();
	modWindow(String title)
	{
		super(title);
		setBounds(200,200,600,600); // x,y,w,h
		setLayout(null);       
		setResizable(false);
		con.setBackground(Color.ORANGE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Font f = new Font("SHOWCARD GOTHIC", Font.BOLD,20);
		JLabel lb = new JLabel("      Modify Data       ");
		lb.setBounds(100,5,400,35);
		lb.setFont(f);
		
	
		
		Font L = new Font("Lucida Handwriting", Font.BOLD,10);
		JLabel lb1 = new JLabel("Product ID");
		lb1.setBounds(50,50,100,30);
		
		lb1.setFont(L);
		lb1.setForeground(Color.red);
		
		JLabel lb2 = new JLabel("Product Name");
		lb2.setBounds(50,100,100,30);
		lb2.setForeground(Color.red);
		lb2.setFont(L);
		
		JLabel lb3 = new JLabel("Brand ID");
		lb3.setBounds(50,150,100,30);
		lb3.setForeground(Color.red);
		lb3.setFont(L);
		
		JLabel lb4 = new JLabel("Model Year");
		lb4.setBounds(50,200,100,30);
		lb4.setForeground(Color.red);
		lb4.setFont(L);
		
		JLabel lb5 = new JLabel("Price");
		lb5.setBounds(50,250,100,30);
		lb5.setForeground(Color.red);
		lb5.setFont(L);
		

		JLabel lb6 = new JLabel("Brand Name");
		lb6.setBounds(50,300,100,30);
		lb6.setForeground(Color.red);
		lb6.setFont(L);
		
		txt1 = new JTextField();
		txt1.setBounds(200,50,180,30);
		txt2 = new JTextField();
		txt2.setBounds(200,100,180,30);
		txt3 = new JTextField();
		txt3.setBounds(200,150,180,30);
		txt4 = new JTextField();
		txt4.setBounds(200,200,180,30);
		txt5 = new JTextField();
		txt5.setBounds(200,250,180,30);
		
		txt6 = new JTextField();
		txt6.setBounds(200,300,180,30);
		
		
		Font M = new Font("Lucida Handwriting",Font.BOLD,12);
		JButton mod, back;
		mod = new JButton("Modify");
		mod.setBounds(50,400,200,50);
		mod.setBackground(Color.BLACK);
		mod.setForeground(Color.white);
		mod.setFont(M);
		
		back = new JButton("back");
		back.setBounds(300,400,200,50);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.white);
		back.setFont(M);
		
		add(lb5);
		add(txt5);
		add(back);
		add(mod);
		add(lb);
		add(lb1);
		add(lb2);
		add(lb3);
		add(lb4);
		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt6);
		add(lb6);
		mod.addActionListener(this);
		back.addActionListener(this);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton btn =  (JButton)ae.getSource();
		if(btn.getText().equals("Modify"))
		{
			DatabaseM db = new DatabaseM(txt1.getText(),txt2.getText(),txt3.getText(), txt4.getText(), txt5.getText(), txt6.getText());
			JOptionPane.showMessageDialog(null, "Your Record has been Modified");
		
		}
		else if(btn.getText().equals("back"))
		{
			setVisible(false);
			new window("Inventory Management System");
		}
	
}

}