import javax.swing.*;
import java.awt.*;


public class splash extends JFrame{
    splash(){
        //selecting image on frame...
        ImageIcon imageicon= new ImageIcon(ClassLoader.getSystemResource("icon/my logo.gif"));
        Image i2=imageicon.getImage().getScaledInstance(680,480,Image.SCALE_DEFAULT);
        JLabel lable= new JLabel(imageicon);
        lable.setBounds(-10,-40,680,480);
        add(lable);


       // Set the size and location of frame on screen..
        setLayout(null);
        setLocation(240,80);
      setSize(680,480);
      setVisible(true);


      //Visibal frame for 5 second
        try{
            Thread.sleep(5500); //FOR FRAME CLOSING...
            new login();// after 5 second move to login page so we use this.
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        new splash();
    }
}
