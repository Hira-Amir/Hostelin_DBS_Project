//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//
//import javax.swing.*;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
//import javax.swing.table.DefaultTableModel;
//
//import java.sql.ResultSetMetaData;
//
//import java.awt.Color;
//
//public class All_Students extends JFrame implements ActionListener {
//	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
//	JTable table;
//	JScrollPane sp;
//	  JButton Back;
//	 ListSelectionModel model1;
//	All_Students(){
//		 setTitle("All Students");
//         setVisible(true);
//        setSize(1100, 600);
//        setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
//        
//        Back = new JButton("Back");
//        Back.setBounds(100,450,150,40);
//        Back.setForeground(Color.WHITE);
//        Back.setBackground(Color.black);
//    	add(Back);
//    	Back.addActionListener(this);
//        
//        
//    	 sp = new JScrollPane(table);
//       	 sp.setPreferredSize(new Dimension(400,150));
//       	 
//       	 table = new JTable();
//    	 table.setVisible(true);
//    	 table.setRowHeight(25);
////    	 table.setAlignmentX(CENTER_ALIGNMENT);/
//    	 table.setBounds(40,30,1000,400);
//    	 add(table);
//    	 
//    	 l1=  new JLabel("Name");
//    	 l1.setBounds(40, 0, 500, 50);
//    	 add(l1);
//    	 
//    	 l2=  new JLabel("F_Name");
//    	 l2.setBounds(130, 0, 500, 50);
//    	 add(l2);
//    	 
//    	 l3=  new JLabel("Roll_No");
//    	 l3.setBounds(220, 0, 500, 50);
//    	 add(l3);
//    	 
//    	 l4=  new JLabel("Batch");
//    	 l4.setBounds(315, 0, 500, 50);
//    	 add(l4);
//    	 
//    	 l5=  new JLabel("Department");
//    	 l5.setBounds(405, 0, 500, 50);
//    	 add(l5);
//    	 
//    	 l6=  new JLabel("Age");
//    	 l6.setBounds(495, 0, 500, 50);
//    	 add(l6);
//    	 
//    	 l7=  new JLabel("Gender");
//    	 l7.setBounds(587, 0, 500, 50);
//    	 add(l7);
//    	 
//    	 l7=  new JLabel("Room_No");
//    	 l7.setBounds(680, 0, 500, 50);
//    	 add(l7);
//    	 
//    	 l7=  new JLabel("UserName");
//    	 l7.setBounds(770, 0, 500, 50);
//    	 add(l7);
//    	 
//    	 l8=  new JLabel("Password");
//    	 l8.setBounds(857, 0, 500, 50);
//    	 add(l8);
//    	 
//    	 l8=  new JLabel("Biometric");
//    	 l8.setBounds(952, 0, 500, 50);
//    	 add(l8);
//    	 
//    	 try {
//    	 
//    	  DBSConnection con = new DBSConnection();
//		  String q= "select * from students";
//		  ResultSet rs = con.s.executeQuery(q);
//		 ResultSetMetaData rsmd = rs.getMetaData();
//        DefaultTableModel model = (DefaultTableModel) table.getModel();
//		  String[] header = {"Student_Name" ,"Father_Name" , "Roll_Number" , "Batch" , "Depatment", "Age" , "Gender" , "Room_Number", "User_Name" , "Password","Biometric"};
//		  model.setColumnIdentifiers(header);
//		 
//		  
//		  
//		  table.setModel(model);
//		  String St_name,F_name,Roll_No,Batch,Department,Age,Gender,Room_No,User_Name,Password,Biometric;
//		  while(rs.next()) {
//			  St_name = rs.getString("St_name");
//			  F_name = rs.getString("F_name");
//			  Roll_No = rs.getString("Roll_No");
//			  Batch = rs.getString("Batch");
//			  Department = rs.getString("Department");
//			  Age = rs.getString("Age");
//			  Gender= rs.getString("Gender");
//			  Room_No = rs.getString("Room_No");
//			  User_Name= rs.getString("User_Name");
//			  Password= rs.getString("Password");
//			  Biometric=rs.getString("Biometric");
//			  
//			  String[] row = {St_name,F_name,Roll_No,Batch,Department,Age,Gender,Room_No,User_Name,Password,Biometric};
//			  model.addRow(row);
//			  }
//	
//				 
//			  
//		
//		  
//	  }
//    	 catch(Exception e1) {
//   		  e1.printStackTrace();
//   	  }
//        
//		
//	}
//	 public static void main(String arr[]) {
//
//	        new All_Students();
//
//	    }
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==Back) {
//			this.setVisible(false);
//		}
//		// TODO Auto-generated method stub
//		
//	}
//
//
//
//}



import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.sql.ResultSetMetaData;

import java.awt.Color;

public class All_Students extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	JTable table;
	JScrollPane sp;
	  JButton Back;
	 ListSelectionModel model1;
	All_Students(){
		Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
	    this.setIconImage(icon);
	    this.setSize(700,500);
	    this.setLocationRelativeTo(null);
	    
		 setTitle("All Students");
		 this.getContentPane().setBackground(new Color(0x8BD8BD));
        setSize(1100, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Back = new JButton("Back");
        Back.setFont(new Font("halvetica ", Font.ITALIC, 18));
        Back.setBounds(50,500,120,40);
        Back.setBackground(new Color(0X243665));
        Back.setForeground(new Color(0x8BD8BD));
    	add(Back);
    	Back.addActionListener(this);
        
        
    	 sp = new JScrollPane(table);
       	 sp.setPreferredSize(new Dimension(400,150));
       	 
       	 table = new JTable();
    	 table.setVisible(true);
    	 table.setRowHeight(25);
//    	 table.setAlignmentX(CENTER_ALIGNMENT);/
    	 table.setBounds(40,40,1000,400);
    	 add(table);
    	 
    	 l1=  new JLabel("Name");
    	 l1.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l1.setForeground(new Color(0X243665));
    	 l1.setBounds(40, 0, 500, 50);
    	 add(l1);
    	 
    	 l2=  new JLabel("F_Name");
    	 l2.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l2.setForeground(new Color(0X243665));
    	 l2.setBounds(130, 0, 500, 50);
    	 add(l2);
    	 
    	 l3=  new JLabel("Roll_No");
    	 l3.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l3.setForeground(new Color(0X243665));
    	 l3.setBounds(220, 0, 500, 50);
    	 add(l3);
    	 
    	 l4=  new JLabel("Batch");
    	 l4.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l4.setForeground(new Color(0X243665));
    	 l4.setBounds(315, 0, 500, 50);
    	 add(l4);
    	 
    	 l5=  new JLabel("Department");
    	 l5.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l5.setForeground(new Color(0X243665));
    	 l5.setBounds(405, 0, 500, 50);
    	 add(l5);
    	 
    	 l6=  new JLabel("Age");
    	 l6.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l6.setForeground(new Color(0X243665));
    	 l6.setBounds(495, 0, 500, 50);
    	 add(l6);
    	 
    	 l7=  new JLabel("Gender");
    	 l7.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l7.setForeground(new Color(0X243665));
    	 l7.setBounds(587, 0, 500, 50);
    	 add(l7);
    	 
    	 l7=  new JLabel("Room_No");
    	 l7.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l7.setForeground(new Color(0X243665));
    	 l7.setBounds(680, 0, 500, 50);
    	 add(l7);
    	 
    	 l7=  new JLabel("UserName");
    	 l7.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l7.setForeground(new Color(0X243665));
    	 l7.setBounds(770, 0, 500, 50);
    	 add(l7);
    	 
    	 l8=  new JLabel("Password");
    	 l8.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l8.setForeground(new Color(0X243665));
    	 l8.setBounds(857, 0, 500, 50);
    	 add(l8);
    	 
    	 l8=  new JLabel("Biometric");
    	 l8.setFont(new Font("halvetica ", Font.ITALIC, 15));
  		l8.setForeground(new Color(0X243665));
    	 l8.setBounds(952, 0, 500, 50);
    	 add(l8);
    	 
    	 try {
    	 
    	  DBSConnection con = new DBSConnection();
		  String q= "select * from students";
		  ResultSet rs = con.s.executeQuery(q);
		 ResultSetMetaData rsmd = rs.getMetaData();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
		  String[] header = {"Student_Name" ,"Father_Name" , "Roll_Number" , "Batch" , "Depatment", "Age" , "Gender" , "Room_Number", "User_Name" , "Password","Biometric"};
		  model.setColumnIdentifiers(header);
		 
		  
		  
		  table.setModel(model);
		  String St_name,F_name,Roll_No,Batch,Department,Age,Gender,Room_No,User_Name,Password,Biometric;
		  while(rs.next()) {
			  St_name = rs.getString("St_name");
			  F_name = rs.getString("F_name");
			  Roll_No = rs.getString("Roll_No");
			  Batch = rs.getString("Batch");
			  Department = rs.getString("Department");
			  Age = rs.getString("Age");
			  Gender= rs.getString("Gender");
			  Room_No = rs.getString("Room_No");
			  User_Name= rs.getString("User_Name");
			  Password= rs.getString("Password");
			  Biometric=rs.getString("Biometric");
			  
			  String[] row = {St_name,F_name,Roll_No,Batch,Department,Age,Gender,Room_No,User_Name,Password,Biometric};
			  model.addRow(row);
			  }
	
				 
			  
		
		  
	  }
    	 catch(Exception e1) {
   		  e1.printStackTrace();
   	  }
        
    	    setVisible(true);	
	}
	 public static void main(String arr[]) {

	        new All_Students();

	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Back) {
			this.setVisible(false);
		}
		// TODO Auto-generated method stub
		
	}



}

