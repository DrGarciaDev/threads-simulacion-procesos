import java.awt.Color;
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
    public static boolean finalizado = false;
    public HiloExcel(JProgressBar barExcel){
        this.barExcel = barExcel;
    }
    
    @Override
    public void run() {
        for(i=0; i <= 100; i++){
            if(finalizado == true){
                finalizado = false;
                barExcel.setForeground(Color.green);
                break;
            }
            barExcel.setValue(i);
            System.out.println("Proceso "+ Thread.currentThread().getName() +" ejecutandose");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Proceso "+ Thread.currentThread().getName() +" finalizado");
        }
    }
}
