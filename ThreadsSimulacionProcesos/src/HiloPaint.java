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
    public HiloPaint(JProgressBar barPaint){
        this.barPaint = barPaint;
    }
    
    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(i=0; i <= 100; i++){
            barPaint.setValue(i);
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
