
package controlescolar;
import java.text.*;
import java.util.*;
import javax.swing.*;


public class Controlescolar {

    public static void main(String[] args) {

        
     //VARIABLES
     String nom,entra;
     int n=0;int sem=0;
     int c=0, clav=0;
     double cuota=0;
     boolean val=true;
     double pagar=0;
     String ent; double resul;
     int a; 
     Scanner et=new Scanner(System.in);
     //CONTENIDO
     Date now = new Date(System.currentTimeMillis());
     SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
     SimpleDateFormat hour = new SimpleDateFormat("HH:mm:ss");

   System.out.println(date.format(now));
System.out.println(hour.format(now));
System.out.println(now);
     while(val==true){
    
     entra=JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE ALUMNOS: ");
     c=Integer.parseInt(entra);
     val=validarNum(val,c);
     
     }
     for(n=0;n<c;n++){
         nom=JOptionPane.showInputDialog("INGRESE SU NOMBRE");
         
        while(clav<1 || clav>6){
        entra=JOptionPane.showInputDialog("INGRESE SU CLAVE DE SU ESPECIALIDAD 1=PROGRAMACION,2=LABORAORIO,3=PUERICULTURA,4=CONTABILIDAD,5=ADMINISTRACION,6=ELECTRICIDAD");
         clav=Integer.parseInt(entra);
        switch (clav)
            
            
        {
             case 1: JOptionPane.showMessageDialog(null,"PROGRAMACION");break; 
             case 2: JOptionPane.showMessageDialog(null,"LABORATORIO");  break; 
             case 3: JOptionPane.showMessageDialog(null,"PUERICULTURA");break; 
             case 4: JOptionPane.showMessageDialog(null,"CONTABILIDAD");break; 
             case 5: JOptionPane.showMessageDialog(null,"ADMINISTRACION");break; 
             case 6: JOptionPane.showMessageDialog(null,"ELECTRICIDAD");break; 
             default :JOptionPane.showMessageDialog(null,"ERROR DE DATOS");
                 
        }
        
        } 
        val=true;
        
        while(val==true){
        entra=JOptionPane.showInputDialog("Ingrese el numero de semestre");
         sem=Integer.parseInt(entra);
         val=validarNum1(val,sem);
        }
         do{
        entra=JOptionPane.showInputDialog("Ingrese la couta");
         cuota=Double.parseDouble(entra);
         
         val=validarNum(val,(int)cuota);
         }while(val==true);
         
        resul= comodin(cuota,sem,pagar);
        
    JOptionPane.showMessageDialog(null,resul);
    

     }
     }
    public static double comodin (double cuota,int sem,double pagar){
        
        if (sem==1)pagar=cuota*0.95;
        if (sem==2||sem==3)pagar=cuota*0.92;
        if (sem==4 )pagar=cuota*0.90;
        if (sem==5||sem==6)pagar=cuota*0.88;
        return pagar;
    }
    public static boolean validarNum(boolean val, int c){
        if(c<0)val=true; else val=false;
        return val;
    }
    public static boolean validarNum1(boolean val, int c){
        if(c<1||c>6)val=true; else  val=false;
        return val;
    }
    
}

    
