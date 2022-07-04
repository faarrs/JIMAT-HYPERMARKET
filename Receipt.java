package main;
import java.util.*;
import javax.swing.table.*;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;

public class Receipt extends javax.swing.JFrame {

	//CONSTRUCTOR WITH PARAMETER
    public Receipt(String custID, String custIC, String custName, double totalAmount, double paidAmount, double balance, Queue listItem) {
        initComponents();
        pack();
        setLocationRelativeTo(null);

        //TO DISPLAY ALL DATA
        custNamelabel.setText("Customer Name: " + custName);
        custIDlabel.setText("Customer ID: " + custID);
        custIClabel.setText("Customer IC: " + custIC);
        paymenttitle.setText("Receipt " + custID);
        totalAmountlabel.setText("Total Price: RM " + totalAmount);
        paidlabel.setText("Customer Paid: RM " + paidAmount);
        balancelabel.setText("Balance: RM " + balance);

        //TO DISPLAY ITEM IN TABLE
        DefaultTableModel receiptTableModel = (DefaultTableModel) itemReceiptTable.getModel();
        for (Iterator iterator = listItem.iterator(); iterator.hasNext();) {
            CustomerInformation customeritemdata = (CustomerInformation) iterator.next();
            receiptTableModel.addRow(new Object[]{customeritemdata.getItemName(), "RM " + customeritemdata.getitemPrice(), customeritemdata.getDate()});
        }
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        custNamelabel = new javax.swing.JLabel();
        custIClabel = new javax.swing.JLabel();
        custIDlabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        paymenttitle = new javax.swing.JLabel();
        totalAmountlabel = new javax.swing.JLabel();
        paidlabel = new javax.swing.JLabel();
        balancelabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RECEIPT");

        custNamelabel.setFont(new Font("Times New Roman", Font.PLAIN, 15)); // NOI18N
        custNamelabel.setText("CUSTOMER NAME: ");

        custIClabel.setFont(new Font("Times New Roman", Font.PLAIN, 15)); // NOI18N
        custIClabel.setText("CUST IC");

        custIDlabel.setFont(new Font("Times New Roman", Font.PLAIN, 15)); // NOI18N
        custIDlabel.setText("CUST ID");

        jPanel2.setBackground(new Color(240, 248, 255));

        paymenttitle.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        paymenttitle.setForeground(new Color(0, 0, 0));
        paymenttitle.setText("Receipt - Customer");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        totalAmountlabel.setFont(new Font("Times New Roman", Font.PLAIN, 18)); 
        totalAmountlabel.setText("Total Price: RM 0");

        paidlabel.setFont(new Font("Times New Roman", Font.PLAIN, 16)); 
        paidlabel.setText("Customer Paid: RM 0");

        balancelabel.setFont(new Font("Times New Roman", Font.PLAIN, 16)); 
        balancelabel.setText("Balance: RM 0");
        
        panel = new JPanel();
        panel.setBackground(new Color(255, 248, 220));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(custNamelabel)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(custIClabel)
        						.addComponent(custIDlabel)
        						.addComponent(totalAmountlabel)
        						.addComponent(paidlabel)
        						.addComponent(balancelabel))
        					.addContainerGap(535, Short.MAX_VALUE))))
        		.addComponent(panel, GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(custNamelabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(custIClabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(custIDlabel)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
        			.addGap(29)
        			.addComponent(totalAmountlabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(paidlabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(balancelabel)
        			.addContainerGap(16, Short.MAX_VALUE))
        );
        panel.setLayout(null);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(10, 11, 684, 334);
        panel.add(jScrollPane1);
        itemReceiptTable = new javax.swing.JTable();
        
        		//TO CREATE TABLE
                itemReceiptTable.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
        
                    },
                    new String [] {
                        "Item Name", "Item Price", "Date"
                    }
                ));
                jScrollPane1.setViewportView(itemReceiptTable);
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    //DECLARE VARIABLE
    private javax.swing.JLabel balancelabel;
    private javax.swing.JLabel custIClabel;
    private javax.swing.JLabel custIDlabel;
    private javax.swing.JLabel custNamelabel;
    private javax.swing.JTable itemReceiptTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel paidlabel;
    private javax.swing.JLabel paymenttitle;
    private javax.swing.JLabel totalAmountlabel;
    private JPanel panel;
    // END VARIABLE VARIFICATION

}
