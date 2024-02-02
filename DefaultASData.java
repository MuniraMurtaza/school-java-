/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author shabbir
 */
public class DefaultASData extends Observable implements Runnable
{

         Thread t;
   static String[] regId = new String[18];
    
    
    private  DefaultASData(String threadName,String[] defaultData){
        int num = defaultData.length;
        this.regId = new String[num];
        this.regId = defaultData;
        t = new Thread(this,threadName);
        t.setPriority(5);
        t.start();
    
    }
       private  DefaultASData(String threadName){

        t = new Thread(this,threadName);
        t.setPriority(5);

    
    } 
    @Override
    public void run() {
     
        if(regId!= null){
            setChanged();
           notifyObservers(regId);
           instance = null;
        }
        
    }
    
    public static DefaultASData getInstance(String threadName,String[] readData) {
         regId = readData; 
        if(instance == null) {
         instance = new DefaultASData(threadName,readData);
         }

        return instance;
  }
    public static DefaultASData getInstance(String threadName) {
          
        if(instance == null) {
         instance = new DefaultASData(threadName);
         }
    
        return instance;
  }   
    public void closeThread(){
    
   instance = null; 
    }
    
    private static DefaultASData instance;
}


         
    
    
