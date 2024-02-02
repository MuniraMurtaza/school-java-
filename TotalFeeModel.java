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
public class TotalFeeModel extends Observable{

    
protected static int totalStd,num = 0;
protected static String[][] newFormData;
private static TotalFeeModel instance = null;
protected static String dataRead = ""; 
protected String defaultData = "";
  //creating an instance of the controller of AllStdData
public static TotalFeeModel getInstance() {
      if(instance == null) {
         instance = new TotalFeeModel();
      }
        return instance;
  } 

private TotalFeeModel(){


}

protected void eventPass(String evt,String formName){

    switch(evt){
      case "TotalFeeDefault":
            newForm(formName);
            break;


    }

}

protected void eventPass(String evt,String formName,String[]readData){
    
    switch(evt){
      case "ReadFromAllStdData":    
          ReadFromASD(formName,readData);
          break;

      case "getTableData":

          getTableData(formName,readData);
          break;
      case "readTotalFee":
            readTotalFee(formName,readData);
            break;    
      case "GetRollNumber":    
          GetRollNum(formName,readData);
          break;
  }

}


public static void newForm(String formName)
    {
                try{
                 New Default =  New.getInstance(formName,2);                                                    
                 Default.t.join();
                 newFormData = Default.val;
                 totalStd = Default.tempTotal;

            }
            catch(Exception e)
            {
            }
    
    }
public static void readTotalFee(String formName,String[] readData)
    {
                try{
                    System.out.println("in TotalFeeModel"+readData[0]);
                 readTotalFee Default =  readTotalFee.getInstance(formName,readData);                                                    
                 Default.t.join();
                 
                 newFormData = Default.getData();
                 Default.closeOp();

            }
            catch(Exception e)
            {
            }
    
    }
public static void ReadFromASD(String formName,String[] readData)
    {
                try{
                 ReadFromASD Default = ReadFromASD.getInstance(formName,readData);                                                    
                  Default.t.join();
                  dataRead= Default.getTableData();

                   }
            catch(Exception e)
            {
            }
    
    }
public static void getTableData(String formName,String[] regId)
    {
                try{
  

                 TotalTableData Default =  TotalTableData.getInstance(formName, regId);
                // Default.run();
                 //Default.t.join();
                 Default.closeThread();
            }
            catch(Exception e)
            {
            }
    
    }
    public void GetRollNum(String formName,String[] readData)
    {
//when the form is loaded then it should be invoked
             try{

                 GetRollNum Default =  GetRollNum.getInstance(formName,readData);   
            Default.t.join();
            
           defaultData  = Default.setMohalla();
           setChanged();
            notifyObservers(defaultData);
          //  Default = null;
           
             }
            catch(Exception e)
            {
            }       
    }
    public void closeOp(){
    instance = null;
    }
}
