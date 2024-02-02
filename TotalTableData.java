/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author shabbir
 */
public class TotalTableData extends Observable implements Runnable {
     Thread t;
   static String[] regId = new String[18];
    protected static String[] tableData = new String[18];
    
    private  TotalTableData(String threadName,String[] tableData){
        int num = tableData.length;
        this.regId = new String[num];
        this.regId = tableData;
        this.tableData = new String[num];
       
        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }
    
    private  TotalTableData(String threadName){

        t = new Thread(this,threadName);
        t.setPriority(5);

    
    }
    
    @Override
    //the daefault values in field when the form is loaded
   
    public void run()
    {

        if(regId!= null){
getTableData();
            //closeThread();
            setChanged();
           notifyObservers(tableData);
           
        }
        
    }
         
    protected String[] getTableData(){
 int monthCalc;
int count = 0,eleMonth = 0;
String[] dueMonth = new String[12];
String[] months = new DateFormatSymbols().getMonths();
Calendar cal = new GregorianCalendar();
            
monthCalc = cal.get(Calendar.MONTH);

if(regId[20] == months[monthCalc] && regId[19] == "no")
{
tableData[6] = regId[18];
}
else 
    tableData[6]  = "0";

eleMonth = monthCalc+8;
//monthCalc+=6;

int amount = Integer.parseInt(regId[5]);


for(int colCount = 0;colCount< 6;colCount++)
{
    tableData[colCount] = regId[colCount] ;

}

count = 0;
if(monthCalc == 0){
monthCalc = 17;
}
else
    monthCalc+=5;

while(!(regId[monthCalc].equals("yes"))&& monthCalc != eleMonth){

dueMonth[count] = Integer.toString((monthCalc-6));
    System.out.println((monthCalc-6)+"in total tabledata thread"+regId[monthCalc]);   
count++;

if(monthCalc==6)
{
monthCalc = 18;
}
--monthCalc;
}

dueMonth[count] = Integer.toString(cal.get(Calendar.MONTH));

tableData[6] = regId[18];
tableData[7] = Integer.toString(amount*(count));
tableData[8] = Integer.toString(Integer.parseInt(tableData[5])+Integer.parseInt(tableData[6])+Integer.parseInt(tableData[7])); 
for(count = 0;count<dueMonth.length;count++)
{
    tableData[count+9] = dueMonth[count];

}
return tableData;
    }
    public static TotalTableData getInstance(String threadName,String[] readData) {
        regId = readData; 

        if(instance == null) {
         instance = new TotalTableData(threadName,readData);
         }

        return instance;
  }
    public static TotalTableData getInstance(String threadName) {
          
        if(instance == null) {
         instance = new TotalTableData(threadName);
         }
    
        return instance;
  }   
    public void closeThread(){
    
   instance = null; 
    }
    
    private static TotalTableData instance;
}