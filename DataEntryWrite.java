
package madarsa;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 *
 * @author shabbir
 */
public class DataEntryWrite implements Runnable{    
 
    private String[][] bioData = new String[3][];
    Thread t;
    int num=0;
    boolean nullValue = false;
    
    
    private DataEntryWrite(String threadName,String[][] bioData)
    {
        num = bioData.length;
        this.bioData = new String[num][];
        this.bioData=bioData;  
        
        //setting thread properties
        t = new Thread(this);
        t.setPriority(2);
        t.start();
  
  } 
    @Override
  public void run(){
  
  }
    

      protected String[][] passTableData(){
     

System.out.println("in DataEntrywrite");

return bioData;
      
      }
        
    //making the write thread singleton
      public static DataEntryWrite getInstance(String threadName,String[][] bioData) {
          if(instance == null) {
         instance = new DataEntryWrite(threadName,bioData);
         
      }
    return instance;
  }

          public void closeThread(){
    
   instance = null; 
    }
      private static DataEntryWrite instance;

}
