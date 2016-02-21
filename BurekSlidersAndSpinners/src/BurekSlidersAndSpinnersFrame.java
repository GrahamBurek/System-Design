import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JCheckBox;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;

public class BurekSlidersAndSpinnersFrame extends JFrame {

	private JPanel contentPane;
	private final JSlider slider = new JSlider();
	private final JLabel lblSlider = new JLabel("Slider");
	private final JSpinner spinner = new JSpinner();
	private final JLabel lblSpinner = new JLabel("Spinner");
	private final JCheckBox chckbxFirst = new JCheckBox("First");
	private final JCheckBox chckbxSecond = new JCheckBox("Second");
	private final JCheckBox chckbxThird = new JCheckBox("Third");
	private final JCheckBox chckbxFourth = new JCheckBox("Fourth");
	private final JLabel lblCheckbox = new JLabel("");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekSlidersAndSpinnersFrame frame = new BurekSlidersAndSpinnersFrame();
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
	public BurekSlidersAndSpinnersFrame() {
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek Sliders and Spinners");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblSlider.setBounds(10, 26, 46, 14);
		
		slider.setValue(25);
		lblSlider.setText(slider.getValue() + "");
		contentPane.add(lblSlider);
		
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_slider_stateChanged(e);
			}
		});
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setBounds(75, 23, 213, 48);
		
		contentPane.add(slider);
		spinner.setModel(new SpinnerNumberModel(20, 0, 100, 5));
		spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_spinner_stateChanged(e);
			}
		});
		spinner.setBounds(114, 140, 46, 20);
		
		contentPane.add(spinner);
		lblSpinner.setBounds(58, 143, 46, 14);
		lblSpinner.setText(spinner.getValue().toString());
		contentPane.add(lblSpinner);
		
		chckbxFirst.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				do_chckbx_stateChanged(arg0);
			}
		});
		
		chckbxFirst.setBounds(207, 140, 97, 23);
		
		contentPane.add(chckbxFirst);
		
		chckbxSecond.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbx_stateChanged(e);
			}
		});
		chckbxSecond.setBounds(207, 166, 97, 23);
		
		contentPane.add(chckbxSecond);
		
		
		chckbxThird.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbx_stateChanged(e);
			}
		});
		chckbxThird.setBounds(207, 192, 97, 23);
		
		contentPane.add(chckbxThird);
		
		chckbxFourth.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				do_chckbx_stateChanged(e);
			}
		});
		chckbxFourth.setBounds(207, 218, 97, 23);
		
		contentPane.add(chckbxFourth);
		lblCheckbox.setBounds(211, 118, 213, 14);
		
		contentPane.add(lblCheckbox);
	}
	
	protected void do_slider_stateChanged(ChangeEvent e) {
		lblSlider.setText(slider.getValue() + "");
	}
	
	protected void do_spinner_stateChanged(ChangeEvent e) {
		lblSpinner.setText(spinner.getValue().toString());
	}
	
	protected void do_chckbx_stateChanged(ChangeEvent arg0) {
		
		lblCheckbox.setText("");
		
		if(chckbxFirst.isSelected()){
			lblCheckbox.setText(chckbxFirst.getText());
		}
		
		if(chckbxSecond.isSelected()){
			lblCheckbox.setText(lblCheckbox.getText() + " " + chckbxSecond.getText());
		}
		
		if(chckbxThird.isSelected()){
			lblCheckbox.setText(lblCheckbox.getText() + " " + chckbxThird.getText());
		}
		
		if(chckbxFourth.isSelected()){
			lblCheckbox.setText(lblCheckbox.getText() + " " + chckbxFourth.getText());
		}
		
	}
}
