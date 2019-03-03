import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class OperatingSystem extends JPanel{
	private static final long serialVersionUID = 1L;
	public static StartUp start;
	static int width;
	static int height;

	// Constructor
	public OperatingSystem(int w, int h, JFrame f) {
		super.setOpaque(true);
		super.setPreferredSize(new Dimension(width, height));
		super.setBackground(Color.BLACK);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		width = (int) screenSize.getWidth();
		height = (int) screenSize.getHeight();
		start = new StartUp(width, height, f);
		//Windows window = new Windows(width, height, f);
		this.add(start);
		//this.add(window);
	}
	
	public static void main(String[] args) 
	{
		JFrame.setDefaultLookAndFeelDecorated(false);
		JFrame fr = new JFrame("AlbertXP");
		fr.add(new OperatingSystem(width, height, fr));
						//USETHIS					
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocation(0, 0);
		fr.setResizable(true);
		fr.pack();
		fr.setVisible(true);
		fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
		start.start();
	}
}