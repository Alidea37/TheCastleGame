package TheCastleGame;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {
private final JLabel label1; // JLabel with text and Icon
	
	//LabelFrame constructor adds JLabel to JFrame
	public LabelFrame()
	{
		super("Testing JLabel");
		setLayout(new FlowLayout()); // set frame layout
		
		{
		
		Icon witch = new ImageIcon(getClass().getResource("witch.jpg"));
		
		label1 = new JLabel(); // JLabel constructor no arguments
		label1.setText("You met a witch, she turned you into a toad!");
		label1.setIcon(witch); // add icon to JLabel
		label1.setHorizontalTextPosition(SwingConstants.CENTER);
		label1.setVerticalTextPosition(SwingConstants.BOTTOM);
		label1.setToolTipText("This is label1");
		add(label1); // add label1 to JFrame	
		}}
	
		private final JLabel label2; // JLabel with text and Icon
		{
		//LabelFrame constructor adds JLabel to JFrame
			
		{
			setLayout(new FlowLayout()); // set frame layout
			Icon gold = new ImageIcon(getClass().getResource("treasure.jpg"));
			
			label2 = new JLabel(); // JLabel constructor no arguments
			label2.setText("You found the treasure!");
			label2.setIcon(gold); // add icon to JLabel
			label2.setHorizontalTextPosition(SwingConstants.CENTER);
			label2.setVerticalTextPosition(SwingConstants.BOTTOM);
			label2.setToolTipText("This is label2");
			add(label2); // add label1 to JFrame
		}}
	
	
	
		
	}
