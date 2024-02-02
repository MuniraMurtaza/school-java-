/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author shabbir
 */
public class AllStdDataController extends Observable implements Observer{
     AllStdData view = AllStdData.getInstance();
     AllStdDataModel model = AllStdDataModel.getInstance();
 //      AdFormController adForm   ;
                      private static AllStdDataController instance = null;
       static int rowCounter = 0;             
       
     protected static boolean dar = true,moh = true;
private AllStdDataController()
{
//setting the default values in the form

    getTotalDefault();

//giving the focus listeners of the combo box 1
view.addComboDarListener(new ComboDarListener());
view.addComboMohListener(new ComboMohListener());
//adding button listeners in the AdForm form
view.insertListener(new insertListener());  
view.searchListener(new searchListener());  
view.printListener(new PrintListener());  
view.closeListener(new CloseListener());  

view.setVisible(true);
view.setExtendedState(AllStdData.MAXIMIZED_BOTH);

//closeOp();
    
}
   
//creating an instance of the controller of AllStdData
public static AllStdDataController getInstance() {
      if(instance == null) {
         instance = new AllStdDataController();
      }
    return instance;
  }






protected void getTotalDefault(){
model.eventPass("AllStdDataDefault","AllStdData");
setTotalDefault();
}
protected void setTotalDefault(){
view.setTotals(0);
view.setDefault(model.newFormData,model.totalStd);
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
model.eventPass("ReadASData","ReadASData",view.getDataVerification());
    view.clearData();
    if(!(model.newFormData[0] == null)) {
view.setTableData(model.newFormData);
view.getTotalRecords();
    }
    }
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

    //model.eventPass("GetRollNumber","GetRollNum",view.getVerification());
model.eventPass("getTableData","TableData",view.getTableData(0));
 AdFormController  adForm  = AdFormController.getInstance();
adForm.addObserver(instance);
}
}
    }


    


    
          
          public void readFromASD(){

          model.eventPass("ReadFromAllStdData","ReadFromASD",view.getVerification());
          
          }
          
          class PrintListener implements java.awt.event.ActionListener{
    
              public void actionPerformed(java.awt.event.ActionEvent e)
    {


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
          
     public void update(Observable obj, Object arg) {
         if(arg == null){
                          
         }
         else
         if(arg instanceof String[]) {
        
         String[] tableVal = (String[])arg;
          String observer = obj.toString();
   
          if(tableVal.length == 2)
          {
              
         model.eventPass("defaultASData","DefaultASData",view.getRegId(tableVal));
         
         
          }          
else
          {


              view.setTableData(tableVal);


     }
     }
         else if(arg instanceof String)
         {
         System.out.println("in AllStdDataController het rollNumber");    
         model.eventPass("GetRollNumber","GetRollNum",view.getVerification());
         }
         else{
             
         int value = (int)arg;
         System.out.println("in AllStdDataController update executed"+value);   
         model.eventPass("getTableData","NextTableData",view.getTableData(value));         
         }
     
     }
    
     
}