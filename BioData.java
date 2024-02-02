/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

/**
 *
 * @author shabbir
 */
public class BioData implements Runnable {
    Thread t;
   BioData(){
    
t = new Thread(this);
t.setPriority(5);
t.start();
    
    }
    
    
    @Override
    //the daefault values in field when the form is loaded
   
    public void run()
    {

    }

    
  
  
}
