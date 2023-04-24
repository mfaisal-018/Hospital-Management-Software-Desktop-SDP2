


import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class HospitalManagementSystem extends JFrame implements ActionListener{

public HospitalManagementSystem ()
{
    setSize(1366,565);
    
    setLocation(20,40);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.png"));
    JLabel l1=new JLabel(i1);
    l1.setBounds(0,0,1366,565);
    add(l1);
    JLabel l2=new JLabel("Hospital Management System");
    l2.setBounds(55,430,1000,90);
    l2.setForeground(Color.red);
    l2.setFont(new Font("serif",Font.PLAIN,70));
    l1.add(l2);
   JButton b1 = new JButton("Next");
                
                b1.setBackground(Color.WHITE);
                b1.setForeground(Color.BLACK);
                  b1.setBounds(1050,460,150,50);
                  b1.setFont(new Font("serif",Font.BOLD,20));
                  b1.addActionListener(this);
                  l1.add(b1);
     setLayout(null);
    setVisible(true);
   
}

@Override
     public void actionPerformed(ActionEvent ae){
                new login().setVisible(true);
               // this.setVisible(false);
     }
                

    public static void main(String[] args) {
    
        HospitalManagementSystem window = new HospitalManagementSystem();
               window.setVisible(true);
    }
    
}
