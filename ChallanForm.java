/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author shabbir
 */
public class ChallanForm extends javax.swing.JFrame {

    private static ChallanForm instance = null;
    /**
     * Creates new form ChallanForm
     */
    public ChallanForm() {
        initComponents();
    }

      public static ChallanForm getInstance() {
            if(instance == null) {
         instance = new ChallanForm();
      }
    return instance;
  }
      
      protected void getTableValue(String[] data){
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
Date date = new Date();

          
challanText.setText(data[0]);
chMadaText.setText(data[0]);
challanBankText.setText(data[0]);

regtext.setText(data[1]);
regMadaText.setText(data[1]);
regbankText.setText(data[1]);

nameText.setText(data[2]);
nameMadaText.setText(data[2]);
nameBankText.setText(data[2]);

dateText.setText(dateFormat.format(date));
dateMadaText.setText(dateFormat.format(date));
dateBankText.setText(dateFormat.format(date));      
    
monthText.setText(data[3]);
monthMada.setText(data[3]);
monthBank.setText(data[3]);

duedateText.setText(data[11]);
duedateText1.setText(data[11]);
duedateText2.setText(data[11]);

for(int rowCount = 0;rowCount<jTable1.getRowCount();rowCount++){
    jTable1.setValueAt(data[rowCount+4], rowCount, 1);
    jTable2.setValueAt(data[rowCount+4], rowCount, 1);
    jTable3.setValueAt(data[rowCount+4], rowCount, 1);
}
      
      }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        regbankText = new javax.swing.JTextField();
        nameBankText = new javax.swing.JTextField();
        dateBankText = new javax.swing.JTextField();
        challanBankText = new javax.swing.JTextField();
        regtext = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        duedateText = new javax.swing.JTextField();
        challanText = new javax.swing.JTextField();
        regMadaText = new javax.swing.JTextField();
        nameMadaText = new javax.swing.JTextField();
        dateMadaText = new javax.swing.JTextField();
        chMadaText = new javax.swing.JTextField();
        duedateText1 = new javax.swing.JTextField();
        duedateText2 = new javax.swing.JTextField();
        dateText = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        monthMada = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        monthText = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        monthBank = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel1.setText("STUDENT COPY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        jLabel2.setText("BANK NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 130, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("MADARSA TAHERIA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, 30));

        jLabel4.setText("Challan Number");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel5.setText("Registration No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabel7.setText("Due Date :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tution", null},
                {"Registration", null},
                {"Examination", null},
                {"Enrollment", null},
                {"Arrears", null},
                {"Penalty", null},
                {"TOTAL", null}
            },
            new String [] {
                "fEE", "AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setEnabled(false);
        jScrollPane3.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setResizable(false);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(60);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 150));

        jLabel8.setText("Issue-Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 110, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel9.setText("Acct off");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel10.setText("Sig: of Bank Manager");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(16, 13, 9));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 610));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel11.setText("BANK COPY");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 30));

        jLabel12.setText("BANK NAME");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 130, 60));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setText("MADARSA TAHERIA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 190, 30));

        jLabel14.setText("Challan Number");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel15.setText("Registration No");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel16.setText("Name");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        jLabel17.setText("Due Date :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tution", null},
                {"Registration", null},
                {"Examination", null},
                {"Enrollment", null},
                {"Arrears", null},
                {"Penalty", null},
                {"TOTAL", null}
            },
            new String [] {
                "fEE", "AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setAutoscrolls(false);
        jTable2.setEnabled(false);
        jScrollPane4.setViewportView(jTable2);
        jTable2.getColumnModel().getColumn(0).setResizable(false);
        jTable2.getColumnModel().getColumn(1).setResizable(false);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(60);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 180, 150));

        jLabel18.setText("Issue-Date");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(16, 13, 9));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, 610));

        jLabel21.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel21.setText("MADARSA COPY");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 140, 30));

        jLabel22.setText("BANK NAME");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 130, 60));

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setText("MADARSA TAHERIA");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 190, 30));

        jLabel24.setText("Challan Number");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, -1, -1));

        jLabel25.setText("Registration No");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabel26.setText("Name");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jLabel27.setText("Due Date :");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tution", null},
                {"Registration", null},
                {"Examination", null},
                {"Enrollment", null},
                {"Arrears", null},
                {"Penalty", null},
                {"TOTAL", null}
            },
            new String [] {
                "fEE", "AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoscrolls(false);
        jTable3.setEnabled(false);
        jScrollPane5.setViewportView(jTable3);
        jTable3.getColumnModel().getColumn(0).setResizable(false);
        jTable3.getColumnModel().getColumn(1).setResizable(false);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(60);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 180, 150));

        jLabel28.setText("Issue-Date");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, -1, -1));

        jLabel31.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel31.setText("Acct off");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 490, -1, -1));

        jLabel32.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel32.setText("Sig: of Bank Manager");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jLabel33.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel33.setText("Acct off");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

        jLabel34.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel34.setText("Sig: of Bank Manager");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, -1, -1));

        regbankText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        regbankText.setEnabled(false);
        getContentPane().add(regbankText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 90, -1));

        nameBankText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        nameBankText.setEnabled(false);
        getContentPane().add(nameBankText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 90, -1));

        dateBankText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        dateBankText.setEnabled(false);
        getContentPane().add(dateBankText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 90, -1));

        challanBankText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        challanBankText.setEnabled(false);
        getContentPane().add(challanBankText, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 90, -1));

        regtext.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        regtext.setEnabled(false);
        getContentPane().add(regtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 90, -1));

        nameText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        nameText.setEnabled(false);
        nameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextActionPerformed(evt);
            }
        });
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 90, -1));

        duedateText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        duedateText.setEnabled(false);
        getContentPane().add(duedateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 90, -1));

        challanText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        challanText.setEnabled(false);
        getContentPane().add(challanText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, -1));

        regMadaText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        regMadaText.setEnabled(false);
        getContentPane().add(regMadaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 90, -1));

        nameMadaText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        nameMadaText.setEnabled(false);
        getContentPane().add(nameMadaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 90, -1));

        dateMadaText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        dateMadaText.setEnabled(false);
        getContentPane().add(dateMadaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 90, -1));

        chMadaText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        chMadaText.setEnabled(false);
        getContentPane().add(chMadaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 90, -1));

        duedateText1.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        duedateText1.setEnabled(false);
        getContentPane().add(duedateText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 90, -1));

        duedateText2.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        duedateText2.setEnabled(false);
        getContentPane().add(duedateText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 90, -1));

        dateText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        dateText.setEnabled(false);
        dateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTextActionPerformed(evt);
            }
        });
        getContentPane().add(dateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, -1));

        jLabel19.setText("Month");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 110, -1));

        monthMada.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        monthMada.setEnabled(false);
        getContentPane().add(monthMada, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 90, -1));

        jLabel20.setText("Month");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 110, -1));

        monthText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        monthText.setEnabled(false);
        getContentPane().add(monthText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, -1));

        jLabel29.setText("Month");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 110, -1));

        monthBank.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        monthBank.setEnabled(false);
        getContentPane().add(monthBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextActionPerformed

    private void dateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTextActionPerformed

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
            java.util.logging.Logger.getLogger(ChallanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChallanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChallanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChallanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChallanForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chMadaText;
    private javax.swing.JTextField challanBankText;
    private javax.swing.JTextField challanText;
    private javax.swing.JTextField dateBankText;
    private javax.swing.JTextField dateMadaText;
    private javax.swing.JTextField dateText;
    private javax.swing.JTextField duedateText;
    private javax.swing.JTextField duedateText1;
    private javax.swing.JTextField duedateText2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField monthBank;
    private javax.swing.JTextField monthMada;
    private javax.swing.JTextField monthText;
    private javax.swing.JTextField nameBankText;
    private javax.swing.JTextField nameMadaText;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField regMadaText;
    private javax.swing.JTextField regbankText;
    private javax.swing.JTextField regtext;
    // End of variables declaration//GEN-END:variables
}
