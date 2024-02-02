/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

/**
 *
 * @author shabbir
 */
public class AdFormWrite implements Runnable{
    
    protected static String setQuery[] = new String[2];
    private static AdFormWrite instance;
    Thread t;
   AdFormWrite(){
    
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

    
    private  AdFormWrite(String threadName,String[] readData){
        setQuery = readData;
        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }    
    public static AdFormWrite getInstance(String threadName,String[] readData) {
      if(instance == null) {
         instance = new AdFormWrite(threadName,readData);
      }
        return instance;
  }

protected void getRecords(){
System.out.println(que);
 // InsertConnection conn =  InsertConnection.getInstance("AdFormWrite",que);
}
        public void closeOp(){
       instance = null; 
       //conn.closeOp();
        }
        
        
     public static   String que ="";
     protected void setQuery(){
        String value = "";
         for(int count = 0;count<setQuery.length;count++)
     {
     value = value+setQuery[count];
     if(!(count == (setQuery.length -1)))
     value+= "','";
     }
       // String value = setQuery[0]+"','"+setQuery[0];
//que = "insert into StdBioData(Daraja,RegID) values ("+value+",'22\\BN\\16')";
que = "Insert into StdBioData(Daraja,RegID,EID,StdName,FName,SurName,SabilNo,DOB,Age,Pno,CellNo,Mohalla,Address,DOA,AdFee,AnnFee,Picture ) values('"+value+"')";
     }
}
