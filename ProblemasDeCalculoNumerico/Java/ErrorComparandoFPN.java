/**
 * Error al comparar números de punto flotante
 *
 *   Libro: Liang, Introduction to Java Programming and Data Structures
 *          pág. 87
 *
 *  @author  Roberto Méndez Méndez
 *  @since  23/Mar/22
 *  @version 1
 */

public class ErrorComparandoFPN {

    final double EPSILON = 1E-14;

    public static void main(String[] args){
        ErrorComparandoFPN.formaIncorrecta();

        ErrorComparandoFPN fc = new ErrorComparandoFPN();
        fc.formaCorrecta();
    }

    /**
     *  De manera teórica debería indicar true,
     *  pero por la forma de operar los números de
     *  puto flotante el resultado es false
     *
     */
    public static void formaIncorrecta(){
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        System.out.println(x == 0.5);

    }

    public void formaCorrecta(){
        double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
        if(Math.abs(x - 0.5) < EPSILON)
            System.out.println(x + " es aproximadamente 0.5");

    }



}
