/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
    import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author A156
 */
public class Connected implements Runnable{

    
    Thread t;
 private static Connected instance = null;
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
         

 
 public static Connected getInstance(String threadName,String que,String[] record) {
     if(instance == null) {

         instance = new Connected(threadName,que,record);
      }
        return instance;
  }
// public static void main(String args[])
private Connected(String threadName,String que,String[] record)
{       myname = record;
	 this.que = que;
           t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();	
    }

public String[][] showData(){
System.out.println(val[0][0]+"in Connection showData"+val[1][0]);
    return val;
}
public String[] showRecord()
{
	try
	{
//	System.out.println("it is executed");
int rowCounter = 0;
while( res.next())
{   
   
 //   myname = new String[rowLength.length];
for(int count = 0;count<myname.length-1;count++)
{
    myname[count] = res.getString(count+1);

}
val[rowCounter] = myname;
System.out.println(val[rowCounter][0]+"in Connection"+rowCounter);
rowCounter++;

} 

	}
	catch(Exception e){
System.out.println(e);
	}       
	return myname;                                           
}  
public void insert(ResultSet res){
      //  try {
          //  if(res.next())
            
        //        executeQuery("INSERT INTO StdBioData(RegID) VALUES('Bellevue')");
            
        //} 
       // catch (SQLException ex) {
         //   Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        //}

}

    @Override
    public void run() {
             try
       {

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		conn = DriverManager.getConnection(url,user,pass);
		
                stat = conn.createStatement();
            res = stat.executeQuery(que);
showRecord();
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
