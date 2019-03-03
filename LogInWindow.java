import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.Color;

import javax.swing.ImageIcon;
import java.awt.Point;

public class LogInWindow extends javax.swing.JPanel
{
	private static String UserName = "";
	private boolean done = false;
	private static final long serialVersionUID = 1L;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private JLabel lblInsertImageHere;

	public LogInWindow(int x, int y, int width, int height)
	{
		initComponents();
	}
	
  private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        Clear = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel1.setText("UserName:");

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 3, 24));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24));
        jLabel2.setText("Password:");

        jTextField1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 20));
        jTextField1.setText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Enter.setText("Ok");
        Enter.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 20));
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        
        JTextPane txtpnLogOnTo = new JTextPane();
        txtpnLogOnTo.setFont(new Font("Tahoma", Font.PLAIN, 20));
        txtpnLogOnTo.setForeground(Color.WHITE);
        txtpnLogOnTo.setBackground(Color.BLUE);
        txtpnLogOnTo.setText("Log On to AlbertXP");
        
        lblInsertImageHere = new JLabel();
        //Image logo = new ImageIcon("/LogoClear.png").getImage();
        ImageIcon logo = new ImageIcon(this.getClass().getResource("Files/Logo.png"));
        lblInsertImageHere.setIcon(logo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel2)
        				.addComponent(jLabel1))
        			.addGap(73)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(Enter, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(Clear, GroupLayout.PREFERRED_SIZE, 176, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jTextField1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
        				.addComponent(jPasswordField1, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
        			.addContainerGap())
        		.addComponent(txtpnLogOnTo, GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(252)
        			.addComponent(lblInsertImageHere)
        			.addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(txtpnLogOnTo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(lblInsertImageHere, GroupLayout.PREFERRED_SIZE, 207, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(Clear, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        				.addComponent(Enter, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGap(45))
        );
        this.setLayout(layout);
    }

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt){}
	private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt){}
	private void EnterActionPerformed(java.awt.event.ActionEvent evt)
	{
		done = true;
		UserName = jTextField1.getText();
	}

	private void ClearActionPerformed(java.awt.event.ActionEvent evt)
	{
		jTextField1.setText("");
		jPasswordField1.setText("");
	}

	public String UserName()
	{
		//System.out.println("1"+UserName);
		return UserName;
	}
	
	public boolean done()
	{
		return done;
	}
}