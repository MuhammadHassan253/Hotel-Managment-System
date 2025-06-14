import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddEmployee extends JFrame implements ActionListener{

    JTextField nameText ,ageText, salaryText, phoneText,cnicText,emailTxet; //the cube where we write data

    JComboBox gender1, job1;  //for selection in multiple options
    JButton Add,back; //buttons
    AddEmployee(){

        //panel size on fram .....
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,540);
        panel.setLayout(null);
        panel.setBackground(new Color(163, 101, 82));
        add(panel);

        //DISPLAY EMPLOYY ON PANEL
        JLabel l1 = new JLabel("Add Employee");
        l1.setBounds(194, 10, 160, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setForeground(new Color(255, 253, 208));
        panel.add(l1);

        //DISPLAY NAME
        JLabel name= new JLabel("Name");
        name.setBounds(60,45,150,27);
        name.setFont(new Font("serif",Font.BOLD,17));
        name.setForeground(new Color(255, 253, 208));
        panel.add(name);

        //THE BOX FOR ENTRING DATA IN IT
        nameText=new JTextField();
        nameText.setBounds(200 ,45,150,27);
        nameText.setBackground(Color.white);
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(new Color(163, 101, 82));
        panel.add(nameText);


        //DISPLAY AGE
        JLabel age= new JLabel("Age");
        age.setBounds(60,85,150,27);
        age.setFont(new Font("serif",Font.BOLD,17));
        age.setForeground(new Color(255, 253, 208));
        panel.add(age);

        ageText=new JTextField();
        ageText.setBounds(200 ,85,150,27);
        ageText.setBackground(Color.white);
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setForeground(new Color(163, 101, 82));
        panel.add(ageText);

        //DISPLAY GENDER
        JLabel gender= new JLabel("Gender");
        gender.setBounds(60,125,150,27);
        gender.setFont(new Font("serif",Font.BOLD,17));
        gender.setForeground(new Color(255, 253, 208));
        panel.add(gender);

        gender1=new JComboBox<>(new String[]{"Male","Female"});
        gender1.setBounds(200 ,125,150,27);
        gender1.setBackground(new Color(163, 101, 82));
        gender1.setFont(new Font("Tahoma",Font.BOLD,14));
        gender1.setForeground(new Color(255, 253, 208));
        panel.add(gender1);


        //DISPLAY JOB
        JLabel Job= new JLabel("Jobs");
        Job.setBounds(60,165,150,27);
        Job.setFont(new Font("serif",Font.BOLD,17));
        Job.setForeground(new Color(255, 253, 208));
        panel.add(Job);

        //SHOWING HOW MANY JOBS OFFER IN OUR HOTEL
        job1=new JComboBox<>(new String[]{"Front Desk","HouseKeeping","Kitchen Staff","Room Service","Manager","Accountet","Chef"});
        job1.setBounds(200 ,165,150,27);
        job1.setBackground(new Color(163, 101, 82));
        job1.setFont(new Font("Tahoma",Font.BOLD,14));
        job1.setForeground(new Color(255, 253, 208));
        panel.add(job1);


        //DISPLAY SALARY
        JLabel Salary= new JLabel("Salary");
        Salary.setBounds(60,205,150,27);
        Salary.setFont(new Font("serif",Font.BOLD,17));
        Salary.setForeground(new Color(255, 253, 208));
        panel.add(Salary);

        salaryText=new JTextField();
        salaryText.setBounds(200 ,205,150,27);
        salaryText.setBackground(Color.white);
        salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
        salaryText.setForeground(new Color(163, 101, 82));
        panel.add(salaryText);


        //DISPLAY PHONE NUMBER
        JLabel phone= new JLabel("Phone Number");
        phone.setBounds(60,245,150,27);
        phone.setFont(new Font("serif",Font.BOLD,17));
        phone.setForeground(new Color(255, 253, 208));
        panel.add(phone);

        phoneText=new JTextField();
        phoneText.setBounds(200 ,245,150,27);
        phoneText.setBackground(Color.white);
        phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
        phoneText.setForeground(new Color(163, 101, 82));
        panel.add(phoneText);


        //DISPLAY CNICN NUMBER
        JLabel cnic= new JLabel("Cnin Number");
        cnic.setBounds(60,285,150,27);
        cnic.setFont(new Font("serif",Font.BOLD,17));
        cnic.setForeground(new Color(255, 253, 208));
        panel.add(cnic);

        cnicText=new JTextField();
        cnicText.setBounds(200 ,285,150,27);
        cnicText.setBackground(Color.white);
        cnicText.setFont(new Font("Tahoma",Font.BOLD,14));
        cnicText.setForeground(new Color(163, 101, 82));
        panel.add(cnicText);

        //DISPLAY EMAIL...
        JLabel email= new JLabel("Email");
        email.setBounds(60,325,150,27);
        email.setFont(new Font("serif",Font.BOLD,17));
        email.setForeground(new Color(255, 253, 208));
        panel.add(email);

        emailTxet=new JTextField();
        emailTxet.setBounds(200 ,325,150,27);
        emailTxet.setBackground(Color.white);
        emailTxet.setFont(new Font("Tahoma",Font.BOLD,14));
        emailTxet.setForeground(new Color(163, 101, 82));
        panel.add(emailTxet);


        //DISPLAY ADD BUTTON
        Add = new JButton("Add");
        Add.setBounds(30, 375, 95, 30);
        Add.setBackground(Color.white);
        Add.setForeground(new Color(163, 101, 82));
        Add.setFont(new Font("Tahoma", Font.BOLD, 15));
        Add.addActionListener(this);
        panel.add(Add);

        // Back Button
        back = new JButton("Back");
        back.setBounds(150, 375, 95, 30);
        back.setBackground(Color.white);
        back.setForeground(new Color(163, 101, 82));
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        panel.add(back);

        //DISPLAY IMAGE ON PANEL
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);




        //FRAME SIZE AND LOCATION
        setUndecorated(true);
        setLocation(20,140);
        setLayout(null);
        setSize(900,550);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== Add){
            String name=nameText.getText();
            String age=ageText.getText();
            String gender=(String) gender1.getSelectedItem();
            String job=(String) job1.getSelectedItem();
            String salary=salaryText.getText();
            String phone=phoneText.getText();
            String email=emailTxet.getText();
            String cnic=cnicText.getText();


            //DATABASE CONNECTION
            try {
              connect c=new connect();
              String q="insert into employee values('"+ name+"','"+ age+"','"+ gender+"','"+ job+"','"+ salary+"','"+ phone+"','"+ email+"','"+ cnic+"')";
              c.statement.executeUpdate(q);
              JOptionPane.showMessageDialog(null,"Employee Added");
              setVisible(false);

            }catch (Exception E ){
                E.printStackTrace();
            }


        }else {
            setVisible(false);
        }
    }

    public static void main(String[] args){
        new AddEmployee();
    }
}
