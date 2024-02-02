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
 * @author A156
 */
public class NewClass {

        protected static String record[]  = new String[23];  
        protected static String ecord[]  = new String[23];  
        static String[] setQuery = new String[2];
   public static   String que = "Select * from StdBioData";
//public static Connected conn = Connection.getInstance("NewClass",que);
  public static void main(String arg[]){

  int count = 0;      

  setQuery[0] = "'All'";
  setQuery[1] = "'Burhani Nagar'";
     readTotalFee  fee = readTotalFee.getInstance("newclass", setQuery);

// conn.insert(conn.res);
   }
 
}