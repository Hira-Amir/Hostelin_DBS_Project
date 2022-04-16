//import java.awt.Color;
//import java.util.Date;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
////import java.sql.Date;
//import java.sql.ResultSet;
//import javax.swing.*;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
//import javax.swing.table.DefaultTableModel;
//import java.sql.ResultSetMetaData;
//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
//import java.awt.Color;
//
//public class Late_Students extends JFrame implements ActionListener {
//	JLabel  l2, l3;
//	JButton Back;
//	JTable table;
//	JScrollPane sp;
//	ListSelectionModel model1;
//
//	Late_Students() {
//		setTitle("Late Students");
//		setVisible(true);
//		setSize(800, 600);
//		setLayout(null);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		 Back = new JButton("Back");
//	        Back.setBounds(100,450,150,40);
//	        Back.setForeground(Color.WHITE);
//	        Back.setBackground(Color.black);
//	    	add(Back);
//	    	Back.addActionListener(this);
//		
//		
//		sp = new JScrollPane(table);
//		sp.setPreferredSize(new Dimension(400, 150));
//
//		l2 = new JLabel("User_Name");
//		l2.setBounds(40, 0, 500, 50);
//		add(l2);
//
//		l3 = new JLabel("Late Coming");
//		l3.setBounds(387, 0, 500, 50);
//		add(l3);
//
//		table = new JTable();
//		table.setVisible(true);
//		table.setRowHeight(25);
//		table.setBounds(40, 30, 700, 400);
//		add(table);
//
//		try {
//
//			DBSConnection con = new DBSConnection();
//			String q = "select * from late";
//			ResultSet rs = con.s.executeQuery(q);
//			ResultSetMetaData rsmd = rs.getMetaData();
//			DefaultTableModel model = (DefaultTableModel) table.getModel();
//			String[] header = { "Student_Name", "Roll_Number" };
//			model.setColumnIdentifiers(header);
//
//			table.setModel(model);
//			String User_Name, Late_Time;
//			while (rs.next()) {
//				User_Name = rs.getString("User_Name");
//				Late_Time = rs.getString("Late_Time");
//
////				String limit="09";
////				String time="Select In_Time from coming ";
////				ResultSet ss = con.s.executeQuery(time);
////				System.out.println(ss);
//////				
////				System.out.println(time);
////				Date t=new Date();
////				SimpleDateFormat format = new SimpleDateFormat(limit);
////				String str= format.format(t);
////				System.out.println(str);
////				
////				String pattern = "HH";
////				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
////				Date date = simpleDateFormat.parse("07");
////				System.out.println(date);			
////				DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
////				  DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
////				LocalTime Limit = LocalTime.parse("09:00:00",formatter);
////				String times = "Select In_Time from coming where Roll_No=19";
////				LocalTime time = LocalTime.parse(times,formatter);
////				int val = time.compareTo(Limit);
////
////				if (val == 0) {
////					System.out.println("Equal");
////				} else if (val > 0) {
////
////					System.out.println("Time1 is greater tha time2");
////				} else if (val < 0) {
////
////					System.out.println("Time1 is lass tha time2");
////				}
//
//				String[] row = { User_Name, Late_Time };
//				model.addRow(row);
//			}
//
//		} catch (Exception e1) {
//			e1.printStackTrace();
//		}
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource()==Back) {
//			this.setVisible(false);
//		}
//		
//
//	}
//
//	public static void main(String arr[]) {
//
//		new Late_Students();
//
//	}
//
//}

import java.awt.Color;
import java.util.Date;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.sql.Date;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.Color;

public class Late_Students extends JFrame implements ActionListener {
	JLabel  l2, l3;
	JButton Back;
	JTable table;
	JScrollPane sp;
	ListSelectionModel model1;

	Late_Students() {
		Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
	    this.setIconImage(icon);
	    this.setSize(700,500);
	    this.setLocationRelativeTo(null);
	    
		setTitle("Late Students");
		 this.getContentPane().setBackground(new Color(0x8BD8BD));
		setSize(800, 600);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 Back = new JButton("Back");
		 Back.setFont(new Font("halvetica ", Font.ITALIC, 15));
	        Back.setBounds(50,500,120,40);
	        Back.setBackground(new Color(0X243665));
	        Back.setForeground(new Color(0x8BD8BD));
	    	add(Back);
	    	Back.addActionListener(this);
		
		
		sp = new JScrollPane(table);
		sp.setPreferredSize(new Dimension(400, 150));

		l2 = new JLabel("User_Name");
		l2.setFont(new Font("halvetica ", Font.ITALIC, 15));
		l2.setForeground(new Color(0X243665));
		l2.setBounds(70, 20, 500, 50);
		add(l2);

		l3 = new JLabel("Late Coming");
		l3.setFont(new Font("halvetica ", Font.ITALIC, 15));
		l3.setForeground(new Color(0X243665));
		l3.setBounds(387, 20, 500, 50);
		add(l3);

		table = new JTable();
		table.setVisible(true);
		table.setRowHeight(25);
		table.setBounds(40, 60, 700, 400);
		add(table);

		try {

			DBSConnection con = new DBSConnection();
			String q = "select * from late";
			ResultSet rs = con.s.executeQuery(q);
			ResultSetMetaData rsmd = rs.getMetaData();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			String[] header = { "Student_Name", "Roll_Number" };
			model.setColumnIdentifiers(header);

			table.setModel(model);
			String User_Name, Late_Time;
			while (rs.next()) {
				User_Name = rs.getString("User_Name");
				Late_Time = rs.getString("Late_Time");
//
//				String limit="09";
//				String time="Select In_Time from coming ";
//				ResultSet ss = con.s.executeQuery(time);
//				System.out.println(ss);
//			
//				System.out.println(time);
//				Date t=new Date();
//				SimpleDateFormat format = new SimpleDateFormat(limit);
//				String str= format.format(t);
//				System.out.println(str);
//				
//				String pattern = "HH";
//				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//				Date date = simpleDateFormat.parse("07");
//				System.out.println(date);			
//				DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss");
//				  DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
//				LocalTime Limit = LocalTime.parse("09:00:00",formatter);
//				String times = "Select In_Time from coming where Roll_No=19";
//				LocalTime time = LocalTime.parse(times,formatter);
//				int val = time.compareTo(Limit);
//
//				if (val == 0) {
//					System.out.println("Equal");
//				} else if (val > 0) {
//
//					System.out.println("Time1 is greater tha time2");
//				} else if (val < 0) {
//
//					System.out.println("Time1 is lass tha time2");
//				}

				String[] row = { User_Name, Late_Time };
				model.addRow(row);
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Back) {
			this.setVisible(false);
		}
		

}

	public static void main(String arr[]) {

		new Late_Students();

	}

}

