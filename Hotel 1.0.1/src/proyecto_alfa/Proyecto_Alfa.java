package proyecto_alfa;

import com.jtattoo.plaf.smart.SmartLookAndFeel;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author The Blacks
 */
public class Proyecto_Alfa {

    public static void main(String[] args) throws IOException {
        try {
            // setup the look and feel properties
            Properties props = new Properties();
            
            props.put("logoString", "Hotel"); 
            props.put("licenseKey", "INSERT YOUR LICENSE KEY HERE");
            
            props.put("selectionBackgroundColor", "241 118 99"); 
            props.put("menuSelectionBackgroundColor", "241 118 99"); 
            
            props.put("controlColor", "50 81 102");
            props.put("controlColorLight", "133 217 254");
            props.put("controlColorDark", "133 217 254"); 

            props.put("buttonColor", "50 81 102");
            props.put("buttonColorLight", "133 217 254");
            props.put("buttonColorDark", "133 217 254");

            props.put("rolloverColor", "50 81 102"); 
            props.put("rolloverColorLight", "133 217 254"); 
            props.put("rolloverColorDark", "133 217 254"); 

            props.put("windowTitleForegroundColor", "33 33 33");
            props.put("windowTitleBackgroundColor", "133 217 254"); 
            props.put("windowTitleColorLight", "133 217 254"); 
            props.put("windowTitleColorDark", "133 217 254"); 
            props.put("windowBorderColor", "133 217 254");
            
            // set your theme
            SmartLookAndFeel.setCurrentTheme(props);
            // select the Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            // Modo Dark
            /**
             * UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
             */
            // start application 
            ServerSocket SERVER_SOCKET = new ServerSocket(1334);
            
            FrameLogin Index = new FrameLogin();
            Index.setVisible(true);
            
        }
        catch ( UnsupportedLookAndFeelException ex) {
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Proyecto_Alfa.class.getName()).log(Level.SEVERE, null, ex);
        }catch(BindException be){
            JOptionPane.showMessageDialog(null, "Upss. Al parecer tienes abierto el programa, cierralo, e intentalo nuevamente.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
}
