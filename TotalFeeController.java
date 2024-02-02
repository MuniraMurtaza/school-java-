/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author shabbir
 */
public class TotalFeeController implements Observer{
   
     TotalFee view = TotalFee.getInstance();
     TotalFeeModel model = TotalFeeModel.getInstance();
     private static TotalFeeController instance = null;
  
     protected static boolean dar = true,moh = true;
    
//creating an instance of the controller of AllStdData
    public static TotalFeeController getInstance() {
      if(instance == null) {
         instance = new TotalFeeController();
      }
    return instance;
  }  
    
    
private TotalFeeController(){
getTotalDefault();


view.insertListener(new insertListener());  
view.searchListener(new searchListener()); 
view.addComboDarListener(new ComboDarListener());  
view.addComboMohListener(new ComboMohListener()); 
view.closeListener(new CloseListener());  

view.setVisible(true);
view.setExtendedState(AllStdData.MAXIMIZED_BOTH);
}


protected void getTotalDefault(){

model.eventPass("TotalFeeDefault","TotalFee");
setTotalDefault();
}
protected void setTotalDefault(){
view.getTotalRecords();
view.setDefault(model.newFormData,model.totalStd);
}


public void readFromASD(){

    model.eventPass("ReadFromAllStdData","ReadFromASD",view.getVerification());
          
          }

    @Override
    public void update(Observable o, Object arg) {
                 if(arg == null){
                          
         }
         else
         if(arg instanceof String[][]) {
        
         String[][] tableVal = (String[][])arg;
        view.setTableData(tableVal,"name");


     }
         else if(arg instanceof String)
         {

        String regId = (String)arg;
        model.eventPass("getTableData","TableData",view.searchRec(regId));

         }


     
     }
     
     class ComboDarListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

dar = true;
    }
}     class ComboMohListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

moh = true;
    }
}    

     class searchListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

if(dar == true || moh == true){        
view.removeRow();
    model.eventPass("readTotalFee","ReadTotalFee",view.getDataVerification());
    view.clearData();
if(!(model.newFormData[0] == null))    
{view.setTableData(model.newFormData);
view.setFormData();
view.getTotalRecords();
}

}
dar = moh = false;
    }
}
     
          class insertListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
        // view.comboDar
readFromASD();
model.addObserver(instance);  
//verification();
if(model.dataRead.equals("Valid")){
         model.eventPass("getTableData","TableData",view.getTableData());
        DataEntryController  adForm  = DataEntryController.getInstance();
        adForm.addObserver(instance);

}
    }


    }
          class CloseListener implements java.awt.event.ActionListener{
    
              public void actionPerformed(java.awt.event.ActionEvent e)
    {
view.dispose();
model.closeOp();
instance = null;

    }
}
}
