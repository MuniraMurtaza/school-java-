/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shabbir
 */
public class readTotalFee implements Runnable{

    private static readTotalFee instance = null;
    protected static String val[][]=new String[100][];  
    protected static String record[]  = new String[23];  
    protected static String[] setQuery = new String[2];  
    Thread t; 
    
    private  readTotalFee(String threadName,String[] readData){
        setQuery = readData;
       ;
        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }    
    public static readTotalFee getInstance(String threadName,String[] readData) {

        if(instance == null) {
         instance = new readTotalFee(threadName,readData);
      }
        return instance;
  }
    
    
    @Override
    public void run() {
        ;
   //    Records(setQuery());
      setQuery();
        try {
            conn.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(readTotalFee.class.getName()).log(Level.SEVERE, null, ex);
        }
      val = conn.showData();

      //    getRecords(setQuery());
        
    }

    
     protected static void Records(Connected conn){
//conn.showData(conn.res);
     }
     protected static String[][] getData()
     {
         
        return val;
     
     }
     
        protected static String[][] getRecords(String value){
int count = 0;

 //           System.out.println(conn.res.getRow()+"+conn.res.isLast()");
//              val[count] =  conn.showRecord(conn.res,record);
              if(val[count][0] instanceof String){

              }
              else 
              {   val[count] = null;
   //              break;
              }
                  count++;
            
                  conn.closeOp();
    //   conn.stat.close();


        return val;
   }
        
        protected String setQuery(){
        System.out.println(setQuery[0]+"in readTotalfee"+setQuery[1]);
        String value = "'All'";
 
                    if(!(setQuery[1].equals(value))&&(setQuery[0].equals(value))){

       que = "Select * from TotalFee where Mohalla =" +setQuery[1];
System.out.println(que);
        }
                else 
                    if((setQuery[1].equals(value))&&!(setQuery[0].equals(value))){

       que = "Select * from TotalFee where Daraja =" +setQuery[0];
System.out.println(que);
        }
        else
           if(!((setQuery[1].equals(value))&&(setQuery[0].equals(value)))){
 
       que = "Select * from TotalFee where Mohalla =" +setQuery[1]+"AND Daraja = " + setQuery[0];
 System.out.println(que);
        }
           else 
               que = "Select * from TotalFee";
   conn = Connected.getInstance("readtotalFee",que,record);

   return "connection";
        }
        public void closeOp(){
       instance = null; 
       conn.closeOp();
               }
     public static   String que = "Select * from TotalFee";
public static Connected conn;
}
