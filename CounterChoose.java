package main;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CounterChoose extends javax.swing.JFrame {

    public CounterChoose() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(new Color(255, 255, 255));
        jButton1.setBackground(new Color(188, 143, 143));
        jButton1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        jButton1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton2.setForeground(new Color(255, 255, 255));
        jButton2.setBackground(new Color(188, 143, 143));
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton3.setForeground(new Color(255, 255, 255));
        jButton3.setBackground(new Color(188, 143, 143));
        jButton3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Counter Selector");

        jPanel2.setBackground(new Color(240, 255, 240));

        jLabel1.setFont(new Font("Century Gothic", Font.PLAIN, 22)); // NOI18N
        jLabel1.setText("COUNTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        jPanel1.setBackground(new Color(240, 248, 255));

        jLabel5.setFont(new Font("Arial", Font.PLAIN, 23)); // NOI18N
        jLabel5.setText("Counter 1");

        jButton1.setText("OPEN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\FARAHSYAHIRAH\\Dropbox\\PC\\Downloads\\output-onlinepngtools.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(18)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel5)
        			.addGap(233)
        			.addComponent(jButton1)
        			.addGap(54))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(40)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton1)
        						.addComponent(jLabel5))))
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel3.setBackground(new Color(240, 255, 255));

        jLabel4.setFont(new Font("Arial", Font.PLAIN, 23)); // NOI18N
        jLabel4.setText("Counter 2");

        jButton2.setText("OPEN");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\FARAHSYAHIRAH\\Dropbox\\PC\\Downloads\\output-onlinepngtools.png"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3Layout.setHorizontalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel4)
        			.addPreferredGap(ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
        			.addComponent(jButton2)
        			.addGap(60))
        );
        jPanel3Layout.setVerticalGroup(
        	jPanel3Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel3Layout.createSequentialGroup()
        			.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(27)
        					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel3Layout.createSequentialGroup()
        					.addGap(41)
        					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton2)
        						.addComponent(jLabel4))))
        			.addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3.setLayout(jPanel3Layout);

        jPanel4.setBackground(new Color(255, 250, 205));

        jLabel3.setFont(new Font("Arial", Font.PLAIN, 23)); // NOI18N
        jLabel3.setText("Counter 3");

        jLabel6.setText("Customer have more than 5 item");

        jButton3.setText("OPEN");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\FARAHSYAHIRAH\\Dropbox\\PC\\Downloads\\output-onlinepngtools.png"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4Layout.setHorizontalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addContainerGap())
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addComponent(jLabel3)
        					.addPreferredGap(ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
        					.addComponent(jButton3)
        					.addGap(55))))
        );
        jPanel4Layout.setVerticalGroup(
        	jPanel4Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel4Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(jPanel4Layout.createSequentialGroup()
        					.addGap(21)
        					.addGroup(jPanel4Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel3)
        						.addComponent(jButton3))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel6)))
        			.addContainerGap())
        );
        jPanel4.setLayout(jPanel4Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel4, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE)
        				.addComponent(jPanel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        				.addComponent(jPanel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(43, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
        			.addGap(29)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        			.addGap(26)
        			.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        			.addGap(28)
        			.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        			.addGap(65))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    Counter counterGUI1;
    Counter counterGUI2;
    Counter counterGUI3;
    
    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {
    	
        //OPEN COUNTER 1
        if(counterGUI1 != null){
            counterGUI1.setVisible(true);
        }else{
            counterGUI1 = new Counter(1);
            counterGUI1.setVisible(true);
        }
    }

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {
    	
        //OPEN COUNTER 2
        if(counterGUI2 != null){
            counterGUI2.setVisible(true);
        }else{
            counterGUI2 = new Counter(2);
            counterGUI2.setVisible(true);
        }
    }

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {
    	
        //OPEN FOR COUNTER 3
        if(counterGUI3 != null){
            counterGUI3.setVisible(true);
        }else{
            counterGUI3 = new Counter(3);
            counterGUI3.setVisible(true);
        }
    }

    // DECLARE VARIABLE
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    // END DECLARE VARIABLE

}
