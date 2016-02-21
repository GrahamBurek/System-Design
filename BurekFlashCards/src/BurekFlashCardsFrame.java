import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.text.NumberFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class BurekFlashCardsFrame extends JFrame {

	private JPanel contentPane;
	
	NumberFormat firstNumFormat = NumberFormat.getNumberInstance();
	NumberFormat secondNumFormat = NumberFormat.getNumberInstance();
	NumberFormat sumNumFormat = NumberFormat.getNumberInstance();
	
	private final JFormattedTextField firstNumFTF = new JFormattedTextField(firstNumFormat);
	private final JFormattedTextField secondNumFTF = new JFormattedTextField(secondNumFormat);
	private final JFormattedTextField sumFTF = new JFormattedTextField(sumNumFormat);
	
	double firstNum = 0.0;
	double secondNum = 0.0;
	double sumNum = 0.0;
	
	private final JLabel lblNumber_1 = new JLabel("Number 1");
	private final JLabel lblNumber_2 = new JLabel("Number 2");
	private final JLabel labelPlus = new JLabel("+");
	private final JLabel labelEquals = new JLabel("=");
	private final JLabel lblSum = new JLabel("Sum");

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekFlashCardsFrame frame = new BurekFlashCardsFrame();
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
	public BurekFlashCardsFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek Flash Cards");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNumFTF.setValue(firstNum);
		secondNumFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				do_secondNumFTF_propertyChange(evt);
			}
		});
		secondNumFTF.setValue(secondNum);
		sumFTF.setValue(sumNum);
		
		firstNumFTF.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				do_firstNumFTF_propertyChange(arg0);
			}
		});
		firstNumFTF.setBounds(15, 16, 77, 26);
		
		
		secondNumFTF.setBounds(15, 99, 77, 26);
		
				
		sumFTF.setEditable(false);
		sumFTF.setBounds(15, 182, 77, 26);
		
				
		
		contentPane.add(secondNumFTF);
		contentPane.add(firstNumFTF);
		contentPane.add(sumFTF);
		
		lblNumber_1.setBounds(105, 19, 77, 20);
		
		contentPane.add(lblNumber_1);
		lblNumber_2.setBounds(105, 102, 77, 20);
		
		contentPane.add(lblNumber_2);
		labelPlus.setBounds(133, 59, 22, 20);
		
		contentPane.add(labelPlus);
		labelEquals.setBounds(133, 149, 22, 20);
		
		contentPane.add(labelEquals);
		lblSum.setBounds(123, 185, 40, 20);
		
		contentPane.add(lblSum);
	}
	
	protected void do_firstNumFTF_propertyChange(PropertyChangeEvent arg0) {
		firstNum =  ((Number)(firstNumFTF.getValue())).doubleValue();
		secondNum =  ((Number)(secondNumFTF.getValue())).doubleValue();
		// System.out.println(secondNumFTF.getValue());
		sumFTF.setValue(firstNum + secondNum);
		
		if(firstNum < 0){
			firstNumFTF.setForeground(Color.RED);
		}
	}
	
	protected void do_secondNumFTF_propertyChange(PropertyChangeEvent evt) {
		firstNum =  ((Number)(firstNumFTF.getValue())).doubleValue();
		secondNum =  ((Number)(secondNumFTF.getValue())).doubleValue();
		sumFTF.setValue(firstNum + secondNum);
		
		if(secondNum < 0){
			secondNumFTF.setForeground(Color.RED);
		}
	}
}
