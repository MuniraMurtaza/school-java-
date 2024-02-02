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
public class ChallanFormModel extends Observable implements Observer{
   
    private static ChallanFormModel instance = null;
    
    protected String[] readVal = new String[18];
        
        
    private ChallanFormModel(){
    
    }
    
        public void eventPass(String evt)
    {
    //this function is used to decide which thread to invoke it will be used for reading operation
        switch(evt){
            case "readOp":
                readOp("AdFormTableData");
                break;
            default:
                System.out.println();
        }
    }
    
            public void readOp(String formName)
    {
       try{

         TableData tableData = TableData.getInstance("ChallanForm");
         
         tableData.addObserver(this);
         tableData.run();

           }
         catch(Exception e)
         {
            }       
    }
        
    public static ChallanFormModel getInstance() {
            if(instance == null) {
         instance = new ChallanFormModel();
      }
    return instance;
  }   

    @Override
    public void update(Observable o, Object arg) {

                        if(arg instanceof String[]){

            readVal = (String[]) arg; 

        setChanged();
         notifyObservers(readVal);

        }
                        
    }
}
