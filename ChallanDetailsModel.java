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
public class ChallanDetailsModel extends Observable{

    
    private static ChallanDetailsModel instance = null;
    protected static String dataRead = "";   
    protected static String[][] newFormData;   
protected static int totalStd,num = 0;

private ChallanDetailsModel(){
 
 
 }

protected void eventPass(String evt,String formName){
    
    switch(evt){
      case "ChallanDetailsDefault":
          newForm(formName);
            break;
      case "readChallan":
          readChallan(formName);
            break;
    }

}

protected void eventPass(String evt,String formName,String[]readData){
    
    switch(evt){
      case "ReadFromChallanDetails":    
          ReadFromCD(formName,readData);
          break;
      case "getTableData":

          getTableData(formName,readData);
          break;
  }

}
 
 public static void ReadFromCD(String formName,String[] readData)
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
 public static void readChallan(String formName)
    {
                try{
                 ReadChallanData Default =  ReadChallanData.getInstance(formName);                                                    
                 Default.t.join();
                 newFormData = Default.getRecords();


            }
            catch(Exception e)
            {
            }
    
    }
 
 public static void getTableData(String formName,String[] regId)
    {
                try{

                 TableData Default =  TableData.getInstance(formName, regId);

                 //Default.t.join();
                 
            }
            catch(Exception e)
            {
            }
    
    }
 public static ChallanDetailsModel getInstance() {
      if(instance == null) {
         instance = new ChallanDetailsModel();
      }
    return instance;
  }    
protected void closeOp(){

instance = null;
}

}
