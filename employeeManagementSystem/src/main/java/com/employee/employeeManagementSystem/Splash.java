package com.employee.employeeManagementSystem;

import java.awt.Image;

import javax.imageio.ImageWriter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash extends JFrame {

	public Splash(){
   
		//visible any item or icon we need to write code above
		//*******************************************************
		// to show img on freme we need to pass img location
		// to load the img location
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/front.gif"));
		
		// to set img according to freme 
		//img is stored i scale
		Image i2 = i1.getImage().getScaledInstance(1170, 650, Image.SCALE_DEFAULT);
		//i2 imge is scale type img  
		//we cont dirict show in freme imge 
		// to show that we again need to crate an object of imageicon and pass i2
		ImageIcon i3=new ImageIcon(i2);
		// to img into freme first it took into lable 
		JLabel image =new JLabel(i3);
		// set img postions   (x,y,width,hight)
		image.setBounds(0,0,1170,650);
		// add img into freme 
		add(image);
		
		
		
		
		//*****************************
		//set freme width,hight
		setSize(1170,650);
		//all elecment we need to set on freme so it shoud be null,to design according to ou needs
		setLayout(null);
		// by defauit freme visibility hide, to see freme we need to visible
		setVisible(true);
		// to set location where we need to show the freme x and y axis 
		setLocation(100, 50);
		
		
		// to time frame to close and open login frame to set timing
		// we need to use thread
		
		try {
			Thread.sleep(5000);
			//after the five second the freme shoiud be invisible
			setVisible(false);
			
			//to load another class login page loding after welcome page is closed 
			new Login();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
		
		new Splash();
		
		
	}
}
