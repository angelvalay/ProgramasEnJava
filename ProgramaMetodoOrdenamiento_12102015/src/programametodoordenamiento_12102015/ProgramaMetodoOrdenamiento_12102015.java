
package programametodoordenamiento_12102015;
public class ProgramaMetodoOrdenamiento_12102015 {

    
    public static void main(String[] args) {
        int vector[]= {1,2,33,565,165};
        
        int[] n = OrdenarBurbuja(vector);
        
        for(int x=0;x<n.length;x++)
        System.out.println("["+x+"]"+" = "+n[x]);
        enBuscaDelMayor(vector);
        enBuscaDelMenor(vector);
    }
    public static int[] OrdenarBurbuja(int[] n)
    {
        int temp;
        int t = n.length;
        for (int i = 1; i < t; i++) 
        {
            for (int k = t- 1; k >= i; k--) 
            {
                if(n[k] < n[k-1])
                {
                    temp = n[k];
                    n[k] = n[k-1];
                    n[k-1]=  temp;
                }
            }
    }
    return n;
    }
    public static void enBuscaDelMayor(int[] listaNumeros){
        int iNumeroMayor, iPosicion;
        //Presuponemos que el numero mayor es el primero
        iNumeroMayor = listaNumeros[0];
        iPosicion = 0;
        for (int x=1;x<listaNumeros.length;x++){
            if (listaNumeros[x]>iNumeroMayor){
                iNumeroMayor = listaNumeros[x];
                iPosicion = x;
            }
        }
        System.out.println(iNumeroMayor+" En la Posicion -> "+iPosicion);
        
    }
    public static void enBuscaDelMenor(int[] listaNumeros){
        int iNumeroMenor, iPosicion;
        //Presuponemos que el numero mayor es el primero
        iNumeroMenor = listaNumeros[0];
        iPosicion = 0;
        for (int x=1;x<listaNumeros.length;x++){
            if (listaNumeros[x]<iNumeroMenor){
                iNumeroMenor = listaNumeros[x];
                iPosicion = x;
            }
        }
        System.out.println(iNumeroMenor+" En la Posicion -> "+iPosicion);
        
    }
  
    
}
