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
public class AdFormModel extends Observable implements Observer{
    //making the threads singleton
    private static Write writeIns = null;  

protected String[] writeVal = new String[18];    
protected String[] readVal = new String[18];

 protected String[][] newFormData; 
private static AdFormModel instance = null;
boolean newAlive = true,defaultAlive = true,picAlive = false;
//we have 2 models read and write
   private AdFormModel(){
       
    }
     public static AdFormModel getInstance() {
 
         if(instance == null) {
         instance = new AdFormModel();
      }
    return instance;
  }  
private void defaultOperation()
{

}


protected void getValue(String year)//gives the value of the AdDefault default values of year
{
       System.out.println(year);
}

    public void eventPass(String evt)
    {

    //this function is used to decide which thread to invoke it will be used for reading operation
        switch(evt){
            case "AdForm":
                newForm();
                break;
            case "Picture":
                picture();
                break;
            case "readOp":
                readOp("AdFormTableData");
                break;
            case "defaultASData":
                defaultASData("AdFormTableData");
                break;
            default:
                System.out.println();
        }
    }
    public void eventPass(String evt,String formName,String[] bioData )
    {
    //this function is used to decide which thread to invoke it will be used for writing operation
        switch(evt){
            case "write":
                writeOp(formName,bioData);
                break;
            default:
                System.out.println();
        }
    }    
 
    //thread for reading operation from AllStdData
    public void readOp(String formName)
    {
       try{
         TableData tableData = TableData.getInstance("AdFormTableData");

         tableData.addObserver(this);
         tableData.run();
         tableData.closeThread();
         

           }
         catch(Exception e)
         {
            }       
    }    
    //thread for writing operation  in AllStdData
    
    public void writeOp(String formName,String[] bioData)
    {
       try{
           System.out.println("in adFormModel writeVal\t"+writeVal);
         writeIns = Write.getInstance("Write",bioData);
         writeIns.t.join();
         writeIns.closeThread();
         writeVal = writeIns.passTableData();
         
         writeDatabase();
           }
         catch(Exception e)
         {
            }       
    }
        public void writeDatabase()
    {
       try{
         System.out.println("in AdFormModel in writeDatabase");
           AdFormWrite write = AdFormWrite.getInstance("AdFormWrite",writeVal);
         writeIns.t.join();
         writeIns.closeThread();
           }
         catch(Exception e)
         {
            }       
    }
 //threads for default reading operation   
    
    
    
    public void picture()
    {
    //this is used to invoke picture thread
            try{

                 Picture Default =Picture.getInstance("picture"); 
                 Default.addObserver(this);
                 

            }
            catch(Exception e)
            {
            }
    }
    
    public void newForm()
    {
                try{
                 New Default =  New.getInstance("AdForm",5);    
                 Default.t.join();
                 Default.closeThread();
                 newFormData = Default.val;
                 newAlive = Default.t.isAlive();
            }
            catch(Exception e)
            {
            }
    
    }
    
        public void defaultASData(String formName)
    {
       try{

           DefaultASData defaultASData = DefaultASData.getInstance("AdFormTableData");
           defaultASData.addObserver(this);
           defaultASData.run();

         

           }
         catch(Exception e)
         {
            }       
    } 

    public void closeOp(){

    instance = null;
    }

    
    
    @Override
    public void update(Observable o, Object arg) {
        

        if(arg instanceof String[]){

            readVal = (String[]) arg; 

        setChanged();
         notifyObservers(readVal);

        }
        else{
        System.out.println("inside update");
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    
    
    }
