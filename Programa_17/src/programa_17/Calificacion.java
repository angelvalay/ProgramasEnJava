
package programa_17;


public class Calificacion {
    public static String Promedio(String text,int prom){
        
        if(prom<10){
        
            switch(prom){
                case 10:
                    text="Excelente";break;
                case 9:
                    text="Muy Bien";break;
                case 8:
                    text="Bien";break;
                case 7:
                    text="Regular";break;
                case 6:
                    text="Suficiente";break;
                default:
                    text="Reprobado";
        
            }
        }
        System.out.println(text);
        return text;
    }
}
