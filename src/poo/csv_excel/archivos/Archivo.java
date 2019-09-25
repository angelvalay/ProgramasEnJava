package poo.csv_excel.archivos;

/**
 * Clase abtracta para crear clases derivadas de archivo
 */
public abstract class Archivo {
    /**
     * Constante que permite que un archivo pueda ser escrito
     */
    public static final int E = 2;
    /**
     * Constante que permite que un archivo pueda ser legible
     */
    public static final int L = 1;
    /**
     * Tipo de archivo CSV
     */
    public static final int FILE_CSV = 0;
    /**
     * Tipo de archivo XLSX
     */
    public static final int FILE_XLSX = 1;
    /**
     * Direccion del archivo
     */
    private final String path;

    /**
     * @param path ubicacion del archivo
     */
    public Archivo(String path) {
        this.path = path;
    }

    /**
     * @return la direccion del archivo
     */
    public String getPath() {
        return path;
    }
}
