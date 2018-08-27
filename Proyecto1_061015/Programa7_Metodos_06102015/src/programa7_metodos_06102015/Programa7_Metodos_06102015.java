
package programa7_metodos_06102015;
import javax.swing.*;

public class Programa7_Metodos_06102015 {

    
    public static void main(String[] args) {
        int opc=0;
        float res;
        float area=0;
        int base=0,altura=0;
        float per=0,perimetro=0;
        Object seleccion1;
        Object seleccion = JOptionPane.showInputDialog(
        null,
        "Seleccione una figura",
        "Operaciones con figuras",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon ("geo.jpg"),  
        new Object[] { "Cuadrado", "Rectangulo", "Circulo","Triangulo" }, 
        "Triangulo");
        if(seleccion=="Cuadrado")opc=1;
        if(seleccion=="Rectangulo")opc=2;
        if(seleccion=="Circulo")opc=3;
        if(seleccion=="Triangulo")opc=4;
        switch(opc){
            
            case 1:
                seleccion1 = JOptionPane.showInputDialog(
                    null,
                    "Seleccion Operacion",
                    "Seleccione la operacion que desea realizar  ",
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon ("cua.jpg"),  
                    new Object[] { "Area", "Perimetro" }, 
                    "Area");
                    base=Integer.parseInt(JOptionPane.showInputDialog("Ingresa La Base De La Figura"));
                if(seleccion1=="Area") {
                    
                        area=ClaseOption.area(base, area);   
                         JOptionPane.showMessageDialog(
                        null,
                        "Area De La Figura == " + area);
                }else if(seleccion1=="Perimetro"){
                        per=ClaseOption.per(base, perimetro);
                        JOptionPane.showMessageDialog(
                        null,
                        "Perimetro De La Figura == " + per);
                }
                
            break;
                
            case 2:
                seleccion1 = JOptionPane.showInputDialog(
                    null,
                    "Seleccion Operacion",
                    "Seleccione la operacion que desea realizar  ",
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon ("rect.jpg"),  
                    new Object[] { "Area", "Perimetro" }, 
                    "Area");
                   base=Integer.parseInt(JOptionPane.showInputDialog("Ingresa La Base De La Figura"));
                   altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura "));
                        if(seleccion1=="Area") {
                    
                            area=ClaseOption.area2(base, altura, area);
                            JOptionPane.showMessageDialog(
                            null,
                            "Area De La Figura == " + area);
                        }else if(seleccion1=="Perimetro"){
                            per=ClaseOption.peri2(base, altura, perimetro);
                            JOptionPane.showMessageDialog(
                            null,
                            "Perimetro De La Figura == " + per);
                }
            break;
                
            case 3:
                seleccion1 = JOptionPane.showInputDialog(
                    null,
                    "Seleccion Operacion",
                    "Seleccione la operacion que desea realizar  ",
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon ("cir.jpg"),  
                    new Object[] { "Area", "Perimetro" }, 
                    "Area");
                    base=Integer.parseInt(JOptionPane.showInputDialog("Ingresa El Radio De La Figura"));
                    
                    if(seleccion1=="Area") {
                    
                            area=ClaseOption.area0(base, area);
                            JOptionPane.showMessageDialog(
                            null,
                            "Area De La Figura == " + area);
                        }else if(seleccion1=="Perimetro"){
                            per=ClaseOption.per0(base, per);
                            JOptionPane.showMessageDialog(
                            null,
                            "Perimetro De La Figura == " + per);
                    }
            break;
                
            case 4:
                seleccion1 = JOptionPane.showInputDialog(
                    null,
                    "Seleccion Operacion",
                    "Seleccione la operacion que desea realizar  ",
                    JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon ("tri.jpg"),  
                    new Object[] { "Area", "Perimetro" }, 
                    "Area");
                
                if(seleccion1=="Area") {
                        base=Integer.parseInt(JOptionPane.showInputDialog("Ingresa La Base De La Figura"));
                        altura=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura "));
                            area=ClaseOption.area3(base, altura, area);
                            JOptionPane.showMessageDialog(
                            null,
                            "Area De La Figura == " + area);
                        }else if(seleccion1=="Perimetro"){
                            int l1=Integer.parseInt(JOptionPane.showInputDialog("Ingresa EL 1er Lado del triangulo"));
                            int l2=Integer.parseInt(JOptionPane.showInputDialog("Ingresa EL 2do Lado del triangulo"));
                            int l3=Integer.parseInt(JOptionPane.showInputDialog("Ingresa EL 3er Lado del triangulo"));
                            per=ClaseOption.peri3(l1, l2, l3, perimetro);
                            JOptionPane.showMessageDialog(
                            null,
                            "Perimetro De La Figura == " + per);
                    }
            break;
                
            default: 
                JOptionPane.showMessageDialog(
                null,
                "No Ingresastes ninguna opcion!!");
                break;
                
        }
    }
    
}

