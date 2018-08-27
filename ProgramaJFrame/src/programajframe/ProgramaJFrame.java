
package programajframe;

import javax.swing.ImageIcon;


public class ProgramaJFrame {

    
    public static void main(String[] args) {
        ImageIcon image= new ImageIcon ("iconBook.jpg");
        Launcher launcher= new Launcher();
        
        launcher.setTitle("Registros");
        launcher.setIconImage(image.getImage());
        launcher.setLocationRelativeTo(null);
        launcher.setVisible(true);
        
        
    }
    
}
