import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField txt_user;
	private JPasswordField txt_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_dangnhap = new JLabel("Đăng Nhập");
		lbl_dangnhap.setBounds(203, 50, 77, 16);
		panel.add(lbl_dangnhap);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(23, 94, 77, 16);
		panel.add(lblNewLabel);
		
		JLabel lbl_Password = new JLabel("Password");
		lbl_Password.setBounds(23, 122, 61, 16);
		panel.add(lbl_Password);
		
		txt_user = new JTextField();
		txt_user.setBounds(112, 89, 307, 26);
		panel.add(txt_user);
		txt_user.setColumns(10);
		
		txt_pass = new JPasswordField();
		txt_pass.setBounds(112, 117, 307, 26);
		panel.add(txt_pass);
		//đặt pass vs mk
		JButton btn_login = new JButton("login");
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = txt_user.getText();
				String pass = txt_pass.getText();
				if(user.equals("admin") && pass.equals("1234"))
				{
					JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
					//
					JF_quanli ql= new JF_quanli();
					ql.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Tài khoản hoặc mật khẩu bị sai");
				}
			}
		});
		btn_login.setBounds(177, 155, 117, 29);
		panel.add(btn_login);
	}
}
