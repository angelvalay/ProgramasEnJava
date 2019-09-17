package tammath;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner conEntrada = new Scanner( System.in );
        try{
            int N = conEntrada.nextInt();
            if (N <= 1 || N >1000000){
                System.exit(0);
            }else{
                int a;
                int suma = 0;
                for (int i = 0; i < N; i++) {
                    a = conEntrada.nextInt();
                    if (a < 1 ||  a > 1000000){
                        System.exit(0);
                    }else{
                        suma+= a;
                    }
                }
                System.out.println(suma);
            }
        }catch (Exception e){
            System.exit(0);
        }
    }
}