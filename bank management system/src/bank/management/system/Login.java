package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");
        
        setLayout(null);
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons.logo.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//to scale image we need Image class
//        ImageIcon i3= new ImageIcon(i2); //since Jlabel only takes Imageicon as argument, we convert image to imageicon.
//        JLabel label = new JLabel(i3); //to place image on the frame
//        label.setBounds(70,10,100,100);
//        add(label); //adding to frame

         JLabel text = new JLabel("Welcome to the Bank");
         text.setBounds(200,40,400,40);
         add(text);
         
         JLabel cardno = new JLabel("Enter the card number: ");
         cardno.setBounds(120,150,150,30);
         add(cardno);
         cardTextField = new JTextField();
         cardTextField.setBounds(300,150,250,30);
         add(cardTextField);
         
         JLabel pin = new JLabel("Enter the PIN: ");
         pin.setBounds(120,220,250,30);
         add(pin);
         pinTextField = new JPasswordField();
         pinTextField.setBounds(300,220,250,30);
         add(pinTextField);
         
         
         login = new JButton("Sign in");
         login.setBounds(300,300,100,30);
         login.addActionListener(this);
         add(login);
         
         
         clear = new JButton("Clear");
         clear.setBounds(430,300,100,30);
         clear.addActionListener(this);
         add(clear);
         
         signup = new JButton("Sign up");
         signup.setBounds(300,350,230,30);
         signup.addActionListener(this);
         add(signup);
         
         
         getContentPane().setBackground(Color.WHITE);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()== login){
            
        }else if(ae.getSource()==signup){
            
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}
