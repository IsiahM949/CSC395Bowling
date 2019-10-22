package bowling;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

public class BowlingGui
{
	public static void main( String[] args )
	{
		JFrame braheFrame = new JFrame();
		JPanel brahePanel = new JPanel( new GridBagLayout() );
		JTextField braheUser = new JTextField();
		JTextField brahePass = new JTextField();
		JButton braheButton  = new JButton("Login");
		JLabel braheUserLabel = new JLabel("Username");
		JLabel brahePassLabel = new JLabel("Password");
		
		
		JFrame mainFrame = new JFrame();
		JPanel mainPanel = new JPanel( new GridBagLayout() );
		JFrame mainFrame2 = new JFrame();
		JPanel mainPanel2 = new JPanel( new GridBagLayout() );
		JFrame mainFrame3 = new JFrame();
		JPanel mainPanel3 = new JPanel( new GridBagLayout() );
		JButton      button1 = new JButton( "Secretary" );
		JButton		 button2 = new JButton( "Treasurer" );
		JTextField  username = new JTextField();
		JTextField  password = new JTextField();
		JTextField  username2 = new JTextField();
		JTextField  password2 = new JTextField();
		JLabel label1 = new JLabel("Username");
		JLabel label2 = new JLabel("Password");
		JLabel label3 = new JLabel("Username");
		JLabel label4 = new JLabel("Password");
		
		mainFrame.setSize(400,300);
		mainFrame2.setSize(500,200);
		mainFrame3.setSize(500,200);
		braheFrame.setSize(400,400);
		
		mainPanel.add(  button1,
						new GridBagConstraints(0, 0, 1, 1, 0.5, 0.5,
										   	   GridBagConstraints.FIRST_LINE_START,
										   	   GridBagConstraints.BOTH,
										   	   new Insets(5, 5, 5, 5), 0, 0) );
		
		mainPanel.add(  button2,
			    		new GridBagConstraints( 1, 0, 1, 1, 0.5, 0.5,
			    								GridBagConstraints.FIRST_LINE_START,
			    								GridBagConstraints.BOTH,
			    								new Insets(5, 5, 5, 5), 0, 0) );
		mainPanel2.add( username,
	    				new GridBagConstraints( 2, 0, 1, 1, 0.5, 0.5,
	    										GridBagConstraints.FIRST_LINE_START,
	    										GridBagConstraints.BOTH,
	    										new Insets(5, 5, 5, 5), 0, 0) );

		mainPanel2.add( password,
						new GridBagConstraints( 2, 1, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		mainPanel2.add( label1,
						new GridBagConstraints( 1, 0, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		mainPanel2.add( label2,
						new GridBagConstraints( 1, 1, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		
		
		mainPanel3.add( username2,
						new GridBagConstraints( 2, 0, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );

		mainPanel3.add( password2,
						new GridBagConstraints( 2, 1, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		
		mainPanel3.add( label3,
						new GridBagConstraints( 1, 0, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		mainPanel3.add( label4,
						new GridBagConstraints( 1, 1, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		
		brahePanel.add( braheUser,
						new GridBagConstraints( 2, 0, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );

		brahePanel.add( brahePass,
						new GridBagConstraints( 2, 1, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );

		brahePanel.add( braheUserLabel,
						new GridBagConstraints( 1, 0, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		brahePanel.add( brahePassLabel,
						new GridBagConstraints( 1, 1, 1, 1, 0.5, 0.5,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		brahePanel.add( braheButton,
						new GridBagConstraints( 3, 2, 1, 1, 1, 1,
												GridBagConstraints.FIRST_LINE_START,
												GridBagConstraints.BOTH,
												new Insets(5, 5, 5, 5), 0, 0) );
		
		

		
		braheFrame.add(brahePanel);
		//braheFrame.pack();
		braheFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		braheFrame.setLocationRelativeTo( null );
		
		mainFrame.add( mainPanel );
		//mainFrame.pack();
		mainFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mainFrame.setLocationRelativeTo( null );
		
		mainFrame2.add( mainPanel2 );
		//mainFrame2.pack();
		mainFrame2.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mainFrame2.setLocationRelativeTo( null );
		username.setBorder( BorderFactory.createBevelBorder( BevelBorder.LOWERED));
		username.setEditable(true);
		
		mainFrame3.add( mainPanel3 );
		//mainFrame3.pack();
		mainFrame3.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		mainFrame3.setLocationRelativeTo( null );
		username2.setBorder( BorderFactory.createBevelBorder( BevelBorder.LOWERED));
		username2.setEditable(true);
		
		SwingUtilities.invokeLater( new Runnable()
		{
			@Override
			public void run() 
			{
				braheFrame.setVisible( true );	
			}
		});
		
		braheButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater( new Runnable()
				{
					@Override
					public void run() 
					{
						mainFrame.setVisible( true );	
					}
				});
				
			}
			
			
		});

		button1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater( new Runnable()
				{
					@Override
					public void run() 
					{
						mainFrame2.setVisible( true );	
					}
				});
				
			}
			
		});
		
		button2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater( new Runnable()
				{
					@Override
					public void run() 
					{
						mainFrame3.setVisible( true );	
					}
				});
				
			}
			
		});
		
		
		
		
		
		
		
	}
	
	
}
