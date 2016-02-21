import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BurekMultiFramesFrame extends JFrame {

	private JPanel contentPane;
	private final JButton btnNewSecondFrame = new JButton("New Second Frame");
	private final JButton btnNewThirdFrame = new JButton("New Third Frame");
	private final JButton btnGoAway = new JButton("Go Away");
	private JFrame secondFrame = null;
	private JFrame thirdFrame = null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekMultiFramesFrame frame = new BurekMultiFramesFrame();
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
	public BurekMultiFramesFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek Multi Frame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnNewSecondFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewSecondFrame_actionPerformed(e);
			}
		});
		btnNewSecondFrame.setBounds(10, 38, 174, 23);
		
		contentPane.add(btnNewSecondFrame);
		btnNewThirdFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewThirdFrame_actionPerformed(e);
			}
		});
		btnNewThirdFrame.setBounds(241, 38, 183, 23);
		
		contentPane.add(btnNewThirdFrame);
		btnGoAway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnGoAway_actionPerformed(e);
			}
		});
		btnGoAway.setBounds(170, 227, 89, 23);
		
		contentPane.add(btnGoAway);
	}
	
	protected void do_btnNewSecondFrame_actionPerformed(ActionEvent e) {
		JFrame secondFrame = BurekSecondFrame.getInstance();
		secondFrame.setVisible(true);
	}
	
	protected void do_btnNewThirdFrame_actionPerformed(ActionEvent e) {
		JFrame thirdFrame = BurekThirdFrame.getInstance();
		thirdFrame.setVisible(true);
	}
	
	protected void do_btnGoAway_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}
