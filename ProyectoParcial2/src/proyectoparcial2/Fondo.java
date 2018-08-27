
package proyectoparcial2;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class Fondo extends javax.swing.JPanel {

    
    public Fondo() {
        initComponents();
        this.setSize(533,570);
    }

    @Override
    public void paintComponent(Graphics g){
        Dimension tam= getSize();
        ImageIcon ImagenFondo = new ImageIcon("Fondo.jpg");
        g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width,tam.height,null);
        setOpaque(false);
        super.paintComponents(g);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
