
package programa_mostrarcontraseña;



import javax.swing.*;


public class Programa_MostrarContraseña {

    
    public static void main(String[] args) {
        /*
            Creo objectos para poder crear una ventana
        */
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Ingresa la contraseña");
        JPasswordField pass = new JPasswordField(10);
        panel.add(label);
        panel.add(pass);
        //Declaro Variables de paso (Parametros)
        String contraseña;
        String[] options = new String[]{"Ingresar", "Cancelar"};
        /*
            Muestro la ventana
        */
        int option = JOptionPane.showOptionDialog(null, panel, "Usuario x",
                         JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                         null, options, options[1]);
        if(option == 0) // pressing OK button
        { 
        char[] password = pass.getPassword();
        // Sirve para mostrar otros caracteres en lugar de mostrar la contraseña
        contraseña= new String(password);
        // Imprime la contraseña
        System.out.println("Your password is: " + contraseña);
        }else System.exit(0);
        
    }
    
}
