
package programa_vector3_13102015;

import javax.swing.JOptionPane;


public class Programa_Vector3_13102015 {

    
    public static void main(String[] args) {
        String [] vector1 = new String [100];
        String [] vector2 = new String [100];
        String [] vector3 = new String [100];
        boolean apagador=true;
        String nombre;
        char grupo;
        String gru;
        int a,b,c;
        a=b=c=0;
        
        while(apagador){
            nombre=JOptionPane.showInputDialog("Ingresa el nombre del alumno");
            do{
            gru=JOptionPane.showInputDialog("Ingresa el grupo en que esta el alumno");
            grupo=gru.charAt(0);
            }while(grupo!='A'&&grupo!='B'&&grupo!='C');
            
            switch(grupo){
                case 'A':
                    vector1[a]=nombre;
                    a++;
                    break;
                case 'B': 
                    vector2[b]=nombre;
                    b++;
                    break;
                case 'C':
                    vector3[c]=nombre;
                    c++;
                    break;
                default:
            }
            apagador=ClaseVector.Salir(apagador);
            
        }
        
        ClaseVector.ordenamiento(vector1,a);
        ClaseVector.ordenamiento(vector2,b);
        ClaseVector.ordenamiento(vector3,c);
        System.out.println("\n"+"GRUPO A:");
        for(int w=0;w<a;w++)
            System.out.println(vector1[w]);
        System.out.println("\n"+"GRUPO B:");
        for(int g=0;g<b;g++)
            System.out.println(vector2[g]);
        System.out.println("\n"+"GRUPO C:");
        for(int y=0;y<c;y++)
            System.out.println(vector3[y]);
    }
    
}
