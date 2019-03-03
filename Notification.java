import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
public class Notification extends javax.swing.JPanel
{
	private static final long serialVersionUID = 1L;
	public JButton Yes;
	private String text;
	public JFrame frame;
	
	public Notification(int x, int y, int height, int width, boolean shutdown, JFrame fr)
	{
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		frame = fr;
		setPreferredSize(new Dimension(736, 384));
        setBackground(Color.WHITE);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		if (shutdown)
		{
			text = "Shutdown";
		}
		else if (!shutdown)
		{
			text = "Log Off";
		}
		Yes = new JButton(text);
		Yes.setHorizontalTextPosition(SwingConstants.CENTER);
		Yes.setFont(new java.awt.Font("Tahoma", 3, 24));
		Yes.setIconTextGap(75);
		Yes.setAlignmentY(0.0f);
		Yes.setBounds(0, 207, 375, 177);
		Yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
			}
		});
		setLayout(null);
		add(Yes);
		
		JButton No = new JButton("Cancel");
		No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		No.setActionCommand("Cancel");
		No.setIconTextGap(75);
		No.setHorizontalTextPosition(SwingConstants.CENTER);
		No.setFont(new java.awt.Font("Tahoma", 3, 24));
		No.setAlignmentY(0.0f);
		No.setBounds(371, 207, 366, 177);
		add(No);
		
		JLabel JLabel1 = new JLabel("Are you sure you want to " + text + "?");
		JLabel1.setVerticalAlignment(SwingConstants.TOP);
		JLabel1.setFont(new Font("Algerian", Font.PLAIN, 36));
		JLabel1.setBounds(10, 47, 701, 48);
		add(JLabel1);
		
		JLabel JLabel2 = new JLabel("Doing so will delete all saved data!");
		JLabel2.setVerticalAlignment(SwingConstants.TOP);
		JLabel2.setFont(new Font("Algerian", Font.PLAIN, 36));
		JLabel2.setBounds(10, 95, 716, 48);
		add(JLabel2);
		initComponents();
	}
	
  private void initComponents() {
    }
}