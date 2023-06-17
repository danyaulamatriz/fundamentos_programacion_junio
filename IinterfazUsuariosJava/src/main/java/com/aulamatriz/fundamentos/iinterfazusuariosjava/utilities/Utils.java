
package com.aulamatriz.fundamentos.iinterfazusuariosjava.utilities;

import com.aulamatriz.fundamentos.iinterfazusuariosjava.abstraccion.Usuario;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Utils {
    public static void guardarUSuario(Usuario usuario){
        FileWriter fichero = null;
        PrintWriter pw = null;
        String linea = usuario.getNombre()+";"+usuario.getApellido()+";"+usuario.getTipoDocumento()+";"+usuario.getNumeroDocumento();
        try
        {
            fichero = new FileWriter("C:\\Users\\AULA301-PC1\\Desktop\\prueba.txt");
            pw = new PrintWriter(fichero);
            pw.println(linea);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
}
