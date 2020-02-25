import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
/**
 *
 * @author luis_
 */
public class HiloExcel implements Runnable{
    JProgressBar barExcel;
    int i;
    public HiloExcel(JProgressBar barExcel){
        this.barExcel = barExcel;
    }
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(i=0; i <= 100; i++){
            barExcel.setValue(i);
            System.out.println("Proceso "+ Thread.currentThread().getName() +" ejecutandose");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Proceso "+ Thread.currentThread().getName() +" finalizado");
        }
    }
}
