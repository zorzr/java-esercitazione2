// ESERCITAZIONE 2

/**
 * @see Forma
 * @see Colore
 * @see ImgVect
 * @author zorzr
 */

public class Tester {
    public static void main(String[] args) {
        ImgVect imm;
        imm = new ImgVect(5);
        
        imm.agg_forma( new Cerchio(1, Colore.RED) );
        imm.agg_forma( new Quadrato(4, Colore.BLUE) );
        imm.agg_forma( new Quadrato(3, Colore.RED) );
        imm.agg_forma( new Rettangolo(2, 5, Colore.YELLOW) );
        imm.agg_forma( new Cerchio(3, Colore.BLACK) );
        imm.agg_forma( new Cerchio(3, Colore.BLACK) );
        
        System.out.println(imm);
        
        System.out.println("Area totale = " + imm.area_tot());
        System.out.println("Area RED = " + imm.area_col(Colore.RED));
        System.out.println("Area BLUE = " + imm.area_col(Colore.BLUE));
        System.out.println("Area YELLOW = " + imm.area_col(Colore.YELLOW));
        System.out.println("Area BLACK = " + imm.area_col(Colore.BLACK));
        
        // INTERFACE
        imm.sortVett();
        System.out.println("\n" + imm);
    }
}
