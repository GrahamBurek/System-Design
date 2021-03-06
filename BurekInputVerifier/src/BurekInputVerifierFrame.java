import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BurekInputVerifierFrame extends JFrame {

	private JPanel contentPane;
	
	// Place NumberFormat declarations after the content pane but before other declarations:
	NumberFormat numFormat = NumberFormat.getNumberInstance();
	// Requires $ symbol
	NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
	// Requires % symbol
	NumberFormat percentFormat = NumberFormat.getPercentInstance();
	
	// Modify call to constructor for FTFs (takes NumberFormat argument):
	private final JFormattedTextField firstFTF = new JFormattedTextField(numFormat);
	private final JFormattedTextField secondFTF = new JFormattedTextField(currencyFormat);
	private final JFormattedTextField thirdFTF = new JFormattedTextField(percentFormat);
	
	private final JLabel lblFirstText = new JLabel("FirstText");
	private final JLabel lblFirstValue = new JLabel("First Value");

	// For calculations:
	double num1 = 1.0;
	double num2 = 2.0;
	double num3 = 3.0;
	
	private final JLabel lblSecondText = new JLabel("SecondText");
	private final JLabel lblSecondValue = new JLabel("Second Value");
	private final JLabel lblThirdText = new JLabel("ThirdText");
	private final JLabel lblThirdValue = new JLabel("Third Value");
	private final JButton btnAdd = new JButton("Add 1");
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekInputVerifierFrame frame = new BurekInputVerifierFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BurekInputVerifierFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek Input Verifiers");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		firstFTF.setHorizontalAlignment(SwingConstants.RIGHT);
		firstFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_firstFTF_propertyChange(evt);
			}
		});
		// Value for FTFs must be initialized
		firstFTF.setBounds(24, 73, 67, 20);
		firstFTF.setValue(num1);
		contentPane.add(firstFTF);
		secondFTF.setHorizontalAlignment(SwingConstants.RIGHT);
		secondFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_secondFTF_propertyChange(evt);
			}
		});
		
		secondFTF.setBounds(24, 132, 67, 20);
		secondFTF.setValue(num2);
		contentPane.add(secondFTF);
		thirdFTF.setHorizontalAlignment(SwingConstants.RIGHT);
		thirdFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_thirdFTF_propertyChange(evt);
			}
		});
		
		thirdFTF.setBounds(24, 205, 67, 20);
		thirdFTF.setValue(num3);
		contentPane.add(thirdFTF);
		
		lblFirstText.setBounds(119, 76, 72, 14);
		
		contentPane.add(lblFirstText);
		lblFirstValue.setBounds(230, 76, 72, 14);
		
		contentPane.add(lblFirstValue);
		lblSecondText.setBounds(119, 135, 72, 14);
		
		contentPane.add(lblSecondText);
		lblSecondValue.setBounds(230, 135, 72, 14);
		
		contentPane.add(lblSecondValue);
		lblThirdText.setBounds(119, 208, 72, 14);
		
		contentPane.add(lblThirdText);
		lblThirdValue.setBounds(230, 208, 72, 14);
		
		contentPane.add(lblThirdValue);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAdd_actionPerformed(e);
			}
		});
		btnAdd.setBounds(335, 72, 89, 23);
		
		contentPane.add(btnAdd);
	}
	// Don't use focusLost event with input verifiers, use propertyChange instead
		//	protected void do_firstFTF_focusLost(FocusEvent e) {
		//		lblFirstText.setText(firstFTF.getText());
		//		lblFirstValue.setText(firstFTF.getValue().toString());
		//	}
	
	
	protected void do_firstFTF_propertyChange(PropertyChangeEvent evt) {
		lblFirstText.setText(firstFTF.getText());
		lblFirstValue.setText(firstFTF.getValue().toString());
	}
	
	protected void do_secondFTF_propertyChange(PropertyChangeEvent evt) {
		lblSecondText.setText(secondFTF.getText());
		lblSecondValue.setText(secondFTF.getValue().toString());
	}
	
	protected void do_thirdFTF_propertyChange(PropertyChangeEvent evt) {
		lblThirdText.setText(thirdFTF.getText());
		lblThirdValue.setText(thirdFTF.getValue().toString());
	}
	protected void do_btnAdd_actionPerformed(ActionEvent e) {
		// This cast will always work
		num1 = ((Number)(firstFTF.getValue())).doubleValue();
		firstFTF.setValue(num1 + 1.0);
	}
}
