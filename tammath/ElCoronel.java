package tammath;

import java.util.ArrayList;
import java.util.Scanner;

public class ElCoronel {
    public static void main(String[] args) {
        Scanner conEntrada = new Scanner( System.in );
        try{
            int N = conEntrada.nextInt();
            int P[] = new int[N];
            if (N >= 1 && N <=1000){
                for (int i = 0; i < N; i++) {
                    P[i] = conEntrada.nextInt();
                    if (!(P[i] >= 1 && P[i] <=1000)){
                        System.out.println(0);
                        System.exit(0);
                    }
                }
                ArrayList<Integer> arrayListActual = new ArrayList<>();
                ArrayList<Integer> arrayListMayor = new ArrayList<>();
                arrayListActual.add(P[0]);
                for (int i = 1; i < N; i++) {
                    if (P[i] > P[i-1]){
                        arrayListActual.add(P[i]);
                    }else{
                        int distanciaActual = obtenerDiferencia(arrayListActual);
                        int distanciaMayor = obtenerDiferencia(arrayListMayor);
                        if (distanciaActual > distanciaMayor){
                            arrayListMayor.clear();
                            arrayListMayor.addAll(arrayListActual);
                        }
                        arrayListActual.clear();
                        arrayListActual.add(P[i]);
                    }
                }
                if (obtenerDiferencia(arrayListActual) > obtenerDiferencia(arrayListMayor)){
                    arrayListMayor.clear();
                    arrayListMayor.addAll(arrayListActual);
                }
                System.out.println(obtenerDiferencia(arrayListMayor));
            }else{
                System.out.println(0);
            }
        }catch (Exception e){
            System.out.println(e.toString());
            System.out.println(0);
        }
    }
    private static int obtenerDiferencia(ArrayList<Integer> numeros){
        return numeros.size() > 0 ? (numeros.get(numeros.size()-1) - numeros.get(0)) : 0;
    }

}
