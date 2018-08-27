
package programa_trycatch_15102015;


public class Operaciones {
    public static int añoDeNacimiento(byte edad){
        int año;
        año=2015-edad;
        return año;
    }
    public static float Bono(float salario, short anti){
        float bono=salario;
        bono/=15;
        bono*=10;
        bono*=anti;
        return bono;
        
    }
    public static float Aguinaldo(float salario){
        float agui;
        agui=salario/15;
        agui*=40;
        return agui;
    }
    public static float[] grado(int grado[], int contadorEmpleados){
        float por[]=new float[6];
        por[0]=grado[0]/contadorEmpleados;
        por[1]=grado[1]/contadorEmpleados;
        por[2]=grado[2]/contadorEmpleados;
        por[3]=grado[3]/contadorEmpleados;
        por[4]=grado[4]/contadorEmpleados;
        por[5]=grado[5]/contadorEmpleados;
        return por;
    }

}


