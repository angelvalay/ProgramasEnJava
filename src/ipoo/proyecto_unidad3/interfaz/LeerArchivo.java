package interfaz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author isaac
 */
public class LeerArchivo {

    String path;

    public LeerArchivo(String path) {
        this.path = path;
    }

    public ArrayList<String> delimitador_cadena() throws FileNotFoundException {
        ArrayList<String> arreglo = new ArrayList<String>();
        File file = new File(this.path);
        Scanner sc = new Scanner(file);

        //leyendo cadena por delimitador y guardandola en un arraylist
        while (sc.hasNextLine()){
            sc.useDelimiter(",");
            //System.out.println(sc.next());
            arreglo.add(sc.next());
            System.out.println(arreglo.get(arreglo.size()-1));
        }
        return arreglo;
    }
}
