import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	int fps = 60;
	int windowWidth = 500;
	int windowHeight = 500;
	
	private boolean isRunning = true;
	private Board board;
	private BufferedImage backBuffer;
	private Insets insets;

	
	int x = 0;
	
	// private InputHandler input;
	
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		MainFrame mainFrame = new MainFrame();
		mainFrame.run();
		System.exit(1);
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Graphics Test");
		board = new Board();
		board.setBorder(new EmptyBorder(5, 5, 5, 5));
		board.setLayout(new BorderLayout(0, 0));
		setContentPane(board);
		setVisible(true);
	}
	
	public void run(){
		init();
		while(isRunning){
			long time = System.currentTimeMillis();
			
			//update();
			//draw();
			
			time = (1000 / fps) - (System.currentTimeMillis() - time);
		
			if (time > 0) 
            { 
				try 
                { 
                   Thread.sleep(time); 
                } 
                catch(Exception e){} 
            }
		}

		setVisible(false); 
	}
	
	public void init(){
		backBuffer = new BufferedImage(windowWidth, windowHeight, BufferedImage.TYPE_INT_RGB); 
        //input = new InputHandler(this); 
		
		insets = getInsets(); 
        setSize(insets.left + windowWidth + insets.right, insets.top + windowHeight + insets.bottom);
	}
	
//	public void draw(){
//		Graphics g = getGraphics();	
//		Graphics bbg = backBuffer.getGraphics();
//		
//		bbg.setColor(Color.WHITE);
//		bbg.fillRect(0, 0, windowWidth, windowHeight);
//		
//		bbg.setColor(Color.BLACK); 
//        bbg.drawOval(x, 10, 20, 20);
//        
//        g.drawImage(backBuffer, 5, 5, this);
//	}

}
