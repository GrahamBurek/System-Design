import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BurekTestOutputFrame extends JFrame {

	private JPanel contentPane;
	private final JButton btnSayHello = new JButton("Say Hello");
	private final JTextArea textArea = new JTextArea();
	private final JScrollPane scrollPane = new JScrollPane();
	private final JLabel lblName = new JLabel("Name:");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JTextField textField_2 = new JTextField();
	private final JLabel lblEmail = new JLabel("Email:");
	private final JLabel lblNewLabel = new JLabel("Phone #:");
	private boolean error = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekTestOutputFrame frame = new BurekTestOutputFrame();
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
	public BurekTestOutputFrame() {
		textField_2.setBounds(338, 72, 86, 20);
		textField_2.setColumns(10);
		textField_1.setBounds(338, 41, 86, 20);
		textField_1.setColumns(10);
		
		textField.setBounds(338, 13, 86, 20);
		textField.setColumns(10);
		textArea.setEditable(false);
		jbInit();
	}
	
	private void jbInit() {
		setTitle("Burek Sample Output");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnSayHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnSayHello_actionPerformed(e);
			}
		});
		btnSayHello.setBounds(10, 227, 150, 23);
		
		contentPane.add(btnSayHello);
		scrollPane.setBounds(24, 10, 226, 146);
		
		contentPane.add(scrollPane);
		
		scrollPane.setViewportView(textArea);
		lblName.setBounds(260, 16, 46, 14);
		
		contentPane.add(lblName);
		contentPane.add(textField);
		
		contentPane.add(textField_1);
		
		contentPane.add(textField_2);
		lblEmail.setBounds(260, 44, 46, 14);
		
		contentPane.add(lblEmail);
		lblNewLabel.setBounds(260, 75, 46, 14);
		
		contentPane.add(lblNewLabel);
	}
	
	protected void do_btnSayHello_actionPerformed(ActionEvent e) {
		String nameField = textField.getText();
		String emailField = textField_1.getText();
		String phoneNumberField = textField_2.getText();
		
		if(nameField.isEmpty() || emailField.isEmpty() || phoneNumberField.isEmpty()){
			error = true;
			
			String[] emptyFields = new String[3];
			if(nameField.isEmpty())
				emptyFields[0] = "Name";
			if(emailField.isEmpty())
				emptyFields[1] = "Email";
			if(phoneNumberField.isEmpty())
				emptyFields[2] = "Phone number";
			
			textArea.setText("You did not fill out all of the fields.\nPlease enter:\n");
			for(String field : emptyFields){
				if(!(field == null))
					textArea.append(field + "\n");
			}
		} else {
			if(error){
				textArea.setText("");
				error = false;
			}
			textArea.append("Hello, " + textField.getText() + "!\nYour email address is " + emailField + ".\nYour phone number is " + phoneNumberField + ".\n");
		}
	}
}
