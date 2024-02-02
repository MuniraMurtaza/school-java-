/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 *
 * @author shabbir
 */
public class Write implements Runnable{    
 
    private String[] bioData = new String[10];
    Thread t;
    int num=0;
    boolean nullValue = false;
    
    
    private Write(String threadName,String[] bioData)
    {
        num = bioData.length;
        this.bioData = new String[num];
        this.bioData=bioData;  
        
        //setting thread properties
        t = new Thread(this);
        t.setPriority(2);
        t.start();
  
  } 
    @Override
  public void run(){
  setTableData();
  
  }
    
    
    protected void setTableData(){
        try{    
        
        for(num=0;num<bioData.length;num++)
        {
            if(bioData[num].equals(null) || bioData[num].equals(""))
            {
                bioData=null;
                break;
            }

        }
        
        }
        catch(Exception e){}
    }

      protected String[] passTableData(){

      return bioData;
      }
        
    //making the write thread singleton
      public static Write getInstance(String threadName,String[] bioData) {
          if(instance == null) {
         instance = new Write(threadName,bioData);
         
      }
    return instance;
  }

          public void closeThread(){
    
   instance = null; 
    }
      private static Write instance;

}
