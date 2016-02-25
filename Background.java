import javax.swing.*;
import java.awt.*;

public class Background extends JFrame {
	public static void main(String[]args) {
		Background window= new Background();
	}
	//declares private variables
	private Container contentPane;
	private JLabel label1;
	
	public Background() {
		setTitle("Background");
		setSize(1000, 500); //sets the size of the window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes window close when the x is clicked
		
		contentPane= getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.GRAY); //sets background to gray
		
		label1= new JLabel("Marquette L.I.M.O."); //creates label
		label1.setForeground(Color.YELLOW); //sets color of label to yellow

		label1.setFont(new Font("Verdana", Font.BOLD, 30)); //sets font of label
		contentPane.add(label1);
	
		setVisible(true);
	}
	
}
