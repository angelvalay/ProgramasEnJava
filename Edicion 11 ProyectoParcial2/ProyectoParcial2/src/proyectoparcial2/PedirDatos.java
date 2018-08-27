package proyectoparcial2;
import java.util.Calendar;
import java.util.Objects;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class PedirDatos {
    // <editor-fold defaultstate="collapsed" desc="Variables">   
    public static int c=0;
    public static Integer cont=1;
    public static String fin="";
    public static String nombre[]= new String[1000]; 
    public static String apepat[]= new String[1000]; 
    public static String apemat[]= new String[1000]; 
    public static String mun[]= new String[1000]; 
    public static String direccion[]= new String[1000]; 
    public static float crecant[]= new float[1000]; 
    public static Integer día[]=new Integer[1000];
    public static Integer mes[]=new Integer[1000];
    public static Integer año[]=new Integer[1000];
    public static boolean corte=true;
    public static String estado[]=new String [1000];
    public static float interés;
    public static Calendar calendario= Calendar.getInstance();
    public static Integer validar_día=calendario.get(Calendar.DATE);
    public static Integer validar_mes=1+(calendario.get(Calendar.MONTH));
    public static Integer validar_año=calendario.get(Calendar.YEAR);
    public static int opcion;
    public static double cantidadCred;
    public static Integer indice;
    public static int meses1;
    public static int plazo1=0;
    public static float cantidad_anticipo=0;
    static Integer v_año=0, v_mes=0, conMes=0;
    public static String name;
    public static String date;
    public static String creType;
    public static String PLAZO;
    public static int MESES;
    public static Object estadoBox="Seleccione..";
    // </editor-fold>  

    public static boolean entradaDatosLauncher(){
        c=(resultados.conta)-1;
        boolean sig=true;
        nombre[c]=launcher.nombre.getText();
        apepat[c]=launcher.apellidopaterno.getText();
        apemat[c]=launcher.apellidomaterno.getText();
        if("".equals(nombre[c]) || "".equals(apepat[c]) || "".equals(apemat[c])){
            launcher.mensaje.setText("LOS DATOS SON OBLIGATORIOS."); sig=false;//Impide que reciba nulos.
        }else{
            if(nombre[c].matches("^[A-Z ]*$") && apepat[c].matches("^[A-Z ]*$") && apemat[c].matches("^[A-Z ]*$")){
                sig=true;
            }
            else{
                launcher.mensaje.setText("SOLOS LETRAS MAYUSCULAS."); sig=false;
            }
        }
        return sig;
    }
    
    public static boolean entradaDatosLauncherDomicilio(){
        boolean sig=true;
        estadoBox=launcherDomicilio.estado.getSelectedItem();
        estado[c]=launcherDomicilio.estado.toString();
        mun[c]=launcherDomicilio.municipio.getText();
        direccion[c]=launcherDomicilio.domicilio.getText();
        if("".equals(mun[c]) || "".equals(direccion[c])){
            launcherDomicilio.mensaje.setText("LOS DATOS SON OBLIGATORIOS."); sig=false;//Impide que reciba nulos.
        }else{
            if(mun[c].matches("^[A-Z ]*$")){ sig=true;}
            else{
                launcher.mensaje.setText("SOLOS LETRAS MAYUSCULAS."); sig=false;
            }
        }
        return sig;
    }
    
    public static boolean entradaDatosLauncherCredito(){
        DecimalFormat decimales = new DecimalFormat("0.00");
        Object tipocre = null;
        boolean sig=true;
        try{
        tipocre=launcherCredito.tipocredito.getSelectedItem();
       
        crecant[c]=Float.parseFloat(launcherCredito.cantidad.getText());
        if(PedirDatos.crecant[PedirDatos.c]>=1000){
            if (tipocre=="Automoviles") {cantidadCred=crecant[c]* 1.15; indice=0;}
            if (tipocre=="Casa") {cantidadCred=crecant[c]* 1.25; indice=1;}
            if (tipocre=="Personal") {cantidadCred=crecant[c]*1.10; indice=2;}
            sig=false;
            launcherCredito.mensaje.setText(" ");
            JOptionPane.showMessageDialog(null, "La cantidad que le corresponderá pagar será de $"+ decimales.format(cantidadCred));
        }else{
            sig=true;
            launcherCredito.mensaje.setText("LA CANTIDAD MÍNIMA A SOLICITAR SON $1000.00");
        }
        }catch(Exception a){
            launcherCredito.mensaje.setText("ERROR EN EL DATO INGRESADO.");
            sig=true;
        }
        return sig;
    }
    
    public static boolean validarFecha(){
        boolean salir=true;
        try{
            día[c]=Integer.parseInt(launcherPlazo.fecha_día.getValue().toString());
            mes[c]=Integer.parseInt(launcherPlazo.fecha_mes.getValue().toString());
            año[c]=Integer.parseInt(launcherPlazo.fecha_año.getValue().toString());
        }catch(Exception a){}
        año[c]+=2000;
            if(Objects.equals(validar_día, día[c]) && Objects.equals(mes[c], validar_mes) && Objects.equals(año[c], validar_año))
                JOptionPane.showMessageDialog(null, "La fecha es correcta.", null, JOptionPane.INFORMATION_MESSAGE);
            else 
                {JOptionPane.showMessageDialog(null, "La fecha es Incorrecta. Vuelve a Intentarlo", null, JOptionPane.ERROR_MESSAGE); salir=false;}
        return salir;
    }
    
    public static boolean fechaAnticipo(){
        boolean salir=false;
        Integer v_día=validar_día;
        v_mes=Integer.parseInt(anticipo.Mes.getValue().toString());
        v_año=Integer.parseInt(anticipo.Año.getValue().toString());
        v_año+=2000;
        Integer MES= validar_mes;
        
        Object typecre=launcherCredito.tipocredito.getSelectedItem();
        if (typecre=="Automoviles") indice=0;
        if (typecre=="Casa")indice=1;
        if (typecre=="Personal")indice=2;
        
        if (indice==0)plazo1= PedirDatos.mesesAuto();
        if (indice==1)plazo1= PedirDatos.mesesCasa();
        if (indice==2)plazo1= PedirDatos.mesesPersonal();

        
        int añosPlazo = (plazo1/12) + validar_año;
        
        //Mayor o igual a la fecha actual
        
        if ((Objects.equals(v_año, validar_año) && v_mes>MES) || (v_año>validar_año && v_año<añosPlazo) || (v_año==añosPlazo && v_mes<=MES)){salir=false;}
        else{
                JOptionPane.showMessageDialog(null,"EL primer pago se realizará el siguiente mes. La fecha ingresada no corresponde al plazo de pagos.", null,JOptionPane.ERROR_MESSAGE); salir=true;    
        }
        return salir;
        
    }
    
    public static void salir(){
        opcion = JOptionPane.showConfirmDialog(null, 
                "¿Desea salir de la aplicación?", "AVISO", JOptionPane.YES_NO_OPTION);
        if (opcion==0) System.exit(0);
    }
    
    public static int mesesAuto(){
        int plazo=0;
        
        if(MESES==0)plazo=12;
        if(MESES==1)plazo=24;
        if(MESES==2)plazo=48;
        
        return plazo;
    }
    
    public static int mesesCasa(){
        int plazo=0;
        
        if(MESES==0)plazo=12;
        if(MESES==1)plazo=24;
        if(MESES==2)plazo=36;
        if(MESES==3)plazo=48;
        return plazo;
    }
    
    public static int mesesPersonal(){
        int plazo=0;
        
        if(MESES==0)plazo=12;
        if(MESES==1)plazo=24;
        return plazo;
    }
    
    public static String[] mesesA(){
        if (indice==0)plazo1= PedirDatos.mesesAuto();
        if (indice==1)plazo1= PedirDatos.mesesCasa();
        if (indice==2)plazo1= PedirDatos.mesesPersonal();
        int month=validar_mes +1;
        int year=año[c];
        int day=día[c];
        
        String vector[]= new String[plazo1];
        
        boolean feb29;
                
                /*
                int month=2;
                int year=2015;
                int day=30; 
                Estuve cambiando los valores de las variables para ver si funcionaban. 
                Puedes checarlo, sólo pon las originales en comentario.
                */
        
         for(int x=0;x<plazo1;x++){
            vector[x]=null;
        }
        
        for(int z=0;z<plazo1;z++){
            if(v_mes==month && v_año==year) conMes=z; //Capturar en que posicion del vector esta la fecha del anticipo 
                
            
            
            feb29=PedirDatos.bisiesto(year);//Checamos si el año es bisiesto...
            
            if ((month%2==0 && month<8 && month!=2 && day==31) || (month%2!=0 && month>7 && day==31)){
                vector[z]= "30/" + String.valueOf(month)+ "/" + String.valueOf(year);
                /*Si se debe de pagar el 31 y el mes sólo tiene 30 días, se paga el 30. 
                Aunque no estoy segura si debería ser el 30 de ese mes o el 1° del siguiente.*/
            }
            else if (month==2 && day>28 && feb29){vector[z]= "29/2/" + String.valueOf(year);
            //... Si se paga el 29,30 o 31, es febrero y el año es bisiesto, se pagará el 29.   
            }
            else if (month==2 && day>28 && feb29==false){vector[z]= "28/2/" + String.valueOf(year);
            //... Si se paga el 29,30 o 31, es febrero y el año no es bisiesto, se pagará el 28.
            }
            else{
                vector[z]=String.valueOf(day) + "/" + String.valueOf(month)+ "/" + String.valueOf(year);
                if(z==(plazo1-1))fin=vector[z];
            } 
            
            if(month==12)year++;
            if(month>=12)month-=12;
            month++; 
            
            
        }
        
        return vector;
    }
    
    public static String[] pagosPlazo(){
        cantidadCred-=cantidad_anticipo;
        DecimalFormat decimales = new DecimalFormat("0.00");
        String mensualidad[]= new String[plazo1];
        for(int x=0;x<plazo1;x++){
            mensualidad[x]=null;
        }
        for(int x=0;x<plazo1;x++){
            mensualidad[x]="$  "+String.valueOf(decimales.format(cantidadCred/plazo1));
            if(x==conMes) mensualidad[x]="$  "+String.valueOf(decimales.format((cantidadCred/plazo1)+cantidad_anticipo));
        }
        
        return mensualidad;
    }
    
    public static boolean validarCant(){
        boolean sig=false;
        try{
        cantidad_anticipo=Float.parseFloat(anticipo.cant_anticipo.getText());
        if(cantidad_anticipo<0 ) {
            JOptionPane.showMessageDialog(null,"Anticipo no valido. Prueba de nuevo.", null,JOptionPane.ERROR_MESSAGE); sig=true;
        }
        if(cantidad_anticipo>cantidadCred){
            JOptionPane.showMessageDialog(null,"Tu Anticipo no puede ser mayor a tu cantidad solicitada. Prueba de nuevo.", null,JOptionPane.ERROR_MESSAGE); sig=true;
        }
        
        }catch(Exception a){
            JOptionPane.showMessageDialog(null,"Error en la cantidad ingresada. Prueba de nuevo.", null,JOptionPane.ERROR_MESSAGE); sig=true;
        }
        return sig;
    }
    
    public static void resultados(){
        name=nombre[c]+" "+apepat[c]+" "+apemat[c];
        date= validar_día.toString() +"/"+ validar_mes.toString() +"/"+ validar_año.toString();
        Object tipocre;
        tipocre=launcherCredito.tipocredito.getSelectedItem();
        creType=tipocre.toString();
        PLAZO=String.valueOf(plazo1);
        
    } 
    
    public static boolean bisiesto(int año){
        //Checa si el año es bisiesto o no. Regresa verdadero si lo es y falso si no.
        boolean feb29;
        if(año % 4 == 0 && (año % 100 != 0 || año % 400 == 0))feb29=true; 
        else feb29=false;
        return feb29;
    }
    
    
}
