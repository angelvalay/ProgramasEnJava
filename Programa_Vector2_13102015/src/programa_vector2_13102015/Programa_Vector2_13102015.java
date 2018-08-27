
package programa_vector2_13102015;


public class Programa_Vector2_13102015 {

    
    public static void main(String[] args) {
        char abc[]=new char[28];
        int x=0;
        for(char a='A';a<='Z';a++){
            x++;
            abc[x]=a;
        }
        for(int q=0;q<abc.length;q++)
            System.out.println(abc[q]);
    }
    
}
