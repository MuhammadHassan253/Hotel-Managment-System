import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Drivers, logout, back;

    admin(){
        //EMPLOYEE BUTTON
        add_Employee =new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(200,180,200,30);
        add_Employee.setBackground(Color.white);
        add_Employee.setForeground(Color.black);
        add_Employee.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        //ROOM BUTTON
        add_Room =new JButton("ADD ROOM");
        add_Room.setBounds(200,330,200,30);
        add_Room.setBackground(Color.white);
        add_Room.setForeground(Color.black);
        add_Room.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);

        //DRIVER BUTTON
        add_Drivers =new JButton("ADD DRIVERS");
        add_Drivers.setBounds(200,480,200,30);
        add_Drivers.setBackground(Color.white);
        add_Drivers.setForeground(Color.black);
        add_Drivers.setFont(new Font("Tahoma",Font.BOLD,15));
        add_Drivers.addActionListener(this);
        add(add_Drivers);

         //LOGOUT BUTTON
        logout=new JButton("Logout");
        logout.setBounds(10,600,95,30);
        logout.setBackground(Color.white);
        logout.setForeground(Color.black);
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);

         //BACK BUTTON
        back=new JButton("Back");
        back.setBounds(110,600,95,30);
        back.setBackground(Color.white);
        back.setForeground(Color.black);
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        add(back);

        // IMAGE OF ADD EMPLOYEE ...
        ImageIcon l1= new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image l11=l1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(l11);
        JLabel label= new JLabel(imageIcon); //ADD IMAGE ON FRAM
        label.setBounds(70,110,120,120);   //LOCATION OF IMAGE ON FRAM
        add(label); //ADD IMAGE ON FRAM..

        //IMAGE FOR ROOM
        ImageIcon l12= new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image l111=l12.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon IMAGEIcon=new ImageIcon(l111);
        JLabel label1= new JLabel(IMAGEIcon); //ADD IMAGE ON FRAM
        label1.setBounds(70,265,120,120);   //LOCATION OF IMAGE ON FRAM
        add(label1); //ADD IMAGE ON FRAM..

        //IMAGE FOR DRIVER
        ImageIcon l123= new ImageIcon(ClassLoader.getSystemResource("icon/driver.png"));
        Image l1111=l123.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon IMAGEICON =new ImageIcon(l1111);
        JLabel label11= new JLabel(IMAGEICON); //ADD IMAGE ON FRAM
        label11.setBounds(70,420,120,120);   //LOCATION OF IMAGE ON FRAM
        add(label11); //ADD IMAGE ON FRAM..

        ImageIcon l1234= new ImageIcon(ClassLoader.getSystemResource("icon/my logo.gif"));
        Image l11111=l1234.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon IMAGEICON1 =new ImageIcon(l11111);
        JLabel label111= new JLabel(IMAGEICON1); //ADD IMAGE ON FRAM
        label111.setBounds(900,250,300,300);   //LOCATION OF IMAGE ON FRAM
        add(label111); //ADD IMAGE ON FRAM..


        getContentPane().setBackground(new Color(163, 101, 82)); //BACKGROUNG COLOUR OF FRAM..
        setLayout(null);
      setSize(1950,1090);
      setVisible(true); // FOR SHOWING FRAME..
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== add_Employee){
            new AddEmployee();
        } else if (e.getSource()== add_Room) {
          new AddRoom();
        }
        else if (e.getSource()== add_Drivers) {
           new addDriver();
        }
        else if (e.getSource()== logout) {
            System.exit(99);
        }
        else if (e.getSource()==back) {
            new Dashboard();
            setVisible(false);
        }

    }

    public static void main(String[] args){
        new admin();
    }
}
