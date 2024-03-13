package com.employee.employeeManagementSystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;  
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.omg.PortableServer.ServantRetentionPolicyValue;

import com.employee.employeeManagementSystem.DB.MyConnection;

public class RemoveEmployee extends
JFrame implements ActionListener{
	
	
	  Choice choiceEMPID;
	JButton delete,back;  
	public RemoveEmployee() {

		
		JLabel lable=new JLabel("Employee ID");
		lable.setBounds(50,50,100,30);
		lable.setFont(new Font("Tahoma",Font.BOLD,15));
		add(lable);
		
		choiceEMPID=new Choice();
		choiceEMPID.setBounds(200,50,150,30);
		add(choiceEMPID);
		
		
		
		try {
//			Statement statement = MyConnection.getconnection();
//			ResultSet resultSet = statement.executeQuery("select * from employee");
			
	//		while(resultSet.next()) {
//				choiceEMPID.add(resultSet.getString("empID"));
		//	}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JLabel lablename=new JLabel("Name");
		lablename.setBounds(50,100,100,30);
		lablename.setFont(new Font("Tahoma",Font.BOLD,15));
		add(lablename);
		
		
		JLabel textname=new JLabel();
		textname.setBounds(200,100,100,30);
		add(textname);
		
		
		JLabel lablephone=new JLabel("Phone");
		lablephone.setBounds(50,150,100,30);
		lablephone.setFont(new Font("Tahoma",Font.BOLD,15));
		add(lablephone);
		
		
		JLabel textphone=new JLabel();
		textphone.setBounds(200,150,100,30);
		add(textphone);
		
		
		
		JLabel lableemail=new JLabel("Email");
		lableemail.setBounds(50,200,100,30);
		lableemail.setFont(new Font("Tahoma",Font.BOLD,15));
		add(lableemail);
		
		
		JLabel textemail=new JLabel();
		textemail.setBounds(200,200,100,30);
		add(textemail);
		
		
		// i not connected to DB
		
		
		try {
//			Statement statement = MyConnection.getconnection();
//			ResultSet resultSet = statement.executeQuery("select * from employee where empId='"+choiceEMPID.getSelectedItem()+"'");
//			while(resultSet.next()) {
//				textname.setText(resultSet.getString("name"));
//				textphone.setText(resultSet.getString("phone"));
//				textemail.setText(resultSet.getString("email"));
		//	}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// when i changed droupdown value it also changes the data when i changed the id t also chage the data 
		choiceEMPID.addItemListener(new ItemListener() {
			
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				try {
					
//					Statement statement = MyConnection.getconnection();
//					ResultSet resultSet;
//					resultSet = statement.executeQuery("select * from employee where empId='"+choiceEMPID.getSelectedItem()+"'");
//					while(resultSet.next()) {
//						textname.setText(resultSet.getString("name"));
//						textphone.setText(resultSet.getString("phone"));
//						textemail.setText(resultSet.getString("email"));
//					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		
		// delete buttoon
		
		delete=new JButton("DELETE");
		delete.setBounds(80,300,100,30);
		delete.setBackground(Color.BLACK);
		delete.setForeground(Color.WHITE);
		add(delete);
		delete.addActionListener(this);
		
		// back buttoon
		back=new JButton("BACK");
		back.setBounds(220,300,100,30);
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		add(back);
		back.addActionListener(this);
		//log
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
		Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel imp=new JLabel(i3);
		imp.setBounds(700,80,200,200);
		add(imp);
		
		//back ground img
		
		
		ImageIcon i11=new ImageIcon(ClassLoader.getSystemResource("icons/rback.png"));
		Image i22 = i11.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
		ImageIcon i33=new ImageIcon(i22);
		JLabel impp=new JLabel(i33);
		impp.setBounds(0,0,1120,630);
		add(impp);
		
		
		
		
		
		
		
	  setSize(1000,400);
	  setLocation(300,150);
	  setLayout(null);
	  setVisible(true);
	
	}
public static void main(String[] args) {
	new RemoveEmployee();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==delete) {
		try {
//			Statement statement = MyConnection.getconnection();
//			String query="delete from employee where empID= '"+choiceEMPID.getSelectedItem()+"'";
//			statement.executeUpdate(query);
//			JOptionPane.showMessageDialog(null, "employee deleted successfully");
			setVisible(false);
			new Main_Class();
		}catch(Exception s) {
			s.printStackTrace();
		
}
		}else{
			setVisible(false);
			//new Splash();
	
}
	
	
}
}
