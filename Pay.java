package main;

import java.util.*;
import java.util.stream.*;
import javax.swing.*;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pay extends javax.swing.JFrame {

    /**
     * Creates new form Pay
     */
	
	//ATTRIBUTES
    private double totalPayment = 0;
    private String custID = "";
    private int counterNumber = 0;
    private int countItem = 0;

    //CUSTRUCTOR WITH PARAMETER 
    public Pay(String custID, double totalPayment, int counterNumber, int countItem) {
        this.totalPayment = totalPayment;
        this.custID = custID;
        this.counterNumber = counterNumber;
        this.countItem = countItem;
        initComponents();
        pack();
        setLocationRelativeTo(null);

        paymenttitle.setText("Payment For Customer " + custID + " COUNTER " + counterNumber);
        totalNeedPaylabel.setText("Total Price: RM " + totalPayment);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        paymenttitle = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        amountpayfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton1.setBackground(new Color(188, 143, 143));
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        jPanel6 = new javax.swing.JPanel();
        totalNeedPaylabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAYMENT");

        jPanel2.setBackground(new Color(255, 250, 205));

        paymenttitle.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        paymenttitle.setForeground(new java.awt.Color(51, 51, 51));
        paymenttitle.setText("Pay For Customer - COUNTER -");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addContainerGap(422, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paymenttitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new Color(240, 248, 255));

        jLabel3.setFont(new Font("Century Gothic", Font.BOLD, 16)); // NOI18N
        jLabel3.setText("Enter amount:");

        amountpayfield.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5Layout.setHorizontalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel5Layout.createSequentialGroup()
        					.addComponent(amountpayfield, GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
        					.addComponent(jLabel3)
        					.addGap(348))))
        );
        jPanel5Layout.setVerticalGroup(
        	jPanel5Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel5Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel3)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(amountpayfield, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel5.setLayout(jPanel5Layout);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        jButton1.setText("Pay");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });

        jPanel6.setBackground(new Color(240, 255, 240));

        totalNeedPaylabel.setFont(new Font("Century Gothic", Font.PLAIN, 24)); 
        totalNeedPaylabel.setText("Total Price: RM 0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6Layout.setHorizontalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap(285, Short.MAX_VALUE)
        			.addComponent(totalNeedPaylabel, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
        			.addGap(297))
        );
        jPanel6Layout.setVerticalGroup(
        	jPanel6Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel6Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(totalNeedPaylabel)
        			.addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6.setLayout(jPanel6Layout);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(304)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(326, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 804, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel6, GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jPanel6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(1)
        			.addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(6))
        );
        panel.setLayout(null);
        
        lblNewLabel = new JLabel("Payment Type: ");
        lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        lblNewLabel.setBounds(10, 22, 148, 34);
        panel.add(lblNewLabel);
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("CASH");
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnNewRadioButton.setBounds(194, 28, 117, 26);
        panel.add(rdbtnNewRadioButton);
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("DEBIT/CREDIT CARD");
        rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnNewRadioButton_1.setBounds(360, 26, 170, 31);
        panel.add(rdbtnNewRadioButton_1);
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("EWALLET");
        rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rdbtnNewRadioButton_2.setBounds(585, 25, 170, 31);
        panel.add(rdbtnNewRadioButton_2);
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {
    	
        //PAY AND RECEIPT PROCESS
        double amountpay = 0;
        try {
            amountpay = Double.parseDouble(amountpayfield.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter valid amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (amountpay < totalPayment) {
            JOptionPane.showMessageDialog(null, "Insufficient amount", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double balance = amountpay - totalPayment;

        //FIND CUSTOMER DATA IN QUEUE
        List<CustomerInformation> convertedCustList = null;
        if (counterNumber == 1) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter1().stream().collect(Collectors.toList());
        } else if (counterNumber == 2) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter2().stream().collect(Collectors.toList());
        } else if (counterNumber == 3) {
            convertedCustList = (List<CustomerInformation>) main.Main.getCounter3().stream().collect(Collectors.toList());
        }
        String custIC = "";
        String custName = "";
        for (Iterator iterator = convertedCustList.iterator(); iterator.hasNext();) {
            CustomerInformation nextCustomerData = (CustomerInformation) iterator.next();
            if (nextCustomerData.getCustID().equalsIgnoreCase(custID)) {
                custIC = nextCustomerData.getCustIC();
                custName = nextCustomerData.getCustName();
                break;
            }
        }

        //REMOVE CUSTOMER AND ITEM AFTER PAYMENT MADE AND SAVE ITEM LIST FOR RECEIPT DISPLAY
        Queue listItem = new LinkedList();
        for (int i = 0; i < countItem; i++) {
            if (counterNumber == 1) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter1().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter1().remove();
            } else if (counterNumber == 2) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter2().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter2().remove();
            } else if (counterNumber == 3) {
                CustomerInformation itemCurrent = (CustomerInformation) main.Main.getCounter3().peek();
                listItem.add(itemCurrent);
                main.Main.getCounter3().remove();
            }
        }

        //DISPLAY RECEIPT 
        Receipt receipt = new Receipt(custID, custIC, custName, totalPayment, amountpay, balance, listItem);
        receipt.setVisible(true);
        dispose();
    }


    // DECLARE VARIABLE 
    private javax.swing.JTextField amountpayfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel paymenttitle;
    private javax.swing.JLabel totalNeedPaylabel;
    private JLabel lblNewLabel;
}
