import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

public class BurekListExampleFrame extends JFrame {

	private JPanel contentPane;
	private final JTextArea outputTextArea = new JTextArea();
	private final JButton btnPrint = new JButton("Print");
	private final JList optionList = new JList();
	private final JScrollPane optionListScrollPane = new JScrollPane();
	private final JScrollPane outputScrollPane = new JScrollPane();
	private final JRadioButton rdbtnFirst = new JRadioButton("First");
	private final JRadioButton rdbtnSecond = new JRadioButton("Second");
	private final JRadioButton rdbtnThird = new JRadioButton("Third");
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekListExampleFrame frame = new BurekListExampleFrame();
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
	public BurekListExampleFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek List Selection");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		outputScrollPane.setBounds(304, 11, 120, 169);
		
		contentPane.add(outputScrollPane);
		outputScrollPane.setViewportView(outputTextArea);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewButton_actionPerformed(e);
			}
		});
		
		btnPrint.setBounds(320, 227, 89, 23);
		
		contentPane.add(btnPrint);
		optionListScrollPane.setBounds(10, 11, 138, 78);
		
		contentPane.add(optionListScrollPane);
		optionListScrollPane.setViewportView(optionList);
		optionList.setModel(new AbstractListModel() {
			String[] values = new String[] {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		buttonGroup.add(rdbtnFirst);
		rdbtnFirst.setBounds(10, 174, 109, 23);
		
		contentPane.add(rdbtnFirst);
		buttonGroup.add(rdbtnSecond);
		rdbtnSecond.setBounds(9, 200, 109, 23);
		
		contentPane.add(rdbtnSecond);
		buttonGroup.add(rdbtnThird);
		rdbtnThird.setBounds(9, 227, 109, 23);
		
		contentPane.add(rdbtnThird);
	}
	
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		List<String> theList = optionList.getSelectedValuesList();
		
		for(String item : theList){
			outputTextArea.append(item + "\n");
		}
			if(rdbtnFirst.isSelected())
				outputTextArea.append(rdbtnFirst.getText() + "\n");
			if(rdbtnSecond.isSelected())
				outputTextArea.append(rdbtnSecond.getText() + "\n");
			if(rdbtnThird.isSelected())
				outputTextArea.append(rdbtnThird.getText() + "\n");
		
	}
}
