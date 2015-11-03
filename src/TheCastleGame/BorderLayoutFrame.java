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

		public BorderLayoutFrame()

	{

			super("BorderLayout Demo");

	 

	layout = new BorderLayout(5,5);

	setLayout(layout);

	buttons = new JButton[names.length];

	 

			for (int count = 0; count < names.length; count++)

	{ 

				buttons[count] = new JButton(names[count]);

				buttons[count].addActionListener(this);

	}

			add(buttons[0], BorderLayout.NORTH);

			add(buttons[1], BorderLayout.SOUTH);

			add(buttons[2], BorderLayout.EAST);

			add(buttons[3], BorderLayout.WEST);

			//add(buttons[4], BorderLayout.CENTER); 
	}
			
	@Override

	public void actionPerformed(ActionEvent event)

	{

	for (JButton button : buttons)

	{

		if (event.getSource() == buttons[0]) // if north is selected
	{

	button.setVisible(true);
	JOptionPane.showMessageDialog(null, "You decided to go upstairs!");
	BorderLayoutFrame.LabelFrame(); // attempt to call LabelFrame
	break;
	}

		if (event.getSource() == buttons[2]) // east selected

	{

		button.setVisible(true);
		JOptionPane.showMessageDialog(null, "Yo decided to go right!");
		break;
	}

		if (event.getSource() == buttons[3]) // west selected

	{
		button.setVisible(true);
		JOptionPane.showMessageDialog(null, "You decided to go left!");
	 break;

	 
	 
	}}
}

	private static void LabelFrame() {
		// TODO Auto-generated method stub
		{
			LabelFrame pic = new LabelFrame();						// show the image
			pic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			pic.setSize(600, 450);
			pic.setVisible(true);	
	}
	} }

