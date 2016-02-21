import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class BurekPizzaProjectFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblPleasePlaceYour = new JLabel("Please Place Your Order");
	private final JLabel lblName = new JLabel("Name:");
	private final JLabel lblSize = new JLabel("Size:");
	private final JLabel lblToppings = new JLabel("Toppings:");
	private final JTextField nameTextField = new JTextField();
	private final JComboBox sizeComboBox = new JComboBox();
	private final JList toppingList = new JList();
	private final JScrollPane toppingScrollPane = new JScrollPane();
	private final JButton btnPlaceOrder = new JButton("Place Order");
	private final JTextArea orderOutputTextArea = new JTextArea();
	private final JScrollPane outputScrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekPizzaProjectFrame frame = new BurekPizzaProjectFrame();
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
	public BurekPizzaProjectFrame() {
		nameTextField.setToolTipText("Enter your name here.");
		nameTextField.setBounds(50, 40, 146, 20);
		nameTextField.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek's Pizzaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblPleasePlaceYour.setBounds(125, 11, 158, 14);
		
		contentPane.add(lblPleasePlaceYour);
		lblName.setToolTipText("Enter your name here.");
		lblName.setBounds(10, 43, 46, 14);
		
		contentPane.add(lblName);
		lblSize.setToolTipText("Choose a pizza size from the menu.");
		lblSize.setBounds(10, 99, 46, 14);
		
		contentPane.add(lblSize);
		lblToppings.setToolTipText("Choose toppings here or leave blank for none.");
		lblToppings.setBounds(10, 151, 56, 14);
		
		contentPane.add(lblToppings);
		
		contentPane.add(nameTextField);
		sizeComboBox.setToolTipText("Choose a pizza size from the menu.");
		sizeComboBox.setModel(new DefaultComboBoxModel(new String[] {"Tiny", "Small", "Medium", "Large", "Extra Large"}));
		sizeComboBox.setBounds(53, 96, 83, 20);
		
		contentPane.add(sizeComboBox);
		toppingScrollPane.setToolTipText("");
		toppingScrollPane.setBounds(76, 149, 120, 68);
		
		contentPane.add(toppingScrollPane);
		toppingList.setToolTipText("Choose toppings here or leave blank for none.");
		toppingList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Pepperoni", "Onions", "Mushrooms", "Olives", "Spinach", "Extra Cheeze", "Pinapple", "Sausage", "Peppers", "Ranch"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		toppingScrollPane.setViewportView(toppingList);
		btnPlaceOrder.setToolTipText("When you are done selecting your pizza, use this button to place your order.");
		btnPlaceOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPlaceOrder_actionPerformed(e);
			}
		});
		btnPlaceOrder.setBounds(157, 227, 126, 23);
		
		contentPane.add(btnPlaceOrder);
		outputScrollPane.setBounds(259, 36, 165, 177);
		
		contentPane.add(outputScrollPane);
		orderOutputTextArea.setToolTipText("Here is a summary of your order.");
		outputScrollPane.setViewportView(orderOutputTextArea);
		orderOutputTextArea.setEditable(false);
	}
	protected void do_btnPlaceOrder_actionPerformed(ActionEvent e) {
		if(nameTextField.getText().isEmpty()){
			orderOutputTextArea.setForeground(Color.RED);
			orderOutputTextArea.setText("Please enter your name.");
			lblName.setForeground(Color.RED);
		} else {
			lblName.setForeground(Color.BLACK);
			orderOutputTextArea.setText("");
			orderOutputTextArea.setForeground(Color.BLACK);
			orderOutputTextArea.append("Hello, " + nameTextField.getText() + "!\n");
			if(sizeComboBox.getSelectedItem().toString().equals("Extra Large")){
				orderOutputTextArea.append("You ordered an\n" + sizeComboBox.getSelectedItem().toString() + " Pizza\n");
			} else {
				orderOutputTextArea.append("You ordered a\n" + sizeComboBox.getSelectedItem().toString() + " Pizza\n");
			}
			List<String> toppingList = this.toppingList.getSelectedValuesList();
			if(toppingList.isEmpty()){
				orderOutputTextArea.append("with no toppings.");
			} else {
				orderOutputTextArea.append("with the following toppings:\n");
				for(String topping : toppingList){
					orderOutputTextArea.append(topping + "\n");
				}
			}
		}
	}
}
