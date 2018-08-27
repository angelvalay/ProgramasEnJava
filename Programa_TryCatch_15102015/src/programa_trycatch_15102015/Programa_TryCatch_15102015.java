package programa_trycatch_15102015;

import javax.swing.*;


public class Programa_TryCatch_15102015 {

    public static void main(String[] args) {
        String nombre[]=new String[100];
        String domicilio[]=new String[100];
        byte edad[]=new byte[100];
        float sueldoBase[]=new float[100];
        short antiguedad[]=new short[100];
        int grado1[]=new int[6];
        Object grado;
        short año_nac[]=new short[100];
        float bono[]=new float[100];
        float aguinaldo[]=new float[100];
        boolean salir=true;
        int c=0;
        while(salir){
            nombre[c]=llenarDatos.nombre();
            domicilio[c]=llenarDatos.domicilio();
            edad[c]=llenarDatos.edad();
            sueldoBase[c]=llenarDatos.sueldo();
            antiguedad[c]=llenarDatos.antiguedad();
            grado=llenarDatos.gradoEstudios();
            if(grado=="Maestria") grado1[1]++;
            if(grado=="Ingenieria")grado1[2]++;
            if(grado=="Lincenciatura") grado1[3]++;
            if(grado=="Media Superior") grado1[4]++;
            if(grado=="Secundaria") grado1[5]++;
            
            año_nac[c]=(short)Operaciones.añoDeNacimiento(edad[c]);
            bono[c]=Operaciones.Bono(sueldoBase[c], antiguedad[c]);
            aguinaldo[c]=Operaciones.Aguinaldo(sueldoBase[c]);
            salir=llenarDatos.salirDelSistema();
            
            c++;
        }
        String aux; 
        float aux1;
        float aux2;
        float aux3;
        for(int i=1; i<=c; i++) {  
            for(int j=0; j<c-i; j++) { 
                if( nombre[j].compareTo( nombre[j+1] ) > 0 ) { 
                    aux   = nombre[j]; 
                    nombre[j]  = nombre[j+1]; 
                    nombre[j+1]= aux;
                    aux1 = sueldoBase[j];
                    sueldoBase[j]=sueldoBase[j+1];
                    sueldoBase[j+1]=aux1;
                    aux2=aguinaldo[j];
                    aguinaldo[j] =aguinaldo[j+1];
                    aguinaldo[j+1]=aux2;
                    aux3=bono[j];
                    bono[j]=bono[j+1];
                    bono[j+1]=aux3;
                }    
            } 
        }
        
     
        JOptionPane.showMessageDialog(null,
                "No. Empleados de acuerdo a el Grado de Estudios"+ "\n"
                +"Maestria = "+grado1[1]+ "\n"
                +"Ingenieria = "+grado1[2]+ "\n"
                +"Licenciatura = "+grado1[3]+ "\n"
                +"Media Superior = "+grado1[4]+ "\n"
                +"Secundaria = "+grado1[5]+ "\n"
                
        );
        
        for(int w=0;w<c;w++){
            if(w==0){
                System.out.print("Nombre ");
                System.out.print("|| Sueldo");
                System.out.print("|| Aguinaldo");
                System.out.print("|| Bono");
                System.out.println("\n"+"-------------------------------------------");
            }
            System.out.print(nombre[w]+" ||");
            System.out.print("$"+sueldoBase[w]+" ||");
            System.out.print("$"+aguinaldo[w]+" ||");
            System.out.print("$"+bono[w]);
            System.out.println("\n"+"-------------------------------------------");
        }
        
    }
    
}
