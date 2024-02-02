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
public class TableData extends Observable implements Runnable {
     Thread t;
   static String[] regId = new String[18];
    
    
    private  TableData(String threadName,String[] tableData){
        int num = tableData.length;
        this.regId = new String[num];
        this.regId = tableData;
        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }
    
    private  TableData(String threadName){

        t = new Thread(this,threadName);
        t.setPriority(5);

    
    }
    
    @Override
    //the daefault values in field when the form is loaded
   
    public void run()
    {


        if(regId!= null){
            //closeThread();
            setChanged();
           notifyObservers(regId);
           
        }
        
    }
         
    protected String[] getTableData(){
        
        return regId;

    }
    public static TableData getInstance(String threadName,String[] readData) {
        regId = readData; 

        if(instance == null) {
         instance = new TableData(threadName,readData);
         }

        return instance;
  }
    public static TableData getInstance(String threadName) {
          
        if(instance == null) {
         instance = new TableData(threadName);
         }
    
        return instance;
  }   
    public void closeThread(){
    
   instance = null; 
    }
    
    private static TableData instance;
}
