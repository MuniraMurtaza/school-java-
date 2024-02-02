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
public class DataEntryController extends Observable implements Observer{

    DataEntry view = DataEntry.getInstance();     
    DataEntryModel model = DataEntryModel.getInstance();
      private static DataEntryController instance = null;
  
            String[] readVal = new String[3];
                    static boolean editVer = false;
            
//creating an instance of the controller of AllStdData
    public static DataEntryController getInstance() {
      if(instance == null) {
         instance = new DataEntryController();
      }
    return instance;
  }
    
   private DataEntryController() { 


 model.addObserver(this); 
 readRec();


//adding button listeners in the AdForm form
view.addEditListener(new EditListener());  
view.addSubmitListener(new SubmitListener());  
view.addPrintListener(new PrintListener());  
view.addRemoveListener(new RemoveListener());  
view.addSearchListener(new SearchListener());  
view.closeListener(new CloseListener());
view.setVisible(true);   
 }
 

private void readRec(){

    model.eventPass("readOp");

}
       protected void verifyTableData(String[] Data){

        
if(readVal.length == 3)
{
newForm();
}
else
{
view.getBioDataValue(Data);
view.getFeeData(Data);
}
    }
   
  private void newForm(){
getTotalDefault();
view.newForm();
view.setDefaultData();
}

protected void getTotalDefault(){
    model.eventPass("AdForm");
setTotalDefault();
}


protected void setTotalDefault(){
view.setDefault(model.newFormData);
} 
    @Override
    public void update(Observable o, Object arg) {

                    if(arg instanceof String[])
           {
               
            readVal = (String[]) arg;
            verifyTableData(readVal);
            //view.getTableValue(readVal);
            //newForm(); 
            }
    }



class SearchListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
     view.setDefaultData();
    view.setSearch();
      setChanged();
       notifyObservers(view.searchRec());
     readRec();
    }
}

class RemoveListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

    }
}

class EditListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

                editVer = true;

        view.newForm();
    }
}
     
          class SubmitListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

if(editVer == true)
{
view.insertOp();

model.eventPass("write","Write",view.bioData );
setChanged();
notifyObservers(model.writeVal);

}
view.recAccess();

editVer = false;
    }

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
}
