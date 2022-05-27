import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

public class LoginForm extends JFrame{
    public void window(){

        //frame.add(jlabel);
        JFrame frame = new JFrame("Login");
        setDefaultCloseOperation(3);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        JLabel jlabel=new JLabel("Name");
        jlabel.setBounds(10,10,100,20);
        frame.add(jlabel);

        JLabel jlavel=new JLabel("Name");
    }

    
}


