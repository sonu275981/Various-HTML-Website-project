import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class testfun
{
	testfun()
	{
		
		JButton b1,b2,b3;
		JTextField tf1,tf2;
		JFrame ob;
		ob=new JFrame("Calc");
		
		tf1=new JTextField();
		tf1.setBounds(50,60,190,20);
		ob.add(tf1);
		tf2=new JTextField();
		tf2.setBounds(50,100,190,20);
		ob.add(tf2);
		b1=new JButton("1");
		b1.setBounds(50,140,120,20);
		ob.add(b1);
		ob.setSize(400,400);  
    		ob.setLayout(null);  
    		ob.setVisible(true);  
		
	}		
	public static void main(String args[])
	{
		new testfun();
	}
}