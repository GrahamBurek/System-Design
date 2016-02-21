import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;

public class BurekMCSRframe extends JFrame {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private final JPanel studentPanel = new JPanel();
	private final JPanel familyPanel = new JPanel();
	private final JPanel financialPanel = new JPanel();
	private final JMenuBar menuBar = new JMenuBar();
	private final JMenu menuFile = new JMenu("File");
	private final JMenu menuHelp = new JMenu("Help");
	private final JMenuItem menuItemStartNewForm = new JMenuItem("Start New Form");
	private final JMenuItem menuItemExit = new JMenuItem("Exit");
	private final JMenuItem menuItemStudentInfo = new JMenuItem("Student Info");
	private final JMenuItem menuItemFinancialInfo = new JMenuItem("Financial Info");
	private final JMenuItem menuItemFamilyInfo = new JMenuItem("Family Info");
	private final JLabel lblFirstName = new JLabel("First Name");
	private final JFormattedTextField firstNameFTF = new JFormattedTextField();
	private final JLabel lblLastName = new JLabel("Last Name");
	private final JFormattedTextField lastNameFTF = new JFormattedTextField();
	private final JLabel lblMiddleInitial = new JLabel("Middle Initial");
	private final JFormattedTextField middleInitialFTF = new JFormattedTextField();
	private final JLabel lblPreferredName = new JLabel("Preferred Name");
	private final JFormattedTextField preferredNameFTF = new JFormattedTextField();
	private final JLabel lblRace = new JLabel("Race (Check all that apply):");
	private final JCheckBox chckbxBlack = new JCheckBox("Black");
	private final JCheckBox chckbxWhite = new JCheckBox("White");
	private final JCheckBox chckbxAsian = new JCheckBox("Asian");
	private final JCheckBox chckbxHispanic = new JCheckBox("Hispanic");
	private final JCheckBox chckbxNativeAmerican = new JCheckBox("Native American");
	private final JCheckBox chckbxOther = new JCheckBox("Other");
	private final JLabel lblOther = new JLabel("If other, please specify:");
	private final JFormattedTextField otherFTF = new JFormattedTextField();
	private final JSeparator studentInfoSeparator = new JSeparator();
	private final JLabel lblGender = new JLabel("Gender");
	private final JRadioButton radioMale = new JRadioButton("Male");
	private final JRadioButton radioFemale = new JRadioButton("Female");
	private final JLabel lblSSN = new JLabel("SS#");
	private final JFormattedTextField ssnFTF = new JFormattedTextField();
	private final JLabel lblDateOfBirth = new JLabel("Date of Birth:");
	private final JLabel lblGrade = new JLabel("Grade");
	private final JRadioButton radioFifteen = new JRadioButton("15");
	private final JRadioButton radioSixteen = new JRadioButton("16");
	private final JLabel lblSubdivision = new JLabel("Subdivision");
	private final JFormattedTextField subdivisionFTF = new JFormattedTextField();
	private final JRadioButton radioOwn = new JRadioButton("Own");
	private final JRadioButton radioLease = new JRadioButton("Lease");
	private final JLabel lblLeaseExpires = new JLabel("Lease Expires");
	private final JDateChooser leaseDateChooser = new JDateChooser();
	private final JLabel lblAddress = new JLabel("Street Address");
	private final JTextField streetTF = new JTextField();
	private final JLabel lblCity = new JLabel("City");
	private final JTextField cityTF = new JTextField();
	private final JLabel lblZip = new JLabel("ZIP");
	private final JFormattedTextField zipFTF = new JFormattedTextField();
	private final JLabel lblHomePhone = new JLabel("Home Phone");
	private final JFormattedTextField homePhoneFTF = new JFormattedTextField();
	private final JDateChooser dobDateChooser = new JDateChooser();
	private final JLabel lblMother = new JLabel("Mother");
	private final JLabel lblMotherFirstName = new JLabel("First Name");
	private final JFormattedTextField motherFirstNameFTF = new JFormattedTextField();
	private final JLabel lblMotherLastName = new JLabel("Last Name");
	private final JFormattedTextField motherLastNameFTF = new JFormattedTextField();
	private final JLabel lblMotherMiddleInitial = new JLabel("Middle Initial");
	private final JFormattedTextField motherMiddleInitialFTF = new JFormattedTextField();
	private final JCheckBox chckbxMotherDifferentAddress = new JCheckBox("Address different than child's");
	private final JLabel lblMotherStreetAddress = new JLabel("Street Address");
	private final JTextField motherStreetAddressTF = new JTextField();
	private final JLabel lblMotherCity = new JLabel("City");
	private final JTextField motherCityTF = new JTextField();
	private final JLabel lblMotherZip = new JLabel("ZIP");
	private final JFormattedTextField motherZipFTF = new JFormattedTextField();
	private final JSeparator verticalFamilySeparator = new JSeparator();
	private final JLabel lblFather = new JLabel("Father");
	private final JLabel lblFatherFirstName = new JLabel("First Name");
	private final JFormattedTextField fatherFirstNameFTF = new JFormattedTextField();
	private final JFormattedTextField fatherLastNameFTF = new JFormattedTextField();
	private final JLabel lblFatherLastName = new JLabel("Last Name");
	private final JLabel lblFatherMiddleInitial = new JLabel("Middle Initial");
	private final JFormattedTextField fatherMiddleInitialFTF = new JFormattedTextField();
	private final JCheckBox checkbxFatherDifferentAddress = new JCheckBox("Address different than child's");
	private final JLabel lblFatherStreetAddress = new JLabel("Street Address");
	private final JTextField fatherStreetAddressTF = new JTextField();
	private final JLabel lblFatherCity = new JLabel("City");
	private final JTextField fatherCityTF = new JTextField();
	private final JLabel lblFatherZip = new JLabel("ZIP");
	private final JFormattedTextField fatherZipFTF = new JFormattedTextField();
	private final JLabel lblMotherEmployment = new JLabel("Place of Employment");
	private final JTextField motherEmploymentTF = new JTextField();
	private final JLabel lblMotherOccupation = new JLabel("Occupation");
	private final JTextField motherOccupationTF = new JTextField();
	private final JLabel lblMotherEmailAddress = new JLabel("Email Address");
	private final JFormattedTextField motherEmailAddressFTF = new JFormattedTextField();
	private final JLabel lblMotherHomeNumber = new JLabel("Home #");
	private final JFormattedTextField motherHomeNumberFTF = new JFormattedTextField();
	private final JLabel lblMotherWorkNumber = new JLabel("Work #");
	private final JFormattedTextField motherWorkNumberFTF = new JFormattedTextField();
	private final JLabel lblMotherCellNumber = new JLabel("Cell #");
	private final JFormattedTextField motherCellNumberFTF = new JFormattedTextField();
	private final JLabel lblFatherHomeNumber = new JLabel("Home #");
	private final JFormattedTextField fatherHomeNumberFTF = new JFormattedTextField();
	private final JLabel lblFatherWorkNumber = new JLabel("Work #");
	private final JFormattedTextField fatherWorkNumberFTF = new JFormattedTextField();
	private final JLabel lblFatherCellNumber = new JLabel("Cell #");
	private final JFormattedTextField fatherCellNumberFTF = new JFormattedTextField();
	private final JLabel lblFatherEmployment = new JLabel("Place of Employment");
	private final JLabel lblFatherOccupation = new JLabel("Occupation");
	private final JTextField fatherOccupationTF = new JTextField();
	private final JTextField fatherEmploymentTF = new JTextField();
	private final JFormattedTextField fatherEmailAddressFTF = new JFormattedTextField();
	private final JLabel lblFatherEmailAddress = new JLabel("Email Address");
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BurekMCSRframe frame = new BurekMCSRframe();
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
	public BurekMCSRframe() {
		streetTF.setBounds(365, 525, 192, 26);
		streetTF.setColumns(10);
		jbInit();
	}
	private void jbInit() {
		setTitle("Burek MCSR Student Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 745, 830);
		
		setJMenuBar(menuBar);
		
		menuBar.add(menuFile);
		
		menuFile.add(menuItemStartNewForm);
		
		menuFile.add(menuItemExit);
		
		menuBar.add(menuHelp);
		
		menuHelp.add(menuItemStudentInfo);
		
		menuHelp.add(menuItemFamilyInfo);
		
		menuHelp.add(menuItemFinancialInfo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 723, 755);
		
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Student Information", null, studentPanel, null);
		studentPanel.setLayout(null);
		lblFirstName.setBounds(15, 16, 123, 20);
		
		studentPanel.add(lblFirstName);
		firstNameFTF.setBounds(15, 41, 123, 26);
		
		studentPanel.add(firstNameFTF);
		lblLastName.setBounds(15, 82, 123, 20);
		
		studentPanel.add(lblLastName);
		lastNameFTF.setBounds(15, 109, 123, 26);
		
		studentPanel.add(lastNameFTF);
		lblMiddleInitial.setBounds(15, 149, 123, 20);
		
		studentPanel.add(lblMiddleInitial);
		middleInitialFTF.setBounds(15, 175, 37, 26);
		
		studentPanel.add(middleInitialFTF);
		lblPreferredName.setBounds(15, 217, 123, 20);
		
		studentPanel.add(lblPreferredName);
		preferredNameFTF.setBounds(15, 246, 123, 26);
		
		studentPanel.add(preferredNameFTF);
		lblRace.setBounds(15, 369, 200, 20);
		
		studentPanel.add(lblRace);
		chckbxBlack.setBounds(15, 401, 139, 29);
		
		studentPanel.add(chckbxBlack);
		chckbxWhite.setBounds(15, 438, 139, 29);
		
		studentPanel.add(chckbxWhite);
		chckbxAsian.setBounds(15, 475, 139, 29);
		
		studentPanel.add(chckbxAsian);
		chckbxHispanic.setBounds(15, 512, 139, 29);
		
		studentPanel.add(chckbxHispanic);
		chckbxNativeAmerican.setBounds(15, 549, 149, 29);
		
		studentPanel.add(chckbxNativeAmerican);
		chckbxOther.setBounds(15, 586, 139, 29);
		
		studentPanel.add(chckbxOther);
		lblOther.setBounds(15, 627, 188, 20);
		
		studentPanel.add(lblOther);
		otherFTF.setBounds(15, 663, 188, 26);
		
		studentPanel.add(otherFTF);
		studentInfoSeparator.setOrientation(SwingConstants.VERTICAL);
		studentInfoSeparator.setBounds(335, 16, 2, 677);
		
		studentPanel.add(studentInfoSeparator);
		lblGender.setBounds(365, 16, 96, 20);
		
		studentPanel.add(lblGender);
		radioMale.setBounds(365, 51, 155, 29);
		
		studentPanel.add(radioMale);
		radioFemale.setBounds(365, 90, 155, 29);
		
		studentPanel.add(radioFemale);
		lblSSN.setBounds(15, 291, 123, 20);
		
		studentPanel.add(lblSSN);
		ssnFTF.setBounds(15, 322, 123, 26);
		
		studentPanel.add(ssnFTF);
		lblDateOfBirth.setBounds(365, 139, 104, 20);
		
		studentPanel.add(lblDateOfBirth);
		lblGrade.setBounds(365, 222, 96, 20);
		
		studentPanel.add(lblGrade);
		radioFifteen.setBounds(365, 250, 63, 29);
		
		studentPanel.add(radioFifteen);
		radioSixteen.setBounds(431, 250, 59, 29);
		
		studentPanel.add(radioSixteen);
		lblSubdivision.setBounds(365, 294, 96, 20);
		
		studentPanel.add(lblSubdivision);
		subdivisionFTF.setBounds(365, 330, 130, 26);
		
		studentPanel.add(subdivisionFTF);
		radioOwn.setBounds(365, 368, 84, 29);
		
		studentPanel.add(radioOwn);
		radioLease.setBounds(450, 368, 84, 29);
		
		studentPanel.add(radioLease);
		lblLeaseExpires.setBounds(365, 413, 104, 20);
		
		studentPanel.add(lblLeaseExpires);
		leaseDateChooser.setBounds(365, 453, 119, 26);
		
		studentPanel.add(leaseDateChooser);
		lblAddress.setBounds(365, 495, 118, 20);
		
		studentPanel.add(lblAddress);
		
		studentPanel.add(streetTF);
		lblCity.setBounds(365, 566, 118, 20);
		
		studentPanel.add(lblCity);
		cityTF.setColumns(10);
		cityTF.setBounds(365, 589, 149, 26);
		
		studentPanel.add(cityTF);
		lblZip.setBounds(532, 565, 118, 20);
		
		studentPanel.add(lblZip);
		zipFTF.setBounds(531, 589, 69, 26);
		
		studentPanel.add(zipFTF);
		lblHomePhone.setBounds(365, 627, 118, 20);
		
		studentPanel.add(lblHomePhone);
		homePhoneFTF.setBounds(365, 663, 118, 26);
		
		studentPanel.add(homePhoneFTF);
		dobDateChooser.setBounds(365, 175, 119, 26);
		
		studentPanel.add(dobDateChooser);
		
		tabbedPane.addTab("Family Information", null, familyPanel, null);
		familyPanel.setLayout(null);
		lblMother.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMother.setBounds(15, 16, 69, 20);
		
		familyPanel.add(lblMother);
		lblMotherFirstName.setBounds(15, 52, 98, 20);
		
		familyPanel.add(lblMotherFirstName);
		motherFirstNameFTF.setBounds(15, 88, 120, 26);
		
		familyPanel.add(motherFirstNameFTF);
		lblMotherLastName.setBounds(15, 130, 123, 20);
		
		familyPanel.add(lblMotherLastName);
		motherLastNameFTF.setBounds(15, 157, 123, 26);
		
		familyPanel.add(motherLastNameFTF);
		lblMotherMiddleInitial.setBounds(177, 52, 123, 20);
		
		familyPanel.add(lblMotherMiddleInitial);
		motherMiddleInitialFTF.setBounds(177, 88, 37, 26);
		
		familyPanel.add(motherMiddleInitialFTF);
		chckbxMotherDifferentAddress.setBounds(15, 368, 265, 29);
		
		familyPanel.add(chckbxMotherDifferentAddress);
		lblMotherStreetAddress.setBounds(15, 409, 118, 20);
		
		familyPanel.add(lblMotherStreetAddress);
		motherStreetAddressTF.setColumns(10);
		motherStreetAddressTF.setBounds(15, 439, 192, 26);
		
		familyPanel.add(motherStreetAddressTF);
		lblMotherCity.setBounds(15, 480, 118, 20);
		
		familyPanel.add(lblMotherCity);
		motherCityTF.setColumns(10);
		motherCityTF.setBounds(15, 503, 149, 26);
		
		familyPanel.add(motherCityTF);
		lblMotherZip.setBounds(182, 479, 118, 20);
		
		familyPanel.add(lblMotherZip);
		motherZipFTF.setBounds(181, 503, 69, 26);
		
		familyPanel.add(motherZipFTF);
		verticalFamilySeparator.setOrientation(SwingConstants.VERTICAL);
		verticalFamilySeparator.setBounds(366, 16, 2, 676);
		
		familyPanel.add(verticalFamilySeparator);
		lblFather.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFather.setBounds(383, 16, 69, 20);
		
		familyPanel.add(lblFather);
		lblFatherFirstName.setBounds(383, 52, 98, 20);
		
		familyPanel.add(lblFatherFirstName);
		fatherFirstNameFTF.setBounds(383, 88, 120, 26);
		
		familyPanel.add(fatherFirstNameFTF);
		fatherLastNameFTF.setBounds(383, 157, 123, 26);
		
		familyPanel.add(fatherLastNameFTF);
		lblFatherLastName.setBounds(383, 130, 123, 20);
		
		familyPanel.add(lblFatherLastName);
		lblFatherMiddleInitial.setBounds(532, 52, 123, 20);
		
		familyPanel.add(lblFatherMiddleInitial);
		fatherMiddleInitialFTF.setBounds(532, 88, 37, 26);
		
		familyPanel.add(fatherMiddleInitialFTF);
		checkbxFatherDifferentAddress.setBounds(383, 368, 265, 29);
		
		familyPanel.add(checkbxFatherDifferentAddress);
		lblFatherStreetAddress.setBounds(383, 409, 118, 20);
		
		familyPanel.add(lblFatherStreetAddress);
		fatherStreetAddressTF.setColumns(10);
		fatherStreetAddressTF.setBounds(383, 439, 192, 26);
		
		familyPanel.add(fatherStreetAddressTF);
		lblFatherCity.setBounds(383, 480, 118, 20);
		
		familyPanel.add(lblFatherCity);
		fatherCityTF.setColumns(10);
		fatherCityTF.setBounds(383, 503, 149, 26);
		
		familyPanel.add(fatherCityTF);
		lblFatherZip.setBounds(550, 479, 118, 20);
		
		familyPanel.add(lblFatherZip);
		fatherZipFTF.setBounds(549, 503, 69, 26);
		
		familyPanel.add(fatherZipFTF);
		lblMotherEmployment.setBounds(15, 545, 160, 20);
		
		familyPanel.add(lblMotherEmployment);
		motherEmploymentTF.setColumns(10);
		motherEmploymentTF.setBounds(15, 580, 149, 26);
		
		familyPanel.add(motherEmploymentTF);
		lblMotherOccupation.setBounds(191, 545, 160, 20);
		
		familyPanel.add(lblMotherOccupation);
		motherOccupationTF.setColumns(10);
		motherOccupationTF.setBounds(191, 580, 134, 26);
		
		familyPanel.add(motherOccupationTF);
		lblMotherEmailAddress.setBounds(15, 622, 120, 20);
		
		familyPanel.add(lblMotherEmailAddress);
		motherEmailAddressFTF.setBounds(15, 658, 170, 26);
		
		familyPanel.add(motherEmailAddressFTF);
		lblMotherHomeNumber.setBounds(15, 199, 69, 20);
		
		familyPanel.add(lblMotherHomeNumber);
		motherHomeNumberFTF.setBounds(15, 235, 120, 26);
		
		familyPanel.add(motherHomeNumberFTF);
		lblMotherWorkNumber.setBounds(177, 199, 69, 20);
		
		familyPanel.add(lblMotherWorkNumber);
		motherWorkNumberFTF.setBounds(177, 235, 120, 26);
		
		familyPanel.add(motherWorkNumberFTF);
		lblMotherCellNumber.setBounds(15, 277, 69, 20);
		
		familyPanel.add(lblMotherCellNumber);
		motherCellNumberFTF.setBounds(15, 313, 120, 26);
		
		familyPanel.add(motherCellNumberFTF);
		lblFatherHomeNumber.setBounds(383, 199, 69, 20);
		
		familyPanel.add(lblFatherHomeNumber);
		fatherHomeNumberFTF.setBounds(383, 235, 120, 26);
		
		familyPanel.add(fatherHomeNumberFTF);
		lblFatherWorkNumber.setBounds(545, 199, 69, 20);
		
		familyPanel.add(lblFatherWorkNumber);
		fatherWorkNumberFTF.setBounds(545, 235, 120, 26);
		
		familyPanel.add(fatherWorkNumberFTF);
		lblFatherCellNumber.setBounds(383, 277, 69, 20);
		
		familyPanel.add(lblFatherCellNumber);
		fatherCellNumberFTF.setBounds(383, 313, 120, 26);
		
		familyPanel.add(fatherCellNumberFTF);
		lblFatherEmployment.setBounds(383, 545, 160, 20);
		
		familyPanel.add(lblFatherEmployment);
		lblFatherOccupation.setBounds(559, 545, 160, 20);
		
		familyPanel.add(lblFatherOccupation);
		fatherOccupationTF.setColumns(10);
		fatherOccupationTF.setBounds(559, 580, 134, 26);
		
		familyPanel.add(fatherOccupationTF);
		fatherEmploymentTF.setColumns(10);
		fatherEmploymentTF.setBounds(383, 580, 149, 26);
		
		familyPanel.add(fatherEmploymentTF);
		fatherEmailAddressFTF.setBounds(383, 658, 170, 26);
		
		familyPanel.add(fatherEmailAddressFTF);
		lblFatherEmailAddress.setBounds(383, 622, 120, 20);
		
		familyPanel.add(lblFatherEmailAddress);
		scrollPane.setBounds(0, 0, 2, 2);
		
		familyPanel.add(scrollPane);
		
		tabbedPane.addTab("Financial Information", null, financialPanel, null);
		financialPanel.setLayout(null);
	}
}
