package com.employee.employeeManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.employee.employeeManagementSystem.DB.MyConnection;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooserBeanInfo;

public class AddEmployee extends JFrame implements ActionListener 
{



	// text field declead 

	JTextField tname,tfname,taddress,tphone,taadhar,temail,tsalary,tdesignation;
    JLabel tempid;
	// set date  
	JDateChooser tdob;
     // to set dropdown 
	JComboBox boxeducation;
	
	//to generate random number forr employee id
	Random ran=new Random();
	int number=ran.nextInt(999999);
	
	// to declear buttoon save and back
	JButton add,back;

	public AddEmployee() 
	
	{


		// set our custome color to frame
		getContentPane().setBackground(new Color(163,255,188));

		JLabel heaing =new JLabel("Add Employee Detail");
		heaing.setBounds(320,30,500,50);
		heaing.setFont( new Font("serif",Font.BOLD,25));
		add(heaing);


		//  data colum to add into database
        // to create form page 
		JLabel name=new  JLabel("Name");
		name.setBounds(50, 150, 150, 30);
		name.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		add(name);

		tname=	new JTextField();
		tname.setBounds(200,150,150,30);
		tname.setBackground(new Color(177,252,197));
		add(tname);
    
		
		
		//  Mother name
        JLabel fname=new JLabel("Mothers Name");
        fname.setBounds(400,150,150,30);
        fname.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(fname);
        
        tfname=new JTextField();
        tfname.setBounds(600,150,150, 30);
        tfname.setBackground(new Color(177,252,197));
        add(tfname);

     
             //databirth 
        JLabel dob=new JLabel("Date of Birth");
        dob.setBounds(50,200,150,30);
        dob.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(dob);
         
        
        
        //to add calender for DoB
        
        tdob=new JDateChooser();
        tdob.setBounds(200, 200, 150, 30);
        tdob.setBackground(new Color(177,252,197));
        add(tdob);

        // salary lable
        
        JLabel salary=new JLabel("Salary");
        salary.setBounds(400,200, 150, 30);
        salary.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(salary);
        
        tsalary=new JTextField();
        tsalary.setBounds(600,200,150, 30);
        tsalary.setBackground(new Color(177,252,197));
        add(tsalary);
       
        /////Address
          JLabel address=new JLabel("Address");
          address.setBounds(50,250,150,30);
          address.setFont(new Font("SAN_SERIF",Font.BOLD,20));
          add(address);
          
          taddress =new JTextField();
          taddress.setBounds(200,250,150,30);
          taddress.setBackground(new Color(177,252,197));
          add(taddress);
          
          //phoneNumber
          
          JLabel phone =new JLabel("Phone");
        		  phone.setBounds(400, 250, 150, 20);
          phone.setFont(new Font("SAN_SERIF",Font.BOLD,20));
          add(phone);
          
          tphone=new JTextField();
          tphone.setBounds(600, 250, 150, 30);
          tphone.setBackground(new Color(177,252,197));
          add(tphone);
          
          //email
          JLabel email=new JLabel("Email");
          email.setBounds(50,300,150,30);
          email.setFont(new Font("SAN_SERIF",Font.BOLD,20));
          add(email);
          
          temail=new JTextField();
          temail.setBounds(200,300,150,30);
          temail.setBackground(new Color(177,252,197));
          add(temail);
          
          //to show higer education
          
          JLabel eduation=new JLabel("Higest Education");
          eduation.setBounds(400,300,150,30);
          eduation.setFont(new Font("SAN_SERIF",Font.BOLD,20));
          add(eduation);
          

          String item[]= {"BBA","B.TECH","BCA","BA","B.COM","MBA","PHD","M.TECH","Diploma","MSC","MA"};
        boxeducation=new JComboBox(item);
        boxeducation.setBackground(new Color(177,252,197));
        boxeducation.setBounds(600,300,150,30);
        add(boxeducation);
          
        //aadhar column
         
        JLabel aadhar=new JLabel("Aadhar Number");
        aadhar.setBounds(400,350,150,30);
        aadhar.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add( aadhar);
        
        taadhar=new JTextField();
        taadhar.setBounds(600,350,150,30);
        taadhar.setBackground(new Color(177,252,197));
        add(taadhar);
        
        //employee id generate
        JLabel empid=new JLabel("Employee ID");
        empid.setBounds(50,400,150,30);
        empid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(empid);
        
        // develop random numbber 
        
        tempid =new JLabel(""+number);
        tempid.setBounds(200,400,150,30);
        tempid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        tempid.setForeground(Color.RED);
//        tempid.setBackground(new Color(177,252,197));
        add(tempid);
        
        //degnation
        
        JLabel designation=new JLabel("Designation");
        designation.setBounds(50,350,150,30);
        designation.setFont(new Font("SAN_SERI",Font.BOLD,20));
        add(designation);
         
        tdesignation=new JTextField();
        tdesignation.setBounds(200,350,150,30);
        tdesignation.setBackground(new Color(177,252,197));
        add(tdesignation);
        
         // add buttoon
        
        
        add=new JButton("ADD");
        add.setBounds(280,500,150,30);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);
        
       //  back button
        back=new JButton("BACK");
        back.setBounds(470,500,150,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        
		setLayout(null);
		setLocation(300,50);
		setSize(840,600);
		setVisible(true);



	}
	
	
	


	public static void main(String[] args) {
		new AddEmployee();
	}





	@Override
	public void actionPerformed(ActionEvent arg0) {
	   // when i select any button it shoud be perform some action
		
		// i need to check it is add back button
		
		//if i pressed the add button then it perform add opeartion to database
		if(arg0.getSource()==add) {
			
			String name = tname.getText();
			String mname = tfname.getText();
	        String dob=((JTextField)tdob.getDateEditor().getUiComponent()).getText();
	        String salary = tsalary.getText();
		     String address = taddress.getText();
		     String phone = tphone.getText();
		     String email = temail.getText();
             String education=     (String)boxeducation.getSelectedItem();
		     String designation = tdesignation.getText();
		     String empid = tempid.getText();
		     String aadhar = taadhar.getText();
		     
		    // i need to store this data into database  
		     try {
		    	 // besouse i dont have db so i commet the code of saving
		    	 
		    	 
//		     String query="insert into employee values('"+name+"','"+mname+"','"+dob+"','"+salary+"','"+address+"','"+phone+"','"+email+"','"+education+"','"+aadhar+"','"+designation+"','"+empid+"',)";
//		     Statement statement = MyConnection.getconnection();
//		     
//				statement.executeUpdate(query);
				// to tell to user the data is save db
				JOptionPane.showMessageDialog(null, "Deatils added successfully");
				setVisible(false);
				new Main_Class();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		}else {
			setVisible(false);
			new Main_Class();
		}
        		
		
		// TODO Auto-generated method stub
		
	}





}
