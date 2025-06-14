import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ConcurrentHashMap;

public class addDriver extends JFrame  implements ActionListener {

    JTextField nameText,ageText, carText,carNText,locText;

    JComboBox gender1,avalibal1;

    JButton Add,back;

    addDriver(){
        //Creating panel on frame
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setLayout(null);
        panel.setBackground(new Color(163, 101, 82));
        add(panel);

        //DISPLAY DRIVER
        JLabel l1 = new JLabel("Add Drivers");
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

        //DISPLAY CAR COMPNEY
        JLabel Carc= new JLabel("Car Compney");
        Carc.setBounds(60,165,150,27);
        Carc.setFont(new Font("serif",Font.BOLD,17));
        Carc.setForeground(new Color(255, 253, 208));
        panel.add(Carc);

        carText=new JTextField();
        carText.setBounds(200 ,165,150,27);
        carText.setBackground(Color.white);
        carText.setFont(new Font("Tahoma",Font.BOLD,14));
        carText.setForeground(new Color(163, 101, 82));
        panel.add(carText);

        //DISPLAY CAR NAME
        JLabel CarN= new JLabel("Car Name");
        CarN.setBounds(60,205,150,27);
        CarN.setFont(new Font("serif",Font.BOLD,17));
        CarN.setForeground(new Color(255, 253, 208));
        panel.add(CarN);

        carNText=new JTextField();
        carNText.setBounds(200 ,205,150,27);
        carNText.setBackground(Color.white);
        carNText.setFont(new Font("Tahoma",Font.BOLD,14));
        carNText.setForeground(new Color(163, 101, 82));
        panel.add(carNText);

        //DISPLAY GENDER
        JLabel Avalibal= new JLabel("Avalibility");
        Avalibal.setBounds(60,245,150,27);
        Avalibal.setFont(new Font("serif",Font.BOLD,17));
        Avalibal.setForeground(new Color(255, 253, 208));
        panel.add(Avalibal);

        avalibal1=new JComboBox<>(new String[]{"Yes","No"});
        avalibal1.setBounds(200 ,245,150,27);
        avalibal1.setBackground(new Color(163, 101, 82));
        avalibal1.setFont(new Font("Tahoma",Font.BOLD,14));
        avalibal1.setForeground(new Color(255, 253, 208));
        panel.add(avalibal1);

        //DISPLAY CAR LOCATION
        JLabel loc= new JLabel(" Location");
        loc.setBounds(60,285,150,27);
        loc.setFont(new Font("serif",Font.BOLD,17));
        loc.setForeground(new Color(255, 253, 208));
        panel.add(loc);

        locText=new JTextField();
        locText.setBounds(200 ,285,150,27);
        locText.setBackground(Color.white);
        locText.setFont(new Font("Tahoma",Font.BOLD,14));
        locText.setForeground(new Color(163, 101, 82));
        panel.add(locText);

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
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);


        //CREATING FRAM ON SCREEN
        setUndecorated(true);
        setLocation(15,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Add) {

            String name = nameText.getText();
            String age = ageText.getText();
            String gender = (String) gender1.getSelectedItem();
            String company = carText.getText();
            String carname = carNText.getText();
            String avalible = (String) avalibal1.getSelectedItem();
            String location = locText.getText();

            try {

                connect c= new connect();
                String q="insert into driver values('"+ name+"','"+ age+"','"+ gender+"','"+ company+"','"+ carname+"','"+ avalible+"','"+ location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Added");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }

        } else {
            setVisible(false);

        }
    }

    public static void main(String[] arrgs){
        new addDriver();
    }
}
