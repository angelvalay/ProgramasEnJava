package tammath;

import java.util.Scanner;

public class CasaDePapel {
    public static void main(String[] args) {
        Scanner conEntrada = new Scanner( System.in );
        try{
            int N = conEntrada.nextInt();
            if (N >= 3 && N <=5000){
                int resultado = encMenorCantPaq(N,N,0,0,true);
                System.out.println(resultado);
            }else{
                System.out.println(-1);
            }
        }catch (Exception e){
            System.exit(0);
        }
    }
    public static int encMenorCantPaq(int N, int rN, int paq3, int paq5, boolean empezarConCinco){
        if (empezarConCinco){
            if ((rN-5)>0){
                paq5++;
                rN -=5;
                return encMenorCantPaq(N,rN,paq3,paq5,true);
            }else if ((rN-5)==0){
                paq5++;
                rN -=5;
                return paq5 + paq3;
            }else{
                if (rN >N)
                    return -1;
                else{
                    if (rN%3==0){
                        return encMenorCantPaq(N,rN,paq3,paq5, false);
                    }else{
                        return encMenorCantPaq(N,(rN+5),0,paq5-1, false);
                    }
                }

            }
        }else{
            if ((rN-3)>0){
                paq3++;
                rN -=3;
                return encMenorCantPaq(N,rN,paq3,paq5,false);
            }else if ((rN-3)==0){
                paq3++;
                rN -=3;
                return paq5 + paq3;
            }else{

                return encMenorCantPaq(N,(rN+5)+(paq3*3),0,paq5-1, false);
            }
        }
    }
}
