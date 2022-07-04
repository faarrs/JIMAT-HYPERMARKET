package main;

import java.util.*;
import java.util.stream.*;
import javax.swing.table.*;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class ItemsList extends javax.swing.JFrame {
    private String custID;
    private int counterNumber = 0;
    private double totalPayment = 0;

    public ItemsList(String custID, int counterNumber) {
        this.custID = custID;
        this.counterNumber = counterNumber;
        initComponents();
        itemtitlelabel.setText("List Item for Customer " + custID);
        pack();
        setLocationRelativeTo(null);
        displayItem();
    }

    private void displayItem() {
        DefaultTableModel itemTableModel = (DefaultTableModel) itemTable.getModel();
        itemTableModel.setRowCount(0);
        
        //TO CONVERT, NEED TO FILTER ITEM ONLY AND ADD TO NEW LIST
        List<CustomerInformation> convertedItemList = null;
        List<CustomerInformation> filteredItemListCust = null;
        if (counterNumber == 1) {
            convertedItemList = (List<CustomerInformation>) main.Main.getCounter1().stream().collect(Collectors.toList());
            filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custID)).collect(Collectors.toList());
        } else if (counterNumber == 2) {
            convertedItemList = (List<CustomerInformation>) main.Main.getCounter2().stream().collect(Collectors.toList());
            filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custID)).collect(Collectors.toList());
        } else if (counterNumber == 3) {
            convertedItemList = (List<CustomerInformation>) main.Main.getCounter3().stream().collect(Collectors.toList());
            filteredItemListCust = convertedItemList.stream().filter(items -> items.getCustID().equalsIgnoreCase(custID)).collect(Collectors.toList());
        }

        countlabelitem.setText(filteredItemListCust.size() + " Items");

        for (Iterator iterator = filteredItemListCust.iterator(); iterator.hasNext();) {
            CustomerInformation nextItemData = (CustomerInformation) iterator.next();
            
            //TO CALCULATE TOTAL PAYMENT
            totalPayment = totalPayment + nextItemData.getitemPrice();
            itemTableModel.addRow(new Object[]{nextItemData.getItemID(), nextItemData.getItemName(), "RM " + nextItemData.getitemPrice(), nextItemData.getDate()});
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        itemtitlelabel = new javax.swing.JLabel();
        countlabelitem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ITEM");

        jPanel2.setBackground(new Color(250, 235, 215));

        itemtitlelabel.setFont(new java.awt.Font("sansserif", 0, 18)); 
        itemtitlelabel.setText("List For -");

        countlabelitem.setFont(new java.awt.Font("Segoe UI", 1, 14));
        countlabelitem.setText("0 Items");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemtitlelabel)
                    .addComponent(countlabelitem))
                .addContainerGap(569, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemtitlelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(countlabelitem)
                .addContainerGap())
        );

        //TO CREATE NEW TABLE
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    // DECLARE VARIABLE
    private javax.swing.JLabel countlabelitem;
    private javax.swing.JTable itemTable;
    private javax.swing.JLabel itemtitlelabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // DECLARE VARIABLE END

}
