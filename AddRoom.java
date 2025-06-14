import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener {

    JTextField t2, t5;  //TEXT FIELD
    JComboBox<String> t3, t4, t6; //SELECTION OPTION
    JButton Add, back;

    public AddRoom() {
        // Panel on Frame
        JPanel panel = new JPanel();
        panel.setBounds(5, 5, 875, 544);
        panel.setBackground(new Color(163, 101, 82));
        panel.setLayout(null);
        add(panel);

        // Heading
        JLabel l1 = new JLabel("Add Rooms");
        l1.setBounds(194, 10, 160, 22);
        l1.setFont(new Font("Tahoma", Font.BOLD, 22));
        l1.setForeground(new Color(255, 253, 208));
        panel.add(l1);

        // Room Number
        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64, 70, 152, 22);
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setForeground(new Color(255, 253, 208));
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(200, 70, 156, 20);
        t2.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t2.setForeground(new Color(163, 101, 82));
        t2.setBackground(Color.white);
        panel.add(t2);

        // Availability
        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64, 110, 152, 22);
        l3.setFont(new Font("Tahoma", Font.BOLD, 14));
        l3.setForeground(new Color(255, 253, 208));
        panel.add(l3);

        t3 = new JComboBox<>(new String[]{"Available", "Occupied"});
        t3.setBounds(200, 110, 156, 20);
        t3.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t3.setForeground(new Color(163, 101, 82));
        t3.setBackground(Color.white);
        panel.add(t3);

        // Cleaning Status
        JLabel l4 = new JLabel("Cleaning Status");
        l4.setBounds(64, 150, 152, 22);
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setForeground(new Color(255, 253, 208));
        panel.add(l4);

        t4 = new JComboBox<>(new String[]{"Cleaned", "Dirty"});
        t4.setBounds(200, 150, 156, 20);
        t4.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t4.setForeground(new Color(163, 101, 82));
        t4.setBackground(Color.white);
        panel.add(t4);

        // Price
        JLabel l5 = new JLabel("Price");
        l5.setBounds(64, 190, 152, 22);
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setForeground(new Color(255, 253, 208));
        panel.add(l5);

        t5 = new JTextField();
        t5.setBounds(200, 190, 156, 20);
        t5.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t5.setForeground(new Color(163, 101, 82));
        t5.setBackground(Color.white);
        panel.add(t5);

        // Bed Type
        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64, 230, 152, 22);
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setForeground(new Color(255, 253, 208));
        panel.add(l6);

        t6 = new JComboBox<>(new String[]{"Single bed", "Double bed"});
        t6.setBounds(200, 230, 156, 20);
        t6.setFont(new Font("Tahoma", Font.PLAIN, 14));
        t6.setForeground(new Color(163, 101, 82));
        t6.setBackground(Color.white);
        panel.add(t6);

        // Add Button
        Add = new JButton("Add");
        Add.setBounds(10, 350, 95, 30);
        Add.setBackground(Color.white);
        Add.setForeground(new Color(163, 101, 82));
        Add.setFont(new Font("Tahoma", Font.BOLD, 15));
        Add.addActionListener(this);
        panel.add(Add);

        // Back Button
        back = new JButton("Back");
        back.setBounds(150, 350, 95, 30);
        back.setBackground(Color.white);
        back.setForeground(new Color(163, 101, 82));
        back.setFont(new Font("Tahoma", Font.BOLD, 15));
        back.addActionListener(this);
        panel.add(back);

        // Image
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image = imageIcon.getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500, 60, 300, 300);
        panel.add(label);

        // Frame Setup

        setUndecorated(true);
        setLocation(20, 140);
        setLayout(null);
        setSize(885, 550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Add) {
            try {
                connect c = new connect(); // Assumes you have a connect class handling DB connection
                String room = t2.getText();
                String ava = (String) t3.getSelectedItem();
                String status = (String) t4.getSelectedItem();
                String price = t5.getText();
                String type = (String) t6.getSelectedItem();

                String q = "insert into room values('" + room + "', '" + ava + "','" + status + "','" + price + "', '" + type + "')";
                c.statement.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Room Successfully Added");
                setVisible(false);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddRoom();
    }
}
