package giga;

import javax.swing.JFrame;

public class Main extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2799137469759654245L;

	public Main()
	{
		add(new Space());
		setTitle("Battle Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(640, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Main();
	}

}
