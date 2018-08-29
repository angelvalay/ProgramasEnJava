package HeidyAhorcarda;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class juego {
    JTextField jt;
    JLabel lb;
    JLabel lb2;
    private boolean play =false;
    private String[] diccionario ={"CANTAR","BAILAR","REIR","APLAUDIR","APRENDER","GANAR","ESCRIBIR","APUNTAR","ACEPTAR","ACTUAR","PERMITIR","PREGUNTAR","EVITAR","CAMBIAR","LIMPIAR","RECOLECTAR","VENIR","COMPRAR","COMER","RECLAMAR","CERRAR","MONTAR","TREPAR","ELEGIR","PODER","LLAMAR","CONSTRUIR"};
    private char[] palabra_secreta;
    private char[] palabra;
    int intentos = 0;
    boolean cambios=false;
    
     juego(JTextField texto, JLabel emo, JLabel emo2){
        System.out.println("Juego del ahorcado ");
        this.palabra_secreta = Random().toCharArray();
        String s="";
                for(int i=0;i<=this.palabra_secreta.length-1;i++){
          s = s + "_";
          System.out.print(this.palabra_secreta[i]); 
        }
       
        this.palabra = s.toCharArray();
        this.jt=texto;
        this.lb= emo;
        this.lb2= emo2;
        jt.setText(s);
        /*lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes//icon/emo0.jpg")));
        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes//icon/ahorcado_0.jpg")));
        */
                this.play=true;
    }

    
        public void evaluar(char word){
        if(play){
        String p="";
         
        if(this.intentos==6){
           JOptionPane.showMessageDialog(null,"GAME OVER,FALLASTE !!!---JUEGO TERMINADO,FALLASTE !!!");
        }
        else{
            
           for(int j=0;j<=this.palabra_secreta.length-1;j++){
             
             if(this.palabra_secreta[j]==word){
                this.palabra[j]= word;
                this.cambios=true;
             }
             p = p + this.palabra[j];
           }
 
           if(this.cambios==false){
             this.intentos+=1; //se incrementa
             lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/emo"+this.intentos+".jpg")));
             lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ahorcado_"+this.intentos+".jpg")));
             if(this.intentos<6){
                JOptionPane.showMessageDialog(null,"FALLASTE !, te quedan " + (6-this.intentos) + " intentos más");
             }
           }else{
               this.cambios=false;
           }
           this.jt.setText(p);
           gano();
         }
       }
    }
    private void gano(){
        boolean win=false;
        for(int i=0;i<=this.palabra_secreta.length-1;i++){
            if(this.palabra[i]==this.palabra_secreta[i]){
                win=true;
            }else{
                win=false;
                break;
            }
        }
        if(win){
             JOptionPane.showMessageDialog(null,"Ganaste, Felicidades!!! \n espera tu premio");
             lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/win.jpg")));
        }
    }
    private String Random(){
    int num = (int)(Math.random()*(diccionario.length));
    return diccionario[num];
    }
    
}

