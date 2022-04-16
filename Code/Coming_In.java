////import java.awt.Color;
////import java.awt.Dimension;
////import java.awt.Font;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////import java.sql.ResultSet;
////import javax.swing.*;
////import javax.swing.event.ListSelectionEvent;
////import javax.swing.event.ListSelectionListener;
////import javax.swing.table.DefaultTableModel;
////import java.sql.ResultSetMetaData;
////import java.awt.Color;
////
////public class Coming_In extends JFrame implements ActionListener {
////	 JLabel l1, l2;
////	 JTextField tf1, tf2;
////	  JButton btn1,btn2;
////	  Coming_In(){
////		setTitle("Coming in");
////	    setVisible(true);
////	    setSize(500, 400);
////	    setLayout(null);
////	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////	   
////	    
////	    l1 = new JLabel("Name ");
////        l2 = new JLabel("Roll Number ");
////   
////        
////        tf1 = new JTextField();
////        tf2 = new JTextField();
////    
////        btn1 = new JButton("Submit");
////        btn2 = new JButton("Back");
////        
////        l1.setBounds(100, 30, 400, 30);
////        l2.setBounds(100, 120, 400, 30);
////     
////   
////        tf1.setBounds(200, 30, 200, 30);
////        tf2.setBounds(200, 120, 200, 30);
////        btn1.setBounds(150, 220, 100, 30);
////        btn2.setBounds(50, 220, 100, 30);
////        
////        add(l1);
////        add(l2);
////        add(tf1);
////        add(tf2);
////        add(btn1);
////        add(btn2);
////        
////        btn1.addActionListener(this);
////        btn2.addActionListener(this);
////	}
////
////	@Override
////	public void actionPerformed(ActionEvent e) {
////		String a = tf1.getText();
////        String b = tf2.getText();
////     
////     
////		   if(e.getSource()==btn1) {
////			   
////			   try {
////			   DBSConnection cc = new DBSConnection();
////               String q = "INSERT INTO coming (St_name,Roll_No) values('"+a+"','"+b+"')";
////               cc.s.executeUpdate(q);
////               JOptionPane.showMessageDialog(null,"You are Back");
////		   }catch(Exception ee){
////               System.out.println("The error is:"+ee);
////           }
////			   }
////		   
////		   if(e.getSource()==btn2) {
////			   new Student_Interface();
////			   setVisible(false);
////			   
////		   }
////		
////	}
////	 public static void main(String arr[]) {
////
////	        new Coming_In();
////
////	    }
////	 
////}
//
//
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//import javax.swing.*;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
//import javax.swing.table.DefaultTableModel;
//import java.sql.ResultSetMetaData;
//import java.awt.Color;
//
//public class Coming_In extends JFrame implements ActionListener {
//    JLabel l1, l2,l3;
//    JTextField tf1, tf2;
//    JButton btn1,btn2;
//    Coming_In(){
//
//        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Google Computers Mhr\\Downloads\\HostelIn-removebg-preview (1).png");
//        this.setIconImage(icon);
//        this.setSize(700,500);
//        this.setLocationRelativeTo(null);
//
//        setTitle("Coming in");
//       
//        setSize(500, 400);
//        this.getContentPane().setBackground(new Color (0x8BD8BD));
//        setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//
//        l1 = new JLabel("User Name : ");
//        l2 = new JLabel("Roll Number ");
//  
//
//        tf1 = new JTextField();
//        tf2 = new JTextField();
//
//        btn1 = new JButton("Submit");
//        btn2 = new JButton("Back");
//
//
//        l1.setBounds(100, 30, 400, 30);
//        l1.setFont(new Font("halvetica", Font.BOLD, 15));
//        l1.setForeground(new Color(0x243665));
//
//        l2.setBounds(100, 120, 400, 30);
//        l2.setFont(new Font("halvetica", Font.BOLD, 15));
//        l2.setForeground(new Color(0x243665));
//
//        
////        l3.setBounds(200, 30, 400, 30);
////        l3.setFont(new Font("halvetica", Font.BOLD, 15));
////        l3.setForeground(new Color(0x243665));
//
//
//        tf1.setBounds(200, 30, 200, 30);
////        tf2.setBounds(200, 120, 200, 30);
//        btn1.setBounds(270, 220, 100, 30);
//        btn1.setBackground(new Color(0x243665));
//        btn1.setForeground(new Color(0x8bd8bd));
//        btn2.setBounds(100, 220, 100, 30);
//        btn2.setBackground(new Color(0x243665));
//        btn2.setForeground(new Color(0x8bd8bd));
//
//        add(l1);
////        add(l3);
////        add(l2);
//        add(tf1);
////        add(tf2);
//        add(btn1);
//        add(btn2);
//
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String a = tf1.getText();
//        
//       
//        if(e.getSource()==btn1) {
//
//            try {
//                DBSConnection cc = new DBSConnection();
//                String q = "INSERT INTO coming (User_Name) values('"+a+"')";
//                cc.s.executeUpdate(q);
//                JOptionPane.showMessageDialog(null,"You are Back");
//            }catch(Exception ee){
//                System.out.println("The error is:"+ee);
//            }
//        }
//
//        if(e.getSource()==btn2) {
//            new Student_Interface(" ");
//            setVisible(false);
//
//        }
//
//    }
//    public static void main(String arr[]) {
//
//        new Coming_In();
//
//    }
//
//}
//


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.awt.Color;

public class Coming_In extends JFrame implements ActionListener {
    JLabel l1, l2,l3;
    JTextField tf1, tf2;
    JButton btn1,btn2;
    Coming_In(){

        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
        this.setIconImage(icon);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);

        setTitle("Coming in");

        setSize(300, 300);
        this.getContentPane().setBackground(new Color (0x8BD8BD));
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        l1 = new JLabel("User Name : ");
        l1.setBounds(30, 50, 400, 30);
        l1.setFont(new Font("halvetica", Font.BOLD, 15));
        l1.setForeground(new Color(0x243665));

        tf1 = new JTextField();
        tf1.setBounds(130, 50, 150, 30);

        btn1 = new JButton("Submit");
        btn1.setBounds(30, 150, 100, 30);
        btn1.setBackground(new Color(0x243665));
        btn1.setForeground(new Color(0x8bd8bd));

        btn2 = new JButton("Back");
        btn2.setBounds(150, 150, 100, 30);
        btn2.setBackground(new Color(0x243665));
        btn2.setForeground(new Color(0x8bd8bd));

        add(l1);
        add(tf1);
        add(btn1);
        add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String a = tf1.getText();


        if(e.getSource()==btn1) {

            try {
                DBSConnection cc = new DBSConnection();
                String q = "INSERT INTO coming (User_Name) values('"+a+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"You are Back");
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }

        if(e.getSource()==btn2) {
            new Student_Interface(" ");
            setVisible(false);

        }

    }
    public static void main(String arr[]) {

        new Coming_In();

    }

}


