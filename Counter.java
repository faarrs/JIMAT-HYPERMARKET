package main;

import java.awt.event.*;
import java.util.*;
import java.util.stream.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Counter extends javax.swing.JFrame {
    private int counterNumber = 0;

    /**
     * Creates new form CounterUI
     */
    public Counter(int counterNumber) {
        this.counterNumber = counterNumber;
        initComponents();
        pack();
        setLocationRelativeTo(null);
        counterlabel.setText("Counter " + counterNumber);
        
        if (counterNumber == 1) {
            displayCustomer(main.Main.getCounter1());
        } else if (counterNumber == 2) {
            displayCustomer(main.Main.getCounter2());
        } else if (counterNumber == 3) {
            displayCustomer(main.Main.getCounter3());
        }
    }

    private void displayCustomer(Queue counter) {
    	
        String currentCustID = "";
        DefaultTableModel customerTableModel = (DefaultTableModel) customerTable.getModel();
        customerTableModel.setRowCount(0);
        //TO CONVERT, NEED TO FILTER CUSTOMER ONLY AND ADD TO NEW LIST
        List<CustomerInformation> convertedCustList = (List<CustomerInformation>) counter.stream().collect(Collectors.toList());

        int custCount = 0;
        for (Iterator iterator = convertedCustList.iterator(); iterator.hasNext();) {
            CustomerInformation nextCustomerData = (CustomerInformation) iterator.next();
            if (!nextCustomerData.getCustID().equalsIgnoreCase(currentCustID)) {
                currentCustID = nextCustomerData.getCustID();
                custCount++;
                customerTableModel.addRow(new Object[]{nextCustomerData.getCustID(), nextCustomerData.getCustIC(), nextCustomerData.getCustName()});
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        counterlabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jButton2 = new javax.swing.JButton();
        jButton2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        jButton2.setBackground(new Color(240, 248, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Counter");

        jPanel2.setBackground(new Color(240, 230, 140));

        counterlabel.setFont(new Font("Century Gothic", Font.PLAIN, 25)); // NOI18N
        counterlabel.setText("Counter 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counterlabel)
                .addContainerGap(713, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(counterlabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("PAY");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Customer Item");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        
        panel = new JPanel();
        panel.setBackground(new Color(245, 245, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jButton2)
        			.addPreferredGap(ComponentPlacement.RELATED, 530, Short.MAX_VALUE)
        			.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(panel, GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton2)
        				.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        panel.setLayout(null);
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane1.setBounds(10, 11, 806, 337);
        panel.add(jScrollPane1);
        customerTable = new javax.swing.JTable();
        
                customerTable.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
        
                    },
                    new String [] {
                        "Customer ID", "Customer IC", "Name"
                    }
                ) {
                    boolean[] canEdit = new boolean [] {
                        false, false, false
                    };
        
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
                jScrollPane1.setViewportView(customerTable);
        getContentPane().setLayout(layout);

        pack();
    }

    private Pay payment;
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
    	
        //PAYING PROCESS
        if (payment == null) {
        	
            //GET FIRST QUEUE FOR CUSTOMER
        	
            CustomerInformation datacust = null;
            if (counterNumber == 1) {
                datacust = (CustomerInformation) main.Main.getCounter1().peek();
            } else if (counterNumber == 2) {
                datacust = (CustomerInformation) main.Main.getCounter2().peek();
            } else if (counterNumber == 3) {
                datacust = (CustomerInformation) main.Main.getCounter3().peek();
            }
            if (datacust == null) {
                JOptionPane.showMessageDialog(null, "No customer queue to pay", "No Customer", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String custIDPay = datacust.getCustID();
            double totalPayment = 0;

            List<CustomerInformation> convertedItemList = null;
            List<CustomerInformation> filteredItemListCust = null;
            if (counterNumber == 1) {
                convertedItemList = (List<CustomerInformation>) main.Main.getCounter1().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            } else if (counterNumber == 2) {
                convertedItemList = (List<CustomerInformation>) main.Main.getCounter2().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            } else if (counterNumber == 3) {
                convertedItemList = (List<CustomerInformation>) main.Main.getCounter3().stream().collect(Collectors.toList());
                filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custIDPay)).collect(Collectors.toList());
            }

            int countitem = 0;
            for (Iterator iterator = filteredItemListCust.iterator(); iterator.hasNext();) {
                CustomerInformation nextItemData = (CustomerInformation) iterator.next();
                countitem++;
                //CALCULATE TOTAL PAYMENT HERE
                totalPayment = totalPayment + nextItemData.getitemPrice();
            }

            payment = new Pay(custIDPay, totalPayment, counterNumber, countitem);
            payment.setVisible(true);
            payment.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosed(WindowEvent e) {
                    if (counterNumber == 1) {
                        displayCustomer(main.Main.getCounter1());
                    } else if (counterNumber == 2) {
                        displayCustomer(main.Main.getCounter2());
                    } else if (counterNumber == 3) {
                        displayCustomer(main.Main.getCounter3());
                    }
                    payment = null;
                }

            });
        } else {
            payment.setVisible(true);
        }
    }

    Map<String, ItemsList> itemInstance = new TreeMap<String, ItemsList>();
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {

        String custID = JOptionPane.showInputDialog("ENTER CUSTOMER ID: ");
        ItemsList getItemUI = itemInstance.get("items" + custID);
        if (getItemUI == null) {
            ItemsList newItemUI = new ItemsList(custID, counterNumber);
            itemInstance.put("items" + custID, newItemUI);
            newItemUI.setVisible(true);
        } else {
            getItemUI.setVisible(true);
        }
    }

    // DECLARE VARIABLE 
    private javax.swing.JLabel counterlabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private JPanel panel;
    // END DECLARATION VARIABLE

}
