// ESERCITAZIONE 2

/**
 * @see Colore
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
    
    // INTERFACE
    public int compareTo(Forma f){
        if (this.area() < f.area()) {
            return -1;
        }
        else if (this.area() > f.area()) {
            return 1;
        }
        return 0;
    }
    
}
