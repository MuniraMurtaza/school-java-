/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package madarsa;

/**
 *
 * @author shabbir
 */
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.*;
import java.util.Observable;
import java.util.Observer;

public class Picture extends Observable implements Runnable{
Thread t;
 String value = "";
private javax.swing.JFileChooser jFileChooser1;
Picture(String threadName){
t = new Thread(this,threadName);
t.setPriority(5);
t.start();
try{
//t.join();
}catch(Exception e){}
}


   
    @Override
    public void run(){
setPicture();
instance = null;

}

protected void setPicture()
{
String Iname = "no picture selected";

jFileChooser1 = new javax.swing.JFileChooser();    
int returnVal = jFileChooser1.showOpenDialog((java.awt.Component)null);     
System.out.println("jfilechooser executed");
if ( returnVal == jFileChooser1.APPROVE_OPTION ) {
File file = jFileChooser1.getSelectedFile(); 
Iname = file.getAbsolutePath();
        if ((Iname != null) &&
                    Iname.toLowerCase().endsWith(".jpg") ||
                    Iname.toLowerCase().endsWith(".jpeg") ||
                    Iname.toLowerCase().endsWith(".gif") ||
                    Iname.toLowerCase().endsWith(".png"))
        {
            value = Iname;
     // System.out.println(value.toString()+"in picture thread");
       }

}

value = Iname;

System.out.println("in picture thread :" + value);

System.out.println("total observers of picture thread"+instance.countObservers());
setChanged();
notifyObservers(value);
}
    public static Picture getInstance(String threadName) {
          
        if(instance == null) {
         instance = new Picture(threadName);
         }
    
        return instance;
  }   
    public void closeThread(){
    
   instance = null; 
    }
    
    private static Picture instance;

}
