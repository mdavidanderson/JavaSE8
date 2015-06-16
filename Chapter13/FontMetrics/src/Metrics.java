import javax.swing.JFrame;

public class Metrics {
	public static void main( String[] args ) {
		JFrame application = new JFrame("Using Font Metrics");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MetricsJPanel metricsPanel = new MetricsJPanel();
		
		application.add(metricsPanel);
		application.setSize(600,240);
		application.setVisible(true);;
	}
}