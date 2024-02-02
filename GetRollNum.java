/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author shabbir
 */
public class GetRollNum implements Runnable{

    Thread t;
         private String[] daraja = {"2","3"};
   private  GetRollNum(String formName,String[] readData)
   {
t = new Thread(this,formName);
t.setPriority(4);
t.start();
daraja = readData;
   }
       private String value;
    @Override
   public void run()
   {    
       RollNum(); 
       instance = null;
   }
  
    
    public void DefaultValues()
  {
  //setting default values of the form
      RollNum();
  }
 
  protected String[] getValue()
  {
  return daraja;
        
  }
 
  protected synchronized void RollNum(){
        Calendar cal = new GregorianCalendar();


        int month,year,day;
        month = cal.get(Calendar.MONTH);
        year = cal.get(Calendar.YEAR);
        year = year%100;

        day = cal.get(Calendar.DAY_OF_MONTH);

        if("2".equals(daraja[0]))
        {
            year = (year-1)%100;
        }
        else
        if("3".equals(daraja[0]))
        {
            year = (year-2)%100;
        }
        else
        if(     "4".equals(daraja[0]))
        {
            year = (year-3)%100;
        }
        else
        if("5".equals(daraja[0]))
        {
            year = (year-4)%100;
        }
        else
        if(     "6".equals(daraja[0]))
        {
            year = (year-5)%100;
        }
        else
        if("7".equals(daraja[0]))
        {
            year = (year-6)%100;
        }
        else
        if("8".equals(daraja[0]))
        {
            year = (year-7)%100;
        }
        else
        if("9".equals(daraja[0]))
        {
            year = (year-8)%100;
        }
        else
        if("10".equals(daraja[0]))
        {
            year = (year-9)%100;
        }

        daraja[0] = Integer.toString(year);
        setMohalla();

    }
  public String setMohalla(){
          if("Burhani Nagar".equals(daraja[1]))
        {
            daraja[1] = "\\BN\\";
        }
        else
        if("Sadar".equals(daraja[1]))
        {
            daraja[1] = "\\SD\\";
        }
return daraja[1];
  }
      public static GetRollNum getInstance(String threadName,String[] readData) {
          
        if(instance == null) {
         instance = new GetRollNum(threadName,readData);
         }
    
        return instance;
  }
          private static GetRollNum instance;
}
