/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author shabbir
 */




public class AdFormController extends Observable implements Observer{
    //this is the instance creater of controller for singleton pattern   
    private static AdFormController instance = null;
    //creating model and view of AdForm of singleton pattern
        AdFormModel model = AdFormModel.getInstance();
        AdForm view = AdForm.getInstance() ;
        String[] tableData = new String[18];
        String[] readVal = new String[3];
        static int rowCounter = 0;
        static boolean insertVer = false,editVer = false;
    //         AllStdDataController AllStd = AllStdDataController.getInstance();
    private AdFormController()
    {

//to set the default values of comboboxes
//getTotalDefault();
//to initialize all the fields to new
//view.newForm();

 model.addObserver(this); 
 model.eventPass("readOp");

view.addInsertListener(new InsertListener());  
view.addEditListener(new EditListener());  
view.addRemoveListener(new RemoveListener());  
view.addSubmitListener(new SubmitListener());  
view.addPrintListener(new PrintListener());  
view.addBrowseListener(new BrowseListener());  
view.addCloseListener(new CloseListener());  
view.addNextRecListener(new NextRecListener());  
view.addLastRecListener(new LastRecListener());  
view.addPreRecListener(new PreRecListener());  
view.addFirstRecListener(new FirstRecListener());  

//view.addNewListener(new Button4Listener());  

view.setVisible(true);
    
    }


    //to initiate the controller
    public static AdFormController getInstance() {
    if(instance == null) 
    {
        instance = new AdFormController();
    }
    return instance;
  }   

        @Override
   synchronized public void update(Observable o, Object arg) {

            if(arg instanceof String[])
           {
               
            readVal = (String[]) arg;
            System.out.println(readVal.length+"the length ");
            verifyTableData(readVal);
            //view.getTableValue(readVal);
            //newForm(); 
            }
   
      }
        
        
    //setting the new form defaults
   private void newForm(){
getTotalDefault();
view.newForm();
view.setDefaultData(readVal);
}

protected void getTotalDefault(){
    model.eventPass("AdForm");
setTotalDefault();
}


protected void setTotalDefault(){
view.setDefault(model.newFormData);
}

//GET THE VALUE OF THE TABLE
protected String[] setTableData(){
tableData = model.writeVal;
     return tableData;
}




//method to verify the data in table
    protected void verifyTableData(String[] Data){

        
if(readVal.length == 3)
{
newForm();
}
else
{
view.getTableValue(Data);
}
    }
    
    

     

protected class InsertListener implements java.awt.event.ActionListener {
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

insertVer = true;       
setChanged();
notifyObservers("newForm");
model.eventPass("defaultASData"); 

    }
}
class EditListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {

        editVer = true;
        view.newForm();



    }
}class RemoveListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
     System.out.println("button1 Listener");

    }
}class SubmitListener implements java.awt.event.ActionListener{
   synchronized public void actionPerformed(java.awt.event.ActionEvent e)
    {

if(insertVer == true){

    view.insertOp();
 view.bioData[view.bioData.length-1] = "insert";
model.eventPass("write","Write",view.bioData );
setChanged();
notifyObservers(model.writeVal);

setChanged();
notifyObservers("newForm");
}
else if(insertVer == false && editVer == true)
{
view.insertOp();
view.bioData[view.bioData.length-1] = Integer.toString(rowCounter);
model.eventPass("write","Write",view.bioData );
setChanged();
notifyObservers(model.writeVal);

setChanged();
notifyObservers("newForm");
}
view.recAccess();
insertVer = false;
editVer = false;
    }
}     
          class PrintListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
     System.out.println("button2 Listener");

    }
}
     
     class BrowseListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
        System.out.println("picture executed in controller");
         model.eventPass("Picture"); 
         //view.regId(model.picName);
    }
}     
     
class NextRecListener implements java.awt.event.ActionListener{
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
        view.recAccess();
if(rowCounter<view.lastRecord){
setChanged();
notifyObservers(++rowCounter);
 model.eventPass("readOp");
}
    }
}

class PreRecListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
      
                view.recAccess();
        if(rowCounter>=1)
      {
          
          setChanged();
notifyObservers(--rowCounter);
 model.eventPass("readOp");

      }
    }
}
class FirstRecListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {
               view.recAccess();   
          setChanged();
          rowCounter = 0;
notifyObservers(rowCounter);
 model.eventPass("readOp");


    }
}class LastRecListener implements java.awt.event.ActionListener{
    public void actionPerformed(java.awt.event.ActionEvent e)
    {        view.recAccess();
          rowCounter = view.lastRecord;;
          setChanged();
notifyObservers(rowCounter);
 model.eventPass("readOp");

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
