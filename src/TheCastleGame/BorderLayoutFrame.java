package TheCastleGame;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class BorderLayoutFrame extends JFrame implements ActionListener{
	

	private final JButton[] buttons;
	private static final String[] names = {"Upstairs", "Downstairs", "Right", "Left"};
	private final BorderLayout layout;
	int gameCount = 1;
	
	public void buttonsNew(){
	
		public BorderLayoutFrame() // constructor JH
		
	{
		
			super("BorderLayout Demo");

				layout = new BorderLayout(5,5);

				setLayout(layout);

				buttons = new JButton[names.length]; // create an array for the buttons N,S,E,W JH
	
						
		for (int buttoncount = 0; buttoncount < names.length; buttoncount++) // actionlistener count JH
	{ 
				buttons[buttoncount] = new JButton(names[buttoncount]);
				buttons[buttoncount].addActionListener(this);
	}
				add(buttons[0], BorderLayout.NORTH);
				add(buttons[1], BorderLayout.SOUTH);
				add(buttons[2], BorderLayout.EAST);
				add(buttons[3], BorderLayout.WEST); //add(buttons[4], BorderLayout.CENTER); 
		
		}
			
	@Override

			public void actionPerformed(ActionEvent event)
			{
		
		// for (int gameCount = 0; gameCount <=2; gameCount++) // loops the game 3 times before closing p. 125 fig 4.2 ForCounter
		// for counter needs to go elsewhere
			{
			
				for (JButton button : buttons)
		{
					if (event.getSource() == buttons[0]) // if north is selected
					{
						button.setVisible(true);
						JOptionPane.showMessageDialog(null, "You decided to go upstairs!");
						LabelFrame pic = new LabelFrame();
						pic.getGraphics1();
						break;
				}
					if (event.getSource() == buttons[3]) // west selected
					{
						button.setVisible(true);
						JOptionPane.showMessageDialog(null, "You decided to go left!");
						break;
				}
		
					if (event.getSource() == buttons[2]) // east selected ---> treasure
					{
						button.setVisible(true);
						JOptionPane.showMessageDialog(null, "You decided to go right!");
						LabelFrame pic = new LabelFrame();
						pic.getGraphics2();
						break;
				}
					if (event.getSource() == buttons[1]) // east selected
					{
						button.setVisible(true);
						JOptionPane.showMessageDialog(null, "You decided to go downstairs!");
						LabelFrame pic = new LabelFrame();
						pic.getGraphics3();
						break;
						
					}}}
					}}