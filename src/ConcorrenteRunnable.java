
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author personal
 */
public class ConcorrenteRunnable implements Runnable{
    private MainPanel mainPanel;
    private int numeroConcorrente;

    public ConcorrenteRunnable(MainPanel mainPanel, int numeroConcorrente) {
        this.mainPanel = mainPanel;
        this.numeroConcorrente = numeroConcorrente;
    }
    
    @Override
    public void run() {
        Random random = new Random();
        
        while(!Thread.interrupted()) {
            int incr = random.nextInt(6);
            mainPanel.aggiornaPosizioneConcorrente(numeroConcorrente, incr);
            
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException ex) {
                return;
            }
        }
    }
}
