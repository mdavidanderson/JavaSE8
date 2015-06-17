import javax.swing.JFrame;

public class DrawPolygons {
	public static void main(String[] args) {
		JFrame application = new JFrame("Draw Polygons");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(new PolygonsJPanel());
		application.setSize(280,270);
		application.setVisible(true);
	}
}