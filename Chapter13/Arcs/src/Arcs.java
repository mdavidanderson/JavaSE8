import javax.swing.JFrame;

public class Arcs {
	
	public static void main( String[] args ) {
		JFrame application = new JFrame("Arcs");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArcsJPanel arcsJPanel = new ArcsJPanel();
		application.add(arcsJPanel);
		application.setSize(300, 210);
		application.setVisible(true);
	}
}