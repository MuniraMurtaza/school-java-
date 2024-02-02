/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

/**
 *
 * @author A156
 */
public class AllStdUpdate implements Runnable{
     protected static String setQuery[] = new String[2];
    private static AllStdUpdate instance;
    Thread t;
   AllStdUpdate(){
    
t = new Thread(this);
t.setPriority(5);
t.start();
    
    }
    
    
    @Override
    //the daefault values in field when the form is loaded
   
    public void run()
    {
        setQuery();
        getRecords();
    }

    
    private  AllStdUpdate(String threadName,String[] readData){
        setQuery = readData;
        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }    
    public static AllStdUpdate getInstance(String threadName,String[] readData) {
      if(instance == null) {
         instance = new AllStdUpdate(threadName,readData);
      }
        return instance;
  }

protected void getRecords(){
System.out.println(que);
 UpdateConnection conn  = UpdateConnection.getInstance("NewJFrame", que);
}
        public void closeOp(){
       instance = null; 
       //conn.closeOp();
        }
        
        
     public static   String que ="";
     protected void setQuery(){
        String[] value = new String[setQuery.length];
         for(int count = 0;count<setQuery.length;count++)
     {
     value[count] = setQuery[count];

     }
       // String value = setQuery[0]+"','"+setQuery[0];
//que = "insert into StdBioData(Daraja,RegID) values ("+value+",'22\\BN\\16')";
que = "Update StdBioData set Daraja = '"+value[1]+"',EID = '"+value[2]+"',StdName = '"+value[3]+"',FName = '"+value[4]+"',SurName = '"+value[5]+"',SabilNo = '"+value[6]+"',DOB = '"+value[7]+"',Age = '"+value[8]+"',Pno = '"+value[9]+"',CellNo = '"+value[10]+"',Mohalla = '"+value[11]+"',Address = '"+value[12]+"',DOA = '"+value[13]+"',AdFee = '"+value[14]+"',AnnFee = '"+value[15]+"',Picture = '"+value[16]+"' where RegID = '"+value[0]+"'";
     }   
}
