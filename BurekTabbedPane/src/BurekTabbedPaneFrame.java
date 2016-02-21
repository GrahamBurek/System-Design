import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;
import javax.swing.text.MaskFormatter;
import javax.swing.event.ChangeEvent;
import javax.swing.JFormattedTextField;

public class BurekTabbedPaneFrame extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel namePanel = new JPanel();
	private final JLabel lblFirstName = new JLabel("Name:");
	private final JTextField nameTextField = new JTextField();
	private final JPanel addressPanel = new JPanel();
	private final JLabel lblAddressName = new JLabel("Name");
	private final JPanel summaryPanel = new JPanel();
	private final JLabel lblAddressStreet = new JLabel("Street:");
	private final JLabel lblAddressCity = new JLabel("City:");
	private final JLabel lblAddressState = new JLabel("State:");
	private final JLabel lblAddressZip = new JLabel("ZIP:");
	private final JTextField streetTextField = new JTextField();
	private final JTextField cityTextField = new JTextField();
	private final JLabel lblSummaryName = new JLabel("Name");
	private final JLabel lblSummaryStreet = new JLabel("Street");
	private final JLabel lblSummaryCity = new JLabel("City");
	private final JLabel lblSummaryState = new JLabel("State");
	private final JLabel lblSummaryZip = new JLabel("ZIP");
	private final JFormattedTextField stateFTF = new JFormattedTextField();
	private final JFormattedTextField zipFTF = new JFormattedTextField();
	
	// Masks
	
	MaskFormatter stateMask = createFormatter("UU");
	MaskFormatter zipMask = createFormatter("#####");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekTabbedPaneFrame frame = new BurekTabbedPaneFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public MaskFormatter createFormatter(String s) {
	     MaskFormatter formatter = null;
	     try {
	          formatter = new MaskFormatter(s);
	         } 
	     catch (java.text.ParseException exc) {
		          System.err.println("formatter is bad: " + exc.getMessage());
		          System.exit(-1);
		      }
	      return formatter;
	}//createFormatter

	/**
	 * Create the frame.
	 */
	public BurekTabbedPaneFrame() {
		cityTextField.setBounds(66, 79, 86, 20);
		cityTextField.setColumns(10);
		streetTextField.setBounds(66, 40, 86, 20);
		streetTextField.setColumns(10);
		nameTextField.setBounds(76, 11, 110, 20);
		nameTextField.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek Tabbed Panes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 606, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane.setBounds(10, 11, 555, 322);
		
		tabbedPane.addTab("Address", null, addressPanel, "Enter your address information here.");
		addressPanel.setLayout(null);
		lblAddressName.setBounds(66, 11, 86, 14);
		
		addressPanel.add(lblAddressName);
		lblAddressStreet.setBounds(10, 43, 46, 14);
		
		addressPanel.add(lblAddressStreet);
		lblAddressCity.setBounds(10, 82, 46, 14);
		
		addressPanel.add(lblAddressCity);
		lblAddressState.setBounds(10, 127, 46, 14);
		
		addressPanel.add(lblAddressState);
		lblAddressZip.setBounds(10, 173, 46, 14);
		
		addressPanel.add(lblAddressZip);
		
		addressPanel.add(streetTextField);
		
		addressPanel.add(cityTextField);
		stateFTF.setBounds(66, 121, 86, 26);
		stateMask.install(stateFTF);
		addressPanel.add(stateFTF);
		
		zipFTF.setBounds(66, 167, 86, 26);
		zipMask.install(zipFTF);
		addressPanel.add(zipFTF);
		
		tabbedPane.addTab("Summary", null, summaryPanel, "Here's a summary of your address information.");
		summaryPanel.setLayout(null);
		lblSummaryName.setBounds(65, 53, 92, 14);
		
		summaryPanel.add(lblSummaryName);
		lblSummaryStreet.setBounds(65, 88, 175, 14);
		
		summaryPanel.add(lblSummaryStreet);
		lblSummaryCity.setBounds(65, 130, 92, 14);
		
		summaryPanel.add(lblSummaryCity);
		lblSummaryState.setBounds(170, 130, 70, 14);
		
		summaryPanel.add(lblSummaryState);
		lblSummaryZip.setBounds(271, 130, 46, 14);
		
		summaryPanel.add(lblSummaryZip);
		
		tabbedPane.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				do_tabbedPane_stateChanged(arg0);
			}
		});
		
		contentPane.add(tabbedPane);
		
		
		
		tabbedPane.addTab("Name", null, namePanel, "Enter your name here.");
		namePanel.setLayout(null);
		lblFirstName.setBounds(10, 14, 56, 14);
		
		namePanel.add(lblFirstName);
		
		namePanel.add(nameTextField);
	}
	protected void do_tabbedPane_stateChanged(ChangeEvent arg0) {
		
		if(nameTextField.getText().isEmpty()){
			lblAddressName.setText("Name");
			lblAddressName.setForeground(Color.RED);
			lblSummaryName.setText("Name");
			lblSummaryName.setForeground(Color.RED);
		} else {
			lblAddressName.setText(nameTextField.getText());
			lblAddressName.setForeground(Color.BLACK);
			lblSummaryName.setText(nameTextField.getText());
			lblSummaryName.setForeground(Color.BLACK);
		}
		
		if(streetTextField.getText().isEmpty()){
			lblSummaryStreet.setText("Street");
			lblSummaryStreet.setForeground(Color.RED);
		} else {
			lblSummaryStreet.setText(streetTextField.getText());
			lblSummaryStreet.setForeground(Color.BLACK);
		}
		
		if(cityTextField.getText().isEmpty()){
			lblSummaryCity.setText("City");
			lblSummaryCity.setForeground(Color.RED);
		} else {
			lblSummaryCity.setText(cityTextField.getText());
			lblSummaryCity.setForeground(Color.BLACK);
		}
		
		if(stateFTF.getText().equals("  ")){
			lblSummaryState.setText("State");
			lblSummaryState.setForeground(Color.RED);
		} else {
			lblSummaryState.setText(stateFTF.getText());
			lblSummaryState.setForeground(Color.BLACK);
		}
		
		if(zipFTF.getText().equals("     ")){
			lblSummaryZip.setText("ZIP");
			lblSummaryZip.setForeground(Color.RED);
		} else {
			lblSummaryZip.setText(zipFTF.getText());
			lblSummaryZip.setForeground(Color.BLACK);
		}
	}
}
