import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JF_quanli extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_quanli frame = new JF_quanli();
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
	public JF_quanli() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 450, 272);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Quanli = new JLabel("Quản Lí");
		lbl_Quanli.setBounds(192, 6, 53, 16);
		panel.add(lbl_Quanli);
		// link vs jf_sanpham
		JButton btn_SanPham = new JButton("Sản Phẩm");
		btn_SanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JF_Sanpham sp = new JF_Sanpham();
				sp.setVisible(true);
			}
		});
		btn_SanPham.setBounds(31, 37, 169, 44);
		panel.add(btn_SanPham);
		
		JButton btn_Nhanvien = new JButton("Nhân Viên");
		btn_Nhanvien.setBounds(236, 37, 169, 44);
		panel.add(btn_Nhanvien);
		
		JButton btn_Thanhtoan = new JButton("Thanh Toán");
		btn_Thanhtoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JF_Thanhtoan tt = new JF_Thanhtoan();
				tt.setVisible(true);
			}
		});
		btn_Thanhtoan.setBounds(31, 100, 169, 44);
		panel.add(btn_Thanhtoan);
		
		JButton btn_Exit = new JButton("Thoát");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login lg = new login();
				lg.setVisible(true);
			}
		});
		btn_Exit.setBounds(236, 93, 169, 44);
		panel.add(btn_Exit);
	}

}
