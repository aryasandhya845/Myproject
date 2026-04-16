package desktopapploication;


	import javax.swing.*;
	import java.awt.event.*;

	public class LoginForm {

	    public static void main(String[] args) {

	        JFrame frame = new JFrame("Login Form");

	        JLabel l1 = new JLabel("Username:");
	        JLabel l2 = new JLabel("Password:");

	        JTextField t1 = new JTextField();
	        JPasswordField t2 = new JPasswordField();

	        JButton btn = new JButton("Login");

	        l1.setBounds(30, 40, 80, 25);
	        t1.setBounds(120, 40, 150, 25);

	        l2.setBounds(30, 80, 80, 25);
	        t2.setBounds(120, 80, 150, 25);

	        btn.setBounds(100, 130, 80, 30);

	        frame.add(l1);
	        frame.add(t1);
	        frame.add(l2);
	        frame.add(t2);
	        frame.add(btn);

	        frame.setSize(330, 230);
	        frame.setLayout(null);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);

	       
	        btn.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	                String username = t1.getText();
	                String password = new String(t2.getPassword());

	                if(username.equals("admin") && password.equals("1234")) {
	                    JOptionPane.showMessageDialog(frame, "Login Successful");
	                } else {
	                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
	                }
	            }
	        });
	    }
	}


