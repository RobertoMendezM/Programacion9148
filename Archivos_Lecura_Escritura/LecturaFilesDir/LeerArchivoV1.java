

package LecturaFilesDir;

import java.io.*;

public class LeerArchivoV1 {

        public static void main(String [] args ) throws FileNotFoundException, IOException {

            File f = SelectorGraficoArchivo1.seleccionaArchivo1();

            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String texto;
            while ((texto = br.readLine()) != null){

                System.out.println(texto);

            }
            br.close();

        }

}


