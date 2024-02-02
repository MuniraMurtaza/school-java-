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
public class ChallanDetailsController {
      ChallanDetails view = ChallanDetails.getInstance();
     ChallanDetailsModel model = ChallanDetailsModel.getInstance();
    private static ChallanDetailsController instance = null;
         protected static boolean dar = true,moh = true;
 
 
 private ChallanDetailsController(){
     getTotalDefault();
 view.backListener(new backListener());  
view.searchListener(new searchListener());  
view.printListener(new printListener()); 
view.printChallanListener(new printChallanListener()); 


view.setVisible(true);
view.setExtendedState(AllStdData.MAXIMIZED_BOTH);
 }
 
 public static ChallanDetailsController getInstance() {
      if(instance == null) {
         instance = new ChallanDetailsController();
      }
    return instance;
  }

 
 protected void getTotalDefault(){

model.eventPass("ChallanDetailsDefault","ChallanDetails");
setTotalDefault();
}

 protected void setTotalDefault(){

     //view.setTotals(0);
view.setDefault(model.newFormData,model.totalStd);
}
 
 public void readFromASD(){

 model.eventPass("ReadFromChallanDetails","ReadFromCD",view.getVerification());
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
    model.eventPass("readChallan","ReadChallan");
    
view.setTableData(model.newFormData);

}
dar = moh = false;

    }
}
       class printListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

    }
}

class printChallanListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
       
readFromASD();

if(model.dataRead.equals("Valid")){
System.out.println("in challandetailscontroller valid");
    model.eventPass("getTableData","TableData",view.getTableData());
 ChallanFormController  ChallanForm  = ChallanFormController.getInstance();
//adForm.addObserver(instance);
}
    }
}
              
              
       class backListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
        view.dispose();
        model.closeOp();
        instance = null;

    }
}
  
 
}
