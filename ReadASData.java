/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shabbir
 */
public class ReadASData implements Runnable{

    private static ReadASData instance = null;
    protected static String val[][]=new String[100][];  
    protected static String record[]  = new String[18];    
    protected String[] setQuery = new String[2] ;
    Thread t; 
    
    private  ReadASData(String threadName,String[] readData){
        setQuery = readData;
        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }    
    public static ReadASData getInstance(String threadName,String[] readData) {
      if(instance == null) {
         instance = new ReadASData(threadName,readData);
      }
        return instance;
  }
    
    

    @Override
    public void run() {
      setQuery();
        try {
            conn.t.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(readTotalFee.class.getName()).log(Level.SEVERE, null, ex);
        }
      val = conn.showData();
      System.out.println("in ReadASData"+val[0][0]);  
    }

    
     protected static void Records(Connected conn){
//conn.showData(conn.res);
     }
     protected static String[][] getData()
     {
        return val;
     
     }
     
        protected static String[][] getRecords(Connected conn){
int count = 0;
       try {
            while(conn.res.isLast() == false)
           {
            System.out.println("conn.res.getRow()"+conn.res.isLast());
       //      val[count] =  conn.showRecord(conn.res,record);
              if(val[count][0] instanceof String){
                          System.out.println("string value in readTotalFee"+val[count][0]);
              }
              else 
              {   val[count] = null;
                  break;
              }
                  count++;
            }
              //if(val[0][0] instanceof String)
            {

            
        
        }
        
       } catch (SQLException ex) {
            Logger.getLogger(ReadASData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return val;
   }
        
        protected Connected setQuery(){
        System.out.println(setQuery[0]+"in readTotalfee"+setQuery[1]);
        String value = "'All'";
 
                    if(!(setQuery[1].equals(value))&&(setQuery[0].equals(value))){

       que = "Select * from StdBioData where Mohalla =" +setQuery[1];
System.out.println(que);
        }
                else 
                    if((setQuery[1].equals(value))&&!(setQuery[0].equals(value))){

       que = "Select * from StdBioData where Daraja =" +setQuery[0];
System.out.println(que);
        }
        else
           if(!((setQuery[1].equals(value))&&(setQuery[0].equals(value)))){
 
       que = "Select * from StdBioData where Mohalla =" +setQuery[1]+"AND Daraja = " + setQuery[0];
 System.out.println(que);
        }
           else 
               que = "Select * from StdBioData";
   conn =  Connected.getInstance("ReadASData",que,record);
  return conn;
        }
        public void closeOp(){
       instance = null; 
       conn.closeOp();
               }
     public static   String que = "Select * from StdBioData";
      Connected conn ;
}
