package poo.csv_excel.archivos;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.stream.Stream;

/**
 * Clase concreta para generar archivos PDF
 */
public class ArchivoPDF extends Archivo {
    /**
     * Variable para almacenar el objecto del documento
     */
    private Document document;
    /**
     * Sirve para guardar la fuente que se utlizara para el documento
     */
    private Font fuente;
    /**
     * Sirve para generar la tabla opcionalmente en el PDF
     */
    private PdfPTable table;

    /**
     * Contructor de la clase
     *
     * @param nombreArchivo direccion del archivo
     * @throws FileNotFoundException ocurre si el archivo esta danado
     * @throws DocumentException     ocurre si el documento se encuentra danado
     */
    public ArchivoPDF(String nombreArchivo) throws FileNotFoundException, DocumentException {
        super(nombreArchivo);
        this.document = new Document();
        this.fuente = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);
        PdfWriter.getInstance(document, new FileOutputStream(nombreArchivo));
        this.document.newPage();

    }

    /**
     * Otro constructor de clase
     *
     * @param path          direccion de la carpeta en donde sera localizable el archivo
     * @param nombreArchivo nombre del archivo
     * @param fuente        tipo de fuente
     * @throws FileNotFoundException si el archivo no exite o esta danado
     * @throws DocumentException     si el documento no sirve
     */
    public ArchivoPDF(String path, String nombreArchivo, Font fuente) throws FileNotFoundException, DocumentException {
        super(path);
        this.document = new Document();
        this.fuente = fuente;
//        this.document.newPage();
        PdfWriter.getInstance(document, new FileOutputStream(path + "/" + nombreArchivo + ".pdf"));
        this.document.newPage();

    }

    /**
     * sirve para abrir el document
     */
    public void abrir() {
        this.document.open();
    }

    /**
     * Sirve para anezar texto al PDF
     *
     * @param texto cadena de texto que se agrega al PDF
     * @throws DocumentException si ocurre un error a la hora de leer el documento
     */
    public void anadirTexto(String texto) throws DocumentException {
        Chunk chunk = new Chunk(texto, this.fuente);
        this.document.add(chunk);
    }

    /**
     * Srive para asignar un conjunto de datos como cabecera a la tabla
     *
     * @param cabecera conjunto de datos que van en la parte de arriba de la tabla
     * @throws DocumentException si ocurre un error en el documento
     */
    public void insertarTabla(String... cabecera) throws DocumentException {
        this.table = new PdfPTable(cabecera.length);
        Stream.of(cabecera)
                .forEach(columnTitle -> {
                    PdfPCell header = new PdfPCell();
                    header.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    header.setBorderWidth(2);
                    header.setPhrase(new Phrase(columnTitle));
                    this.table.addCell(header);
                });
//        this.document.add(this.table);
    }

    /**
     * Permite anadir una fila a la tabla
     *
     * @param datos conjunto de datos para agregar a la tabla
     * @throws DocumentException si ocurre algo con el documento
     */
    public void insertarFilaATabla(String... datos) throws DocumentException {
        for (String dato :
                datos) {
            this.table.addCell(dato);
        }
    }

    /**
     * Permite agregar la tabla creada
     *
     * @throws DocumentException si ocurre algo con el documento
     */
    public void agregarTabla() throws DocumentException {
        this.document.add(this.table);
    }

    /**
     * sirve para cerra el archivo
     */
    public void cerrar() {
        this.document.close();
    }
}
