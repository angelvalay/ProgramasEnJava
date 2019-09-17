package tammath;

import java.util.Scanner;

public class Ralph {
    public static void main(String[] args) {
        Scanner conEntrada = new Scanner( System.in );
        try{
            int N = conEntrada.nextInt();
            if (N <= 1 || N >100){
                System.exit(0);
            }else{
                int a;
                int cont = 0;
                int contTotal = 0;
                int[] torres = new int[N];
                for (int i = 0; i < N; i++) {
                    a = conEntrada.nextInt();
                    if (a < 1 ||  a >= 20000){
                        System.exit(0);
                    }else{
                        torres[i] = a;
                    }
                }
                for (int i = (N-1); i >0; i--) {
                    cont = torres[i - 1] - torres[i];
                    contTotal += cont + 1;
                    if (cont == 0)
                        torres[i - 1]--;
                    else if (cont >0)
                        torres[i - 1]-=(cont + 1);

                }
                System.out.println(contTotal);
            }
        }catch (Exception e){
            System.exit(0);
        }
    }

}
