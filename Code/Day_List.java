//
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.ListSelectionModel;
//import javax.swing.table.DefaultTableModel;
//
//public class Day_List extends JFrame implements ActionListener {
//	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
//	JTable table,table2;
//	JScrollPane sp, sp2;
//	JButton Back;
//	ListSelectionModel model1;
//
//	Day_List() {
//		setTitle("Day_List");
//		setSize(1100, 600);
//		setLayout(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		sp = new JScrollPane(table);
//		sp.setPreferredSize(new Dimension(400, 150));
//		table = new JTable();
//		table.setVisible(true);
//		table.setRowHeight(25);
//		table.setBounds(40, 34, 800, 400);
//		add(table);
//		
//		table2 = new JTable();
//		table2.setVisible(true);
//		table2.setRowHeight(25);
//		table2.setBounds(839, 34, 100, 400);
//		add(table2);
//
//		Back = new JButton("Back");
//		Back.setBounds(100, 450, 150, 40);
//		Back.setForeground(Color.WHITE);
//		Back.setBackground(Color.black);
//		add(Back);
//		Back.addActionListener(this);
//		
//		 l1=  new JLabel("User_Name");
//    	 l1.setBounds(40, 0, 500, 50);
//    	 add(l1);
//    	 
//    	 l2=  new JLabel("Location");
//    	 l2.setBounds(240, 0, 500, 50);
//    	 add(l2);
//    	 
//    	 l3=  new JLabel("Reason");
//    	 l3.setBounds(442, 0, 500, 50);
//    	 add(l3);
//    	 
//    	 l4=  new JLabel("Out");
//    	 l4.setBounds(637, 0, 500, 50);
//    	 add(l4);
//    	 
//    	 l5=  new JLabel("In");
//    	 l5.setBounds(840, 0, 500, 50);
//    	 add(l5);
//    
//    	
//    	 
//    	 
//    	 try {
//    
//       	  DBSConnection con = new DBSConnection();
//   		  String q= "select * from going";
//   		  ResultSet rs = con.s.executeQuery(q);
//   		 ResultSetMetaData rsmd = rs.getMetaData();
//           DefaultTableModel model = (DefaultTableModel) table.getModel();
//   		  String[] header = {"User_Name" ,"Location" , "Reason" , "Out" };
//   		  model.setColumnIdentifiers(header);
//   		 
//   		  
//   		  
//   		  table.setModel(model);
//   		  String User_Name,Location,Reason,Out,In;
//   		  while(rs.next()) {
//   			  User_Name = rs.getString("User_Name");
//   			  Location = rs.getString("Location");
//   			  Reason = rs.getString("Reason");
//   			  Out = rs.getString("Out_Time");
//
//   			  String[] row = {User_Name,Location,Reason,Out};
//   			  model.addRow(row);
//   			  }
// 
//   						  
//   		  
//   	  }
//       	 catch(Exception e1) {
//      		  e1.printStackTrace();
//      	  }
//    	 
//    	 
//    	 try {
//        	 
//          	  DBSConnection con = new DBSConnection();
//      		  String p= "select In_Time from coming where User_Name=(Select User_Name from going )";
//      		  ResultSet rs1 = con.s.executeQuery(p);
//      		 ResultSetMetaData rsmd = rs1.getMetaData();
//              DefaultTableModel model = (DefaultTableModel) table2.getModel();
//      		  String[] header = {"In_Time"  };
//      		  model.setColumnIdentifiers(header);
//      		 
//      		  
//      		  
//      		  table2.setModel(model);
//      		  String In;
//      		  while(rs1.next()) {
//      			
//      			  In = rs1.getString("In_Time");
//
//      			  String[] row = {In};
//      			  model.addRow(row);
//      			  }
//    
//      						  
//      		  
//      	  }
//          	 catch(Exception e1) {
//         		  e1.printStackTrace();
//         	  }
//       	 
//
//    	 
//    	
//    	 setVisible(true);      
//	}
//
//	public static void main(String arr[]) {
//new Day_List();
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		 if (e.getSource() == Back) {
//			 this.setVisible(false);
//        }
//		
//	}
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
import java.sql.ResultSetMetaData;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Day_List extends JFrame implements ActionListener {
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JTable table,table2;
	JScrollPane sp, sp2;
	JButton Back;
	ListSelectionModel model1;

	Day_List() {
		Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
	    this.setIconImage(icon);
	    this.setSize(700,500);
	    this.setLocationRelativeTo(null);
	    
		setTitle("Day_List");
		 this.getContentPane().setBackground(new Color(0x8BD8BD));
		setSize(1100, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sp = new JScrollPane(table);
		sp.setPreferredSize(new Dimension(400, 150));
		table = new JTable();
		table.setVisible(true);
		table.setRowHeight(25);
		table.setBounds(40, 34, 800, 400);
		add(table);
		
		table2 = new JTable();
		table2.setVisible(true);
		table2.setRowHeight(25);
		table2.setBounds(839, 34, 100, 400);
		add(table2);

		Back = new JButton("Back");
		 Back.setFont(new Font("halvetica ", Font.ITALIC, 18));
	        Back.setBounds(50,500,120,40);
	        Back.setBackground(new Color(0X243665));
	        Back.setForeground(new Color(0x8BD8BD));
		add(Back);
		Back.addActionListener(this);
		
		 l1=  new JLabel("User_Name");
		 l1.setFont(new Font("halvetica ", Font.ITALIC, 15));
	     l1.setForeground(new Color(0X243665));
    	 l1.setBounds(40, 0, 500, 50);
    	 add(l1);
    	 
    	 l2=  new JLabel("Location");
    	 l2.setFont(new Font("halvetica ", Font.ITALIC, 15));
 		l2.setForeground(new Color(0X243665));
    	 l2.setBounds(240, 0, 500, 50);
    	 add(l2);
    	 
    	 l3=  new JLabel("Reason");
    	 l3.setFont(new Font("halvetica ", Font.ITALIC, 15));
 		l3.setForeground(new Color(0X243665));
    	 l3.setBounds(442, 0, 500, 50);
    	 add(l3);
    	 
    	 l4=  new JLabel("Out");
    	 l4.setFont(new Font("halvetica ", Font.ITALIC, 15));
 		l4.setForeground(new Color(0X243665));
    	 l4.setBounds(637, 0, 500, 50);
    	 add(l4);
    	 
    	 l5=  new JLabel("In");
    	 l5.setFont(new Font("halvetica ", Font.ITALIC, 15));
 		l5.setForeground(new Color(0X243665));
    	 l5.setBounds(840, 0, 500, 50);
    	 add(l5);
    
    	
    	 
    	 
    	 try {
    
       	  DBSConnection con = new DBSConnection();
   		  String q= "select * from going";
   		  ResultSet rs = con.s.executeQuery(q);
   		 ResultSetMetaData rsmd = rs.getMetaData();
           DefaultTableModel model = (DefaultTableModel) table.getModel();
   		  String[] header = {"User_Name" ,"Location" , "Reason" , "Out" };
   		  model.setColumnIdentifiers(header);
   		 
   		  
   		  
   		  table.setModel(model);
   		  String User_Name,Location,Reason,Out;
   		  while(rs.next()) {
   			  User_Name = rs.getString("User_Name");
   			  Location = rs.getString("Location");
   			  Reason = rs.getString("Reason");
   			  Out = rs.getString("Out_Time");

   			  String[] row = {User_Name,Location,Reason,Out};
   			  model.addRow(row);
   			  }
 
   						  
   		  
   	  }
       	 catch(Exception e1) {
      		  e1.printStackTrace();
      	  }
    	 
    	 
    	 try {
        	 
          	  DBSConnection con = new DBSConnection();
      		  String p= "select In_Time from coming where User_Name IN(Select User_Name from going )";
      		  ResultSet rs1 = con.s.executeQuery(p);
      		 ResultSetMetaData rsmd = rs1.getMetaData();
              DefaultTableModel model = (DefaultTableModel) table2.getModel();
      		  String[] header = {"In_Time"  };
      		  model.setColumnIdentifiers(header);
      		 
      		  
      		  
      		  table2.setModel(model);
      		  String In;
      		  while(rs1.next()) {
      			
      			  In = rs1.getString("In_Time");

      			  String[] row = {In};
      			  model.addRow(row);
      			  }
    
      						  
      		  
      	  }
          	 catch(Exception e1) {
         		  e1.printStackTrace();
         	  }
       	 

    	 
    	
    	 setVisible(true);      
	}

	public static void main(String arr[]) {
new Day_List();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 if (e.getSource() == Back) {
			 this.setVisible(false);
        }
		
	}

}

