/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A156
 */
public class InsertConnection implements Runnable{
   Thread t;
 private static InsertConnection instance = null;

 String val[][] = new String[100][];   
 String[] myname = new String[22];    
    public static ResultSet res;
    public static java.sql.Connection conn;
    public static Statement stat;
public static String user = "";
public static String pass = "";
public static String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=E:/MadarsaAdmission.mdb;";//"jdbc:odbc:MadarsaAdmission";
 String name = "munira",address = "address";
 String que = "";
  
 
 public static InsertConnection getInstance(String threadName,String que) {
System.out.println(res+"\t"+instance);
     if(instance == null) {

         instance = new InsertConnection(threadName,que);
      }
        return instance;
  }
 private InsertConnection(String threadName,String que)
{      
    
	 this.que = que;

           t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();	
    }
 
 
    @Override
    public void run() {
                     try
       {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		conn = DriverManager.getConnection(url,user,pass);
		
                stat = conn.createStatement();
            stat.execute(que);

                //res.last();
//	myname = res.getString(1);
//	myname1 = res.getString(2);
       }
	catch(Exception e)   {
	System.out.println("Error" +e);
	} 
//		executeQuery(que);
    }
    
            public void closeOp(){
       instance = null; 
               try {
            res.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connected.class.getName()).log(Level.SEVERE, null, ex);
        }
          
               }
    
    
}
