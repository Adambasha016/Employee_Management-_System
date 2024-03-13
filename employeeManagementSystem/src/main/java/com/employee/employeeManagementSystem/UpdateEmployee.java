package com.employee.employeeManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.employee.employeeManagementSystem.DB.MyConnection;
import com.toedter.calendar.JDateChooser;

public class UpdateEmployee extends JFrame implements ActionListener{

	JTextField teducation,tfname,taddress,tphone,taadhar,temail,tsalary,tdesignation;
    JLabel tempid;
    
    String number;
    
 // to declear buttoon save and back
 	JButton add,back;
 	
 	
	
	public UpdateEmployee( String number) {
	this.number=number;
		
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
      
		//we cont updatetthe name
		 
		JLabel tname=	new JLabel();
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
         
        
        
        JLabel tdob=new JLabel();
        tdob.setBounds(200,200,150,30);
        tdob.setFont(new Font("Tahoma",Font.BOLD,20));
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
          
          JLabel taddress =new JLabel();
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
          
          teducation=new JTextField();
          teducation.setBounds(600,300,150,30);
          teducation
          .setBackground(new Color(177,252,197));
         add(teducation);
   
          
          
        //aadhar column
         
        JLabel aadhar=new JLabel("Aadhar Number");
        aadhar.setBounds(400,350,150,30);
        aadhar.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add( aadhar);
        
         JLabel taadhar=new JLabel();
        taadhar.setBounds(600,350,150,30);
        taadhar.setBackground(new Color(177,252,197));
        add(taadhar);
        
        //employee id generate
        JLabel empid=new JLabel("Employee ID");
        empid.setBounds(50,400,150,30);
        empid.setFont(new Font("SAN_SERIF",Font.BOLD,20));
        add(empid);
        
        // develop random numbber 
        
        tempid =new JLabel();
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
        
        
        
        //
        
           try {
//        	   Statement statement = MyConnection.getconnection();
//        	   String query="select * from employee where empId='"+number+"'";
//			ResultSet resultSet = statement.executeQuery(query);
//			
//			while(resultSet.next()){
//				tname.setText(resultSet.getString("name"));
//				tfname.setText(resultSet.getString("fname"));
//				tdob.setText(resultSet.getString("dob"));
//				taddress.setText(resultSet.getString("address"));
//				tsalary.setText(resultSet.getString("salary"));
//				tphone.setText(resultSet.getString("phone"));
//				temail.setText(resultSet.getString("email"));
//				teducation.setText(resultSet.getString("education"));
//				taadhar.setText(resultSet.getString("aadhar"));
//				tempid.setText(resultSet.getString("empID"));
//				tdesignation.setText(resultSet.getString("designation"));
//				
			//}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
         // add buttoon
        
        
        add=new JButton("UPDATE");
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
		new UpdateEmployee("");
	}












	@Override
	public void actionPerformed(ActionEvent e) {

          // to store update data int DB		
		if(e.getSource()==add) {
//			String fname = tfname.getText();
//			String salary = tsalary.getText();
//			String addres = taddress.getText();
//			String phone = tphone.getText();
//			String email = temail.getText();
//			String education = teducation.getText();
//			String designation = tdesignation.getText();
//			
//			
//			String query="update employee set fname='"+fname+"',salay ='"+salary+"',address='"+addres+"',phone='"+phone+"',email ='"+email+"',education ='"+education+"', designation ='"+designation+"' where empId='"+number+"' ";
			
			
			try {
//				Statement statement = MyConnection.getconnection();
//				int update = statement.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Deatils Updated Successfully");
				setVisible(false);
				new Main_Class();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			
		}else {
			setVisible(false);
			new Main_Class();
		}
		
		
	}
	
}
