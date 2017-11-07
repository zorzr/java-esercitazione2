// ESERCITAZIONE 2
import java.util.Arrays;

/**
 * @see Forma
 * @see Colore
 * @author zorzr
 */

public class ImgVect {
    private int n_max, n;
    private Forma[] vett;
    
    public ImgVect (int max) {
        n = 0;
        n_max = max;
        vett = new Forma[max];
    }
    
    public void agg_forma (Forma f) {
        if (n < n_max) {
            vett[n] =  f;
            n++;
        }
        else {
            System.out.println("Errore: numero massimo di forme raggiunto\n");
        }
    }
    
    public double area_tot () {
        int i;
        double s_tot = 0.;
        
        for (i = 0; i < n; i++) {
            s_tot += vett[i].area();
        }
        
        return s_tot;
    }
    
    public double area_col (Colore col) {
        int i;
        double s_col = 0.;
        
        for (i = 0; i < n; i++) {
            if (col.equals(vett[i].getColore())) {
                s_col += vett[i].area();
            }
        }
        
        return s_col;
    }
    
    // TESTER
    public void sortVett() {
        Arrays.sort(vett, 0, n);
    }
    
    public String toString() {
        String s = "";
        
        for (Forma f : vett) {
            if (f != null) {
                s += f + "\n";
            }
        }
        
        return s;
    }
}
