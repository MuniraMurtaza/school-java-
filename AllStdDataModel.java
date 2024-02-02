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
public class AllStdDataModel extends Observable{
//this is a queue that is created so that the events can be executed in bad times toot18
private AllStdDataModel(){}

    
protected static String dataRead = "";    
protected static String[][] newFormData;   
protected static int totalStd,num = 0;
protected String[] defaultData = {"",""};

private static AllStdDataModel instance = null;
 
public static AllStdDataModel getInstance() 
{
      if(instance == null) {
         instance = new AllStdDataModel();
      }
    return instance;
  }

//event pass gives the thread to be generated
protected void eventPass(String evt,String formName){
    switch(evt){
      case "AllStdDataDefault":
            newForm(formName);
            break;

       
  }

}

protected void eventPass(String evt,String formName,String[]readData){
    
    switch(evt){
      case "ReadFromAllStdData":    
          ReadFromASD(formName,readData);
          break;
      case "GetRollNumber":    
          GetRollNum(formName,readData);
          break;
      case "getTableData":
          getTableData(formName,readData);
          break;
      case "ReadASData":
            readASData(formName,readData);
            break;
      case "defaultASData":
            defaultASData(formName,readData);
            break;
              
  }

}
public static void newForm(String formName)
    {
                try{
                 New Default =  New.getInstance("AllStdData",2);                                                    
                  Default.t.join();
                 newFormData = Default.val;
                 totalStd = Default.tempTotal;

            }
            catch(Exception e)
            {
            }
    
    }

//read data from the database into the table
public static void readASData(String formName,String[] readData)
    {
                try{
                 ReadASData Default =  ReadASData.getInstance(formName,readData);                                                    
                 Default.t.join();
                 newFormData = Default.val;
                       System.out.println("in AllStdDataModel"+newFormData[0][0]); 
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

    public void GetRollNum(String formName,String[] readData)
    {
//when the form is loaded then it should be invoked
             try{
System.out.println("roll number executed in AllstdDataModel");
                 GetRollNum Default =  GetRollNum.getInstance(formName,readData);   
            Default.t.join();
            
           defaultData  = Default.getValue();
           setChanged();
            notifyObservers(defaultData);
          //  Default = null;
           
             }
            catch(Exception e)
            {
            }       
    } 
public static void getBioData()
    {
                try{
                 BioData Default = new BioData();    
                 Default.t.join();
                 
            }
            catch(Exception e)
            {
            }
    
    }

public static void getTotalStudents()
    {
                try{
                 totalStudents Default = new totalStudents();    
                 Default.t.join();
                 totalStd = Default.num;
            }
            catch(Exception e)
            {
            }
    
    }
public static void getTableData(String formName,String[] regId)
    {
                try{
  

                 TableData Default =  TableData.getInstance(formName, regId);
                // Default.run();
                 //Default.t.join();
                 
            }
            catch(Exception e)
            {
            }
    
    }
public static void defaultASData(String formName,String[] regId)
    {
                try{
  

                 DefaultASData Default =  DefaultASData.getInstance(formName, regId);
                 Default.closeThread();
            }
            catch(Exception e)
            {
            }
    
    }
protected void closeOp(){
    instance = null;
}

}
