package com.employee.employeeManagementSystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.employee.employeeManagementSystem.DB.MyConnection;



public class Login extends JFrame  implements ActionListener{
    
	
	
	//to set text field so that admin can enter data to username and password
	JTextField tusername;
	JPasswordField tpassword;
	
	
	// to set button on the frame we use jbutton
	
	JButton login,back;
	
	
	public Login() {
		
		// to set username on frame 
		
		// to dislay any text on frame we use jlable
	 JLabel 	username=new JLabel("Username");
	  //to set position	
	 username.setBounds(40,20,100,30);
		add(username);
		
		// set text field so that admin can enter data ,to username 
		tusername=new JTextField();
		tusername.setBounds(150,20,150,30);
      add(tusername);		
		
		
		// to set password colom in frame 
		 JLabel 	passsword=new JLabel("Password");
		  //to set position	it show below username
		 passsword.setBounds(40,70,100,30);
			add(passsword);		
			
			// to set text field to password
			tpassword =new JPasswordField();
			tpassword.setBounds(150,70,150,30);
			add(tpassword);
			
			// set login button on frame 
			login=new JButton("LOGIN");
			login.setBounds(150,140,150,30);
			
			//to set backbgoud color
			login.setBackground(Color.black);
			// to set text color
			login.setForeground(Color.WHITE);
			login.addActionListener(this);
			add(login);
			
			
			// set back buttoon
			
			back=new JButton("BACK");
			back.setBounds(150,180,150,30);
			
			//to set backbgoud color
			back.setBackground(Color.black);
			// to set text color
			back.setForeground(Color.WHITE);
			
			// to perform button action if we press any button it goes to actionprefored() 
			back.addActionListener(this);
			add(back);
			
			
			
			// to set icon on loginpage 
			
			ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
			// to scale the img
		Image i22=	i11.getImage().getScaledInstance(650, 380, Image.SCALE_DEFAULT);
			ImageIcon i33=new ImageIcon(i22);			
			 JLabel imgg=new JLabel(i33);
			 imgg.setBounds(360,12,650,380);
			 add(imgg);

			
			
			// to add background 
			ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
			// to scale the img
		Image i2=	i1.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
			ImageIcon i3=new ImageIcon(i2);			
			 JLabel img=new JLabel(i3);
			 img.setBounds(0,0,600,300);
			 add(img);
		
			 //t
			 
			 
		
		
		
		
		// to det frame sige
		setSize(600, 300);
		// to set location of frame where we need to display
		setLocation(450, 200);

		//to set according us elemet so it shoud be null  by default frame ,layout is border layout 
		setLayout(null);
         // to set vibsibility of freme by default it is hiddent to show we make true
		setVisible(true);
 
		






	}
	// way one to use buttoon
	@Override
	public void actionPerformed(ActionEvent action) {
       // to konw which button was pressed ,login or back button pressed
		if(action.getSource()==login) {
			try {
			// when it maches with login it perform login opration
			String username=tusername.getText();
			String password=tpassword.getText();
			//Statement statement = MyConnection.getconnection();
		//	String Query="select * from login where username='"+username+"'and pasword='"+password+"'";
			 // we pass user given   login and password  ,cheking with data base the login and passweord is present if the data present
			//then open new frame else add by youeself is database becouse we not implement the signin method or save method for admin to store username and password 
				//ResultSet resultSet = statement.executeQuery(Query);
				// if we get data we open new frame
				//if(resultSet.next()) {
			if(true) {
					// ones the data is match then close login frame open new frame 
					setVisible(false);
						
						//login password matched then open new window
						// where we can see the enatire data 
						new Main_Class();
						
				}
			else {
					
					// if data is not matched then sign 
					// resultset is empty
					JOptionPane.showMessageDialog(null, "INvalid username or password");
					
					
					
				}
				
				// sqlexception i dont have data base so i removied
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}else if(action.getSource()==back) {
			
			// if we press back buttoon it perform back button action
			System.exit(0);
		}
		
		
		
		
	}


	public static void main(String[] args) {
        new Login();
	}
}
