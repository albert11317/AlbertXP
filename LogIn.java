import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Image;
import java.awt.Toolkit;

public class LogIn extends JPanel{
	private static final long serialVersionUID = 1L;
	private Image backGround;
	private Image java;
	private LogInWindow loginwindow;
	public LogInAnimation animation;
	private int width;
	private int height;
	private JFrame frame;
	private boolean start = true;
	private String UserName = "No User Name";
	private boolean ints = true;
	
	public LogIn(int w, int h, JFrame f)
	{
		loginwindow = new LogInWindow(w/3, h/4, w/3, h/4);
		super.setPreferredSize(new Dimension(w, h));
		super.setBackground(Color.BLUE);
		width = w;
		height = h;
		frame = f;
	    backGround = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("Files/Welcome.png"));
	    this.add(loginwindow);
	    frame.setLocationRelativeTo(null);
	    //loginwindow.setLocation(1000, 1000);
		//this.getContentPanel().setLayout(null);
	    //start();
	}
	
	public void start()
	{
		//System.out.println("Start logging");
		while (start)
		{
			repaint();
			try
			{
				Thread.sleep(10);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		//System.out.println("login start..");
		}
		animation = new LogInAnimation(width, height, UserName, frame);
	    frame.remove(this);
		frame.add(animation);
		frame.pack();
		frame.revalidate();
		animation.start();
	}

	@Override
	public void paintComponent(Graphics g)
	{
		//System.out.println("login repainting..");
		//System.out.println(start);
		if (ints)			//eSystem.out.println("login paint component (should happen twice if logging off)");
			ints = false;
		g.setColor(Color.white);
	    g.drawImage(backGround, 0, 0, width, height, this);
	    g.drawImage(java, height*3/4, width/2, 123, 170, this);
		    if (loginwindow.done())
		    {
		    	//System.out.println("leave repaint");
		    	start = false;
		    	UserName = loginwindow.UserName();
		    }
	}
}