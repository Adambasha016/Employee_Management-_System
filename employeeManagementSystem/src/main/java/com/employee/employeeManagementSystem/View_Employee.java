package com.employee.employeeManagementSystem;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.apache.commons.dbutils.DbUtils;

import com.employee.employeeManagementSystem.DB.MyConnection;

public class View_Employee extends JFrame implements ActionListener {
   
	//to show all data in table
	JTable table;
	
	// to  set buttoon
	JButton searchbtn,print,update,back;
	
	// show in dropdown chice option 
	  Choice choicemp;
	public View_Employee() {
		
		
		getContentPane().setBackground(new Color(255,131,122));
		
		JLabel search =new JLabel("Search by Employee Id ");
		search.setBounds(20, 20, 150, 20);
		add(search);
		
		
		choicemp=new Choice();
		choicemp.setBounds(180,20,150,20);
		add(choicemp);
		
		// based on emp id we get data from DB
		
		try {
		// 	Statement statement = MyConnection.getconnection();
			//ResultSet executeQuery = statement.executeQuery("select * from employee ");
//			while(executeQuery.next()) {
//				choicemp.add(executeQuery.getString("empID"));;
//			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 table=new JTable();
		// show all data in table we take data from data base and show the data  
		  try {
//			  Statement statement = MyConnection.getconnection();
//			ResultSet query = statement.executeQuery("select * from emp");
//			table.setModel(DbUtils.resultSetToTableModel(query));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  // show data in page we use
		  
		  JScrollPane jp=new JScrollPane(table);
		  jp.setBounds(0,100,900,600);
		  add(jp);
		 
		
		
		// to implemet buttoon
		  
		  
		  searchbtn=new JButton("Search");
		  searchbtn.setBounds(20,70,80,20);
		  add(searchbtn);
		  searchbtn.addActionListener(this);
		  // print buttoon
		  
		  print=new JButton("Print");
		  print.setBounds(120,70,80,20);
		  add(print);
		  print.addActionListener(this);
		 
		  //update buttom
		  update=new JButton("Update");
		  update.setBounds(220,70,80,20);
		  add(update);
		  update.addActionListener(this);
		  
		  //back button
		  back=new JButton("Back");
		  back.setBounds(320,70,80,20);
		  add(back);
		  back.addActionListener(this);
		  
		
		
		
		
		
		setSize(900,700);
		setLayout(null);
          setLocation(300,200);
          setVisible(true);
		
		
		
		
		
	}
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
    
		
		if(e.getSource()==searchbtn) {
			
			String query="select * from employee where empId='"+choicemp.getSelectedItem()+"'";
			
			try {
//				Statement statement = MyConnection.getconnection();
//				ResultSet resultSet = statement.executeQuery(query);
				
				
			//	table.setModel(DbUtils.resultSetToTableModel(resultSet));
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}else if(e.getSource()==print) {
			
		//	table.print();
			
			
		}
		else if(e.getSource()==update) {
			setVisible(false);
			new UpdateEmployee(choicemp.getSelectedItem());
			
		}else {
			setVisible(false);
			new Main_Class();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	new View_Employee();
}
}
