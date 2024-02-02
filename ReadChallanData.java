/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author A156
 */
public class ReadChallanData implements Runnable{
    private static ReadChallanData instance = null;
    protected String val[][]=new String[100][];      
    protected String record[]  = new String[23]; 
     private String[] months = new DateFormatSymbols().getMonths();
   
    Thread t; 
    
    private  ReadChallanData(String threadName){

        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }    
    public static ReadChallanData getInstance(String threadName) {
      if(instance == null) {
         instance = new ReadChallanData(threadName);
      }
        return instance;
  }
    
    @Override
    public void run() {

    getRecords();
    }
    protected String[][] getRecords(){
                         Calendar cal = new GregorianCalendar();

        int    yearCalc = cal.get(Calendar.MONTH);
        
        record[0] = "11/MT/11";
    record[1] = "11/MT/11";
    record[2] = "munira";
    record[3] = months[yearCalc];
    record[4] = "1000";
    record[5] = "0";
    record[6] = "0";
    record[7] = "0";
    record[8] = "0";
    record[9] = "0";
    record[10] = "0";
    record[11] = "12-sep-213";

    
    
    val[0] = record;
 
    return val;
    }
}
