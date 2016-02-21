import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JCheckBox;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JProgressBar;

public class BurekMenusAndMoreFrame extends JFrame {

	private JPanel contentPane;
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu mnFile = new JMenu("File");
	private final JMenuItem mntmNew = new JMenuItem("New...");
	private final JMenuItem mntmOpen = new JMenuItem("Open...");
	private final JMenuItem mntmSave = new JMenuItem("Save");
	private final JMenuItem mntmClose = new JMenuItem("Close");
	private final JMenuItem mntmExit = new JMenuItem("Exit");
	private final JMenu mnEdit = new JMenu("Edit");
	private final JMenuItem mntmCopy = new JMenuItem("Copy");
	private final JMenuItem mntmPaste = new JMenuItem("Paste");
	private final JMenu mnMore = new JMenu("More");
	private final JLabel lblSelection = new JLabel("Selection:");
	private final JCheckBox chckbxFirst = new JCheckBox("First");
	private final JCheckBox chckbxSecond = new JCheckBox("Second");
	private final JCheckBox chckbxThird = new JCheckBox("Third");
	private final JMenuItem mntmOne = new JMenuItem("One");
	private final JMenuItem mntmSecond = new JMenuItem("Second");
	private final JMenuItem mntmThird = new JMenuItem("Third");
	private final JPasswordField passwordField = new JPasswordField();
	private final JButton btnPrint = new JButton("Print");
	private final JLabel lblPassword = new JLabel("Password");
	private final JButton btnToggle = new JButton("Show Password");
	private final JButton btnAdvance = new JButton("Advance");
	private final JProgressBar progressBar = new JProgressBar();
	private final JButton btnPrintPassword = new JButton("Print Password");
	private boolean showPassword = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekMenusAndMoreFrame frame = new BurekMenusAndMoreFrame();
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
	public BurekMenusAndMoreFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek Menus and More!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setJMenuBar(menuBar);
		
		
		menuBar.add(mnFile);
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmNew_actionPerformed(e);
			}
		});
		
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		
		mnFile.add(mntmNew);
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmOpen_actionPerformed(e);
			}
		});
		mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		
		mnFile.add(mntmOpen);
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmSave_actionPerformed(e);
			}
		});
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		
		mnFile.add(mntmSave);
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmClose_actionPerformed(e);
			}
		});
		mntmClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, InputEvent.CTRL_MASK));
		
		mnFile.add(mntmClose);
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmExit_actionPerformed(e);
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, InputEvent.ALT_MASK));
		
		mnFile.add(mntmExit);
		
		menuBar.add(mnEdit);
		mntmCopy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmCopy_actionPerformed(e);
			}
		});
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		
		mnEdit.add(mntmCopy);
		mntmPaste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_mntmPaste_actionPerformed(e);
			}
		});
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_MASK));
		
		mnEdit.add(mntmPaste);
		
		mnEdit.add(mnMore);
		
		mnMore.add(mntmOne);
		
		mnMore.add(mntmSecond);
		
		mnMore.add(mntmThird);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblSelection.setBounds(15, 97, 134, 14);
		
		contentPane.add(lblSelection);
		chckbxFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_chckbx_actionPerformed(e);
			}
		});
		chckbxFirst.setBounds(286, 12, 97, 23);
		
		contentPane.add(chckbxFirst);
		chckbxSecond.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_chckbx_actionPerformed(e);
			}
		});
		chckbxSecond.setBounds(286, 38, 97, 23);
		
		contentPane.add(chckbxSecond);
		chckbxThird.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_chckbx_actionPerformed(e);
			}
		});
		chckbxThird.setBounds(286, 64, 97, 23);
		
		contentPane.add(chckbxThird);
		passwordField.setBounds(159, 135, 97, 20);
		
		contentPane.add(passwordField);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnPrint_actionPerformed(e);
			}
		});
		btnPrint.setBounds(279, 134, 89, 23);
		
		contentPane.add(btnPrint);
		lblPassword.setBounds(86, 138, 78, 14);
		
		contentPane.add(lblPassword);
		btnToggle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnToggle_actionPerformed(e);
			}
		});
		btnToggle.setBounds(64, 171, 143, 29);
		
		contentPane.add(btnToggle);
		btnAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnAdvance_actionPerformed(e);
			}
		});
		btnAdvance.setBounds(18, 44, 89, 23);
		
		contentPane.add(btnAdvance);
		progressBar.setBounds(18, 16, 146, 14);
		
		contentPane.add(progressBar);
		btnPrintPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnPrintPassword_actionPerformed(arg0);
			}
		});
		btnPrintPassword.setBounds(222, 171, 146, 29);
		
		contentPane.add(btnPrintPassword);
	}
	
	
	protected void do_chckbx_actionPerformed(ActionEvent e) {
		lblSelection.setText("");
		
		String selectLabelText = "";
		
		if(chckbxFirst.isSelected()){
			selectLabelText += chckbxFirst.getText() + " ";
		}
		
		if(chckbxSecond.isSelected()){
			selectLabelText += chckbxSecond.getText() + " ";
		}
		
		if(chckbxThird.isSelected()){
			selectLabelText += chckbxThird.getText() + " ";;
		}
		
		lblSelection.setText(selectLabelText);
	
	}
	
	protected void do_mntmNew_actionPerformed(ActionEvent e) {
		lblSelection.setText(mntmNew.getText());
	}
	
	protected void do_mntmOpen_actionPerformed(ActionEvent e) {
		lblSelection.setText(mntmOpen.getText());
	}
	
	protected void do_mntmSave_actionPerformed(ActionEvent e) {
		lblSelection.setText(mntmSave.getText());
	}
	
	protected void do_mntmClose_actionPerformed(ActionEvent e) {
		lblSelection.setText(mntmClose.getText());
	}
	
	protected void do_mntmExit_actionPerformed(ActionEvent e) {
		lblSelection.setText(mntmExit.getText());
	}
	
	protected void do_mntmCopy_actionPerformed(ActionEvent e) {
		lblSelection.setText(mntmCopy.getText());
	}
	
	protected void do_mntmPaste_actionPerformed(ActionEvent e) {
		lblSelection.setText(mntmPaste.getText());
	}
	protected void do_btnPrint_actionPerformed(ActionEvent e) {
		if(showPassword){
			char[] charArray = passwordField.getPassword();
			String password = "";
			for(char c : charArray){
				password += c;
			}
			lblSelection.setText(password);
		} else {
			lblSelection.setText(passwordField.getPassword().toString());
		}
	}
	protected void do_btnAdvance_actionPerformed(ActionEvent e) {
		progressBar.setValue(progressBar.getValue() + 5);
	}
	protected void do_btnToggle_actionPerformed(ActionEvent e) {
		if(passwordField.getEchoChar() == (char)0){
			passwordField.setEchoChar('●');
		} else {
			passwordField.setEchoChar((char)0);
		}
	}
	protected void do_btnPrintPassword_actionPerformed(ActionEvent arg0) {
		if(!showPassword){
			showPassword = true;
			do_btnPrint_actionPerformed(arg0);
		} else {
			showPassword = false;
			do_btnPrint_actionPerformed(arg0);
		}
	}
}
