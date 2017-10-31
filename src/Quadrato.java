// ESERCITAZIONE 2

/**
 * @see Forma
 * @see Colore
 * @see Tester 
 * @see ImgVect
 * @author zorzr
 */

public class Quadrato extends Forma {
    protected double lato;
    
    public Quadrato (double l, Colore col) {
        super(col);
        this.lato = l;
    }

    public double getLato() {
        return lato;
    }
    
    public double area () {
        return lato*lato;
    }
    
    public double perimetro () {
        return 4*lato;
    }
    
    // TESTER
    public String toString () {
        return "Quadrato     lato = " + lato + "           colore = " + super.getColore();
    }
}
