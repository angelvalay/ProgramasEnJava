package poo.csv_excel.archivos;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Clase concreta para la lectura de archivos XLSX
 */
public class ArchivoXLSX extends Archivo implements ManejableTabulado {
    /**
     * para guardar la direccion de tipo file
     */
    File fuente;

    /**
     * Constructor de la clase
     *
     * @param path ubicacion del archivo
     */
    public ArchivoXLSX(String path) {
        super(path);
        this.fuente = new File(this.getPath());
    }

    /**
     * Permite visualizar los datos
     *
     * @throws IOException Se lanza el error si fue no posible visualizar los datos
     */
    @Override
    public void visualizarDatos() throws IOException {
        FileInputStream archivoExcel = new FileInputStream(this.fuente);
        Workbook workbook = new XSSFWorkbook(archivoExcel);
        Sheet hojaDeCalculo = workbook.getSheetAt(0);
        for (Row currentRow : hojaDeCalculo) {
            for (Cell celdaActual : currentRow) {
                if (celdaActual.getCellTypeEnum() == CellType.STRING) {
                    System.out.print(celdaActual.getStringCellValue() + "\t");
                } else if (celdaActual.getCellTypeEnum() == CellType.NUMERIC) {
                    System.out.print(celdaActual.getNumericCellValue() + "\t");
                }
            }
            System.out.println();
        }
    }

    /**
     * Permite escribir los datos
     *
     * @param datos conjunto de datos que se guardaran en el archivo
     * @throws IOException Se lanza el error si no fue posible escribir los datos en el archivo
     */
    @Override
    public void escribirDatos(Object... datos) throws IOException {

    }

    /**
     * Permite obtener datos y almacenarlos en la esctructura
     *
     * @return Se obtiene una estructura de datos del archivo
     */
    @Override
    public ArrayList<ArrayList<String>> obtenerDatos(boolean conCabecera) throws IOException {
        ArrayList<ArrayList<String>> datos = new ArrayList<>();
        FileInputStream archivoExcel = new FileInputStream(this.fuente);
        Workbook workbook = new XSSFWorkbook(archivoExcel);
        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
            ArrayList<ArrayList<String>> datosPestana = new ArrayList<>();
            Sheet sheet = workbook.getSheetAt(i);
            for (Row currentRow : sheet) {
                ArrayList<String> fila = new ArrayList<>();
                for (Cell celdaActual : currentRow) {
                    if (celdaActual.getCellTypeEnum() == CellType.STRING) {
                        fila.add(celdaActual.getStringCellValue());
                    } else if (celdaActual.getCellTypeEnum() == CellType.NUMERIC) {
                        fila.add(String.valueOf((int) celdaActual.getNumericCellValue()));
                    }
                }
                datosPestana.add(fila);
            }
            if (conCabecera)
                datosPestana.remove(0);
            datos.addAll(datosPestana);
        }
        return datos;
    }

    /**
     * Permite asignar un conjunto de datos al archivo
     *
     * @param datos Se da un conjunto de datos
     */
    @Override
    public void asignarConjuntoDatos(ArrayList<String> datos) throws IOException, InvalidFormatException {
        FileInputStream archivoExcel = new FileInputStream(this.fuente);
        Workbook workbook = WorkbookFactory.create(archivoExcel);
        Sheet hojaDeCalculo = workbook.getSheetAt(0);
        Map<Integer, Object[]> mapaDeDatos = new TreeMap<Integer, Object[]>();
        mapaDeDatos.put(0, datos.toArray());
        Set<Integer> keyset = mapaDeDatos.keySet();
        int rownum = hojaDeCalculo.getLastRowNum();
        for (Integer key : keyset) {
            Row row = hojaDeCalculo.createRow(rownum++);
            Object[] objArr = mapaDeDatos.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                cell.setCellValue((String) obj);
                System.out.println(((String) obj));
            }
        }
        FileOutputStream archivoSalida = new FileOutputStream(this.getPath());
        workbook.write(archivoSalida);
        archivoSalida.close();
    }
}
