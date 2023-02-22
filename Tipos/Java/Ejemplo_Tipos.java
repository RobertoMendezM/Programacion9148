/**
 * Programa para ejemplificar
 * los distintos tipos en JAVA
 *
 *  Curso: Programación
 *
 *  editado: 20-Feb-23
 */
public class Ejemplo_Tipos {

    public static void main(String[] algo){
       Boolean bool = true;
       boolean v = true;
       char c = 'c';
       short sh = -32768;
       int n = 2147483647;
       // Nota la L al final
       long l = 9223372036854775807L;
        // Nota la f al final
       float f = 673093.1234f;
       // Busco poner el valor máximo para float
       //float g = (float) ((float)3.4*Math.pow(10, 38));
        float g = (float)(3.4*Math.pow(10, 38));
        double d = 673093.1234;
        double d2 = 0.3;
        String s = "Fractal de Pitágoras";
        System.out.println(f);
        System.out.printf("%.4f",f);
        System.out.println();
        System.out.println(g);
        System.out.println(d);
        System.out.println(f + .0006);
        System.out.println(d + .0006);
        System.out.println(d2);

    }
}
