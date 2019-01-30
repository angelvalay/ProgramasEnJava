
package AdministracionTotal;

import java.awt.Component;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

public class PantallaFondo implements Border{
    public BufferedImage back;
    public PantallaFondo (){
        try{
            URL imagenFondo= new URL(getClass().getResource("../AdministracionTotal/FondoEmpresa.jpg").toString());
            back=ImageIO.read(imagenFondo);
        }catch (Exception ex) {
                Logger.getLogger(PantallaFondo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.drawImage(back,(x), (y), null);
        
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0,0,0,0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
    
}
    

