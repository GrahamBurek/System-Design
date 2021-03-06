import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BurekSecondFrame extends JFrame {

	private static final JFrame INSTANCE = new BurekSecondFrame();
	
	private JPanel contentPane;
	private final JButton btnGoAway = new JButton("Go Away");
	private final JButton btnNewThirdFrame = new JButton("Create Third Frame");

	/**
	 * Create the frame.
	 */
	private BurekSecondFrame() {
		jbInit();
	}
	
	public static JFrame getInstance(){
		return BurekSecondFrame.INSTANCE;
	}
	private void jbInit() {
		setTitle("Burek's Second Frame");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		btnGoAway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnGoAway_actionPerformed(e);
			}
		});
		btnGoAway.setBounds(159, 84, 89, 23);
		
		contentPane.add(btnGoAway);
		btnNewThirdFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnNewThirdFrame_actionPerformed(e);
			}
		});
		btnNewThirdFrame.setBounds(145, 161, 116, 23);
		
		contentPane.add(btnNewThirdFrame);
	}

	protected void do_btnGoAway_actionPerformed(ActionEvent e) {
		this.dispose();
	}
	protected void do_btnNewThirdFrame_actionPerformed(ActionEvent e) {
		JFrame thirdFrame = BurekThirdFrame.getInstance();
		thirdFrame.setVisible(true);
	}
}
