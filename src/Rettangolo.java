// ESERCITAZIONE 2

/**
 * @see Forma
 * @see Colore
 * @see Tester 
 * @see ImgVect
 * @author zorzr
 */

public class Rettangolo extends Forma {
    protected double altezza, base;
    
    public Rettangolo (double a, double b, Colore col) {
        super(col);
        this.altezza = a;
        this.base = b;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getBase() {
        return base;
    }
    
    public double area () {
        return base*altezza;
    }
    
    public double perimetro () {
        return 2*(base + altezza);
    }
    
    // TESTER
    public String toString () {
        return "Rettangolo   b = " + base + "   a = " + altezza + "    colore = " + super.getColore();
    }
}
