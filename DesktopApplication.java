package array;
import javax.swing.*;
import java.awt.event.*;

public class DesktopApplication{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Management System");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("Roll No:");
        JLabel l3 = new JLabel("Course:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton btn = new JButton("Save");

        l1.setBounds(30, 30, 80, 25);
        t1.setBounds(120, 30, 150, 25);

        l2.setBounds(30, 70, 80, 25);
        t2.setBounds(120, 70, 150, 25);

        l3.setBounds(30, 110, 80, 25);
        t3.setBounds(120, 110, 150, 25);

        btn.setBounds(100, 160, 80, 30);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(btn);

        frame.setSize(330, 260);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

       
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	 String name = t1.getText();
                 String roll = t2.getText();
                 String course = t3.getText();

                 JOptionPane.showMessageDialog(frame,
                         "Name: " + name + "\nRoll No: " + roll + "\nCourse: " + course);
             }
         });
     }
 }