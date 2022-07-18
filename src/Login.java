import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel implements ActionListener{
	
	//User label + text field
	JLabel userL = new JLabel("Username:");
	JTextField userTF = new JTextField();
	
	//Password label + text field
	JLabel passL = new JLabel("Password:");
	JPasswordField passTF = new JPasswordField();
	
	
	JPanel loginP = new JPanel(new GridLayout(3,2));
	JPanel panel = new JPanel ();
	
	JButton login = new JButton("Login");
	JButton register = new JButton("Register");
			
	CardLayout cl;
	
	
	Login(){
		setLayout(new CardLayout());
		loginP.add(userL);
		loginP.add(userTF);
		loginP.add(passL);
		loginP.add(passTF);
		
		login.addActionListener(this);
		register.addActionListener(this);
		
		loginP.add(login);
		loginP.add(register);
		
		panel.add(loginP);
		add(panel, "login");
		
		cl = (CardLayout)getLayout();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Protected Text Editor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		Login login = new Login();
		frame.add(login);
		frame.setVisible(true);
	}

}
