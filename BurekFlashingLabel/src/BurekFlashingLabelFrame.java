import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BurekFlashingLabelFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblCmptRocks = new JLabel("CMPT-330 Rocks!");
	private final JButton btnFancy = new JButton("Fancy");
	private final JButton btnFancier = new JButton("Fancier");
	private final JLabel lblSoDoesDmb = new JLabel("So Does DMB");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekFlashingLabelFrame frame = new BurekFlashingLabelFrame();
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
	public BurekFlashingLabelFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek Flashing Label Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblCmptRocks.setBounds(154, 68, 166, 14);
		
		contentPane.add(lblCmptRocks);
		btnFancy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				do_btnFancy_actionPerformed(e);
			}
		});
		btnFancy.setBounds(10, 227, 89, 23);
		
		contentPane.add(btnFancy);
		btnFancier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				do_btnFancier_actionPerformed(arg0);
			}
		});
		btnFancier.setBounds(335, 227, 89, 23);
		
		contentPane.add(btnFancier);
		lblSoDoesDmb.setBounds(154, 116, 146, 14);
		lblSoDoesDmb.setVisible(false);
		contentPane.add(lblSoDoesDmb);
		
	}
	protected void do_btnFancy_actionPerformed(ActionEvent e) {
		// For boolean instance variables, check for is method rather than get
	
		lblCmptRocks.setVisible(!(lblCmptRocks.isVisible()));
		
	}
	protected void do_btnFancier_actionPerformed(ActionEvent arg0) {
		lblSoDoesDmb.setVisible(!(lblSoDoesDmb.isVisible()));
		lblCmptRocks.setVisible(!(lblCmptRocks.isVisible()));
	}
}

