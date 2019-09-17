package Login;

import AdministracionTotal.Conexion;
import AdministracionTotal.InicioAdmin;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class contraPrincipal extends javax.swing.JFrame {
    
    
    public static boolean Sig=true;
    boolean WordFalse= true;
    public contraPrincipal() {
        setUndecorated(true);
        initComponents();
        CerrarVentana();
        getContentPane().setBackground(Color.WHITE);
        
        OpaqueButtons(); // Metodo para ocultar El Bordo de Los botones
        setLocationRelativeTo(null); // Te pérmite Centrar La Ventana
        setResizable(false); //Te permite No modificar el tamaño de la ventana
        setTitle("Login");
        User.setText("Usuario....");
        PassWord.setText("Contraseña...");
        
        
        
    }
    

    private void OcultarTextoPassWord(MouseEvent a){
        PassWord.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
             PassWord.setText("");
            }
        });
    }

    private void OcultarTextoUser(MouseEvent a){
        User.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
             User.setText("");
            }
        });
    }
    private void OpaqueButtons(){
        Salir.setOpaque(false);
        Salir.setContentAreaFilled(false);
        Salir.setBorderPainted(false);
        Ingresar.setOpaque(false);
        Ingresar.setContentAreaFilled(false);
        Ingresar.setBorderPainted(false);
        TypeUser.setToolTipText("Seleccione..");
    }
    public void cleanField(){
        User.setText("Teclea Usuario...");
        PassWord.setText("Contraseña...");
        TypeUser.setSelectedIndex(0);
    }
    public boolean ContraseñaTrue(){
        boolean WordTrue =true;
        
        String Usuario="ADM";
        String UserVentas ="Vendedor";
        String ContraVentas="123VEN";
        String Contraseña="123ADM";
        if(Usuario.equals(User.getText()) && Contraseña.equals(PassWord.getText())&& TypeUser.getSelectedItem()=="Administrador(Gerente)"){
            // Entre Al Menu PrincipalAccesoPremium
            WordTrue=true;
            WordFalse=true;
        }else if(UserVentas.equals(User.getText()) && ContraVentas.equals(PassWord.getText())&& TypeUser.getSelectedItem()=="Vendedor(Empleado)"){
            // entre Al Menu PrincipalAcessoFree
            WordTrue=false;
            WordFalse=true;
        } 
        else {
            
            WordFalse=false;
            cleanField();
            
            JOptionPane.showMessageDialog(null, "Datos Incorrectos. Vuelve a Intentarlo.", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        return WordTrue;
    }
    public void salir(){
        
        int opcion = JOptionPane.showConfirmDialog(this, "Esta Seguro Que Quiere Salir?", "Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if (opcion==0) System.exit(0);
    }
    private void CerrarVentana(){
     addWindowListener(new WindowAdapter() {
       public void windowClosing(WindowEvent e) {
         salir();
       }
     });
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PassWord = new javax.swing.JPasswordField();
        User = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TypeUser = new javax.swing.JComboBox();
        MostrarContra = new javax.swing.JCheckBox();
        verContra = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Ingresar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusCycleRoot(false);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Originales/Perfil2.jpg"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);

        PassWord.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        PassWord.setToolTipText("Ingrese la contraseña que concida con su usuario...");
        PassWord.setBorder(null);
        PassWord.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassWordMousePressed(evt);
            }
        });
        PassWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassWordKeyPressed(evt);
            }
        });

        User.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        User.setToolTipText("El nombre del usuario\n tiene como maximo \n 10 caracteres...");
        User.setBorder(null);
        User.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        User.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        User.setName(""); // NOI18N
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UserMousePressed(evt);
            }
        });
        User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserKeyTyped(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Originales/Configuracion.jpg"))); // NOI18N

        TypeUser.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        TypeUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador(Gerente)", "Vendedor(Empleado)" }));
        TypeUser.setToolTipText("Seleccione el tipo..");
        TypeUser.setBorder(null);
        TypeUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TypeUser.setFocusable(false);
        TypeUser.setName(""); // NOI18N
        TypeUser.setOpaque(false);
        TypeUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TypeUserKeyPressed(evt);
            }
        });

        MostrarContra.setBackground(new java.awt.Color(0, 0, 0));
        MostrarContra.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        MostrarContra.setForeground(new java.awt.Color(255, 255, 255));
        MostrarContra.setText("Mostrar Contraseña");
        MostrarContra.setContentAreaFilled(false);
        MostrarContra.setFocusPainted(false);
        MostrarContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarContraMousePressed(evt);
            }
        });
        MostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarContraActionPerformed(evt);
            }
        });

        verContra.setFont(new java.awt.Font("Calibri Light", 1, 10)); // NOI18N
        verContra.setEnabled(false);
        verContra.setFocusable(false);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Password.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));

        Ingresar.setBackground(new java.awt.Color(0, 0, 0));
        Ingresar.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setText("Ingresar");
        Ingresar.setBorder(null);
        Ingresar.setBorderPainted(false);
        Ingresar.setContentAreaFilled(false);
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.setBorder(null);
        Salir.setBorderPainted(false);
        Salir.setContentAreaFilled(false);
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Salir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalirKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(245, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(null);
        jMenu1.setText("Usuario...");
        jMenu1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setBorder(null);
        jMenu3.setText("Preferencias..");
        jMenu3.setContentAreaFilled(false);
        jMenu3.setFocusable(false);
        jMenu3.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jMenu1.add(jMenu3);

        jMenuItem1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Imformacion..");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Ayuda..");
        jMenu2.setFocusable(false);
        jMenu2.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jMenu2.setRequestFocusEnabled(false);
        jMenu2.setRolloverEnabled(false);
        jMenu2.setVerifyInputWhenFocusTarget(false);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addComponent(MostrarContra)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PassWord)
                                .addGap(2, 2, 2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(verContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TypeUser, 0, 199, Short.MAX_VALUE))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PassWord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TypeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verContra, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MostrarContra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PassWord.getAccessibleContext().setAccessibleDescription("\n");
        User.getAccessibleContext().setAccessibleName("");
        User.getAccessibleContext().setAccessibleDescription("El nombre del usuario\ntiene como maximo \n10 caracteres...");
        TypeUser.getAccessibleContext().setAccessibleName("Seleccione el tipo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        
        Sig=ContraseñaTrue();
        if(WordFalse){
        InicioAdmin menúPrincipal = new InicioAdmin();
        menúPrincipal.setLocationRelativeTo(null);
        menúPrincipal.setVisible(true);
        this.setVisible(false);
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        salir();
    }//GEN-LAST:event_SalirActionPerformed

    private void UserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserKeyTyped
        int CharLong=10;
        if(User.getText().length()>CharLong ){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_UserKeyTyped

    private void SalirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalirKeyTyped
        evt.consume();
    }//GEN-LAST:event_SalirKeyTyped

    private void PassWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassWordKeyPressed
        if(KeyEvent.VK_ENTER==evt.getKeyCode()){
        //this.OcultarTextoPassWord(evt);
        Sig=ContraseñaTrue();
        if(WordFalse){
        InicioAdmin menúPrincipal = new InicioAdmin();
        menúPrincipal.setLocationRelativeTo(null);
        menúPrincipal.setVisible(true);
        this.setVisible(false);
        }
        }
    }//GEN-LAST:event_PassWordKeyPressed

    private void TypeUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TypeUserKeyPressed
        if(KeyEvent.VK_ENTER==evt.getKeyCode()){
        //this.OcultarTextoUser(evt);
        Sig=ContraseñaTrue();
        if(WordFalse){
        InicioAdmin menúPrincipal = new InicioAdmin();
        menúPrincipal.setLocationRelativeTo(null);
        menúPrincipal.setVisible(true);
        this.setVisible(false);
        }
        }
    }//GEN-LAST:event_TypeUserKeyPressed

    private void UserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMousePressed
        User.setEnabled(true);
        this.OcultarTextoUser(evt);
    }//GEN-LAST:event_UserMousePressed

    private void PassWordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassWordMousePressed
        PassWord.setEnabled(true);
        TypeUser.setEnabled(true);
        this.OcultarTextoPassWord(evt);
    }//GEN-LAST:event_PassWordMousePressed

    private void MostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarContraActionPerformed
        
    }//GEN-LAST:event_MostrarContraActionPerformed

    private void MostrarContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarContraMousePressed
       if(MostrarContra.isSelected()){
           verContra.setText(null);
           verContra.setVisible(false);
            }
        else {verContra.setVisible(true);
        verContra.setText(PassWord.getText());
           }
       
    }//GEN-LAST:event_MostrarContraMousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JCheckBox MostrarContra;
    private javax.swing.JPasswordField PassWord;
    private javax.swing.JButton Salir;
    public static javax.swing.JComboBox TypeUser;
    public static javax.swing.JTextField User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel verContra;
    // End of variables declaration//GEN-END:variables
}
