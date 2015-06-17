import javax.swing.JFrame;

public class Shapes extends JFrame {
	public static void main( String[] args ) {
		JFrame app = new JFrame("2D Shapes");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(new ShapesJPanel());
		app.setSize(425,200);
		app.setVisible(true);
	}
}