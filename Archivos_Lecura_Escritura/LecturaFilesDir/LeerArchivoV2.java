package LecturaFilesDir;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivoV2 {
    public static void main(String[] algo) {
        Scanner archivo;

        try {
            archivo = new Scanner(new File("tiendita2.csv"));
            for(int i = 0; i < 4; i++){
                System.out.println(archivo.nextLine());
            }

            archivo.close();

        }catch (FileNotFoundException e){
            System.err.println("No leí nada");
        }

    }
}
