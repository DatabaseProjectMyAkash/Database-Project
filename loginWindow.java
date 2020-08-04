import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class loginWindow extends JFrame implements ActionListener
{
	
		JTextField jt;
		JPasswordField jtp;
		JLabel lb1, lb2;
		
	loginWindow(String title)
	{
		super(title);
		setBounds(200,200,500,520);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Font f=new Font("Lucida Handwriting",Font.BOLD,16);
		
		 jt = new JTextField();
		jtp = new JPasswordField();
		jt.setBounds(150,150,150,40);
		jtp.setBounds(150,200,150,40);
		
		Font M = new Font("Lucida Handwriting",Font.BOLD,12);
		JButton bt = new JButton("login");
		bt.setBounds(150,300,150,50);
		bt.setBackground(Color.BLACK);
		bt.setForeground(Color.white);
		bt.setFont(f);
		
		//ImageIcon hostelLogo = new ImageIcon("C:/Users/Akash kumar/Desktop/JavaProject/HostelPic.PNG");
		//JLabel l = new JLabel("Logo", hostelLogo, JLabel.CENTER);
		//l.setBounds(0,0,500,500);
		
		lb1 = new JLabel("Admin");
		lb1.setBounds(50,150,120,40);
		lb1.setFont( new Font("Lucida Handwriting",Font.ITALIC,20)); 
		lb1.setForeground(Color.white);
		
		lb2 = new JLabel("Key");
		lb2.setBounds(50,200,120,40);
		lb2.setFont( new Font("Lucida Handwriting",Font.ITALIC,20)); 
		lb2.setForeground(Color.white);
		
		
		
		//setBackground(Color.YELLOW);
		/*
		JLabel lb = new JLabel("Welcome to Hostel Management");
		lb.setBounds(50,200,200,330);
		lb.setFont( new Font("Lucida Handwriting",Font.ITALIC,15));
		lb.setForeground(Color.RED);
		*/
		//add(lb);
		
		add(jt);
		add(lb1);
		add(lb2);
		add(jtp);
		add(bt);
		bt.addActionListener(this);
		//add(l);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton btn = (JButton)ae.getSource();
		
		JTextField j = jt;
		
		JPasswordField jtf = jtp;
		
		if(j.getText().equals("aki") && jtf.getText().equals("akash#")) // API, there is error and i have confrimed from sir
		{
			//JOptionPane.showMessageDialog(null," please press Ok to proceed "); // this is extra and this need to be add latter
			setVisible(false);
			new window("Mobile Inventory Management System ");
		}
		else 
		{
			JOptionPane.showMessageDialog(null,"please enter again");
		}
	}
}