import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
	private final JTextField textField;
	
	private final Font plainFont;
	private final Font boldFont;
	private final Font italicFont;
	private final Font boldItalicFont;
	
	private final JRadioButton plainRadioButton;
	private final JRadioButton boldRadioButton;
	private final JRadioButton italicRadioButton;
	private final JRadioButton boldItalicRadioButton;
	
	private final ButtonGroup radioGroup;
	
	public RadioButtonFrame() {
		super("RadioButtonFrame Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change", 25);
		add(textField);
		
		plainRadioButton = new JRadioButton("Plain", true);
		boldRadioButton = new JRadioButton("Bold", false);
		italicRadioButton = new JRadioButton("Italic", false);
		boldItalicRadioButton = new JRadioButton("Bold/Italic", false);
		
		add(plainRadioButton);
		add(boldRadioButton);
		add(italicRadioButton);
		add(boldItalicRadioButton);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(plainRadioButton);
		radioGroup.add(boldRadioButton);
		radioGroup.add(italicRadioButton);
		radioGroup.add(boldItalicRadioButton);
		
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		
		textField.setFont(plainFont);
		
		plainRadioButton.addItemListener( new RadioButtonHandler(plainFont));
		boldRadioButton.addItemListener( new RadioButtonHandler(boldFont));
		italicRadioButton.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicRadioButton.addItemListener(new RadioButtonHandler(boldItalicFont));
		
	}
	
	private class RadioButtonHandler implements ItemListener {
		
		private Font font;
		
		public RadioButtonHandler(Font f) {
			font = f;
		}
		@Override
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
		}
	}
}