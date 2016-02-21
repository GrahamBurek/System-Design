import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BurekThirdFrame extends JFrame {

	private static final JFrame INSTANCE = new BurekThirdFrame();
	
	private JPanel contentPane;
	private final JButton btnGoAway = new JButton("Go Away");

	/**
	 * Create the frame.
	 */
	private BurekThirdFrame() {
		jbInit();
	}
	
	public static JFrame getInstance(){
		return BurekThirdFrame.INSTANCE;
	}
	
	private void jbInit() {
		setTitle("Burek's Third Frame");
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
		btnGoAway.setBounds(154, 73, 89, 23);
		
		contentPane.add(btnGoAway);
	}

	protected void do_btnGoAway_actionPerformed(ActionEvent e) {
		this.dispose();
	}
}
