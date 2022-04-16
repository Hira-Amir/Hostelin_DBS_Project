//
//import javax.swing.*;
////import java.awt.*;
////import java.awt.event.*;
////import java.io.File;
////import java.io.FileNotFoundException;
////import java.io.FileReader;
////import java.io.FileWriter;
////import java.io.IOException;
////import java.io.RandomAccessFile;
////import java.sql.ResultSet;
////import java.awt.*;
////public class Admin_Interface extends JFrame implements ActionListener {
////	JLabel l1;
////	JButton btn1;
////	Admin_Interface(){
////		 setTitle("Student Interface");
////         setVisible(true);
////        setSize(600, 600);
////        setLayout(null);
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        
////        l1 = new JLabel("Admin Interface");
////        l1.setForeground(Color.blue);
////        l1.setFont(new Font("Serif", Font.BOLD, 20));
////        btn1 = new JButton("All students");
////        
////        l1.setBounds(100, 30, 400, 30);
////        btn1.setBounds(100, 80, 120, 30);
////            
////        add(l1);
////        add(btn1);
////        
////
////        btn1.addActionListener(this);
////    
////	}
////	@Override
////	public void actionPerformed(ActionEvent e) {
////		 if(e.getSource()==btn1) {
////			 new All_Students();
////		 }
////		
////	}
////	  public static void main(String arr[]) {
////
////	        new Admin_Interface();
////
////	    }
////
////	
////
////}
//
//
//
//
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
//public class Admin_Interface extends JFrame implements ActionListener {
//    JButton btn1,btn2,btn3,btn4;
//    JLabel l1, back;
//    ImageIcon background;
//    Image img;
//    Image temp;
//
//    Admin_Interface() {
//        setTitle("Admin Interface");
//        setSize(600, 600);
//        setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        l1 = new JLabel("Admin Interface", JLabel.CENTER);
//        l1.setForeground(Color.decode("#243665"));
//        l1.setFont(new Font("halvetica", Font.BOLD, 30));
//
//        btn1 = new JButton("All students");
//        btn1.setBackground(Color.decode("#243665"));
//        btn1.setForeground(Color.decode("#8BD8BD"));
//        btn1.setFocusable(false);
//        
//        btn2 = new JButton("Back To Home");
//        btn2.setBackground(new Color(0x243665));
//        btn2.setForeground(new Color(0x8bd8bd));
//        
//        btn3 = new JButton("Late Students");
//        btn3.setBackground(new Color(0x243665));
//        btn3.setForeground(new Color(0x8bd8bd));
//        
//        
//        btn4 = new JButton("All Day List");
//        btn4.setBackground(new Color(0x243665));
//        btn4.setForeground(new Color(0x8bd8bd));
//
//        l1.setBounds(80, 80, 400, 40);
//        btn1.setBounds(200, 150, 120, 30);
//        btn3.setBounds(200, 200, 120, 30);
//        btn2.setBounds(30, 280, 120, 30);
//        btn4.setBounds(200, 250, 120, 30);
//        
//
////        Image icon = Toolkit.getDefaultToolkit().getImage("F:\\DSA\\src\\HostelIn-removebg-preview.png");
////        this.setIconImage(icon);
//        
//        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
//        this.setIconImage(icon);
//        this.setSize(700,500);
//        this.setLocationRelativeTo(null);
//
//        // Background
//        background = new ImageIcon("src\\HostelIn-removebg-preview.png");
//        img = background.getImage();
//        temp = img.getScaledInstance(70, 60, Image.SCALE_SMOOTH);
//        background = new ImageIcon(temp);
//        back = new JLabel("", background, JLabel.CENTER);
//        back.setLayout(null);
//        back.setBounds(95, 70, 70, 60);
//
//        this.getContentPane().setBackground(new Color(0x8BD8BD));
//
//        add(l1);
//        add(btn1);
//        add(back);
//        add(btn2);
//        add(btn3);
//        add(btn4);
//
//
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        btn3.addActionListener(this);
//        btn4.addActionListener(this);
//        setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == btn1) {
//             new All_Students();
//        }
//        else if(e.getSource() == btn2) {
//        	
//        	 setVisible(false);
//        	 new Home();
//        }
//        else if(e.getSource() == btn3) {
//        	
//       	
//       	 new Late_Students();
//       }
//        else if(e.getSource() == btn4) {
//        	
//           	
//          	 new Day_List();
//          }
//
//    }
//
//    public static void main(String arr[]) {
//
//        new Admin_Interface();
//
//    }
//
//
//}



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

public class Admin_Interface extends JFrame implements ActionListener {
    JButton btn1,btn2,btn3,btn4;
    JLabel l1, back;
    ImageIcon background;
    Image img;
    Image temp;

    Admin_Interface() {

        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
        this.setIconImage(icon);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x8BD8BD));

        ImageIcon i1= new ImageIcon("src/admin.png");
        Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l5=new JLabel(i3);


        setTitle("Admin Interface");
        setSize(600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        l1 = new JLabel("Admin Interface", JLabel.CENTER);
        l1.setForeground(Color.decode("#243665"));
        l1.setFont(new Font("halvetica", Font.BOLD, 30));
        l1.setBounds(40, 80, 400, 30);

        btn1 = new JButton("All students");
        btn1.setBackground(Color.decode("#243665"));
        btn1.setForeground(Color.decode("#8BD8BD"));
        btn1.setFont(new Font("halvetica", Font.BOLD, 15));
        btn1.setFocusable(false);
        btn1.setBounds(160, 150, 150, 40);

        btn2 = new JButton("Back To Home");
        btn2.setBackground(new Color(0x243665));
        btn2.setForeground(new Color(0x8bd8bd));
        btn2.setFont(new Font("halvetica", Font.BOLD, 15));
        btn2.setBounds(30, 370, 150, 40);

        btn3 = new JButton("Late Students");
        btn3.setBackground(new Color(0x243665));
        btn3.setForeground(new Color(0x8bd8bd));
        btn3.setFont(new Font("halvetica", Font.BOLD, 15));
        btn3.setBounds(160, 220, 150, 40);


        btn4 = new JButton("All Day List");
        btn4.setBackground(new Color(0x243665));
        btn4.setForeground(new Color(0x8bd8bd));
        btn4.setFont(new Font("halvetica", Font.BOLD,15));
        btn4.setBounds(160, 290, 150, 40);


        add(l1);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(l5);


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        setVisible(true);

        l5.setBounds(330, 110, 250, 250);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            new All_Students();
        }
        else if(e.getSource() == btn2) {

            setVisible(false);
            new Home();
        }
        else if(e.getSource() == btn3) {


            new Late_Students();
        }
        else if(e.getSource() == btn4) {


            new Day_List();
        }

    }

    public static void main(String arr[]) {

        new Admin_Interface();

    }


}
