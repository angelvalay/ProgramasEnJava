
package programa_vector3_13102015;


public class Programa_Vector3_13102015 {

    
    public static void main(String[] args) {
        String [] vector1={};
        String [] vector2={};
        String [] vector3={};
        
        vector1=ClaseVector.GrupoA();
        ClaseVector.ordenamiento(vector1);
        vector2=ClaseVector.GrupoB();
        ClaseVector.ordenamiento(vector2);
        vector3=ClaseVector.GrupoC();
        ClaseVector.ordenamiento(vector3);
        System.out.println("\n"+"GRUPO A:");
        for(int w=0;w<vector1.length;w++)
            System.out.println(vector1[w]);
        System.out.println("\n"+"GRUPO B:");
        for(int g=0;g<vector2.length;g++)
            System.out.println(vector2[g]);
        System.out.println("\n"+"GRUPO C:");
        for(int y=0;y<vector3.length;y++)
            System.out.println(vector3[y]);
    }
    
}
