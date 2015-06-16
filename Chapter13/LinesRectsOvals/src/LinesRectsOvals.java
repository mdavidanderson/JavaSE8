
import java.awt.Color;
import javax.swing.JFrame;

public class LinesRectsOvals {
	public static void main(String[] args) {
		JFrame application = new JFrame("Lines, Rectangles, and Ovals");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LinesRectsOvalsJPanel jpanel = new LinesRectsOvalsJPanel();
		jpanel.setBackground(Color.WHITE);
		application.add(jpanel);
		application.setSize(400,210);
		application.setVisible(true);
	}
}