import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;
/**
 *
 * @author luis_
 */
public class HiloPaint implements Runnable{
    JProgressBar barPaint;
    int i;
    public static boolean finalizado = false;
    public HiloPaint(JProgressBar barPaint){
        this.barPaint = barPaint;
    }
    
    @Override
    public void run() {
        for(i=0; i <= 100; i++){
            if(finalizado == true){
                finalizado = false;
                barPaint.setForeground(Color.green);
                break;
            }
            barPaint.setValue(i);
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
