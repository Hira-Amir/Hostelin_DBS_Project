//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.RandomAccessFile;
//import java.sql.ResultSet;
//import java.awt.*;
//
//public class Student_Login extends JFrame implements ActionListener {
//
//    JLabel l1, l2, l3,l4;   //label for email and password
//
//    JTextField tf1,tf2; // email field
//
//    JButton btn1,btn2; // login button
//
//    JPasswordField p1; // password field
//    int ln;
//    // create folder in which record is save
//    Student_Login() {
//        Image icon = Toolkit.getDefaultToolkit().getImage("");
//        this.setIconImage(icon);
//        this.setSize(700,500);
//        this.setLocationRelativeTo(null);
//
//        this.setLayout(new FlowLayout());
//        JLabel label=new JLabel(new ImageIcon("src/logo.png"));
//
//
//        setTitle("Login");
//        setVisible(true);
//        this.getContentPane().setBackground(new Color (0x8BD8BD));
//        setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(400, 500);
//
//        
//        l4=new JLabel("Student Login");
//        l1 = new JLabel("Student Login");
//        l1.setForeground(new Color(0x243665));
//        l1.setFont(new Font("halvetica", Font.BOLD, 30));
//        l2 = new JLabel("Enter UserName:");
//        l2.setFont(new Font("halvetica", Font.BOLD, 15));
//        l2.setForeground(new Color(0x243665));
//        l3 = new JLabel("Enter Password:");
//        l3.setFont(new Font("halvetica", Font.BOLD, 15));
//        l3.setForeground(new Color(0x243665));
//        tf1 = new JTextField();
//        p1 = new JPasswordField();
//        btn1 = new JButton("Login");
//        btn1.setBackground(new Color(0x243665));
//        btn1.setForeground(new Color(0x8bd8bd));
//        btn2 = new JButton("Back");
//        btn2.setBackground(new Color(0x243665));
//        btn2.setForeground(new Color(0x8bd8bd));
//
//        l1.setBounds(100, 30, 400, 40);
//        l2.setBounds(50, 70, 200, 30);
//        l3.setBounds(50, 160, 200, 30);
//        tf1.setBounds(150, 110, 200, 30);
//        p1.setBounds(150, 200, 200, 30);
//        btn1.setBounds(150, 280, 100, 30);
//        btn2.setBounds(30, 280, 100, 30);
//
//        add(l1);
//        add(l2);
//        add(tf1);
//        add(l3);
//        add(p1);
//        add(btn1);
//        add(btn2);
//
//
//        //JLabel l21 = new JLabel(tf1.getText());
//
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//
//    }
//
//    public void actionPerformed(ActionEvent e) {
////    	Name=tf1.getText();
////    	Roll=p1.getText();
//    	
//        if(e.getSource()==btn1) {
//            try{
//                DBSConnection c1 = new DBSConnection();
//                String q = "select * from students where User_Name='"+tf1.getText()+"' and Password='"+p1.getText()+"'";
//                ResultSet rs = c1.s.executeQuery(q);
//                if(rs.next()){
//                    new Student_Interface(tf1.getText());
//                    setVisible(false);
//                    
//                }else{
//                    JOptionPane.showMessageDialog(null, "Invalid login");
//                    tf1.setText("");
//                    p1.setText("");
//
//                }
//            }catch(Exception ae){
//                ae.printStackTrace();
//                //System.out.print(e);
//            }}  else if(e.getSource()==btn2) {
//            	new Home();
//            	setVisible(false);
//            }
//
//
//    }
//
//
//    public static void main(String arr[]) {
//
//        new Student_Login();
//
//    }
//
//}
//


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.ResultSet;
import java.awt.*;

public class Student_Login extends JFrame implements ActionListener {

    JLabel l1, l2, l3,l4;

    JTextField tf1,tf2;

    JButton btn1,btn2;

    JPasswordField p1;


    Student_Login() {
        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
        this.setIconImage(icon);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);


        ImageIcon i1= new ImageIcon("src/login.png");
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l5=new JLabel(i3);



        setTitle("Login");
        this.getContentPane().setBackground(new Color (0x8BD8BD));
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);


        l4=new JLabel("Student Login");
        l1 = new JLabel("Student Login");
        l1.setForeground(new Color(0x243665));
        l1.setFont(new Font("halvetica", Font.BOLD, 30));
        l2 = new JLabel("Enter UserName:");
        l2.setFont(new Font("halvetica", Font.BOLD, 15));
        l2.setForeground(new Color(0x243665));
        l3 = new JLabel("Enter Password:");
        l3.setFont(new Font("halvetica", Font.BOLD, 15));
        l3.setForeground(new Color(0x243665));
        tf1 = new JTextField();
        p1 = new JPasswordField();

        btn1 = new JButton("Login");
        btn1.setBackground(new Color(0x243665));
        btn1.setForeground(new Color(0x8bd8bd));
        btn1.setFont(new Font("halvetica", Font.BOLD, 15));


        btn2 = new JButton("Back");
        btn2.setBackground(new Color(0x243665));
        btn2.setForeground(new Color(0x8bd8bd));
        btn2.setFont(new Font("halvetica", Font.BOLD, 15));

        l1.setBounds(140, 50, 400, 40);
        l2.setBounds(50, 120, 200, 30);
        l3.setBounds(50, 200, 200, 30);
        tf1.setBounds(180, 120, 170, 30);
        p1.setBounds(180, 200, 170, 30);
        btn1.setBounds(200, 280, 100, 50);
        btn2.setBounds(70, 280, 100, 50);
        l5.setBounds(50, 10, 100, 100);

        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(p1);
        add(btn1);
        add(btn2);
        add(l5);



        btn1.addActionListener(this);
        btn2.addActionListener(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
    	
        if(e.getSource()==btn1) {
            try{
                DBSConnection c1 = new DBSConnection();
                String q = "select * from students where User_Name='"+tf1.getText()+"' and Password='"+p1.getText()+"'";
                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    new Student_Interface(tf1.getText());
                    setVisible(false);

                }else{
                    JOptionPane.showMessageDialog(null, "Invalid login");
                    tf1.setText("");
                    p1.setText("");

                }
            }catch(Exception ae){
                ae.printStackTrace();
                //System.out.print(e);
            }}  else if(e.getSource()==btn2) {
            new Home();
            setVisible(false);
        }


    }


    public static void main(String arr[]) {

        new Student_Login();

    }

}


