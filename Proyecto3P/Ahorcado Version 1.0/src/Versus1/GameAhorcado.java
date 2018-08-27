
package Versus1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static javax.management.Query.lt;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class GameAhorcado extends javax.swing.JFrame {

    private final JButton btns[]= new JButton[27];
    private final String palabras[]=new String[8];
    private int ran;
    private int err=0;
    private String res[];
   
    public GameAhorcado() {
        this.setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        initComponents();
        jPanel1.setBackground(Color.red);
        setBackground(Color.BLACK);
        btns[1] = jButton1;
        btns[2] = jButton2;
        btns[3] = jButton3;
        btns[4] = jButton4;
        btns[5] = jButton5;
        btns[6] = jButton6;
        btns[7] = jButton7;
        btns[8] = jButton8;
        btns[9] = jButton9;
        btns[10] = jButton10;
        btns[11] = jButton11;
        btns[12] = jButton12;
        btns[13] = jButton13;
        btns[14] = jButton14;
        btns[15] = jButton16;
        btns[16] = jButton17;
        btns[17] = jButton18;
        btns[18] = jButton19;
        btns[19] = jButton20;
        btns[20] = jButton21;
        btns[21] = jButton22;
        btns[22] = jButton23;
        btns[23] = jButton24;
        btns[24] = jButton25;
        btns[25] = jButton26;
        btns[26] = jButton27;
        palabras[0]="PROGRAMACION".toUpperCase();
        palabras[1]="JAVA".toUpperCase();
        palabras[2]="COMPILAR".toUpperCase();
        palabras[3]="EJECUTAR".toUpperCase();
        palabras[4]="COMPUTADORA".toUpperCase();
        palabras[5]="CODIGO".toUpperCase();
        palabras[6]="ALGORITMOS".toUpperCase();
        palabras[7]="BASEDEDATOS".toUpperCase();
        
        for (int i = 1; i <btns.length;i++) {
            btns[i].addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        checarLetra(e);                    
                    } 
            });
        }
        iniciar();
        CerrarVentana();
    }

    private void CerrarVentana(){
     addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent e) {
         cerrar();
       }
     });
    }
    private void cerrar(){
       int a=JOptionPane.showConfirmDialog(this, "Quiere terminar el juego?", "AVISO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
       if(a==JOptionPane.YES_OPTION){
           System.exit(0);
       }
    }
    
    private void checarLetra(ActionEvent e){
        JButton bt = (JButton)e.getSource();
        char c[];
        
        for (int i = 1; i <btns.length; i++) {
            if(bt == btns[i]){
                //SE SACA LA LETRA
                c = Character.toChars(64+i);
                
                
                boolean esta = false;
                for (int j = 0; j< palabras[ran].length(); j++) {
                    if(c[0] == palabras[ran].charAt(j)){
                        res[j] = c[0]+"";
                        esta = true;
                    }
                }
                
                if(esta){
                    jLabel2.setText("");
                    for (String re : res) {
                        if(" ".equals(re))jLabel2.setText(jLabel2.getText() + "\n");
                        else jLabel2.setText(jLabel2.getText() + re +" ");
                    }
                    
                    boolean gano = true;
                    for (String re : res) {
                        if(re.equals("_")){
                            gano = false;
                            break;
                        }
                    }
                    
                    if(gano){
                        JOptionPane.showMessageDialog(this, "FELICIDADES HAS GANADO!!!");
                        iniciar();
                    }
               
                }else{
                    
                    intentos.setStringPainted(true);
                    switch(err){
                        case 0:
                            intentos.setValue(16);
                            CABEZA.setVisible(true);
                            break;
                        case 1:
                            intentos.setValue(33);
                            PECHO.setVisible(true);
                            break;
                        case 2:
                            intentos.setValue(48);
                            BRAZOIZQ.setVisible(true);
                            break;
                        case 3:
                            intentos.setValue(62);
                            BRAZODERECHO.setVisible(true);
                            break;
                        case 4:
                            intentos.setValue(84);
                            PIERNAI.setVisible(true);
                            break; 
                        case 5:
                            intentos.setValue(100);
                            PIERNADER.setVisible(true);
                            break;
                        default:
                            break;
                    }
                    
                    err++;
                }

                bt.setEnabled(false);

                    if(err == 6){
                        JOptionPane.showMessageDialog(this, "LA FRASE ERA:\n"+palabras[ran]);
                        iniciar();
                    }
                break;
            }
        }
 
    }
    private void iniciar(){

        err = 0;
        CABEZA.setVisible(false);
        PECHO.setVisible(false);
        BRAZOIZQ.setVisible(false);
        BRAZODERECHO.setVisible(false);
        PIERNAI.setVisible(false);
        PIERNADER.setVisible(false);
        intentos.setValue(0);
        intentos.setStringPainted(false);
        jLabel2.setText("");

        for (int i = 1; i <27; i++) {
            btns[i].setEnabled(true);
        }

        ran =(int) 0 + (int)(Math.random() * ((palabras.length - 1) + 1));

        String pal[] = palabras[ran].split(" ");
        res = new String[palabras[ran].length()+1];
        int j = 0;

        for (String pal1 : pal) {
            for (int i = 0; i <pal1.length(); i++) {
                jLabel2.setText(jLabel2.getText() + "_ ");
                res[j++] = "_";
            }
            jLabel2.setText(jLabel2.getText() + "\n");
            res[j++] = " ";
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        intentos = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        otraPalabra = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CABEZA = new javax.swing.JLabel();
        PECHO = new javax.swing.JLabel();
        BRAZODERECHO = new javax.swing.JLabel();
        BRAZOIZQ = new javax.swing.JLabel();
        PIERNADER = new javax.swing.JLabel();
        PIERNAI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setText("Juega al Ahorcado..");

        intentos.setBackground(Color.MAGENTA);
        intentos.setForeground(new java.awt.Color(0, 0, 255));
        intentos.setToolTipText("Intentos");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Adivina la palabra :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel13.setText("TECLA PARA DETECTAR LA LETRA");

        otraPalabra.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        otraPalabra.setText("Otra Palabra");
        otraPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otraPalabraActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        CABEZA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ahorcado.png"))); // NOI18N

        PECHO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pecho.png"))); // NOI18N

        BRAZODERECHO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BrazoDerecho.png"))); // NOI18N

        BRAZOIZQ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BrazoIzquierdo.png"))); // NOI18N

        PIERNADER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pierna.png"))); // NOI18N

        PIERNAI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pierna.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuerda.png"))); // NOI18N

        jButton1.setText("A");

        jButton2.setText("B");

        jButton3.setText("C");

        jButton4.setText("D");

        jButton5.setText("E");

        jButton6.setText("F");

        jButton7.setText("G");

        jButton8.setText("H");

        jButton9.setText("I");

        jButton10.setText("J");

        jButton11.setText("K");

        jButton12.setText("L");

        jButton13.setText("M");

        jButton14.setText("N");

        jButton16.setText("O");

        jButton17.setText("P");

        jButton18.setText("Q");

        jButton19.setText("R");

        jButton20.setText("S");

        jButton21.setText("T");

        jButton22.setText("U");

        jButton23.setText("V");

        jButton24.setText("W");

        jButton25.setText("X");

        jButton26.setText("Y");

        jButton27.setText("Z");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(CABEZA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(BRAZOIZQ)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PIERNAI, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(50, 50, 50)
                                    .addComponent(PIERNADER)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(PECHO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(BRAZODERECHO)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(otraPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton21))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton16))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26))
                            .addComponent(jButton27))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CABEZA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BRAZOIZQ)
                    .addComponent(PECHO)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(otraPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11)
                            .addComponent(jButton12)
                            .addComponent(jButton13)
                            .addComponent(jButton14)
                            .addComponent(jButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17)
                            .addComponent(jButton18)
                            .addComponent(jButton19)
                            .addComponent(jButton20)
                            .addComponent(jButton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton22)
                            .addComponent(jButton23)
                            .addComponent(jButton24)
                            .addComponent(jButton25)
                            .addComponent(jButton26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27))
                    .addComponent(BRAZODERECHO)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PIERNAI, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PIERNADER))))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void otraPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otraPalabraActionPerformed
        JOptionPane.showMessageDialog(this, "LA FRASE ERA:\n"+palabras[ran]);
                        iniciar();
    }//GEN-LAST:event_otraPalabraActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       cerrar();
    }//GEN-LAST:event_salirActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameAhorcado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameAhorcado().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BRAZODERECHO;
    private javax.swing.JLabel BRAZOIZQ;
    private javax.swing.JLabel CABEZA;
    private javax.swing.JLabel PECHO;
    private javax.swing.JLabel PIERNADER;
    private javax.swing.JLabel PIERNAI;
    private javax.swing.JProgressBar intentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton otraPalabra;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
