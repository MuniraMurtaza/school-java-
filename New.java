/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

/**
 *
 * @author shabbir
 */import java.text.DateFormatSymbols;
import java.util.Locale;
 import java.util.Calendar;
import java.util.GregorianCalendar;


public class New implements Runnable{
            Calendar cal = new GregorianCalendar();
    protected int tempTotal = 10,num = 2,yearCalc = 0;
    private String[] daraja = {"1","2","3","4","5","6","7","8","9","10"};
    private String[] mohalla = {"Burhani Nagar","Sadar"};
    private String[] dates = new String[31];
    private String[] year = new String[20];
    private String[] months = new DateFormatSymbols().getMonths();
    
    protected String val[][]=new String[num][];     

//another stored procedure will be executed to count total students in all branches
    Thread t;
   private  New(String formName,int num){
    this.num = num;
    t = new Thread(this,formName);
    t.setPriority(5);
    t.start();

    }
    
        
    @Override
    //the daefault values in field when the form is loaded
 
    public void run()
    {
val = new String[num][];
        formName();
    }
    protected void formName(){

        getValue();
        switch(t.getName()){
            case "AdForm":
                calc();
               getFurtherValue();
        case "DataEntry":

            calc();
            getFurtherValue();

            break;
    }
    
    }
    
    private void getValue(){
        
    val[0] = daraja;
    val[1] = mohalla;
    
    }
private void getFurtherValue(){
 
    val[2] = dates;
    val[3] = months;
    val[4]= year;

}
private void calc(){
//adding dates into the date String
for(int i=0;i<=30;i++)
{
dates[i]=Integer.toString(i+1);

}



//adding years into the date String
for(int i=0;i<20;i++)
{
            yearCalc = cal.get(Calendar.YEAR);
year[i]=Integer.toString(yearCalc-i);

}
}
    public static New getInstance(String threadName,int value) {
 
        if(instance == null) {
         instance = new New(threadName,value);
         }

        return instance;
  }
    public void closeThread(){
    
   instance = null; 
    }
    private static New instance;
}
