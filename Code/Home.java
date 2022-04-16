//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Image;
//import java.awt.Toolkit;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//public class Home  extends JFrame implements ActionListener {
//	  JLabel l1,back;
//	  JButton btn1, btn2,btn3;
//	  ImageIcon background;
//	    Image img;
//	    Image temp;
//Home(){
//	
//	Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
//    this.setIconImage(icon);
//    this.setSize(700,500);
//    this.setLocationRelativeTo(null);
//	
// 
// // Background
//    background = new ImageIcon("src/hostel.jpg");
//    img = background.getImage();
//    temp = img.getScaledInstance(800, 250, Image.SCALE_SMOOTH);
//    background = new ImageIcon(temp);
//    back = new JLabel("", background, JLabel.CENTER);
//    back.setLayout(null);
//    back.setSize(800,500);
//	
//
//
//    setSize(700, 500);
//    setLayout(null);
//    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setTitle("Home");
//    l1 = new JLabel("Welcome to Hostel Entry System");
//    l1.setForeground(new Color(0X243665));
//    l1.setFont(new Font("halvetica ", Font.ITALIC, 30));
//    
//    
//    
//    
//    btn1 = new JButton("Admin Login");
//    btn1.setBackground(new Color(0X243665));
//    btn1.setForeground(new Color(0x8BD8BD));
//    btn2 = new JButton("Student Login");
//    btn2.setBackground(new Color(0X243665));
//    btn2.setForeground(new Color(0x8BD8BD));
//    l1.setBounds(135, 20, 500, 50);
//    btn1.setBounds(60, 400, 150, 50);
//    btn1.setFont(new Font("helvetica",Font.ITALIC,15));
//    btn2.setBounds(270, 400, 150, 50);
//    btn2.setFont(new Font("helvetica",Font.ITALIC,15));
//  
//    btn1.addActionListener(this);
//    btn2.addActionListener(this);
//    
//    
//    btn3 = new JButton("Registration");
//    btn3.setBackground(new Color(0X243665));
//    btn3.setForeground(new Color(0x8BD8BD));
//    btn3.setBounds(500, 400, 150, 50);
//    btn3.setFont(new Font("helvetica",Font.ITALIC,15));
//    btn3.addActionListener(this);
//    
// 
// 
//    
//    add(l1);
//    add(btn1);
//    add(btn2);
//    add(btn3);
//    add(back);
//	setVisible(true);
//	
//}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		
//		
//		 if(e.getSource()==btn1) {
// 	          new Admin_Login();
// 	         setVisible(false);
// 	        
// 	        }
//		 else if(e.getSource()==btn2) {
//			 
//			  new Student_Login();	
//			  setVisible(false);
// 	    
//		 }
//		 else if(e.getSource()==btn3) {
//			 
//			  new Registration();	
//			  setVisible(false);
//			  }
//		 }
//		
//	
//
//	public static void main(String[] args) {
//		new Home();
//	}
//
//}
//
//

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Home  extends JFrame implements ActionListener {
    JLabel l1,back;
    JButton btn1, btn2,btn3;
    ImageIcon background;
    Image img;
    Image temp;
    Home(){

        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
        this.setIconImage(icon);
        this.setSize(700,500);
        this.setLocationRelativeTo(null);


        background = new ImageIcon("src/bg.jpg");
        img = background.getImage();
        temp = img.getScaledInstance(800, 500, Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        back = new JLabel("", background, JLabel.CENTER);
        back.setLayout(null);
        back.setSize(700,500);



        setSize(700, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home");

        l1 = new JLabel("Welcome to Hostelin");
        l1.setForeground(new Color(0X8BD8BD));
        l1.setFont(new Font("halvetica ", Font.BOLD+Font.ITALIC, 30));
        l1.setBounds(60, 100, 500, 50);


        btn1 = new JButton("Admin");
        btn1.setBackground(new Color(0X8BD8BD));
        btn1.setForeground(new Color(0x243665));
        btn1.setBounds(50, 200, 120, 50);
        btn1.setFont(new Font("helvetica",Font.ITALIC,20));

        btn2 = new JButton("Student");
        btn2.setBackground(new Color(0X8BD8BD));
        btn2.setForeground(new Color(0x243665));
        btn2.setBounds(220, 200, 120, 50);
        btn2.setFont(new Font("helvetica",Font.ITALIC,20));


        btn3 = new JButton("Registration");
        btn3.setBackground(new Color(0X8BD8BD));
        btn3.setForeground(new Color(0x243665));
        btn3.setBounds(130, 290, 150, 50);
        btn3.setFont(new Font("helvetica",Font.ITALIC,20));

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);


        add(l1);
        add(btn1);
        add(btn2);
        add(btn3);
        add(back);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {



        if(e.getSource()==btn1) {
            new Admin_Login();
            setVisible(false);

        }
        else if(e.getSource()==btn2) {

            new Student_Login();
            setVisible(false);

        }
        else if(e.getSource()==btn3) {

            new Registration();
            setVisible(false);
        }
    }


    public static void main(String[] args) {
        new Home();
    }

}



