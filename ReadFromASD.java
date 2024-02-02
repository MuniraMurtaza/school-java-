/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

/**
 *
 * @author shabbir
 */
public class ReadFromASD implements Runnable{
    
    Thread t;
    String[] readData=new String[2];
    private static ReadFromASD instance;
    public static ReadFromASD getInstance(String threadName,String[] readData) {
          
        if(instance == null) {
         instance = new ReadFromASD(threadName,readData);
         }
    
        return instance;
  }
private ReadFromASD(String threadName,String[] readData){
        this.readData = readData;
        t = new Thread(this,threadName);
        t.setPriority(2);
        t.start();
}

    
    public void run()
    {
getTableData();
    }

    //look if the daraja and the mohalla are not All
    protected String getTableData(){
    
    if((readData[0].equals("All"))||(readData[1].equals("All"))){
    
    return "notValid";
    }
    return "Valid";
    }
}
