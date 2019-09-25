package poo.csv_excel.archivos;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase concreta que hereda de la clase Archivo, sirve para leer y escribir solo en archivos csv
 */
public class ArchivoCSV extends Archivo implements ManejableTabulado {
    /**
     * Permite saber si el archivo es de lectura o escritura
     */
    private int flag;

    /**
     * Constructor de la clase
     *
     * @param path Direccion del archivo
     * @param flag Saber si sera legible o escrito
     * @throws IOException Sera lanzado el error si ocurre algo con el archivo
     */
    public ArchivoCSV(String path, int flag) throws IOException {
        super(path);
        this.flag = flag;
        if (this.flag != Archivo.L && this.flag != Archivo.E) {
            throw new ExceptionInInitializerError("Flag no valida");
        }
    }

    /**
     * Permite la visualizacion de datos por consola
     *
     * @throws IOException Ocurrira un error si no se pudo abrir el archivo
     */
    @Override
    public void visualizarDatos() throws IOException {
        if (this.flag == Archivo.L) {
            CSVParser csvParser =
                    new CSVParser(new FileReader(this.getPath()), CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : csvParser) {
                // Reading all records at once into memory
                Iterator<String> csvRec = csvRecord.iterator();
                for (; csvRec.hasNext(); ) {
                    String rec = csvRec.next();
                    System.out.print(rec + ",");
                }
                System.out.println("");
            }
        } else
            System.err.println("No disponible para leer");
    }

    /**
     * Permite la visualizacion de datos si existe con una cabecera especifica
     *
     * @param cabecera Es conjunto de String que contiene el archivo
     * @throws IOException Marcara error si el archivo esta danado
     */
    public void visualizarDatos(String[] cabecera) throws IOException {
        if (this.flag == Archivo.L) {
            CSVParser csvParser = new CSVParser(new FileReader(this.getPath()), CSVFormat.DEFAULT
                    .withHeader(cabecera)
                    .withIgnoreHeaderCase()
                    .withTrim());
            for (CSVRecord csvRecord : csvParser) {
                for (String columna : cabecera) {
                    System.out.println(columna + " : " + csvRecord.get(columna));
                }
                System.out.println("");
            }
        } else
            System.err.println("No disponible para leer");
    }

    /**
     * Permite escribir datos al archivo
     *
     * @param datos el archivo se sobreecribira con los datos que ingresen
     * @throws IOException Lanza un error si el archivo que intenta abrir no funciona
     */
    @Override
    public void escribirDatos(Object... datos) throws IOException {
        if (this.flag == Archivo.E) {
//            CSVParser parser = new CSVParser(new FileReader(this.getPath()), CSVFormat.DEFAULT);
//            List<CSVRecord> listaDeRegistros = parser.getRecords();
//            new File(this.getPath()).delete();
            CSVPrinter csvPrinter = new CSVPrinter(new FileWriter(this.getPath()),
                    CSVFormat.DEFAULT.withRecordSeparator(','));
//            for (CSVRecord registro :
//                    listaDeRegistros) {
//                for (String str : registro) {
//                    csvPrinter.print(str != null ? str : "");
//                }
//                csvPrinter.println();
////                csvPrinter.printRecord(registro);
//            }
            csvPrinter.printRecord(datos);
            csvPrinter.flush();
            csvPrinter.close();
//            parser.close();
        } else
            System.err.println("No disponible para escribir");
    }

    /**
     * @return Devuelve un numero que puede ser de las constantes de la clase abtracta Archivo
     */
    public int getFlag() {
        return flag;
    }

    /**
     * @param flag Solo se permite las constantes que estan en la clase abtracta
     */
    public void setFlag(int flag) {
        this.flag = flag;
    }

    /**
     * Se obtiene los datos y se almamcenan en un array list
     *
     * @return Se obtiene una estructura de datos del archivo
     */
    @Override
    public ArrayList<ArrayList<String>> obtenerDatos(boolean conCabecera) throws IOException {
        ArrayList<ArrayList<String>> datos = new ArrayList<>();
        if (this.flag == Archivo.L) {
            CSVParser csvParser =
                    new CSVParser(new FileReader(this.getPath()), CSVFormat.DEFAULT);
            for (CSVRecord csvRecord : csvParser) {
                if (conCabecera) {
                    if (csvRecord.getRecordNumber() != 1) {
                        datos.add(this.obtenerRegistro(csvRecord));
                    }
                } else {
                    datos.add(this.obtenerRegistro(csvRecord));
                }
            }
//            System.out.println(datos.toString());
            return datos;
        } else {
            System.err.println("No disponible para leer");
            return null;
        }
    }

    /**
     * Se asigna un conjunto de datos
     *
     * @param datos Se da un conjunto de datos
     */
    @Override
    public void asignarConjuntoDatos(ArrayList<String> datos) {

    }

    /**
     * Permite obtener un registro a partir de un csvrecord
     *
     * @param csvRecord Registro de tipo CSVRecord
     * @return Un registro de String
     */
    private ArrayList<String> obtenerRegistro(CSVRecord csvRecord) {
        Iterator<String> csvRec = csvRecord.iterator();
        ArrayList<String> reg = new ArrayList<>();
        for (; csvRec.hasNext(); ) {
            reg.add(csvRec.next());
        }
//        System.out.println(reg.toString());
        return reg;
    }
}
