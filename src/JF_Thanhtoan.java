import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JF_Thanhtoan extends JFrame {

	private JPanel contentPane;
	private JTextField txt_maSP;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Thanhtoan frame = new JF_Thanhtoan();
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
	public JF_Thanhtoan() {
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
		
		JLabel lbl_maSP = new JLabel("Mã Sản Phẩm");
		lbl_maSP.setBounds(6, 44, 99, 16);
		panel.add(lbl_maSP);
		
		txt_maSP = new JTextField();
		txt_maSP.setBounds(117, 39, 194, 26);
		panel.add(txt_maSP);
		txt_maSP.setColumns(10);
		
		JButton btn_them = new JButton("Thêm");
		btn_them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JF_Sanpham sp = new JF_Sanpham();
			}
		});
		btn_them.setBounds(327, 39, 117, 29);
		panel.add(btn_them);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 146, 438, 84);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lbl_thanhtien = new JLabel("Thành Tiền ");
		lbl_thanhtien.setBounds(214, 242, 79, 16);
		panel.add(lbl_thanhtien);
		
		JLabel lbl_tt = new JLabel("");
		lbl_tt.setForeground(Color.RED);
		lbl_tt.setBounds(327, 242, 61, 16);
		panel.add(lbl_tt);
		
		JButton btn_Thoat = new JButton("Thoát");
		btn_Thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JF_quanli ql =new JF_quanli();
				ql.setVisible(true);
			}
		});
		btn_Thoat.setBounds(327, 107, 117, 29);
		panel.add(btn_Thoat);
	}

}
