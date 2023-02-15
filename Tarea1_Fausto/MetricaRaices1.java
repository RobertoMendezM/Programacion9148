import java.util.Scanner;
public class MetricaRaices1 {


    public static void main(String[] args) {
        System.out.println("Calculo la distancia y las raices");
        System.out.println("pon 1 para raices y 2 " +
                "para distancia euclideana");
        Scanner lecteur = new Scanner(System.in);
        int opcion = lecteur.nextInt();
        if( opcion == 1){
            MetricaRaices1.raicesEcuacion2doGrado();
        } else if  (opcion == 2){
            MetricaRaices1.metricaEuclideana();
        }else{
            System.out.println("Opción incorrecta");
        }
    } // fin de main

    public static void metricaEuclideana(){

    }

    public static void raicesEcuacion2doGrado(){
        Scanner coeficiente = new Scanner(System.in);
        double a,b,c;
        System.out.println("Ecuación de la forma \n ax^2 + bx + c = 0");
        System.out.print("Dame el valor de a: ");
        a = coeficiente.nextDouble();
        System.out.print("\n Dame el valor de b: ");
        b = coeficiente.nextDouble();
        System.out.print("\n Dame el valor de c: ");
        c = coeficiente.nextDouble();
        double solRight = MetricaRaices1.resgRight(a, b, c);

    }

    private static double resgRight(double a, double b, double c){

        return 0.0;
    }

    private double resgWrong(double a, double b, double c){

        return 0.0;
    }
}