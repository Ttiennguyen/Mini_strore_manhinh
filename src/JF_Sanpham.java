import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JF_Sanpham extends JFrame {

	private JPanel contentPane;
	private JTextField txt_maSP;
	private JTextField txt_tenSP;
	private JTextField txt_soluong;
	private JTextField txt_sotien;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_Sanpham frame = new JF_Sanpham();
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
	public JF_Sanpham() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 313);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_maSP = new JLabel("Mã Sản Phẩm");
		lbl_maSP.setBounds(6, 58, 88, 16);
		contentPane.add(lbl_maSP);
		
		txt_maSP = new JTextField();
		txt_maSP.setBounds(106, 53, 229, 26);
		contentPane.add(txt_maSP);
		txt_maSP.setColumns(10);
		
		JLabel lbl_tenSP = new JLabel("Tên Sản Phẩm");
		lbl_tenSP.setBounds(6, 85, 88, 16);
		contentPane.add(lbl_tenSP);
		
		txt_tenSP = new JTextField();
		txt_tenSP.setBounds(106, 80, 229, 26);
		contentPane.add(txt_tenSP);
		txt_tenSP.setColumns(10);
		
		JLabel lbl_soSL = new JLabel("Số lượng");
		lbl_soSL.setBounds(6, 111, 88, 16);
		contentPane.add(lbl_soSL);
		
		txt_soluong = new JTextField();
		txt_soluong.setBounds(106, 106, 229, 26);
		contentPane.add(txt_soluong);
		txt_soluong.setColumns(10);
		
		txt_sotien = new JTextField();
		txt_sotien.setBounds(106, 135, 229, 26);
		contentPane.add(txt_sotien);
		txt_sotien.setColumns(10);
		
		JLabel lbl_giatien = new JLabel("Giá tiền ");
		lbl_giatien.setBounds(6, 140, 61, 16);
		contentPane.add(lbl_giatien);
		model = new DefaultTableModel();
		// add tên hàng vs cột vào bảng 
		Object[] column = {"Mã Sản Phẩm","Tên Sản Phẩm","Số Lượng","Giá tiền"};
		Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 175, 438, 104);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = table.getSelectedRow();
				txt_maSP.setText(model.getValueAt(i, 0).toString());
				txt_tenSP.setText(model.getValueAt(i, 1).toString());
				txt_soluong.setText(model.getValueAt(i, 2).toString());
				txt_sotien.setText(model.getValueAt(i, 3).toString());
			
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		JButton btn_themSP = new JButton("Thêm SP");
		btn_themSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// lenh để trống hiện thông báo điền đầy đủ
				if(txt_maSP.getText().equals("") || txt_tenSP.getText().equals("") || txt_soluong.getText().equals("") ||txt_sotien.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Hãy điền đầy đủ");
				}
				else 
				{
				row[0] = txt_maSP.getText();
				row[1] = txt_tenSP.getText();
				row[2] = txt_soluong.getText();
				row[3] = txt_sotien.getText();
				model.addRow(row);
				
				
				
				
				txt_maSP.setText("");
				txt_tenSP.setText("");
				txt_soluong.setText("");
				txt_sotien.setText("");
				JOptionPane.showMessageDialog(null,"Lưu thành công");
				}
			}
		});
		btn_themSP.setBounds(327, 53, 117, 29);
		contentPane.add(btn_themSP);
		
		JButton btn_XoaSP = new JButton("Xoá SP");
		btn_XoaSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				if(i>=0)
				{
					model.removeRow(i);
					JOptionPane.showMessageDialog(null,"Xoá thành công");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"bạn chưa chọn xoá");
				}
			}
		});
		btn_XoaSP.setBounds(327, 80, 117, 29);
		contentPane.add(btn_XoaSP);
		
		JButton btn_update = new JButton("Update");
		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = table.getSelectedRow();
				model.setValueAt(txt_maSP.getText(), i, 0);
				model.setValueAt(txt_tenSP.getText(), i, 1);
				model.setValueAt(txt_soluong.getText(), i, 2);
				model.setValueAt(txt_sotien.getText(), i, 3);
			}
		});
		btn_update.setBounds(327, 106, 117, 29);
		contentPane.add(btn_update);
		
		JButton btn_exit = new JButton("exit");
		btn_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JF_quanli ql =new JF_quanli();
				ql.setVisible(true);
			}
		});
		btn_exit.setBounds(327, 135, 117, 29);
		contentPane.add(btn_exit);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 450, 285);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_SP = new JLabel("Sản Phẩm ");
		lbl_SP.setBounds(178, 6, 69, 35);
		panel.add(lbl_SP);
	}
}
