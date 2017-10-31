// ESERCITAZIONE 2

/**
 * @see Colore
 * @see Tester
 * @author zorzr
 */

public abstract class Forma implements Comparable<Forma> {
    protected Colore colore;
    
    public Forma(Colore col) {
        this.colore = col;
    }

    public Colore getColore() {
        return colore;
    }
    
    public abstract double area();
    public abstract double perimetro();
    
    // TESTER
    public abstract String toString();
    
    // INTERFACE
    public int compareTo(Forma f){
        if (this.area() < f.area()) {
            return -1;
        }
        return 0;
    }
    
}