package proyecto_alfa;
/**
 *
 * @author The Blacks
 */
public class Validaciones {
    private final String texto;
    public Validaciones(String texto2) {
        texto = texto2;
    }
    public boolean forName(){
        String txt= texto;
        boolean isName=false;
        for(int a=0;a<txt.length();a++){
            if ((txt.charAt(a)>='a'&&txt.charAt(a)<='z') ||
                    (txt.charAt(a)>='A'&&txt.charAt(a)<='Z')||
                        (txt.charAt(a)==' ')) {
                isName=true; 
            }
            else{
                isName=false;
                break;
            }            
        }
        return isName;
    }   
    public boolean forNumber(){
        String txt = this.texto;
        boolean isNumber = false;
        for(int a=0; a<txt.length(); a++){
            if(txt.charAt(a)>='0' && txt.charAt(a)<='9'){
                isNumber = true;
            }
            else{
                isNumber = false;
                break;
            }            
        }        
       return isNumber;
    }
    public boolean isRFC(){
       boolean isRFC=false;
       if(this.texto.length()==10){
           for (int i = 0; i < 10; i++) {
               if(i<4){
                   if(texto.charAt(i)>='A'&&texto.charAt(i)<='Z'){
                       isRFC=true;
                   }else{
                      isRFC=false;
                      break;
                   }
               }else{
                   if(texto.charAt(i)>='0'&&texto.charAt(i)<='9'){
                       isRFC=true;
                   }else{
                      isRFC=false;
                      break; 
                   }
               }
           }
 
       } else{
           isRFC=false;
       }
       return isRFC;
    }
}
    