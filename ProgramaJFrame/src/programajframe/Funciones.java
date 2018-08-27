
package programajframe;

import javax.swing.JOptionPane;


public class Funciones {
    public Funciones() {
        
    }
    public static boolean bye;
    public static Integer age[]=new Integer [5];
    public static String nombre[]=new String [5],apellidos[]=new String [5];
    public static Integer con=0;
    
    
   public static void salirDelSistema(){
        JOptionPane.showMessageDialog(null, "Gracias... Hasta Pronto");
    } 
   public static void pedirDatos(){
       if(con<5){
       nombre[con]=Launcher.nombre.getText();
       apellidos[con]=Launcher.apellidos.getText();
       age[con]=Integer.parseInt(Launcher.edad.getText());
       con++;
       }else JOptionPane.showMessageDialog(null, "Ya puedes Capturar Mas Datos " , /*TITULO*/ "Mensaje Emitido", JOptionPane.PLAIN_MESSAGE, null);
       String c=String.valueOf(con+1);
       Launcher.conta.setText(c);
   }
   public static void mostrarDatos(){
       for(int x=0;x<5;x++){
       JOptionPane.showMessageDialog(null,"Reg:"+ (x+1) + "\n"+ "El nombre  : "+" "+nombre[x]+""+apellidos[x]+
               "\nLa edad es : "+age[x]+" años" , /*TITULO*/ "Mensaje Emitido", JOptionPane.PLAIN_MESSAGE, null);
       }
   }
   
}
