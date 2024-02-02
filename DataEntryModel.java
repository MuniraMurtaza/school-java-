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
public class DataEntryModel extends Observable implements Observer{
 //this is a queue that is created so that the events can be executed in bad times toot18
    
private String events[] = new String[5];    
protected static String[][] newFormData;   
protected static int totalStd,num = 0;
protected static New Default;
protected String[] readVal = new String[18];

private static DataEntryModel instance = null;
protected String[][] writeVal = new String[3][12];   
    
//creating an instance of the controller of AllStdData
    public static DataEntryModel getInstance() {
      if(instance == null) {
         instance = new DataEntryModel();
      }
    return instance;
  }
    private DataEntryModel(){
    
    }

protected void eventPass(String evt){
     
    switch(evt){
        case "AllStdDataDefault":
            newForm();
        case "readOp":
            readOp("AdFormTableData");
             break;
    }

}
    public void eventPass(String evt,String formName,String[][] bioData )
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
public static void newForm()
    {
                try{
                  Default = New.getInstance("DataEntry",5);                                                    
                  Default.t.join();
                 newFormData = Default.val;
                 totalStd = Default.tempTotal;

            }
            catch(Exception e)
            {
            }
    
    }   
    public void readOp(String formName)
    {
       try{
         TotalTableData tableData = TotalTableData.getInstance("DataEntryTableData");

         tableData.addObserver(this);
         tableData.run();
         tableData.closeThread();
         

           }
         catch(Exception e)
         {
            }       
    }
    
        public void writeOp(String formName,String[][] bioData)
    {
       try{
         DataEntryWrite writeIns = null; 
         writeIns = DataEntryWrite.getInstance("Write",bioData);
         System.out.println(writeIns+"in DataEntryModel");
         writeIns.t.join();
         writeVal = writeIns.passTableData();
         writeIns.closeThread();
System.out.println(writeVal[0][0]+"in DataEntryModel");
         

           }
         catch(Exception e)
         {
            }       
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
    protected void closeOp(){
    instance = null;
}
}
