/**
 * Obtención del epsilon de máquina y muestra
 * de un error a la hora de obtenerlo
 *
 *   Libro: Einar Smith, Introduction to the Tools
 *          of Scientific Computing
 *          pág. 29
 *
 *  @author  Roberto Méndez Méndez
 *  @since  23/Mar/22
 *  @version 7/Abr/22
 */
public class EpsilonDeMaquina {

    public static void main(String[] algo){
        System.out.println("Usando el método epsilonMaquina()");
        EpsilonDeMaquina.calculaEpsilon();
        System.out.println("Ahora utilicemos el método epsilonMaquinaSad()");
        EpsilonDeMaquina.calculaEpsilonIncorrecto();
        System.out.println("¿Por qué el resultado fue tan diferente?");
    }

    /**
     * Método que calcula el Epsilon de Máquina
     */
    public static void calculaEpsilon(){
        double eps = 1.0;
        int i = 0;
        while( 1 + eps > 1){
            eps /= 2;
            i++;  // i = i + 1;
        }
        double epsMachine = eps*2;
        System.out.println("El epsilon de máquina para double es: " + epsMachine);
        System.out.println("Por qué  i es: " + i);

    }
    /**
     * Método teóricamente equivalente a calculaEpsilon()
     * pero que no logra calcular el epsilon de máquina
     */
    public static void calculaEpsilonIncorrecto(){
        double eps = 1.0;
        int i = 0;
        while( eps > 0){
            eps /= 2;
            i++;
        }
        System.out.println("El epsilon de máquina para double es: " + eps);
        System.out.println("Por qué  i es: " + i);

    }
}


