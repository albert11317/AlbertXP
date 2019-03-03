import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class LeaveAnimation extends JPanel {

	private static final long serialVersionUID = 1L;
	private boolean playMusic = false;
	private AudioInputStream firstTone;
	private Clip music;
	private int i = 0;
	private int width;
	private int height;
	private Font WelcomeFont = new Font("Arial", Font.ITALIC, 96);
	Image Welcome = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("Files/Welcome.png"));
    //Image Welcome = new ImageIcon("Files/Welcome.png").getImage();

	// Constructor
	public LeaveAnimation(int w, int h, boolean shutDown, JFrame f) {
		super.setOpaque(true);
		super.setBackground(Color.BLACK);
		super.setPreferredSize(new Dimension(w, h));
		width = w;
		height = h;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// System.out.println("Constructor");
	}

	public void start() {
		// System.out.println("start method");
		for (i = 0; i<500; i+=2) {
			// System.out.println("second step");
			//this.paintComponent(getGraphics());
			repaint(); //shutdown doesn't work otherwise
			try {
				Thread.sleep(20); // CANT GO NO FASTER!!!!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.exit(0);
	}

	@Override
	public void paintComponent(Graphics g) {
		// System.out.println("paint component");
		// just for Shutdown
		//System.out.append("asfdg");
		String Line1 ="Goodbye,";
		String Line2 = "Thanks for using AlbertXP";
		g.setColor(Color.black);
		g.fillRect(0,0, width, height);
		g.setColor(Color.white);

		if (i == 0)
		{
				playMusic = true;
		}
		if (i>0&&i<500)
		{
			g.drawImage(Welcome, 0, 0, width, height, this);
			g.setFont(WelcomeFont);
			g.setColor(Color.BLACK);
			g.drawString(Line1, (width*1/5) + 10, (height/2) + 4);
			g.drawString(Line2, (width*1/5) + 10, (height/2) + 4 + 100);
			g.setColor(Color.WHITE);
			g.drawString(Line1, width*1/5, height/2);
			g.drawString(Line2, width*1/5, height/2 + 100);
		}
		// ---------------------------------------MUSIC---------------------------------------//
		if (playMusic == true) {
			playMusic = false;
			try {
				music = AudioSystem.getClip();
				firstTone = AudioSystem
						.getAudioInputStream(getClass()
								.getResource(
										"Shutdown_Sound.wav"));
				music.open(firstTone);
				music.start();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}