import javax.swing.JFrame;

public class Fonts {
	public static void main( String[] args ) {
		JFrame frame = new JFrame("Using Fonts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FontJPanel fontJPanel = new FontJPanel();
		frame.add(fontJPanel);
		frame.setSize(420, 150);
		frame.setVisible(true);
	}
}