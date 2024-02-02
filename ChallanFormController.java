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
public class ChallanFormController implements Observer{
   
    private static ChallanFormController instance = null;
    ChallanFormModel model = ChallanFormModel.getInstance();
    ChallanForm view = ChallanForm.getInstance() ;
    String readVal[] = new String[18];
    private ChallanFormController(){
    
     model.addObserver(this);
     setValue();
view.setVisible(true);
    }
    protected void setTotalDefault(){
view.getTableValue(readVal);
}
    
    public void setValue(){
    model.eventPass("readOp"); 

    }
    public static ChallanFormController getInstance() {
            if(instance == null) {
         instance = new ChallanFormController();
      }
    return instance;
  }   

    @Override
    public void update(Observable o, Object arg) {

            if(arg instanceof String[])
           {
            
            readVal = (String[]) arg;
                setTotalDefault();
            }
                
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
