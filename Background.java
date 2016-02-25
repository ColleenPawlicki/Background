/*
 * Creates background JFrame platform for Marquette L.I.M.O. app. Includes title and jpg image. 
 * Date created: 2-25-16
 * 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
 
public class Background extends JFrame {
    public static void main(String[] args)  throws IOException {
    	Background window= new Background();
    }
    private Container contentPane;
	private JLabel label1;
	private JLabel label2;
    
	public Background() throws IOException{
    	
    	setTitle("Background");
    	setSize(1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contentPane= getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.setBackground(Color.GRAY); //sets background to gray
		
		label1= new JLabel("Marquette L.I.M.O."); //creates label
		label1.setForeground(Color.YELLOW); //sets color of label to yellow

		label1.setFont(new Font("Verdana", Font.BOLD, 30)); //sets font of label
		contentPane.add(label1);
        
        String path = "http://www.marquette.edu/omc/images/US-4C-P.jpg";
        URL url = new URL(path);
        BufferedImage image = ImageIO.read(url);
        label2 = new JLabel(new ImageIcon(image));
       
		contentPane.add(label2);
	
		setVisible(true);
        
        
       
    }
}
	
		
	
	

