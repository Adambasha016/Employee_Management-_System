package com.employee.employeeManagementSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Main_Class  extends JFrame{
	
	JButton AddEmploye;
	

	public Main_Class() {
		
		
		// loding img in frame home img 
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1120,650, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel img = new JLabel(i3);
		img.setBounds(0,0,1120,630);
		add(img);
		
		//to create hedding
		JLabel heading =new JLabel("Employee Management System");
		heading.setBounds(340, 155, 400, 40);
		heading.setFont(new Font("Raleway",Font.BOLD,25));
		
		// to text on to the img 
		img.add(heading);
		
		
		// way two to use buttoon
		
		// to create add employee buttoon
		JButton add=new JButton("AddEmploye");
		add.setBounds(335,270,150,40);
		add.setForeground(Color.WHITE);
		add.setBackground(Color.black);
		img.add(add);
		
		// write what condtion u need to write when u press the button
		//way two to add button conditon 
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
              // when user pressed add employee buttoon then it open new window of application form
					setVisible(false);
					new AddEmployee();
				
				
				
			}
		});
		
		
		// to create view button
		
		JButton view=new JButton("View Employee");
		view.setBounds(565,270,150,40);
		view.setForeground(Color.WHITE);
		view.setBackground(Color.BLACK);
		
		// when u pree the button that button what condiotn neet to perform
		view.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
         new View_Employee();
         setVisible(false);// TODO Auto-generated method stub
				
			}
		});
		img.add(view);
		
		// to create remove button 
		
		JButton rem=new JButton("Remove Employee");
		rem.setBounds(440,370,150,40);
		rem.setForeground(Color.WHITE);
		rem.setBackground(Color.BLACK);
		img.add(rem);
		// by cliking on the button to perfotm some action
		rem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new RemoveEmployee();
				setVisible(false);
				
			}
		});
		
		
		
		 setSize(1120, 630);
		 setLayout(null);
		 setLocation(130,80);
		 setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		new Main_Class();
	}
	
}
