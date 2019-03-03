import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.io.IOException;
import java.awt.Image;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class StartUp extends JPanel {

	private static final long serialVersionUID = 1L;
	private boolean playMusic = false;
	private AudioInputStream firstTone;
	private Clip music;
	private int i = 0;
    private Image img = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("Files/Logo.png"));
private Image LoadingBar1 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (1).png"));
private Image LoadingBar2 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (2).png"));
private Image LoadingBar3 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (3).png"));
private Image LoadingBar4 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (4).png"));
private Image LoadingBar5 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (5).png"));
private Image LoadingBar6 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (6).png"));
private Image LoadingBar7 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (7).png"));
private Image LoadingBar8 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (8).png"));
private Image LoadingBar9 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (9).png"));
private Image LoadingBar10 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (10).png"));
private Image LoadingBar11 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (11).png"));
private Image LoadingBar12 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (12).png"));
private Image LoadingBar13 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (13).png"));
private Image LoadingBar14 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (14).png"));
private Image LoadingBar15 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (15).png"));
private Image LoadingBar16 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (16).png"));
private Image LoadingBar17 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (17).png"));
private Image LoadingBar18 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (18).png"));
private Image LoadingBar19 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (19).png"));
private Image LoadingBar20 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (20).png"));
private Image LoadingBar21 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (21).png"));
private Image LoadingBar22 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (22).png"));
private Image LoadingBar23 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (23).png"));
private Image LoadingBar24 = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("LoadingBar/LoadingBar (24).png"));
    private Image Welcome = Toolkit.getDefaultToolkit().getImage(super.getClass().getResource("Files/Welcome.png"));
	public LogIn login;
	public JFrame fr;
	private int height;
	private int width;
	private Font WelcomeFont = new Font("Arial", Font.ITALIC, 96);

	// Constructor
	public StartUp(int w, int h, JFrame f) {
		super.setOpaque(true);
		super.setPreferredSize(new Dimension(w, h));
		super.setBackground(Color.BLACK);
		fr = f;
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		width = w;
		height = h;
	}

	public void start() {
		for (i = 0; i <= 920; i+=2) // initial i = 0
		{
			//i=490;
			//System.out.println(i);
			repaint();
			try {
				Thread.sleep(25); // should be 25
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		fr.remove(this);
		login = new LogIn(width, height, fr);
		fr.add(login);
		fr.pack();
		fr.revalidate();
        fr.setVisible(true);
		login.start();
	}

	// Perform any custom painting (if necessary) in this method
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		if (i == 600) {
			playMusic = true;
			//System.exit(0);
		}
		if (i > 0 && i < 600) {
	        g.drawImage(img, width/3, height/6, width/3, height/3, this);
		}
		
		if (i > 100 && i < 115) 
			g.drawImage(LoadingBar1, width*14/40, height*2/3, width/3, height/12, this);
			if (i > 110 && i < 125) 
				g.drawImage(LoadingBar2, width*14/40, height*2/3, width/3, height/12, this);
				if (i > 120 && i < 135) 
					g.drawImage(LoadingBar3, width*14/40, height*2/3, width/3, height/12, this);
					if (i > 130 && i < 145) 
						g.drawImage(LoadingBar4, width*14/40, height*2/3, width/3, height/12, this);
						if (i > 140 && i < 155) 
							g.drawImage(LoadingBar5, width*14/40, height*2/3, width/3, height/12, this);
							if (i > 150 && i < 165) 
								g.drawImage(LoadingBar6, width*14/40, height*2/3, width/3, height/12, this);
								if (i > 160 && i < 175) 
									g.drawImage(LoadingBar7, width*14/40, height*2/3, width/3, height/12, this);
									if (i > 170 && i < 185) 
										g.drawImage(LoadingBar8, width*14/40, height*2/3, width/3, height/12, this);
										if (i > 180 && i < 195) 
											g.drawImage(LoadingBar9, width*14/40, height*2/3, width/3, height/12, this);
											if (i > 190 && i < 205) 
												g.drawImage(LoadingBar10, width*14/40, height*2/3, width/3, height/12, this);
												if (i > 200 && i < 215) 
													g.drawImage(LoadingBar11, width*14/40, height*2/3, width/3, height/12, this);
													if (i > 210 && i < 225) 
														g.drawImage(LoadingBar12, width*14/40, height*2/3, width/3, height/12, this);
														if (i > 220 && i < 235) 
															g.drawImage(LoadingBar13, width*14/40, height*2/3, width/3, height/12, this);
															if (i > 230 && i < 245) 
																g.drawImage(LoadingBar14, width*14/40, height*2/3, width/3, height/12, this);
																if (i > 240 && i < 255) 
																	g.drawImage(LoadingBar15, width*14/40, height*2/3, width/3, height/12, this);
																	if (i > 250 && i < 265) 
																		g.drawImage(LoadingBar16, width*14/40, height*2/3, width/3, height/12, this);
																		if (i > 260 && i < 275) 
																			g.drawImage(LoadingBar17, width*14/40, height*2/3, width/3, height/12, this);
																			if (i > 270 && i < 285) 
																				g.drawImage(LoadingBar18, width*14/40, height*2/3, width/3, height/12, this);
																				if (i > 280 && i < 295) 
																					g.drawImage(LoadingBar19, width*14/40, height*2/3, width/3, height/12, this);
																					if (i > 290 && i < 305) 
																						g.drawImage(LoadingBar20, width*14/40, height*2/3, width/3, height/12, this);
																						if (i > 300 && i < 315) 
																							g.drawImage(LoadingBar21, width*14/40, height*2/3, width/3, height/12, this);
																							if (i > 310 && i < 325) 
																								g.drawImage(LoadingBar22, width*14/40, height*2/3, width/3, height/12, this);
																								if (i > 320 && i < 335) 
																									g.drawImage(LoadingBar23, width*14/40, height*2/3, width/3, height/12, this);
																									if (i > 330 && i < 345) 
																										g.drawImage(LoadingBar24, width*14/40, height*2/3, width/3, height/12, this);			
																									if (i > 340 && i < 355) 
																										g.drawImage(LoadingBar1, width*14/40, height*2/3, width/3, height/12, this);
																										if (i > 350 && i < 365) 
																											g.drawImage(LoadingBar2, width*14/40, height*2/3, width/3, height/12, this);
																											if (i > 360 && i < 375) 
																												g.drawImage(LoadingBar3, width*14/40, height*2/3, width/3, height/12, this);
																												if (i > 370 && i < 385) 
																													g.drawImage(LoadingBar4, width*14/40, height*2/3, width/3, height/12, this);
																													if (i > 380 && i < 395) 
																														g.drawImage(LoadingBar5, width*14/40, height*2/3, width/3, height/12, this);
																														if (i > 390 && i < 405) 
																															g.drawImage(LoadingBar6, width*14/40, height*2/3, width/3, height/12, this);
																															if (i > 400 && i < 415) 
																																g.drawImage(LoadingBar7, width*14/40, height*2/3, width/3, height/12, this);
																																if (i > 410 && i < 425) 
																																	g.drawImage(LoadingBar8, width*14/40, height*2/3, width/3, height/12, this);
																																	if (i > 420 && i < 435) 
																																		g.drawImage(LoadingBar9, width*14/40, height*2/3, width/3, height/12, this);
																																		if (i > 430 && i < 445) 
																																			g.drawImage(LoadingBar10, width*14/40, height*2/3, width/3, height/12, this);
																																			if (i > 440 && i < 455) 
																																				g.drawImage(LoadingBar11, width*14/40, height*2/3, width/3, height/12, this);
																																				if (i > 450 && i < 465) 
																																					g.drawImage(LoadingBar12, width*14/40, height*2/3, width/3, height/12, this);
																																					if (i > 460 && i < 475) 
																																						g.drawImage(LoadingBar13, width*14/40, height*2/3, width/3, height/12, this);
																																						if (i > 470 && i < 485) 
																																							g.drawImage(LoadingBar14, width*14/40, height*2/3, width/3, height/12, this);
																																							if (i > 480 && i < 495) 
																																								g.drawImage(LoadingBar15, width*14/40, height*2/3, width/3, height/12, this);
																																								if (i > 490 && i < 505) 
																																									g.drawImage(LoadingBar16, width*14/40, height*2/3, width/3, height/12, this);
																																									if (i > 500 && i < 515) 
																																										g.drawImage(LoadingBar17, width*14/40, height*2/3, width/3, height/12, this);
																																										if (i > 510 && i < 525) 
																																											g.drawImage(LoadingBar18, width*14/40, height*2/3, width/3, height/12, this);
																																											if (i > 520 && i < 535) 
																																												g.drawImage(LoadingBar19, width*14/40, height*2/3, width/3, height/12, this);
																																												if (i > 530 && i < 545) 
																																													g.drawImage(LoadingBar20, width*14/40, height*2/3, width/3, height/12, this);
																																													if (i > 540 && i < 555) 
																																														g.drawImage(LoadingBar21, width*14/40, height*2/3, width/3, height/12, this);
																																														if (i > 550 && i < 565) 
																																															g.drawImage(LoadingBar22, width*14/40, height*2/3, width/3, height/12, this);
																																															if (i > 560 && i < 575) 
																																																g.drawImage(LoadingBar23, width*14/40, height*2/3, width/3, height/12, this);
																																																if (i > 570 && i < 585) 
																																																	g.drawImage(LoadingBar24, width*14/40, height*2/3, width/3, height/12, this);
																																																//g.drawImage(LoadingBar1, width*14/40, height*2/3, width/3, height/12, this);
																																																if (i > 580 && i < 595) 
																																																	g.drawImage(LoadingBar2, width*14/40, height*2/3, width/3, height/12, this);
																																																	if (i > 590 && i < 605) 
																																																		g.drawImage(LoadingBar3, width*14/40, height*2/3, width/3, height/12, this);
																																																		if (i > 600 && i < 615) 
																																																			g.drawImage(LoadingBar4, width*14/40, height*2/3, width/3, height/12, this);
																																																			if (i > 610 && i < 625) 
																																																				g.drawImage(LoadingBar5, width*14/40, height*2/3, width/3, height/12, this);
																																																				if (i > 620 && i < 635) 
																																																					g.drawImage(LoadingBar6, width*14/40, height*2/3, width/3, height/12, this);
																																																					if (i > 630 && i < 645) 
																																																						g.drawImage(LoadingBar7, width*14/40, height*2/3, width/3, height/12, this);
																																																						if (i > 640 && i < 655) 
																																																							g.drawImage(LoadingBar8, width*14/40, height*2/3, width/3, height/12, this);
																																																							if (i > 650 && i < 665) 
																																																								g.drawImage(LoadingBar9, width*14/40, height*2/3, width/3, height/12, this);
																																																								if (i > 660 && i < 675) 
																																																									g.drawImage(LoadingBar10, width*14/40, height*2/3, width/3, height/12, this);
																																																									if (i > 670 && i < 685) 
																																																										g.drawImage(LoadingBar11, width*14/40, height*2/3, width/3, height/12, this);
																																																										if (i > 680 && i < 695) 
																																																											g.drawImage(LoadingBar12, width*14/40, height*2/3, width/3, height/12, this);
																																																											if (i > 690 && i < 705) 
																																																												g.drawImage(LoadingBar13, width*14/40, height*2/3, width/3, height/12, this);
																																																												if (i > 700 && i < 715) 
																																																													g.drawImage(LoadingBar14, width*14/40, height*2/3, width/3, height/12, this);
																																																													if (i > 710 && i < 725) 
																																																														g.drawImage(LoadingBar15, width*14/40, height*2/3, width/3, height/12, this);
																																																														if (i > 720 && i < 735) 
																																																															g.drawImage(LoadingBar16, width*14/40, height*2/3, width/3, height/12, this);
																																																															if (i > 730 && i < 745) 
																																																																g.drawImage(LoadingBar17, width*14/40, height*2/3, width/3, height/12, this);
																																																																if (i > 740 && i < 755) 
																																																																	g.drawImage(LoadingBar18, width*14/40, height*2/3, width/3, height/12, this);
																																																																	if (i > 750 && i < 765) 
																																																																		g.drawImage(LoadingBar19, width*14/40, height*2/3, width/3, height/12, this);
																																																																		if (i > 760 && i < 775) 
																																																																			g.drawImage(LoadingBar20, width*14/40, height*2/3, width/3, height/12, this);
																																																																			if (i > 770 && i < 785) 
																																																																				g.drawImage(LoadingBar21, width*14/40, height*2/3, width/3, height/12, this);
																																																																				if (i > 780 && i < 795) 
																																																																					g.drawImage(LoadingBar22, width*14/40, height*2/3, width/3, height/12, this);
																																																																					if (i > 790 && i < 805) 
																																																																						g.drawImage(LoadingBar23, width*14/40, height*2/3, width/3, height/12, this);
																																																																						if (i > 800 && i < 815) 
																																																																							g.drawImage(LoadingBar24, width*14/40, height*2/3, width/3, height/12, this);			
																																																																						

		
		if (i > 600 && i < 1000) {
			g.drawImage(Welcome, 0, 0, width, height, this);
			g.setFont(WelcomeFont);
			g.setColor(Color.BLACK);
			g.drawString("Welcome", (width*3/5) + 10, (height/2) + 4);
			g.setColor(Color.WHITE);
			g.drawString("Welcome", width*3/5, height/2);
		}
		if (i == 900) {
			music.stop();
			music.close();
		}


		// ---------------------------------------MUSIC---------------------------------------//

		if (playMusic == true) {
			playMusic = false;
			try {
				// System.out.println("help");
				music = AudioSystem.getClip();
				firstTone = AudioSystem.getAudioInputStream(getClass()
						.getResource("Startup_Sound.wav"));
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