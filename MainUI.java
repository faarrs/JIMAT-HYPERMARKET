package main;
import java.io.*;
import java.util.*;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form HomeUI
     */
    public MainUI() {
    	getContentPane().setForeground(new Color(176, 224, 230));
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private CounterChoose counterchoose;

    //TEMPORARY LIST TO ASSIGN COUNTER LIST QUEUE
    private ArrayList<CustomerInformation> customerList = new ArrayList();
    private ArrayList<String> listCustID = new ArrayList<String>();

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN");
        setBackground(new java.awt.Color(255, 255, 255));
        
        panel = new JPanel();
        panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel.setBackground(new Color(240, 255, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(62)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 725, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(27)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(23, Short.MAX_VALUE))
        );
        panel.setLayout(null);
        jButton1 = new javax.swing.JButton();
        jButton1.setFont(new Font("Century Gothic", Font.PLAIN, 18));
        jButton1.setBounds(189, 352, 368, 38);
        panel.add(jButton1);
        
                jButton1.setBackground(new Color(255, 255, 255));
                jButton1.setText("START");
                        
                        lblNewLabel = new JLabel("");
                        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\FARAHSYAHIRAH\\Dropbox\\PC\\Downloads\\Green Cart Icon Grocery Logo (3)-modified.png"));
                        lblNewLabel.setBounds(229, 53, 290, 288);
                        panel.add(lblNewLabel);
                jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseReleased(java.awt.event.MouseEvent evt) {
                        jButton1MouseReleased(evt);
                    }
                });
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    //GET ONLY SELECTED ITEM BY CUSTOMER ID TO ADD TO COUNTER
    public List filteritemdatacust(String custID) {
        Predicate<CustomerInformation> itemSelectCondition = itemsCond -> itemsCond.getCustID().equalsIgnoreCase(custID);
        List itemsCustomer = customerList.stream().filter(itemSelectCondition).collect(Collectors.toList());
        return itemsCustomer;
    }
    
    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {
        jButton1.setEnabled(false);
        
        //1. READ TEXTFILE AND ADD TO TEMPORARY ARRAY
        try {
            BufferedReader br = new BufferedReader(new FileReader("hypermarket.txt"));
            String line = br.readLine();

            String customerID = "";
            String customerIC = "";
            String customerName = "";
            String currentCustID = "";
            
            while (line != null) {
            	
                //READ DATA EACH LINE
                StringTokenizer st = new StringTokenizer(line, ",");
                customerID = st.nextToken();
                customerIC = st.nextToken();
                customerName = st.nextToken();
                String itemID = st.nextToken();
                String itemName = st.nextToken();
                double itemPrice = Double.parseDouble(st.nextToken());
                String date = st.nextToken();
                if (!customerID.equalsIgnoreCase(currentCustID)) {
                    listCustID.add(customerID);
                    currentCustID = customerID;
                }

                //QUESTION 2
                customerList.add(new CustomerInformation(customerID, customerIC, customerName, null, itemID, itemName, itemPrice, date));

                line = br.readLine();
            }
            br.close();

            //QUESTION 3
            //ADD TO NEW QUEUE
            int counterswitching = 1;
            for (int i = 0; i < listCustID.size(); i++) {
                List filtereditemcustomer = filteritemdatacust(listCustID.get(i));

                if (filtereditemcustomer.size() <= 5) {
                    if (counterswitching == 1) {
                        for (int j = 0; j < filtereditemcustomer.size(); j++) {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String date = itemdata.getDate();

                            main.Main.getCounter1().add(new CustomerInformation(custID, custIC, custName, "counter1", itemID, itemName, itemPrice, date));
                        }
                        counterswitching = 2;
                    } else if (counterswitching == 2) {
                        for (int j = 0; j < filtereditemcustomer.size(); j++) {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String date = itemdata.getDate();

                            main.Main.getCounter2().add(new CustomerInformation(custID, custIC, custName, "counter2", itemID, itemName, itemPrice, date));

                        }
                        counterswitching = 1;
                    }
                } else {
                    for (int j = 0; j < filtereditemcustomer.size(); j++) {
                        CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                        String custID = itemdata.getCustID();
                        String custIC = itemdata.getCustIC();
                        String custName = itemdata.getCustName();
                        String itemID = itemdata.getItemID();
                        String itemName = itemdata.getItemName();
                        Double itemPrice = itemdata.getitemPrice();
                        String date = itemdata.getDate();

                        main.Main.getCounter3().add(new CustomerInformation(custID, custIC, custName, "counter3", itemID, itemName, itemPrice, date));

                    }
                }
            }

            counterchoose = new CounterChoose();
            counterchoose.setVisible(true);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
            e.printStackTrace();
        }
    }


    // DECLARE VARIABLE
    private javax.swing.JButton jButton1;
    private JPanel panel;
    private JLabel lblNewLabel;
    // END DECLARE VARIABLE

}
