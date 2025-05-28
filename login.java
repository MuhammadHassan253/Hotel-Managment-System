import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JTextField textField1;    //Fram for username
    JPasswordField passwordField1; //Fram for passward..

    JButton b1,b2; //Buttons for login and clear.

    login(){
      //size and location of lable1                                                   //lables will show every lable on frame
        JLabel lable1= new JLabel("Username");
        setFont(new Font("Tahoma",Font.BOLD,17));
        lable1.setBounds(35,20,100,30);
        lable1.setForeground(new Color(255, 253, 208));
        add(lable1);

        //Size and location of lable2
        JLabel lable2= new JLabel("Password");
        setFont(new Font("Tahoma",Font.BOLD,17));
        lable2.setBounds(35,70,100,30);
        lable2.setForeground(new Color(255,253,208));
        add(lable2);

       // Text field arrangment for username ...
        textField1= new JTextField();
        textField1.setBounds(120,20,150,30);
        textField1.setForeground(new Color(163, 101, 82));
        textField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField1.setBackground(Color.white);
        add(textField1);

        passwordField1=new JPasswordField();
        passwordField1.setBounds(120,70,150,30);
        passwordField1.setForeground(new Color(163, 101, 82));
        passwordField1.setFont(new Font("Tahoma",Font.PLAIN,15));
        passwordField1.setBackground(Color.WHITE);
        add(passwordField1);


        //add image in background of login
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/my logo.gif"));
        Image i1=imageIcon.getImage().getScaledInstance(350,300,Image.SCALE_DEFAULT);
        JLabel lable=new JLabel(imageIcon);
        lable.setBounds(270,0,350,300);
        add(lable);

        //Login button
        b1=new JButton("Login");
        b1.setBounds(40,170,85,24);
        b1.setFont(new Font("serif",Font.PLAIN,15));
        b1.setBackground(Color.WHITE);
        b1.setForeground(new Color(163, 101, 82));
        b1.addActionListener(this);
        add(b1);

        //Cancel button
        b2=new JButton("Cancel");
        b2.setBounds(160,170,85,24);
        b2.setFont(new Font("serif",Font.PLAIN,15));
        b2.setBackground(Color.white);
        b2.setForeground(new Color(163, 101, 82));
        b2.addActionListener(this);
        add(b2);


       getContentPane().setBackground(new Color(163, 101, 82)); //colour of background of login page.
       //Size and location of login page
        setLayout(null);
        setLocation(340,180);
        setSize(600,300);
        setVisible(true);
    }


    //override the action button
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource() ==b1){
       try {
           connect c=new connect();
           String user = textField1.getText();  //store the user name
           String pass = passwordField1.getText(); //store the passward..

           //check that the usrname and password given by user is avalibal in database table or not.
           String q= "select * from login where username ='"+user+"' and password ='"+pass+"'";
           ResultSet resultSet= c.statement.executeQuery(q);  //execution query to check that input is valid or not

           if(resultSet.next()){
               new Dashboard(); //move from login page to dashboard
               setVisible(false);
           }
           else {
               JOptionPane.showMessageDialog(null,"Invalid"); //if input does not match..
           }


       }catch (Exception E){
           E.printStackTrace();
       }
      }
      else{
        System.exit(102);
      }
    }



    public static void main(String[] args){
       new login();
    }
}
