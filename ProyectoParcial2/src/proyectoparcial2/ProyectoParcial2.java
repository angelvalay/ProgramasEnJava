
package proyectoparcial2;

import javax.swing.*;



public class ProyectoParcial2 {

    public static void main(String[] args) {
        
        contra();
        launcher menuPrincipal= new launcher();
        
        ImageIcon image= new ImageIcon ("iconBook.jpg");
        menuPrincipal.setTitle("Registros");
        menuPrincipal.setIconImage(image.getImage());
        menuPrincipal.setLocationRelativeTo(null);
        menuPrincipal.setVisible(true);
        
    }
    public static void contra(){
        /*
            Creo objectos para poder crear una ventana
        */
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingresa la contraseña");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        //Declaro Variables de paso (Parametros)
        String contraseña = null;
        String verificador="05071998";
        String[] options = new String[]{"Entrar", "Salir"};
        /*
            Muestro la ventana
        */
        boolean exito=true;
        
        while(exito){
            
        int option = JOptionPane.showOptionDialog(null, panel, "Usuario Principal",
                         JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                         null, options, options[0]);
        if(option == 0) // pressing OK button
        { 
        char[] password = pass.getPassword();
        // Sirve para mostrar otros caracteres en lugar de mostrar la contraseña
        contraseña= new String(password);
        // Imprime la contraseña
        
        }else {
            salirDelSistema();
            System.exit(0);
        }
        if(contraseña.equals(verificador)) exito=false;
        
        }
    }
    public static void salirDelSistema(){
        ImageIcon salida= new ImageIcon("Salida.jpg");
        JOptionPane.showMessageDialog(null, "Muchas Gracias....", "Salida", JOptionPane.PLAIN_MESSAGE, salida);
        
    } 
    
}
