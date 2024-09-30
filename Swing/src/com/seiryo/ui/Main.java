/*
 * Enter.java
 *
 * Created on __DATE__, __TIME__
 */

package com.seiryo.ui;

import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.seiryo.edu.entity.Users;
import com.seiryo.edu.service.UserService;
import com.seiryo.edu.service.imp.UserServiceImp;

/**
 *
 * @author  __USER__
 */
public class Main extends javax.swing.JFrame {

	private Vector vDate;

	/** Creates new form Enter */
	public Main() {
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

		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jTextField3 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowOpened(java.awt.event.WindowEvent evt) {
				formWindowOpened(evt);
			}
		});

		jTextField1.setEditable(false);

		jTextField2.setEditable(false);

		jButton1.setText("\u4fee\u6539");
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

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jTable1.setColumnSelectionAllowed(true);
		jTable1.setShowHorizontalLines(false);
		jTable1.setShowVerticalLines(false);
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(35, 35, 35)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(
																		jButton2)
																.addComponent(
																		jButton1))
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(
																		jTextField2,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		95,
																		Short.MAX_VALUE)
																.addComponent(
																		jTextField3,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		95,
																		Short.MAX_VALUE)
																.addComponent(
																		jTextField1,
																		javax.swing.GroupLayout.Alignment.LEADING,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		95,
																		Short.MAX_VALUE)))
								.addGap(68, 68, 68)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGap(60, 60, 60)
								.addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(62, 62, 62)
								.addComponent(jTextField2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(53, 53, 53)
								.addComponent(jTextField3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(52, 52, 52)
								.addComponent(jButton1)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										51, Short.MAX_VALUE)
								.addComponent(jButton2).addGap(48, 48, 48))
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(27, Short.MAX_VALUE)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)));

		pack();
	}// </editor-fold>
		//GEN-END:initComponents

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		int row = this.jTable1.getSelectedRow();
		if (row >= 0) {
			this.jTextField1.setText(this.jTable1.getValueAt(row, 0) + "");
			this.jTextField2.setText(this.jTable1.getValueAt(row, 1) + "");
			this.jTextField3.setText(this.jTable1.getValueAt(row, 2) + "");
		}
	}

	private void formWindowOpened(java.awt.event.WindowEvent evt) {
		setTable();
	}

	private void setTable() {
		List<Users> list = service.queryAllUsers();
		this.vHead = new Vector();
		this.vDate = new Vector();
		vHead.add("���");
		vHead.add("����");
		vHead.add("����");
		for (int i = 0; i < list.size(); i++) {
			Users users = list.get(i);
			Vector VectorUsers = new Vector();
			VectorUsers.add(users.getId());
			VectorUsers.add(users.getName());
			VectorUsers.add(users.getPassword());
			vDate.add(VectorUsers);
		}
		this.dtm = new DefaultTableModel(vDate, vHead);
		this.jTable1.setModel(dtm);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = this.jTable1.getSelectedRow();
		if (row == -1) {
			return;
		}
		int id = (Integer) this.jTable1.getValueAt(row, 0);
		boolean bo = service.deleteUserInfo(id);
		if (bo) {
			JOptionPane.showMessageDialog(this, "ɾ���ɹ�");
			setTable();
		}
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int row = this.jTable1.getSelectedRow();
		if (row == -1) {
			return;
		}
		String pwd = this.jTextField3.getText();
		if ("".equals(pwd)) {
			return;
		}
		int id = (Integer) this.jTable1.getValueAt(row, 0);
		boolean bo = service.updatePwd(pwd, id);
		if (bo) {
			JOptionPane.showMessageDialog(this, "�޸ĳɹ�");
			setTable();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	Vector vHead = null;
	Vector vData = null;
	DefaultTableModel dtm = null;
	UserServiceImp service = new UserService();
	JOptionPane jPane = new JOptionPane();
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}