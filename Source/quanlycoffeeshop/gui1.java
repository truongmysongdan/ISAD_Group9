/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlycoffeeshop;
import database.databaseHelper;
import java.sql.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tung Le
 */
public class gui1 extends javax.swing.JFrame {

    /**
     * Creates new form gui1
     */
    int SUM=0;
    DefaultTableModel model;
    public gui1() {
        initComponents();
        setVisible(true);
        pushCategory();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        saleBtn = new com.k33ptoo.components.KButton();
        invoiceBtn = new com.k33ptoo.components.KButton();
        customerBtn = new com.k33ptoo.components.KButton();
        revenueBtn = new com.k33ptoo.components.KButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        categorybox = new javax.swing.JComboBox<>();
        namebox = new javax.swing.JComboBox<>();
        quantity = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        totalTXT = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        received = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        addbtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsale = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1016, 563));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 51, 0));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_java_100px_1.png"))); // NOI18N

        saleBtn.setForeground(new java.awt.Color(255, 51, 0));
        saleBtn.setText("Sales management");
        saleBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saleBtn.setkEndColor(new java.awt.Color(0, 0, 0));
        saleBtn.setkForeGround(new java.awt.Color(204, 0, 51));
        saleBtn.setkHoverEndColor(new java.awt.Color(0, 204, 51));
        saleBtn.setkHoverStartColor(new java.awt.Color(255, 51, 255));
        saleBtn.setkStartColor(new java.awt.Color(255, 255, 255));
        saleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleBtnActionPerformed(evt);
            }
        });

        invoiceBtn.setForeground(new java.awt.Color(0, 0, 0));
        invoiceBtn.setText("Invoice managerment");
        invoiceBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invoiceBtn.setkEndColor(new java.awt.Color(0, 0, 0));
        invoiceBtn.setkForeGround(new java.awt.Color(0, 0, 0));
        invoiceBtn.setkSelectedColor(new java.awt.Color(153, 153, 153));
        invoiceBtn.setkStartColor(new java.awt.Color(255, 255, 255));
        invoiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceBtnActionPerformed(evt);
            }
        });

        customerBtn.setText("Customer management");
        customerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerBtn.setkEndColor(new java.awt.Color(0, 0, 0));
        customerBtn.setkForeGround(new java.awt.Color(0, 0, 0));
        customerBtn.setkStartColor(new java.awt.Color(255, 255, 255));
        customerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerBtnActionPerformed(evt);
            }
        });

        revenueBtn.setText("revenue statistic");
        revenueBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        revenueBtn.setkEndColor(new java.awt.Color(0, 0, 0));
        revenueBtn.setkForeGround(new java.awt.Color(0, 0, 0));
        revenueBtn.setkStartColor(new java.awt.Color(255, 255, 255));
        revenueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revenueBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NGUYEN DUY");

        jLabel3.setText("Manager");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_male_user_60px.png"))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(73, 73, 73))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 38, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(revenueBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(saleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(invoiceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(customerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(saleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(invoiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(customerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(revenueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5)))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jPanel1.add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 590));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 590));

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(475, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1377, 0, -1, 563));

        categorybox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoryboxItemStateChanged(evt);
            }
        });
        categorybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryboxActionPerformed(evt);
            }
        });
        getContentPane().add(categorybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 112, 110, 30));

        getContentPane().add(namebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 112, 160, 30));
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 112, 80, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("SALES MANAGEMENT");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 210, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel10.setText("Total money :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel11.setText("Received :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel12.setText("Change");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        totalTXT.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        totalTXT.setText("0đ");
        getContentPane().add(totalTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 140, -1));

        change.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        change.setText("0đ");
        getContentPane().add(change, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 120, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setText("Status:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Unpaid");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, -1));

        received.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        received.setText("0");
        received.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                receivedInputMethodTextChanged(evt);
            }
        });
        received.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receivedActionPerformed(evt);
            }
        });
        received.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                receivedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                receivedKeyTyped(evt);
            }
        });
        getContentPane().add(received, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 120, 20));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_pay_50px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 50, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_print_50px.png"))); // NOI18N
        jButton2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton2MouseMoved(evt);
            }
        });
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, -1, 50));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 153));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));

        addbtn.setBackground(new java.awt.Color(255, 255, 204));
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_joyent_35px.png"))); // NOI18N
        addbtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        jLabel16.setText("Quantity");

        jLabel17.setText("Add");

        jLabel8.setText("Name:");

        jLabel6.setText("Category: ");

        tblsale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "item", "quantity", "unit", "price", "amount"
            }
        ));
        jScrollPane1.setViewportView(tblsale);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_exit_40px_1.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setText("exit");

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel16)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addGap(0, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 680, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saleBtnActionPerformed

    private void customerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerBtnActionPerformed
        new gui2();
        setVisible(false);
    }//GEN-LAST:event_customerBtnActionPerformed

    private void receivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receivedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receivedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseMoved
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton2MouseMoved

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
            }//GEN-LAST:event_jButton2MouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void categoryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryboxActionPerformed

    private void invoiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceBtnActionPerformed
        new gui5();
        setVisible(false);
    }//GEN-LAST:event_invoiceBtnActionPerformed

    private void revenueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revenueBtnActionPerformed
        new gui6();
        setVisible(false);
    }//GEN-LAST:event_revenueBtnActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        model = (DefaultTableModel)tblsale.getModel();
        int quan=(int)quantity.getValue();
        if (quan==0) JOptionPane.showMessageDialog(this, "Quantity is 0 !");
        else{
                int total = quan*getprice();
            Object[] ob = new Object[]{
                    namebox.getSelectedItem(),quantity.getValue(),getUnit(),getprice(),total
                };
            SUM+=total;
            model.addRow(ob);
            String money= String.valueOf(SUM);
            totalTXT.setText(money);
        }
        
        
        
        
        

    }//GEN-LAST:event_addbtnActionPerformed

    private void categoryboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoryboxItemStateChanged
        namebox.removeAllItems();
        pushProductName();
    }//GEN-LAST:event_categoryboxItemStateChanged

    private void receivedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_receivedKeyTyped
                //System.out.println("gg");
    }//GEN-LAST:event_receivedKeyTyped

    private void receivedInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_receivedInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_receivedInputMethodTextChanged

    private void receivedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_receivedKeyReleased
        int total = Integer.parseInt(totalTXT.getText());
        int received = Integer.parseInt(this.received.getText());
        change.setText(""+(received-total));

    }//GEN-LAST:event_receivedKeyReleased

// lấy data đơn vị của sản phẩm trên combobox
    public String getUnit(){
        Connection conn = null;
        ResultSet rs = null;
        Statement sttm = null;
        String pdn = String.valueOf(namebox.getSelectedItem());
        try {
            String SQL = "select unit \n" +
"from product \n" +
"where ProductName= '"+pdn+"'";
            conn=databaseHelper.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(SQL);
            if (rs.next()) return rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // lấy data đơn vị của sản phẩm trên combobox
        public int getprice(){
        Connection conn = null;
        ResultSet rs = null;
        Statement stm = null;
        String pdn = String.valueOf(namebox.getSelectedItem());
        String s;
        try {
            String SQL =  "select dprice \n" +
"from product \n" +
"where ProductName= '"+pdn+"'"; ;
            conn = databaseHelper.getDBConnect();
            stm = conn.createStatement();
            rs = stm.executeQuery(SQL);
            if (rs.next()) return rs.getInt(1);
        } catch (Exception e) {
        }
        return -1;
    }
// lấy dữ liệu từ bảng category để đẩy vào combobox
    public List<String> getCategoryList(){
        Connection conn = null;
        ResultSet rs = null;
        Statement stm = null;
        List<String> data = new ArrayList<String>();
        try {
            String SQL =  "select distinct CategoryName from ProductCategory "  ;
            conn = databaseHelper.getDBConnect();
            stm = conn.createStatement();
            rs = stm.executeQuery(SQL);
            while (rs.next()){
                data.add(rs.getString(1));
            }
            return data;
        } catch (Exception e) {
        }
        return null;
    }
    // lay data từ bảng sản phẩm 
    public List<String> getProductnameList(){
        Connection conn = null;
        ResultSet rs = null;
        Statement ptm = null;
        List<String> data = new ArrayList<String>();
        String s = String.valueOf(categorybox.getSelectedItem());
        try {
            String SQL =  "select ProductName \n" +
                            "from Product as P , ProductCategory as PC\n" +
                            "where p.CategoryId = PC.CategoryId and PC.CategoryName ='" + s +"'" ;
            conn = databaseHelper.getDBConnect();
            ptm = conn.createStatement();
            rs = ptm.executeQuery(SQL);
            while (rs.next()){
                data.add(rs.getString(1));
            }
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // day data vao category combobox
    public void pushCategory(){
        List<String> data = getCategoryList();
        for (String s : data) {
            categorybox.addItem(s);
        }
        
    }
    // day data vao productname combobox
    public void pushProductName(){
        List<String> data = getProductnameList();
        for (String s : data) {
            namebox.addItem(s);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JComboBox<String> categorybox;
    private javax.swing.JLabel change;
    private com.k33ptoo.components.KButton customerBtn;
    private com.k33ptoo.components.KButton invoiceBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JComboBox<String> namebox;
    private javax.swing.JSpinner quantity;
    private javax.swing.JTextField received;
    private com.k33ptoo.components.KButton revenueBtn;
    private com.k33ptoo.components.KButton saleBtn;
    private javax.swing.JTable tblsale;
    private javax.swing.JLabel totalTXT;
    // End of variables declaration//GEN-END:variables
}
