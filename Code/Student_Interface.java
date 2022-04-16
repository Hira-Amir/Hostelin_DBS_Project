//
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
//public class Student_Interface extends JFrame implements ActionListener {
//    JLabel l1, back,l21;
//    JButton btn1, btn2, btn3, btn4,btn5;
//    ImageIcon background;
//    Image img;
//    Image temp;
//
//    Student_Interface(String username) {
//        setTitle("Student Interface");
//        setSize(600, 600);
//        setBackground(Color.decode("#8BD8BD"));
//        setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//
//        l1 = new JLabel("Student Interface", JLabel.CENTER);
//        l1.setForeground(Color.decode("#243665"));
//        l1.setFont(new Font("halvetica", Font.BOLD, 30));
//        l1.setBackground(Color.decode("#243665"));
//
//
//        btn1 = new JButton("Coming in");
//        btn1.setBackground(Color.decode("#243665"));
//        btn1.setForeground(Color.decode("#8BD8BD"));
//        btn1.setFocusable(false);
//
//        btn2 = new JButton("Going out");
//        btn2.setBackground(Color.decode("#243665"));
//        btn2.setForeground(Color.decode("#8BD8BD"));
//        btn2.setFocusable(false);
//
//        btn3 = new JButton("Profile");
//        btn3.setBackground(Color.decode("#243665"));
//        btn3.setForeground(Color.decode("#8BD8BD"));
//        btn3.setFocusable(false);
//
//        btn4 = new JButton("Mark My Attendance");
//        btn4.setBackground(Color.decode("#243665"));
//        btn4.setForeground(Color.decode("#8BD8BD"));
//        btn4.setFocusable(false);
//        
//        
//        btn5 = new JButton("Back");
//        
//
//        l1.setBounds(80, 70, 400, 40);
//        btn1.setBounds(190, 150, 100, 30);
//        btn2.setBounds(190, 190, 100, 30);
//        btn3.setBounds(190, 230, 100, 30);
//        btn4.setBounds(190, 270, 160, 30);
//        btn5.setBounds(190, 320, 160, 30);
//
//
////        Image icon = Toolkit.getDefaultToolkit().getImage("F:\\DSA\\src\\HostelIn-removebg-preview.png");
////        this.setIconImage(icon);
//        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
//        this.setIconImage(icon);
//        this.setSize(700,500);
//        this.setLocationRelativeTo(null);
//
//        // Background
//        background = new ImageIcon("src\\HostelIn-removebg-preview.png");
//        img = background.getImage();
//        temp = img.getScaledInstance(80, 70, Image.SCALE_SMOOTH);
//        background = new ImageIcon(temp);
//        back = new JLabel("", background, JLabel.CENTER);
//        back.setLayout(null);
//        back.setBounds(70, 60, 80, 70);
//
//
//        this.getContentPane().setBackground(new Color (0x8BD8BD));
//        add(l1);
//        add(btn1);
//        add(btn2);
////        add(btn3);
////        add(btn4);
//        add(btn5);
//        add(back);
//        setVisible(true);
//        
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        btn5.addActionListener(this);
//        l21 = new JLabel(username);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//    	 if(e.getSource()==btn2) {
////    		 try {
////    			 DBSConnection con = new DBSConnection();
////    			 String q= "select St_Name from students where user_name='"+l21.getText()+"'";
////    			 Result
////    		 }catch(Exception ee) {
////    			 ee.printStackTrace();
//    		 
//			 new Going_Out(l21.getText());
//			 setVisible(false);
//		 }
//		 else if(e.getSource()==btn1) {
//			 new Coming_In();
//			 setVisible(false);
//		 }
//		 else if(e.getSource()==btn5) {
//			 new Home();
//			 setVisible(false);
//		 }
//
//    }
//
//
//    public static void main(String arr[]) {
//
//        new Student_Interface("");
//
//    }
//
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

public class Student_Interface extends JFrame implements ActionListener {
    JLabel l1, back,l21;
    JButton btn1, btn2, btn3, btn4,btn5;
    ImageIcon background;
    Image img;
    Image temp;

    Student_Interface(String username) {
        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
        this.setIconImage(icon);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color (0x8BD8BD));

        ImageIcon i1= new ImageIcon("src/stud.png");
        Image i2=i1.getImage().getScaledInstance(250, 280, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l5=new JLabel(i3);


        setTitle("Student Interface");
        setSize(600, 600);
        setBackground(Color.decode("#8BD8BD"));
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        l1 = new JLabel("Student Interface", JLabel.CENTER);
        l1.setForeground(Color.decode("#243665"));
        l1.setFont(new Font("halvetica", Font.BOLD, 30));
        l1.setBackground(Color.decode("#243665"));


        btn1 = new JButton("Coming in");
        btn1.setBackground(Color.decode("#243665"));
        btn1.setForeground(Color.decode("#8BD8BD"));
        btn1.setFont(new Font("halvetica", Font.BOLD, 15));
        btn1.setFocusable(false);

        btn2 = new JButton("Going out");
        btn2.setBackground(Color.decode("#243665"));
        btn2.setForeground(Color.decode("#8BD8BD"));
        btn2.setFont(new Font("halvetica", Font.BOLD, 15));
        btn2.setFocusable(false);



        btn3 = new JButton("Back");
        btn3.setBackground(Color.decode("#243665"));
        btn3.setForeground(Color.decode("#8BD8BD"));
        btn3.setFont(new Font("halvetica", Font.BOLD, 15));
        btn3.setFocusable(false);


        l1.setBounds(20, 170, 400, 40);
        btn1.setBounds(60, 270, 130, 40);
        btn2.setBounds(230, 270, 130, 40);
        btn3.setBounds(60, 450, 100, 40);





        add(l1);
        add(btn1);
        add(btn2);
        add(btn3);
        add(l5);


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        setVisible(true);
        l21 = new JLabel(username);
        l5.setBounds(350, 90, 250, 310);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn2) {
//    		 try {
//    			 DBSConnection con = new DBSConnection();
//    			 String q= "select St_Name from students where user_name='"+l21.getText()+"'";
//    			 Result
//    		 }catch(Exception ee) {
//    			 ee.printStackTrace();

            new Going_Out(l21.getText());
            setVisible(false);
        }
        else if(e.getSource()==btn1) {
            new Coming_In();
            setVisible(false);
        }
        else if(e.getSource()==btn3) {
            new Home();
            setVisible(false);
        }
       

    }


    public static void main(String arr[]) {

        new Student_Interface("");

    }


}

