package Login;


import AdministracionTotal.InicioAdmin;
import AdministracionTotal.PanelBD1;
import AdministracionTotal.usuarios;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import javax.swing.*;
import proyectoparcial3.ProyectoParcial3;



public class contraPrincipal extends javax.swing.JFrame {
    public static String tipoDeUsuario;
    private final PanelBD1 pan= new PanelBD1();
    boolean WordFalse= false;
    public contraPrincipal() {
        initComponents();
        CerrarVentana();
        Nimbus2000();
        getContentPane().setBackground(Color.WHITE);
        OpaqueButtons(); // Metodo para ocultar El Bordo de Los botones
        setLocationRelativeTo(null); // Te pérmite Centrar La Ventana
        setResizable(false); //Te permite No modificar el tamaño de la ventana
        if(ProyectoParcial3.getConnection()!=null){
            con.setText("Conectado");
        }else{
            con.setText("Desconectado");
        }
    }
    
    private void Nimbus2000(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e){
            
        }
        SwingUtilities.updateComponentTreeUI( this );
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
        
        Ingresar.setOpaque(false);
        Ingresar.setContentAreaFilled(true);
        Ingresar.setBorderPainted(false);
        TypeUser.setToolTipText("Seleccione..");
    }
    public void cleanField(){
        User.setText("");
        PassWord.setText("");
        TypeUser.setSelectedIndex(0);
    }
    private boolean ContraseñaTrue(){
        boolean WordTrue =false;
        try{
        String tipo = null;
        String PASSWORD;
        PASSWORD = PassWord.getText().toString();
        switch (TypeUser.getSelectedIndex()){
            case 0: tipo="Administrador"; break;
            case 1: tipo="Empleado";break;
        }
        ResultSet rs= ProyectoParcial3.getConexion().setBusqueda("usuarios","numEmpleado",Integer.parseInt(User.getText()));
            //Corregir 2, 1 === 3, 2
            if(rs.next()){
                String contr= rs.getString(3);
                String type= rs.getString(2);
                tipoDeUsuario=type;
                if(PASSWORD.equals(contr) && tipo.equals(type)) {
                    WordTrue=true;
                }else{
                    JOptionPane.showMessageDialog(this, "Contraseña: "+contr + "\n" + "Tipo de usuario: "+ type
                    + "\n Usuario: "+ User.getText());
                    JOptionPane.showMessageDialog(this, "Contraseña Incorrecta");
                    WordTrue=false;
                }
            }else JOptionPane.showMessageDialog(this, "ID No encontrado");
        }catch(Exception a){
        }
        return WordTrue;
    }
    public void salir(){
        if (JOptionPane.showConfirmDialog(this, 
                "¿Estás seguro de que quieres salir?", 
                "Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION) 
            System.exit(0);
    }
    private void CerrarVentana(){
     addWindowListener(new WindowAdapter() {
       @Override
       public void windowClosing(WindowEvent e) {
         salir();
       }
     });
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        verContra = new javax.swing.JLabel();
        MostrarContra = new javax.swing.JCheckBox();
        PassWord = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        TypeUser = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Ingresar = new javax.swing.JButton();
        con = new javax.swing.JLabel();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setFocusCycleRoot(false);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        verContra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        verContra.setEnabled(false);
        verContra.setFocusable(false);

        MostrarContra.setBackground(new java.awt.Color(0, 0, 0));
        MostrarContra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        MostrarContra.setForeground(new java.awt.Color(102, 102, 102));
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

        PassWord.setBackground(new java.awt.Color(204, 204, 255));
        PassWord.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        PassWord.setForeground(new java.awt.Color(0, 0, 102));
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Configuracion2.jpg"))); // NOI18N

        TypeUser.setBackground(new java.awt.Color(204, 204, 255));
        TypeUser.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        TypeUser.setForeground(new java.awt.Color(0, 0, 102));
        TypeUser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador(Gerente)", "Vendedor(Empleado)" }));
        TypeUser.setToolTipText("Seleccione el tipo..");
        TypeUser.setBorder(null);
        TypeUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TypeUser.setFocusable(false);
        TypeUser.setName(""); // NOI18N
        TypeUser.setOpaque(false);
        TypeUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TypeUserKeyPressed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Password2.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/Originales/Perfil2.jpg"))); // NOI18N
        jLabel1.setText("ID DE USUARIO");
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);

        User.setBackground(new java.awt.Color(204, 204, 255));
        User.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        User.setForeground(new java.awt.Color(0, 0, 102));
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
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });
        User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UserKeyTyped(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Usuarios");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reconexion");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/cerrar.jpg"))); // NOI18N
        exit.setBorder(null);
        exit.setBorderPainted(false);
        exit.setContentAreaFilled(false);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/358.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        Ingresar.setBackground(new java.awt.Color(0, 0, 51));
        Ingresar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setText("Ingresar");
        Ingresar.setBorder(null);
        Ingresar.setBorderPainted(false);
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.setOpaque(false);
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        con.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        con.setForeground(new java.awt.Color(0, 102, 0));
        con.setText("Verifica la conexion");
        con.setEnabled(false);
        con.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(User))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PassWord))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(MostrarContra)
                                    .addComponent(TypeUser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(verContra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(PassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TypeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verContra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MostrarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        PassWord.getAccessibleContext().setAccessibleDescription("\n");
        TypeUser.getAccessibleContext().setAccessibleName("Seleccione el tipo");
        User.getAccessibleContext().setAccessibleName("");
        User.getAccessibleContext().setAccessibleDescription("El nombre del usuario\ntiene como maximo \n10 caracteres...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(307, 307, 307))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        
        if(ProyectoParcial3.getConnection()==null){
            JOptionPane.showMessageDialog(this,"Conexion A Base De Datos Necesaria. \n "
                    + "Establece una conexion y vuelve a intentarlo.");
        }
        else{
           if(ContraseñaTrue()==true){
                InicioAdmin menúPrincipal = new InicioAdmin();
                menúPrincipal.setLocationRelativeTo(null);
                menúPrincipal.setVisible(true);
                this.setVisible(false);
                this.dispose();
            }else{
                cleanField();
            }
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void UserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserKeyTyped
       char c=evt.getKeyChar();
        int CharLong=10;
        if(Character.isLetter(c)) {
            if(!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())){
                getToolkit().beep();
                evt.consume();
            }
        }
        if("-".equals(String.valueOf(c))||"'".equals(String.valueOf(c))||"+".equals(String.valueOf(c))
            ||"/".equals(String.valueOf(c))||".".equals(String.valueOf(c))||"*".equals(String.valueOf(c))
            ||"|".equals(String.valueOf(c))||"{".equals(String.valueOf(c))||"}".equals(String.valueOf(c))
            ||"~".equals(String.valueOf(c))||"^".equals(String.valueOf(c))||"`".equals(String.valueOf(c)))
        //AGREGAR MAS CARACTERES
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_UserKeyTyped

    private void PassWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassWordKeyPressed
        if(KeyEvent.VK_ENTER==evt.getKeyCode()){
        //this.OcultarTextoPassWord(evt);
        boolean sig=ContraseñaTrue();
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
        boolean sig=ContraseñaTrue();
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

   
   public static void setTextEstado(String nom){
       con.setText(nom);
   }
    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        usuarios USER = new usuarios();
        USER.setLocationRelativeTo(null);
        USER.setVisible(true);
        this.setVisible(false);
        if(ProyectoParcial3.getConnection()!=null){
            con.setText("Conectado");
        }else{
            con.setText("Desconectado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        cerrar();
    }//GEN-LAST:event_exitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         pan.getRegistro();   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       setExtendedState(JFrame.CROSSHAIR_CURSOR); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cerrar(){
       if(JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Exit", JOptionPane.YES_NO_OPTION)
        ==JOptionPane.NO_OPTION){
           cleanField();
       }else{
           System.exit(0);
       }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar;
    private javax.swing.JCheckBox MostrarContra;
    private javax.swing.JPasswordField PassWord;
    public static javax.swing.JComboBox TypeUser;
    public static javax.swing.JTextField User;
    private static javax.swing.JLabel con;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel verContra;
    // End of variables declaration//GEN-END:variables
}
