/**
 * Programa que ejemplifica manejo de 'excepciones' y como opera la clase padre
 *
 * Ejemplifica:  -> InputMismatchException, ArithmeticException, NumberFormatException,InterruptedException
 *       -> Thread.sleep(500)
 *
 * Ejercicio: Cambiar  InputMismatchException por NoSuchElementException, para ejemplificar como la clase padre
 * cacha excepciones de la clase hijo.
 *
 * Nota: Se utiliza un ciclo para que en caso de cometer un error vuelva a pedir los datos.
 *
 * Curso: programación 2022-2
 * Clase: 25/Mar/2022
 * Corregido: 25/Mar/2022
 * @author Roberto Mèndez Mèndez
 * @version 2
 */

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class PruebaExcepcionNumerica {

    public static void main(String [] args)  {
        Scanner teclado = new Scanner(System.in);
        double a, b;

        do {
            try {
                Thread.sleep(500);
                System.out.println("\n\t INGRESA LOS SIGUIENTES DATOS: \n");
                System.out.print("Da el valor de a: ");
                a = teclado.nextDouble();
                System.out.print("Da el valor de b: ");
                b = teclado.nextDouble();
                double c = a / b;
                System.out.println("La division de " + a + "entre "+ b + " es "
                        + c);
                System.out.print("Dime tu edad: " );
                String edad = teclado.next();
                int d = Integer.parseInt(edad);
                System.out.println("Tu edad es: " + d);
                break;
            }catch (InputMismatchException e) {
                System.err.println("Formato de número incorrecto");
                break;
            }catch(ArithmeticException e){
                System.err.println("división entre 0");

            } catch (NumberFormatException e) {
                System.err.println("Parse incorrecto. No diste tu edad " +
                        ";o el formato es incorrecto");

            }catch (InterruptedException e){
                System.err.print("Falla al utilizar Time.sleep");
             }
        }while( true );

    }
}
