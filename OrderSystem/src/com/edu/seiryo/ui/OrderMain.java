/*
 * OrderMain.java
 *
 * Created on __DATE__, __TIME__
 */

package com.edu.seiryo.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.seiryo.edu.entity.Menu;
import com.seiryo.edu.entity.Order;
import com.seiryo.edu.entity.OrdersDetail;
import com.seiryo.edu.entity.Users;
import com.seiryo.edu.service.MenuService;
import com.seiryo.edu.service.OrderDetailService;
import com.seiryo.edu.service.OrderService;
import com.seiryo.edu.service.UserService;

/**
 *
 * @author  __USER__
 */
public class OrderMain extends javax.swing.JFrame {

	/** Creates new form OrderMain */
	public OrderMain() {
		initComponents();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable1.setShowHorizontalLines(false);
		jTable1.setShowVerticalLines(false);

		jScrollPane1.setViewportView(jTable1);

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable2.setShowHorizontalLines(false);
		jTable2.setShowVerticalLines(false);
		jScrollPane2.setViewportView(jTable2);

		jButton1.setText("\u52a0\u5165\u8d2d\u7269\u8f66");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("\u5220\u9664");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setText("\u7ed3\u7b97");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jLabel1.setText("\u603b\u6570\u91cf");

		jTextField1.setEnabled(false);

		jLabel2.setText("\u603b\u91d1\u989d");

		jTextField2.setEnabled(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(437,
																										437,
																										437)
																								.addComponent(
																										jButton1)
																								.addGap(290,
																										290,
																										290))
																				.addGroup(
																						javax.swing.GroupLayout.Alignment.TRAILING,
																						layout.createSequentialGroup()
																								.addContainerGap(
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										jLabel1)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jTextField1,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										100,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
																.addGap(60, 60,
																		60)
																.addComponent(
																		jLabel2)
																.addGap(18, 18,
																		18)
																.addComponent(
																		jTextField2))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(34, 34,
																		34)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(98, 98,
																		98)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addComponent(
																										jButton2)
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										jButton3))
																				.addComponent(
																						jScrollPane2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(49, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(71, 71, 71)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														309,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jScrollPane2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														341,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(2, 2, 2)
																.addComponent(
																		jButton1)
																.addGap(53, 53,
																		53)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jButton2)
																				.addComponent(
																						jButton3)))
												.addGroup(
														layout.createSequentialGroup()
																.addGap(31, 31,
																		31)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jLabel1)
																				.addComponent(
																						jLabel2)
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addContainerGap(54, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
		//GEN-END:initComponents


	private void formWindowOpened(java.awt.event.WindowEvent evt) {
		List<Menu> menu = service.queryAll();
		this.vHead1 = new Vector();
		this.vData1 = new Vector();
		vHead1.add("序号");
		vHead1.add("套餐名称");
		vHead1.add("套餐描述");
		vHead1.add("套餐价格");
		for (Menu i : menu) {
			Vector vMenu = new Vector();
			vMenu.add(i.getMenu_id());
			vMenu.add(i.getName());
			vMenu.add(i.getDescribe());
			vMenu.add(i.getUnit_price());
			vData1.add(vMenu);
		}
		this.dtm = new DefaultTableModel(vData1, vHead1);
		this.jTable1.setModel(dtm);
		//清空第二个表，不然会空数组
		DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
		this.vHead2 = new Vector();
		this.vData2 = new Vector();
		vHead2.add("套餐序号");
		vHead2.add("套餐名称");
		vHead2.add("套餐数量");
		vHead2.add("套餐单价");
		vHead2.add("套餐金额");
		DefaultTableModel model2 = new DefaultTableModel(vData2, vHead2);
		jTable2.setModel(model2);
	}
	/*
	 * 结算商品，存入sql
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = jTable1.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(this, "请添加商品后再结算！");
			return;
		}
		int totalAmount = 0;
		int totalPrice = 0;
		DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
		for (int i = 0; i < jTable2.getRowCount(); i++) {
			int amount = (Integer) model.getValueAt(i, 2); // 数量
			int price = (Integer) model.getValueAt(i, 4); // 总金额
			totalAmount += amount;
			totalPrice += price;
		}
		int userId = userService.iUser().getId();
		order = new Order(totalAmount, totalPrice, "未处理",userId);
		or_service.insertOrder(order);
		for (int i = 0; i < jTable2.getRowCount(); i++) {
			int menu_id = (Integer) jTable2.getValueAt(i, 0);
			int amount = (Integer) jTable2.getValueAt(i, 2);
			OrdersDetail dt = new OrdersDetail();
			dt.setMenu_id(menu_id);
			dt.setOrder_id(order.getOrder_id());
			dt.setAmount(amount);
			dt_service.insertOrderDetail(dt);
		}
		jTextField1.setText("");
		jTextField2.setText("");
		JOptionPane.showMessageDialog(this,
				"订单提交成功，请记住您的订单号" + order.getOrder_id());
	}
	/*
	 * 添加购物车
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = this.jTable1.getSelectedRow();
		if (row == -1) {
			jPane.showMessageDialog(this, "请选择菜品！");
			return;
		}
		int menu_id = (Integer) jTable1.getValueAt(row, 0);
		String name = (String) jTable1.getValueAt(row, 1);
		int unit_price = (Integer) jTable1.getValueAt(row, 3);
		int quantity = 1;
		// 查找表格中是否已经有该菜品
		for (int i = 0; i < jTable2.getRowCount(); i++) {
			if (menu_id == (Integer) jTable2.getValueAt(i, 0)) {
				quantity = (Integer) jTable2.getValueAt(i, 2) + 1;
				jTable2.setValueAt(quantity, i, 2);
				jTable2.setValueAt(quantity * unit_price, i, 4);
				updateTotal();
				return;
			}
		}
		// 新增行到表格
		DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
		model.addRow(new Object[] { menu_id, name, quantity, unit_price,
				unit_price * quantity });
		updateTotal();
	}

	/*
	 * 更新总价格
	 */
	private void updateTotal() {
		int totalAmount = 0;
		int totalPrice = 0;
		DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
		for (int i = 0; i < model.getRowCount(); i++) {
			int amount = (Integer) model.getValueAt(i, 2); // 数量
			int price = (Integer) model.getValueAt(i, 4); // 总金额
			totalAmount += amount;
			totalPrice += price;
		}
		System.out.println(totalAmount + "" + totalPrice);
		jTextField1.setText(String.valueOf(totalAmount));
		jTextField2.setText(String.valueOf(totalPrice));
	}

	/*
	 * 删除
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = jTable2.getSelectedRow();
		if (row == -1) {
			JOptionPane.showMessageDialog(this, "请选择要删除的菜品！");
			return;
		}
		DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
		model.removeRow(row);
		updateTotal();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new OrderMain().setVisible(true);
			}
		});
	}

	UserService userService = new UserService();
	Order order = null;
	OrderService or_service = new OrderService();
	OrderDetailService dt_service = new OrderDetailService();
	Vector subMenu = new Vector();
	JOptionPane jPane = new JOptionPane();
	Vector vHead1 = null;
	Vector vData1 = null;
	Vector vHead2 = null;
	Vector vData2 = null;
	DefaultTableModel dtm = null;
	MenuService service = new MenuService();
	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}