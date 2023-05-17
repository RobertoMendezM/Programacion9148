package LecturaFilesDir; /**
 *  Programa que despliega la pantalla para buscar un archivo
 *
 *  Curso de Programación
 *
 *  @author Roberto Méndez Méndez
 *  Fecha creación:  16-Nov-21
 *  @version 2/May/22
 */

import javax.swing.*;
import java.io.File;

public class SelectorGraficoArchivo1 {

    public static File seleccionaArchivo1(){
        File archivo = null;
        JFileChooser archivoSel = new JFileChooser();
        int valor = archivoSel.showOpenDialog(archivoSel.getParent());
        if(valor == JFileChooser.APPROVE_OPTION)
        {
            try{
                File tmpArch = archivoSel.getSelectedFile();
                String ruta = tmpArch.getAbsolutePath();
                archivo = new File(ruta);
            }catch (SecurityException f){
                System.err.println("No se pudo accesar el archivo");
            }

        } else {
            System.out.println("No seleccionaste ningún archivo u " +
                    "otro error");
        }

        return archivo;

    }
}
