import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class BurekInputMasksFrame extends JFrame {

	private JPanel contentPane;
	
	private final JLabel lblEnterANumber = new JLabel("Enter a Number:");
	private final JLabel lblSocialSecurityNumber = new JLabel("SSN:");
	private final JLabel lblPhoneNumber = new JLabel("Phone Number:");
	private final JLabel lblState = new JLabel("State:");
	private final JLabel lblNumOutput = new JLabel("Number");
	private final JLabel lblSSNOutput = new JLabel("SSN");
	private final JLabel lblPhoneNumberOutput = new JLabel("Phone Number");
	private final JLabel lblStateOutput = new JLabel("State");

	private final JFormattedTextField numberFTF = new JFormattedTextField();
	private final JFormattedTextField ssnFTF = new JFormattedTextField();
	private final JFormattedTextField phoneNumberFTF = new JFormattedTextField();
	private final JFormattedTextField stateFTF = new JFormattedTextField();
	
	//Masks
	MaskFormatter numMask1 = createFormatter("####");
	MaskFormatter ssnMask1 = createFormatter("###-##-####");
	MaskFormatter phoneNumberMask1 = createFormatter("(###) ###-####");
	MaskFormatter stateMask1 = createFormatter("UU");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekInputMasksFrame frame = new BurekInputMasksFrame();
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
	public BurekInputMasksFrame() {
		jbInit();
	}
	
	private void jbInit() {
		setTitle("Burek Input Masks Examples");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		numberFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_numberFTF_focusLost(e);
			}
		});
		numberFTF.setBounds(142, 75, 94, 20);
		numMask1.setPlaceholderCharacter('#');
		numMask1.install(numberFTF);
		contentPane.add(numberFTF);
		lblEnterANumber.setBounds(10, 78, 122, 14);
		
		contentPane.add(lblEnterANumber);
		lblSocialSecurityNumber.setBounds(10, 120, 66, 14);
		
		contentPane.add(lblSocialSecurityNumber);
		lblPhoneNumber.setBounds(10, 160, 109, 14);
		
		contentPane.add(lblPhoneNumber);
		lblState.setBounds(10, 202, 66, 14);
		
		contentPane.add(lblState);
		ssnFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_ssnFTF_focusLost(e);
			}
		});
		ssnFTF.setBounds(142, 117, 94, 20);
		ssnMask1.setPlaceholderCharacter('#');
		ssnMask1.install(ssnFTF);
		
		contentPane.add(ssnFTF);
		phoneNumberFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_phoneNumberFTF_focusLost(e);
			}
		});
		phoneNumberFTF.setBounds(142, 157, 94, 20);
		phoneNumberMask1.setPlaceholderCharacter('#');
		phoneNumberMask1.install(phoneNumberFTF);
		
		contentPane.add(phoneNumberFTF);
		stateFTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				do_stateFTF_focusLost(e);
			}
		});
		stateFTF.setBounds(142, 199, 36, 20);
		stateMask1.install(stateFTF);
		
		contentPane.add(stateFTF);
		lblNumOutput.setBounds(255, 78, 103, 14);
		
		contentPane.add(lblNumOutput);
		
		lblSSNOutput.setBounds(255, 120, 94, 14);
		
		contentPane.add(lblSSNOutput);
		lblPhoneNumberOutput.setBounds(255, 160, 103, 14);
		
		contentPane.add(lblPhoneNumberOutput);
		lblStateOutput.setBounds(255, 202, 81, 14);
		
		contentPane.add(lblStateOutput);
	}
	
	protected void do_numberFTF_focusLost(FocusEvent e) {
		lblNumOutput.setText(numberFTF.getText());
	}
	
	protected void do_ssnFTF_focusLost(FocusEvent e) {
		lblSSNOutput.setText(ssnFTF.getText());
	}
	
	protected void do_phoneNumberFTF_focusLost(FocusEvent e) {
		lblPhoneNumberOutput.setText(phoneNumberFTF.getText());
	}
	
	protected void do_stateFTF_focusLost(FocusEvent e) {
		lblStateOutput.setText(stateFTF.getText());
	}
}
