////import java.awt.Color;
////import java.awt.Font;
////import java.awt.event.ActionEvent;
////import java.awt.event.ActionListener;
////import java.io.File;
////import java.io.FileNotFoundException;
////import java.io.FileReader;
////import java.io.FileWriter;
////import java.io.IOException;
////import java.io.RandomAccessFile;
////import javax.swing.JButton;
////import javax.swing.JFrame;
////import javax.swing.JLabel;
////import javax.swing.JOptionPane;
////import javax.swing.JPasswordField;
////import javax.swing.JTextField;
//
////
////public class Registration extends JFrame implements ActionListener   {
////    JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,User_Name1,Password1;  //all labels for textField
////    JTextField tf1, tf2, tf3,tf4, tf5, tf6, tf7,tf8,tf9,User_Name2;   // others fields
////    JButton btn1, btn2;  //buttons for signup and clear
////    JPasswordField Password2;
////    int ln;
////
////    Registration()
////    {
////        setVisible(true);
////        setSize(600, 700);
////        setLayout(null);
////        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        setTitle("Hostel Entry Management System");
////        l1 = new JLabel("Registration");
////        l1.setForeground(Color.blue);
////        l1.setFont(new Font("Serif", Font.BOLD, 20));
////        l2 = new JLabel("Student Name:");
////        l3 = new JLabel("Father Name");
////        l4 = new JLabel("Roll Number:");
////        l5 = new JLabel("Batch:");
////        l6 = new JLabel("Department:");
////        l7 = new JLabel("Age:");
////        l8 = new JLabel("Phone No:");
////        l9 = new JLabel("Gender:");
////        l10=new JLabel("Room Number");
////        User_Name1= new JLabel("Set User_Name");
////        Password1= new JLabel("Set Password");
////        tf1 = new JTextField();
////        tf2 = new JTextField();
////        tf3 = new JTextField();
////        tf4 = new JTextField();
////        tf5 = new JTextField();
////        tf6 = new JTextField();
////        tf7 = new JTextField();
////        tf8 = new JTextField();
////        tf9= new JTextField();
////        User_Name2=new JTextField(); 
////        Password2=new JPasswordField();
////        btn1 = new JButton("Submit");
////        btn2 = new JButton("Clear");
////        btn1.addActionListener(this);
////        btn2.addActionListener(this);
////        l1.setBounds(100, 30, 400, 30);
////        l2.setBounds(80, 70, 200, 30);
////        l3.setBounds(80, 110, 200, 30);
////        l4.setBounds(80, 150, 200, 30);
////        l5.setBounds(80, 190, 200, 30);
////        l6.setBounds(80, 230, 200, 30);
////        l7.setBounds(80, 270, 200, 30);
////        l8.setBounds(80, 310, 200, 30);
////        l9.setBounds(80, 350, 200, 30);
////        l10.setBounds(80, 390, 200, 30);
////        User_Name1.setBounds(80, 430, 200, 30);
////       Password1.setBounds(80, 470, 200, 30);
////        tf1.setBounds(300, 70, 200, 30);
////        tf2.setBounds(300, 110, 200, 30);
////        tf3.setBounds(300, 150, 200, 30);
////        tf4.setBounds(300, 190, 200, 30);
////        tf5.setBounds(300, 230, 200, 30);
////        tf6.setBounds(300, 270, 200, 30);
////        tf7.setBounds(300, 310, 200, 30);
////        tf8.setBounds(300, 350, 200, 30);
////        tf9.setBounds(300, 390, 200, 30); 
////        User_Name2.setBounds(300, 430, 200, 30);
////        Password2.setBounds(300, 470, 200, 30);
////        btn1.setBounds(50, 520, 100, 30);
////        btn2.setBounds(170, 520, 100, 30);
////        add(l1);
////        add(l2);
////        add(tf1);
////        add(l3);
////        add(tf2);
////        add(l4);
////        add(tf3);
////        add(l5);
////        add(tf4);
////        add(l6);
////        add(tf5);
////        add(l7);
////        add(tf6);
////        add(l8);
////        add(tf7);
////        add(l9);
////        add(tf8);
////        add(l10);
////        add(tf9);
////        add(User_Name1);
////        add(User_Name2);
////        add(Password1);
////        add(Password2);
////        add(btn1);
////        add(btn2);
////    }
////    public void actionPerformed(ActionEvent e)
////    {
////        String a = tf1.getText();
////        String b = tf2.getText();
////        String c = tf3.getText();
////        String d = tf4.getText();
////        String f = tf5.getText();
////        String g = tf6.getText();
////        String h = tf7.getText();
////        String i = tf8.getText();
////        String j=tf9.getText();
////        String k= User_Name2.getText();
////        String l= Password2.getText();
////
////        if (e.getSource() == btn1)
////        {
////            try{
////                DBSConnection cc = new DBSConnection();
////                String q = "INSERT INTO students (St_name,F_name,Roll_No,Batch,Department,Age,Gender,Room_No,User_Name,Password) values('"+a+"','"+b+"','"+c+"','"+d+"','"+f+"','"+g+"','"+i+"','"+j+"','"+k+"','"+l+"')";
////                cc.s.executeUpdate(q);
////                JOptionPane.showMessageDialog(null,"Details Successfully Inserted");
////                //f.setVisible(false);
////                //new Details();
////            }catch(Exception ee){
////                System.out.println("The error is:"+ee);
////            }
////        }
////        }
////
////
////    public static void main(String args[])
////    {
////        new Registration();
////    }
////
////}
////
////
//
////
//
//
//
//
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.RandomAccessFile;
//import javax.swing.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
//
//public class Registration extends JFrame implements ActionListener {
//    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, User_Name1, Password1, back,Upload;  //all labels for textField
//    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, User_Name2;   // others fields
//    JButton btn1, btn2,Picture;  //buttons for signup and clear
//    JPasswordField Password2;
//    int ln;
//    ImageIcon background;
//    Image img;
//    Image temp;
//
//    Registration() {
//
//        setSize(600, 700);
//        setLayout(null);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("Hostel Entry Management System");
//        l1 = new JLabel("Registration", JLabel.CENTER);
//        l1.setForeground(Color.decode("#243665"));
//        l1.setFont(new Font("halvetica", Font.BOLD, 25));
//        l2 = new JLabel("Student Name:");
//        l3 = new JLabel("Father Name");
//        l4 = new JLabel("Roll Number:");
//        l5 = new JLabel("Batch:");
//        l6 = new JLabel("Department:");
//        l7 = new JLabel("Age:");
//        l8 = new JLabel("Phone No:");
//        l9 = new JLabel("Gender:");
//        l10 = new JLabel("Room Number");
//        User_Name1 = new JLabel("Set User_Name");
//        Password1 = new JLabel("Set Password");
//        Upload= new JLabel("Upload");
//        tf1 = new JTextField();
//        tf2 = new JTextField();
//        tf3 = new JTextField();
//        tf4 = new JTextField();
//        tf5 = new JTextField();
//        tf6 = new JTextField();
//        tf7 = new JTextField();
//        tf8 = new JTextField();
//        tf9 = new JTextField();
//        User_Name2 = new JTextField();
//        Password2 = new JPasswordField();
//        btn1 = new JButton("Submit");
//        btn2 = new JButton("Back");
//        Picture= new JButton("Upload Picture");
//       
//        l1.setBounds(80, 10, 400, 30);
//        l2.setBounds(80, 70, 200, 30);
//        l3.setBounds(80, 110, 200, 30);
//        l4.setBounds(80, 150, 200, 30);
//        l5.setBounds(80, 190, 200, 30);
//        l6.setBounds(80, 230, 200, 30);
//        l7.setBounds(80, 270, 200, 30);
//        l8.setBounds(80, 310, 200, 30);
//        l9.setBounds(80, 350, 200, 30);
//        l10.setBounds(80, 390, 200, 30);
//        User_Name1.setBounds(80, 430, 200, 30);
//        Password1.setBounds(80, 470, 200, 30);
//        Upload.setBounds(80, 520, 200, 30);
//        tf1.setBounds(300, 70, 200, 30);
//        tf2.setBounds(300, 110, 200, 30);
//        tf3.setBounds(300, 150, 200, 30);
//        tf4.setBounds(300, 190, 200, 30);
//        tf5.setBounds(300, 230, 200, 30);
//        tf6.setBounds(300, 270, 200, 30);
//        tf7.setBounds(300, 310, 200, 30);
//        tf8.setBounds(300, 350, 200, 30);
//        tf9.setBounds(300, 390, 200, 30);
//        User_Name2.setBounds(300, 430, 200, 30);
//        Password2.setBounds(300, 470, 200, 30);
//        btn1.setBounds(50, 600, 100, 30);
//        btn1.setBackground(Color.decode("#243665"));
//        btn1.setForeground(Color.decode("#8BD8BD"));
//        btn1.setFocusable(false);
//
//        btn2.setBounds(170, 600, 100, 30);
//        btn2.setBackground(Color.decode("#243665"));
//        btn2.setForeground(Color.decode("#8BD8BD"));
//        btn2.setFocusable(false);
//        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");
//
//        Picture.setBounds(300, 520, 150, 30);
//      
//        Picture.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//            	JFileChooser file = new JFileChooser();
//                file.setCurrentDirectory(new File(System.getProperty("user.home")));
//                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png");
//                file.addChoosableFileFilter(filter);
//                int res = file.showSaveDialog(null);
//                if(res == JFileChooser.APPROVE_OPTION){
//                  File selFile = file.getSelectedFile();
//                 Picture.setText("Image Selected");
//                }
//            }
//        });
//        
//        
//        
//        // Background
//        background = new ImageIcon("F:\\DSA\\src\\HostelIn-removebg-preview.png");
//        img = background.getImage();
//        temp = img.getScaledInstance(69, 49, Image.SCALE_SMOOTH);
//        background = new ImageIcon(temp);
//        back = new JLabel("", background, JLabel.CENTER);
//        back.setLayout(null);
//        back.setBounds(130, 0, 69, 49);
//
//        this.setIconImage(icon);
//
//        this.setLocationRelativeTo(null);
//        this.getContentPane().setBackground(new Color(0x8BD8BD));
//        add(l1);
//        add(l2);
//        add(tf1);
//        add(l3);
//        add(tf2);
//        add(l4);
//        add(tf3);
//        add(l5);
//        add(tf4);
//        add(l6);
//        add(tf5);
//        add(l7);
//        add(tf6);
//        add(l8);
//        add(tf7);
//        add(l9);
//        add(tf8);
//        add(l10);
//        add(tf9);
//        add(User_Name1);
//        add(User_Name2);
//        add(Password1);
//        add(Password2);
//        add(Upload);
//        add(btn1);
//        add(btn2);
//        add(back);
//        add(Picture);
//        
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//  
//        setVisible(true);
//    }
//
//    public void actionPerformed(ActionEvent e) {
//        String a = tf1.getText();
//        String b = tf2.getText();
//        String c = tf3.getText();
//        String d = tf4.getText();
//        String f = tf5.getText();
//        String g = tf6.getText();
//        String h = tf7.getText();
//        String i = tf8.getText();
//        String j = tf9.getText();
//        String k = User_Name2.getText();
//        String l = Password2.getText();
//        String m= Picture.getText();
//
//        if (e.getSource() == btn1) {
//            try {
//                  DBSConnection cc = new DBSConnection();
//                String q = "INSERT INTO students (St_name,F_name,Roll_No,Batch,Department,Age,Gender,Room_No,User_Name,Password,Biometric) values('" + a + "','" + b + "','" + c + "','" + d + "','" + f + "','" + g + "','" + i + "','" + j + "','" + k + "','" + l + "','" + m+ "')";
//                
//                cc.s.executeUpdate(q);
//                JOptionPane.showMessageDialog(null, "Details Successfully Inserted");  
//                setVisible(false);
//            } catch (Exception ee) {
//                System.out.println("The error is:" + ee);
//            }
//        }
//        if (e.getSource() == btn2) {
//        	new Home();
//        	setVisible(false);
//        }
//    }
//
//
//    public static void main(String args[]) {
//        new Registration();
//    }
//
//}
//
//
//
//




import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Registration extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, User_Name1, Password1, back,Upload;  //all labels for textField
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9, User_Name2;   // others fields
    JButton btn1, btn2,Picture;  //buttons for signup and clear
    JPasswordField Password2;
    int ln;
    ImageIcon background;
    Image img;
    Image temp;

    Registration() {

        setSize(600, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registration Form");
        l1 = new JLabel("Registration", JLabel.CENTER);
        l1.setForeground(new Color(0x243665));
        l1.setFont(new Font("halvetica", Font.BOLD, 25));

        l2 = new JLabel("Student Name:");
        l2.setForeground(new Color(0x243665));
        l2.setFont(new Font("halvetica", Font.BOLD, 15));

        l3 = new JLabel("Father Name");
        l3.setForeground(new Color(0x243665));
        l3.setFont(new Font("halvetica", Font.BOLD, 15));

        l4 = new JLabel("Roll Number:");
        l4.setForeground(new Color(0x243665));
        l4.setFont(new Font("halvetica", Font.BOLD, 15));

        l5 = new JLabel("Batch:");
        l5.setForeground(new Color(0x243665));
        l5.setFont(new Font("halvetica", Font.BOLD, 15));

        l6 = new JLabel("Department:");
        l6.setForeground(new Color(0x243665));
        l6.setFont(new Font("halvetica", Font.BOLD, 15));

        l7 = new JLabel("Age:");
        l7.setForeground(new Color(0x243665));
        l7.setFont(new Font("halvetica", Font.BOLD, 15));

        l8 = new JLabel("Phone No:");
        l8.setForeground(new Color(0x243665));
        l8.setFont(new Font("halvetica", Font.BOLD, 15));

        l9 = new JLabel("Gender:");
        l9.setForeground(new Color(0x243665));
        l9.setFont(new Font("halvetica", Font.BOLD, 15));

        l10 = new JLabel("Room Number");
        l10.setForeground(new Color(0x243665));
        l10.setFont(new Font("halvetica", Font.BOLD, 15));

        User_Name1 = new JLabel("Set User_Name");
        User_Name1.setForeground(new Color(0x243665));
        User_Name1.setFont(new Font("halvetica", Font.BOLD, 15));

        Password1 = new JLabel("Set Password");
        Password1.setForeground(new Color(0x243665));
        Password1.setFont(new Font("halvetica", Font.BOLD, 15));

        Upload= new JLabel("Upload");
        Upload.setForeground(new Color(0x243665));
        Upload.setFont(new Font("halvetica", Font.BOLD, 15));

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();
        tf6 = new JTextField();
        tf7 = new JTextField();
        tf8 = new JTextField();
        tf9 = new JTextField();
        User_Name2 = new JTextField();
        Password2 = new JPasswordField();
        btn1 = new JButton("Submit");
        btn2 = new JButton("Back");
        Picture= new JButton("Upload Picture");

        l1.setBounds(80, 10, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        l6.setBounds(80, 230, 200, 30);
        l7.setBounds(80, 270, 200, 30);
        l8.setBounds(80, 310, 200, 30);
        l9.setBounds(80, 350, 200, 30);
        l10.setBounds(80, 390, 200, 30);
        User_Name1.setBounds(80, 430, 200, 30);
        Password1.setBounds(80, 470, 200, 30);
        Upload.setBounds(80, 520, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        tf2.setBounds(300, 110, 200, 30);
        tf3.setBounds(300, 150, 200, 30);
        tf4.setBounds(300, 190, 200, 30);
        tf5.setBounds(300, 230, 200, 30);
        tf6.setBounds(300, 270, 200, 30);
        tf7.setBounds(300, 310, 200, 30);
        tf8.setBounds(300, 350, 200, 30);
        tf9.setBounds(300, 390, 200, 30);
        User_Name2.setBounds(300, 430, 200, 30);
        Password2.setBounds(300, 470, 200, 30);

        btn1.setBounds(170, 590, 100, 40);
        btn1.setBackground(Color.decode("#243665"));
        btn1.setForeground(Color.decode("#8BD8BD"));
        btn1.setFont(new Font("halvetica", Font.BOLD, 15));
        btn1.setFocusable(false);

        btn2.setBounds(300, 590, 100, 40);
        btn2.setBackground(Color.decode("#243665"));
        btn2.setForeground(Color.decode("#8BD8BD"));
        btn2.setFont(new Font("halvetica", Font.BOLD, 15));
        btn2.setFocusable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage("src/logo.png");

        Picture.setBounds(300, 520, 150, 40);
        Picture.setBackground(Color.decode("#243665"));
        Picture.setForeground(Color.decode("#8BD8BD"));
        Picture.setFont(new Font("halvetica", Font.BOLD, 15));
        Picture.setFocusable(false);
        Picture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser file = new JFileChooser();
                file.setCurrentDirectory(new File(System.getProperty("user.home")));
                FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","png");
                file.addChoosableFileFilter(filter);
                int res = file.showSaveDialog(null);
                if(res == JFileChooser.APPROVE_OPTION){
                    File selFile = file.getSelectedFile();
                    Picture.setText("Image Selected");
                }
            }
        });



        // Background
        background = new ImageIcon("F:\\DSA\\src\\HostelIn-removebg-preview.png");
        img = background.getImage();
        temp = img.getScaledInstance(69, 49, Image.SCALE_SMOOTH);
        background = new ImageIcon(temp);
        back = new JLabel("", background, JLabel.CENTER);
        back.setLayout(null);
        back.setBounds(130, 0, 69, 49);

        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(0x8BD8BD));

        add(l1);
        add(l2);
        add(tf1);
        add(l3);
        add(tf2);
        add(l4);
        add(tf3);
        add(l5);
        add(tf4);
        add(l6);
        add(tf5);
        add(l7);
        add(tf6);
        add(l8);
        add(tf7);
        add(l9);
        add(tf8);
        add(l10);
        add(tf9);
        add(User_Name1);
        add(User_Name2);
        add(Password1);
        add(Password2);
        add(Upload);
        add(btn1);
        add(btn2);
        add(back);
        add(Picture);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String a = tf1.getText();
        String b = tf2.getText();
        String c = tf3.getText();
        String d = tf4.getText();
        String f = tf5.getText();
        String g = tf6.getText();
        String h = tf7.getText();
        String i = tf8.getText();
        String j = tf9.getText();
        String k = User_Name2.getText();
        String l = Password2.getText();
        String m= Picture.getText();

        if (e.getSource() == btn1) {
            try {
                DBSConnection cc = new DBSConnection();
                String q = "INSERT INTO students (St_name,F_name,Roll_No,Batch,Department,Age,Gender,Room_No,User_Name,Password,Biometric) values('" + a + "','" + b + "','" + c + "','" + d + "','" + f + "','" + g + "','" + i + "','" + j + "','" + k + "','" + l + "','" + m+ "')";

                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Details Successfully Inserted");
                setVisible(false);
            } catch (Exception ee) {
                System.out.println("The error is:" + ee);
            }
        }
        if (e.getSource() == btn2) {
            new Home();
            setVisible(false);
        }
    }


    public static void main(String args[]) {
        new Registration();
    }

}




