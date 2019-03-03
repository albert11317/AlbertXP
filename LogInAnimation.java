import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class LogInAnimation extends JPanel{

	private static final long serialVersionUID = 1L;
	private boolean playMusic = false;
	private AudioInputStream firstTone;
	private Clip music;
	private int i = 0;
    Image Welcome = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("Files/Welcome.png"));
	private String UserName = "";
	private JFrame fr;
	private int width;
	private int height;
	public Windows windows;
	private Font WelcomeFont = new Font("Arial", Font.ITALIC, 96);
	
	// Constructor
	public LogInAnimation(int w, int h, String userName, JFrame f)
	{
		UserName = userName;
		super.setOpaque(true);
		super.setBackground(Color.BLACK);
		super.setPreferredSize(new Dimension(w, h));
		width = w;
		height = h;
		fr = f;
	}
	
	public void start()
	{
		for (i = 0; i<300; i+=2) //initial i = 0
		{
			repaint();
			try
			{
				Thread.sleep(25);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		//System.out.print("Windows about to start...");
		fr.remove(this);
		windows = new Windows(width, height, fr);
		fr.add(windows);
		fr.pack();
		fr.revalidate();
		windows.start();
	}

	// Perform any custom painting (if necessary) in this method
	@Override
	public void paintComponent(Graphics g)
	{
		//System.out.append("asfdg");
		String Line1 ="Welcome " + UserName + "...";
		g.setColor(Color.black);
		g.fillRect(0,0, width, height);
		g.setColor(Color.white);

		if (i == 0)
		{
				playMusic = true;
		}
		if (i>0&&i<100)
		{
			g.drawImage(Welcome, 0, 0, width, height, this);
			g.setFont(WelcomeFont);
			g.setColor(Color.BLACK);
			g.drawString(Line1, (width*2/5) + 10, (height/2) + 4);
			g.setColor(Color.WHITE);
			g.drawString(Line1, width*2/5, height/2);
		}
		//---------------------------------------MUSIC---------------------------------------//
		if (playMusic==true)
		{
			playMusic=false;
		try {
			music = AudioSystem.getClip();
			firstTone = AudioSystem.getAudioInputStream(getClass().getResource("Logon_Sound.wav"));
			music.open(firstTone);
			music.start();
			}
			catch (LineUnavailableException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			catch (UnsupportedAudioFileException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}