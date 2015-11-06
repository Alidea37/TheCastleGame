package TheCastleGame;
 // Fig 12.6 LabelFrame.java pp 473-474
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
	//LabelFrame constructor adds JLabel to JFrame
	
	public Graphics getGraphics1(){ 				// create method to hold a jframe containing the witch picture
		JPanel Witch = new JPanel(); 				// creates a new JPanel
		LabelFrame pic = new LabelFrame();			// show the image
		pic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pic.setSize(600, 450);
		
		final JLabel label1; // JLabel with text and Icon		
		Icon witch = new ImageIcon(getClass().getResource("witch.jpg"));
		label1 = new JLabel(); // JLabel constructor no arguments
		label1.setText("You met a witch, she turned you into a toad!");
		label1.setIcon(witch); // add icon to JLabel
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		Witch.add(label1);// add label1 to JFrame	
		pic.add(Witch);
		pic.setVisible(true);	
		return null;
	}
			// create a method for the jframe containing treasure
		public Graphics getGraphics2(){ 		
			JPanel Gold = new JPanel();
			LabelFrame pic = new LabelFrame();
			pic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pic.setSize(600, 450);
			
			final JLabel label2; 		// JLabel with text and Icon
			Icon gold = new ImageIcon(getClass().getResource("treasure.jpg"));
			label2 = new JLabel();		 // JLabel constructor no arguments
			label2.setText("You found the treasure!");
			label2.setIcon(gold);			 // add icon to JLabel
			label2.setHorizontalTextPosition(SwingConstants.CENTER);
			label2.setVerticalTextPosition(SwingConstants.BOTTOM);
			Gold.add(label2); 		// add label to JFrame
			pic.add(Gold);
			pic.setVisible(true);
			return null;
		}
			// create a method for jframe containing troll
		public Graphics getGraphics3(){ 		
			JPanel Troll = new JPanel();
			LabelFrame pic = new LabelFrame();
			pic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pic.setSize(600, 450);
			
			final JLabel label3; // JLabel with text and Icon
			Icon troll = new ImageIcon(getClass().getResource("troll.jpg"));
			label3 = new JLabel(); // JLabel constructor no arguments
			label3.setText("You were eaten by a troll!");
			label3.setIcon(troll); // add icon to JLabel
			label3.setHorizontalTextPosition(SwingConstants.CENTER);
			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
			Troll.add(label3); // add label to JFrame
			pic.add(Troll);
			pic.setVisible(true);
			return null;
		}
		}
