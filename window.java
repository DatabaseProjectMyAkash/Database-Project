import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class window extends JFrame implements ActionListener
{
	Container con = getContentPane();
	window(String title)
	{
		super(title);
		setBounds(200,200,550,520); // x,y,w,h
		//setSize(500, 500);
		setLayout(null);       
		setResizable(false);
		con.setBackground(Color.ORANGE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Font f=new Font("Lucida Handwriting",Font.BOLD,16);
		JButton rgs = new JButton("Insert");
		rgs.setFont(f);
		rgs.setBounds(50,100,180,50);
		rgs.setBackground(Color.BLACK);
		rgs.setForeground(Color.white);
		JButton cnc = new JButton("Delete");
		cnc.setFont(f);
		cnc.setBounds(50,300,180,50);
		cnc.setBackground(Color.BLACK);
		cnc.setForeground(Color.white);
		JButton md = new JButton("Modify");
		md.setFont(f);
		md.setBounds(300,100,180,50);
		md.setBackground(Color.BLACK);
		md.setForeground(Color.white);
		JButton ins = new JButton("Search");
		ins.setBackground(Color.BLACK);
		ins.setForeground(Color.white);
		ins.setFont(f);
		ins.setBounds(300,300,180,50);
/*
		ImageIcon hostelLogo = new ImageIcon("C:/Users/Akash kumar/Desktop/JavaProject/HostelPic.PNG");
		JLabel l = new JLabel("Logo", hostelLogo, JLabel.CENTER);
		l.setBounds(0,0,500,500);
*/
		md.addActionListener(this);
		cnc.addActionListener(this);
		rgs.addActionListener( this);
		ins.addActionListener(this);
		add(ins);
		add(rgs);
		add(cnc);
		add(md);
		//add(l);
		setVisible(true);
	
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton btn = (JButton)ae.getSource();
		
		if(btn.getText().equals("Insert"))
		{
				this.setVisible(false);
				new regWindow(" Insert Data Into Inventory ");
		}

		else if(btn.getText().equals("Delete"))
		{
			this.setVisible(false);
			new canWindow("Cancellation window");
		}
		
		
		else if(btn.getText().equals("Modify"))
		{
			this.setVisible(false);
			new modWindow("Modification window");
		}
		
	
		else if(btn.getText().equals("Search"))
		{
			this.setVisible(false);
			new search("Search window");
		}
	
		
	}
}
