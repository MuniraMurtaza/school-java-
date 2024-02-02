/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;
import java.awt.event.*;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author shabbir
 */
public class DataEntry extends javax.swing.JFrame {

    
         private static DataEntry instance = null;
  
    
//creating an instance of the controller of AllStdData
    public static DataEntry getInstance() {
      if(instance == null) {
         instance = new DataEntry();
      }
    return instance;
  }
    
    /**
     * Creates new form DataEntry
     */
    private DataEntry() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regId = new javax.swing.JLabel();
        jPrint = new javax.swing.JButton();
        stdName = new javax.swing.JLabel();
        ejamaat_Id = new javax.swing.JLabel();
        monthFee = new javax.swing.JLabel();
        mohalla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPaidMonths = new javax.swing.JList(new DefaultListModel());
        jScrollPane2 = new javax.swing.JScrollPane();
        listUnpaidMonths = new javax.swing.JList(new DefaultListModel());
        to = new javax.swing.JButton();
        from = new javax.swing.JButton();
        toAll = new javax.swing.JButton();
        fromAll = new javax.swing.JButton();
        examFee = new javax.swing.JLabel();
        paneltyFee = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textTotalPayableFee = new javax.swing.JFormattedTextField();
        textTotalpaidFee = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        textSearchRegId = new javax.swing.JFormattedTextField();
        textStdName = new javax.swing.JTextField();
        mohText = new javax.swing.JTextField();
        textExamFee = new javax.swing.JFormattedTextField();
        textPaneltyFee = new javax.swing.JFormattedTextField();
        daraja = new javax.swing.JLabel();
        textRemainingFee = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        searchMoh = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        search = new javax.swing.JButton();
        textEjamaat = new javax.swing.JFormattedTextField();
        darText = new javax.swing.JTextField();
        regText = new javax.swing.JFormattedTextField();
        textMonthFee = new javax.swing.JFormattedTextField();
        submit = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regId.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        regId.setForeground(new java.awt.Color(0, 51, 255));
        regId.setText("REGISTRATTION ID :");
        getContentPane().add(regId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 120, 24));

        jPrint.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jPrint.setForeground(new java.awt.Color(0, 51, 255));
        jPrint.setText("PRINT");
        getContentPane().add(jPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, 90, 40));

        stdName.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        stdName.setForeground(new java.awt.Color(0, 51, 255));
        stdName.setText("STUDENT NAME :");
        getContentPane().add(stdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, 24));

        ejamaat_Id.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ejamaat_Id.setForeground(new java.awt.Color(0, 51, 255));
        ejamaat_Id.setText("EJAMAAT ID :");
        getContentPane().add(ejamaat_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 24));

        monthFee.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        monthFee.setForeground(new java.awt.Color(0, 51, 255));
        monthFee.setText("MONTH FEE :");
        getContentPane().add(monthFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 24));

        mohalla.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        mohalla.setForeground(new java.awt.Color(0, 51, 255));
        mohalla.setText("MOHALLA :");
        getContentPane().add(mohalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 24));

        jScrollPane1.setEnabled(false);

        jScrollPane1.setViewportView(listPaidMonths);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 140, 180));

        jScrollPane2.setEnabled(false);

        listUnpaidMonths.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listUnpaidMonths.setDropMode(javax.swing.DropMode.INSERT);
        jScrollPane2.setViewportView(listUnpaidMonths);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 140, 180));

        to.setText(">");
        to.setEnabled(false);
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });
        getContentPane().add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 50, -1));

        from.setText("<");
        from.setEnabled(false);
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });
        getContentPane().add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 50, -1));

        toAll.setText(">|");
        toAll.setEnabled(false);
        toAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAllActionPerformed(evt);
            }
        });
        getContentPane().add(toAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 50, -1));

        fromAll.setText("|<");
        fromAll.setEnabled(false);
        fromAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromAllActionPerformed(evt);
            }
        });
        getContentPane().add(fromAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 50, -1));

        examFee.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        examFee.setForeground(new java.awt.Color(0, 51, 255));
        examFee.setText("EXAMINATION FEE :");
        getContentPane().add(examFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, 24));

        paneltyFee.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        paneltyFee.setForeground(new java.awt.Color(0, 51, 255));
        paneltyFee.setText("PANALTY FEE :");
        getContentPane().add(paneltyFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, 24));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 255));
        jLabel15.setText("FEES PAID MONTHS");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, -1, 24));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("FEES UNPAID MONTHS");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, 24));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("TOTAL PAID FEE :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, 110, 24));

        textTotalPayableFee.setForeground(new java.awt.Color(0, 0, 204));
        textTotalPayableFee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textTotalPayableFee.setEnabled(false);
        textTotalPayableFee.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textTotalPayableFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 190, -1));

        textTotalpaidFee.setForeground(new java.awt.Color(0, 0, 204));
        textTotalpaidFee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textTotalpaidFee.setEnabled(false);
        textTotalpaidFee.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textTotalpaidFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 190, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 255));
        jLabel19.setText("TOTAL PAYABLE FEE :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 140, 24));

        try {
            textSearchRegId.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/**/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(textSearchRegId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 170, -1));

        textStdName.setEnabled(false);
        getContentPane().add(textStdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 190, -1));

        mohText.setEnabled(false);
        getContentPane().add(mohText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 190, -1));

        textExamFee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textExamFee.setEnabled(false);
        getContentPane().add(textExamFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 190, -1));

        textPaneltyFee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textPaneltyFee.setEnabled(false);
        getContentPane().add(textPaneltyFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 190, -1));

        daraja.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        daraja.setForeground(new java.awt.Color(0, 51, 255));
        daraja.setText("DARAJA:");
        getContentPane().add(daraja, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 30));

        textRemainingFee.setForeground(new java.awt.Color(0, 0, 204));
        textRemainingFee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textRemainingFee.setEnabled(false);
        textRemainingFee.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        getContentPane().add(textRemainingFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 190, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 51, 255));
        jLabel20.setText("RAMAINING FEE:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 110, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 990, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 410, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 910, 10));

        searchMoh.setForeground(new java.awt.Color(0, 0, 204));
        searchMoh.setText("SEARCH BY  REGISTRATION ID :");
        getContentPane().add(searchMoh, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 220, 30));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("STUDENT BIO-DATA");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 214, 44));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 990, 10));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 990, 10));

        search.setForeground(new java.awt.Color(0, 0, 204));
        search.setText("SEARCH");
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 100, 30));

        textEjamaat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textEjamaat.setEnabled(false);
        getContentPane().add(textEjamaat, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 190, -1));

        darText.setEnabled(false);
        getContentPane().add(darText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, -1));

        regText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        regText.setEnabled(false);
        getContentPane().add(regText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 190, -1));

        textMonthFee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        textMonthFee.setEnabled(false);
        getContentPane().add(textMonthFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 190, -1));

        submit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        submit.setForeground(new java.awt.Color(0, 51, 255));
        submit.setText("SUBMIT");
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, 110, 40));

        edit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 51, 255));
        edit.setText("EDIT");
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 80, 40));

        Close.setForeground(new java.awt.Color(0, 0, 204));
        Close.setText("BACK TO WELCOME PAGE");
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
protected void setDefault(String[][] str){


//setting combo box default values
//variable[0] = coboDar;
//variable[1] = comboMoh;
//variable[2] = comboDate;
//variable[3] = comboMonth;
//variable[4] = comboYear;

int num = 2;
while(num < variable.length)
{
setCombo1(str[num],variable[num]);
num++;
}
}
protected void setCombo1(String[] str,javax.swing.JComboBox variable)
{
int num = 0;
while(num < str.length)
{
variable.addItem(str[num]);
num++;
}
}

    protected void newForm(){
  
textMonthFee.setEnabled(true);
textExamFee.setEnabled(true);
textPaneltyFee.setEnabled(true);
textTotalPayableFee.setEnabled(true);
textTotalpaidFee.setEnabled(true);
textRemainingFee.setEnabled(true);
listPaidMonths.setEnabled(true);
listUnpaidMonths.setEnabled(true);
to.setEnabled(true);
from.setEnabled(true);
fromAll.setEnabled(true);
toAll.setEnabled(true);

}
    
        protected void setDefaultData(){
 
textMonthFee.setText("");
textExamFee.setText("");
textPaneltyFee.setText("");
textTotalPayableFee.setText("");
textTotalpaidFee.setText("");
textRemainingFee.setText("");
((DefaultListModel)listUnpaidMonths.getModel()).clear();
((DefaultListModel)listPaidMonths.getModel()).clear();
    
    }
        protected void setSearch(){
 
textStdName.setText("");
darText.setText("");
mohText.setText("");
regText.setText("");
textEjamaat.setText("");
   }        
protected void getBioDataValue(String[] data){

darText.setText(data[0]);
mohText.setText(data[1]);
regText.setText(data[2]);
textEjamaat.setText(data[3]);
textStdName.setText(data[4]);





}
protected void getFeeData(String[] data){

   // DefaultListModel model = (DefaultListModel)listUnpaidMonths.getModel();
Calendar cal = new GregorianCalendar();           
int monthCalc = cal.get(Calendar.MONTH);
 String[] g = new String[20];
 String[] months = new DateFormatSymbols().getMonths();
int  count = 9;
 
 textMonthFee.setText(data[5]);
 
textExamFee.setText(data[6]);
int paneltyFee = Integer.parseInt(data[7]);
textPaneltyFee.setText(Integer.toString(paneltyFee));
textTotalPayableFee.setText(data[8]);
textRemainingFee.setText(data[8]);
textTotalpaidFee.setText("0");
while(data[count] != null){
int month = Integer.parseInt(data[count]);
    ((DefaultListModel)listUnpaidMonths.getModel()).addElement(months[month]);
count++;

}
if(data[6].equals("0"))
{}
else
    ((DefaultListModel)listUnpaidMonths.getModel()).addElement("Examination Fee");
}
protected void recAccess(){
textMonthFee.setEnabled(false);
textExamFee.setEnabled(false);
textPaneltyFee.setEnabled(false);
textTotalPayableFee.setEnabled(false);
textTotalpaidFee.setEnabled(false);
textRemainingFee.setEnabled(false);
listPaidMonths.setEnabled(false);
listUnpaidMonths.setEnabled(false);

}
protected void insertOp(){
//in invoked when the insert button is pressed takes all the values fro the text field in String format
bioData[0][0] = regText.getText();   
bioData[0][1] =textExamFee.getText();
bioData[0][2] =textTotalPayableFee.getText();
bioData[0][3] = textRemainingFee.getText();
bioData[0][4] = textRemainingFee.getText();

for(int count = 0;count<((DefaultListModel)listPaidMonths.getModel()).size();count++)
        bioData[1][count] = (String)(((DefaultListModel)listPaidMonths.getModel()).get(count));
for(int count = 0;count<((DefaultListModel)listUnpaidMonths.getModel()).size();count++)
        bioData[2][count] = (String)(((DefaultListModel)listUnpaidMonths.getModel()).get(count));
//newForm();
}

protected String searchRec(){

String regId = textSearchRegId.getText();
return regId;

}


    void addPrintListener(java.awt.event.ActionListener evt){
    
jPrint.addActionListener(evt);
//adding a listener whose value will be given in the controller class
}
void addEditListener(java.awt.event.ActionListener evt){
    
edit.addActionListener(evt);
//adding a listener whose value will be given in the controller class
}
void addSubmitListener(java.awt.event.ActionListener evt){
    
submit.addActionListener(evt);
//adding a listener whose value will be given in the controller class
}
void addRemoveListener(java.awt.event.ActionListener evt){
    
//jSubmit.addActionListener(evt);
//adding a listener whose value will be given in the controller class
}
void addSearchListener(java.awt.event.ActionListener evt){
    
    search.addActionListener(evt);
//adding a listener whose value will be given in the controller class
}

void addComboDarListener(java.awt.event.ActionListener evt){
    
//coboDar.addActionListener(evt);

}
void addComboMohListener(java.awt.event.ActionListener evt){
    
//comboMoh.addActionListener(evt);
}
void closeListener(java.awt.event.ActionListener evt){
    
Close.addActionListener(evt);
//adding a listener whose value will be given in the controller class
}

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
  int select = listUnpaidMonths.getSelectedIndex();
        if(!((DefaultListModel)listUnpaidMonths.getModel()).isEmpty()&& select > -1)
   {
       ((DefaultListModel)listPaidMonths.getModel()).addElement(listUnpaidMonths.getSelectedValue());
    ((DefaultListModel)listUnpaidMonths.getModel()).remove(((DefaultListModel)listUnpaidMonths.getModel()).indexOf(listUnpaidMonths.getSelectedValue()));
    
    int totalPaid = Integer.parseInt(textMonthFee.getText())+Integer.parseInt(textTotalpaidFee.getText());
    textTotalpaidFee.setText(Integer.toString(totalPaid));
    
    int totalUnpaid = Integer.parseInt(textRemainingFee.getText())-Integer.parseInt(textMonthFee.getText());
    textRemainingFee.setText(Integer.toString(totalUnpaid));
   }    
        // TODO add your handling code here:
    }//GEN-LAST:event_toActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
   
        int select = listPaidMonths.getSelectedIndex();
        if(!((DefaultListModel)listPaidMonths.getModel()).isEmpty() && select > -1)
   {
       
            ((DefaultListModel)listUnpaidMonths.getModel()).addElement(listPaidMonths.getSelectedValue());
    ((DefaultListModel)listPaidMonths.getModel()).remove(((DefaultListModel)listPaidMonths.getModel()).indexOf(listPaidMonths.getSelectedValue()));
       
   }        
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void toAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toAllActionPerformed

   //     for(int count = 0;count<((DefaultListModel)listPaidMonths.getModel()).size()-1;count++)
     //   ((DefaultListModel)listPaidMonths.getModel()).addElement(((DefaultListModel)listUnpaidMonths.getModel()).get(count));
    //((DefaultListModel)listUnpaidMonths.getModel()).clear();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_toAllActionPerformed

    private void fromAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromAllActionPerformed

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
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataEntryController controller = DataEntryController.getInstance();
            }
        });
    }   

    String bioData[][] = new String[3][12];
private DefaultListModel listModel = new DefaultListModel();
private javax.swing.JComboBox variable[] = new javax.swing.JComboBox[5];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JTextField darText;
    private javax.swing.JLabel daraja;
    private javax.swing.JButton edit;
    private javax.swing.JLabel ejamaat_Id;
    private javax.swing.JLabel examFee;
    private javax.swing.JButton from;
    private javax.swing.JButton fromAll;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jPrint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JList listPaidMonths;
    private javax.swing.JList listUnpaidMonths;
    private javax.swing.JTextField mohText;
    private javax.swing.JLabel mohalla;
    private javax.swing.JLabel monthFee;
    private javax.swing.JLabel paneltyFee;
    private javax.swing.JLabel regId;
    private javax.swing.JFormattedTextField regText;
    private javax.swing.JButton search;
    private javax.swing.JLabel searchMoh;
    private javax.swing.JLabel stdName;
    private javax.swing.JButton submit;
    private javax.swing.JFormattedTextField textEjamaat;
    private javax.swing.JFormattedTextField textExamFee;
    private javax.swing.JFormattedTextField textMonthFee;
    private javax.swing.JFormattedTextField textPaneltyFee;
    private javax.swing.JFormattedTextField textRemainingFee;
    private javax.swing.JFormattedTextField textSearchRegId;
    private javax.swing.JTextField textStdName;
    private javax.swing.JFormattedTextField textTotalPayableFee;
    private javax.swing.JFormattedTextField textTotalpaidFee;
    private javax.swing.JButton to;
    private javax.swing.JButton toAll;
    // End of variables declaration//GEN-END:variables
}