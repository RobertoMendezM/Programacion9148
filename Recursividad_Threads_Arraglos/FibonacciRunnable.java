/**
 * Curso: Programación
 *
 * Tomado de:
 * Buch: Gunter Saake Kai-Uwe Sattler (2021).
 *       Algorithmen and Datenstrukturen Eine Einführung mit Java
 * Buchseite: Pogramm 9.4
 *
 * Temas: Runnable-Threads
 *        llamadas recursivas
 *        Ciclos
 *
 * Fecha: 14/ Dic/ 21
 * Actualizado: 11/ May /22
 */
public class FibonacciRunnable implements Runnable{

    long fi;
    int num;

    public FibonacciRunnable(int n, long f){
        num = n;
        fi = f;
    }

    @Override
    public void run() {
        System.out.println("Starte #" + num);
        long res = fibonacci(fi);
        System.out.println("Abschlussverfahren: " + num +
                            " - "+"fibonacci(" + fi + ") =" + res);
    }

    long fibonacci(long f) {
        if (f < 2)
            return 1;
        else
            return fibonacci(f - 1) + fibonacci(f - 2);
    }

    public  static void main(String[] anfangsbedingung){

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new FibonacciRunnable(i,
                                    (long)(Math.random()*50) + 1));
        }

        for(int i = 0; i < 10; i++) threads[i].start();
    }
}
