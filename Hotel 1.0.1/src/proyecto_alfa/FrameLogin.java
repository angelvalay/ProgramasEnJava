package proyecto_alfa;

import conexionesExt.ConexionMySQL;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;

/**
 *
 * @author The Blacks
 */
public class FrameLogin extends javax.swing.JFrame {
    
    int contador=0;
    public FrameLogin() {
        super("Minimal-Frame-Application");
        initComponents();
        this.setTitle("Inicio de sesión");
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/hotel.png")).getImage());
        this.textoIntentosRestantes.setText(String.valueOf(3+this.contador)+" intentos restantes");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        usario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textoIntentosRestantes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 11)); // NOI18N
        jLabel1.setText("Password:");

        btnAceptar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 0, 51));
        btnAceptar.setText("Log In");
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.setFocusPainted(false);
        btnAceptar.setFocusable(false);
        btnAceptar.setOpaque(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        usario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usarioActionPerformed(evt);
            }
        });
        usario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usarioKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 12)); // NOI18N
        jLabel2.setText("User:");

        textoIntentosRestantes.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 11)); // NOI18N
        textoIntentosRestantes.setText("intentos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoIntentosRestantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoIntentosRestantes, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usarioActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_usarioActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        logearse();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
              btnAceptarActionPerformed(null);
        }
    }//GEN-LAST:event_passKeyPressed

    private void usarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usarioKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        this.pass.requestFocus();
        }
    }//GEN-LAST:event_usarioKeyPressed
    public void esperar (int segundos) {
        try {
        Thread.sleep (segundos*1000);
        } catch (Exception e) {
        // Mensaje en caso de que falle
        }
    }
    private void logearse (){
        String user1 = "1";
        String pass1 = "1234";
        if((getUsario().getText().equals(user1)) && (getPass().getText().equals(pass1))){
            this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            this.setDefaultCloseOperation(0);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    esperar(5);
                }
            };
            esperar(2);
            ConexionMySQL db = new ConexionMySQL();
            FrameIndex login = new FrameIndex(db.MySQLCo());            
            login.setVisible(true);
            this.dispose();
            this.contador=0;
            this.textoIntentosRestantes.setForeground(Color.BLACK);
        } 
        else{
            this.pass.setText(null);
            this.usario.setText(null);
            this.usario.requestFocus();
            this.contador++;
            if(contador>3){
                System.exit(0);
            }
            else{  
                this.textoIntentosRestantes.setText(String.valueOf(3-this.contador)+" intentos restantes");
                
                switch(this.contador){
                    case 1:
                        this.textoIntentosRestantes.setForeground(Color.BLUE);
                        break;
                    case 2:
                        this.textoIntentosRestantes.setForeground(Color.ORANGE);
                        break;
                    case 3:
                        this.textoIntentosRestantes.setForeground(Color.RED);
                        break;
                    default:
                        this.textoIntentosRestantes.setForeground(Color.BLACK);
                        break;
                }
            }
        }
        
    }
    
    public JPasswordField getPass() {
        return pass;
    }

    public JTextField getUsario() {
        return usario;
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel textoIntentosRestantes;
    private javax.swing.JTextField usario;
    // End of variables declaration//GEN-END:variables
}
