import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener{
     JButton add,rec; //For adding buttons on dashboard..


    Dashboard(){
        super("Hotel Managment System"); //Title on dashboard..

        //reception button..
        rec=new JButton("RECEPTION");
        rec.setBounds(320,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(153, 168, 25));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);//when we click on button it will switch to Reception page.
        add(rec);

        add=new JButton("ADMIN");
        add.setBounds(760,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(153, 168, 25));
        add.setForeground(Color.WHITE);
        add.addActionListener(this); //when we click on button it will switch to Admin page..
        add(add);

        //Image of Admin
        ImageIcon i2= new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));//chosingimage from computer
        Image i3=i2.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT); // setvadio img on admin button
        ImageIcon imageIcon11= new ImageIcon(i3);// set image on admin button
        JLabel label1=new JLabel(imageIcon11);//placing camand
        label1.setBounds(733,300,200,195);//for excet location
        add(label1);

        //RECEPTION IMAGE
        ImageIcon i22= new ImageIcon(ClassLoader.getSystemResource("icon/receptionlogo.jpeg"));//chosingimage from computer
        Image i33=i22.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT); // setvadio img on Reception button
        ImageIcon imageIcon111= new ImageIcon(i33);// set image on Reception button
        JLabel label11=new JLabel(imageIcon111);//placing camand
        label11.setBounds(291,300,200,195);//for excet location
        add(label11);



       //vadio for Fram
        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("icon/Paris.gif"));//chosingimage from computer
        Image i1=imageIcon.getImage().getScaledInstance(1370,800,Image.SCALE_DEFAULT); // setvadio size on fram
        ImageIcon imageIcon1= new ImageIcon(i1);// set image on fram
        JLabel label=new JLabel(imageIcon1);//placing camand
        label.setBounds(-380,-190,1950,1090);//for excet locations
        add(label);

       //Fram size on screen...
        setLayout(null);
        setSize(1950,1090);
        setVisible(true); // visable fram on screen...

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //when clock on reception button do this one
     if(e.getSource()==rec){
          new Reception();
     }else if (e.getSource()==add){
         new admin();


     }
    }

    public static void main(String[] args){
        new Dashboard();
    }
}
