
package AdministracionTotal;
import Login.contraPrincipal;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoparcial3.ProyectoParcial3;

public class usuarios extends javax.swing.JFrame {
 
    private PanelBD1 pan= new PanelBD1();
    public usuarios() {
        
        initComponents();
        this.setBackground(Color.WHITE);
        thePanel.setVisible(false);
        theOtherPanel.setVisible(false);
        if (ProyectoParcial3.getConnection()==null){
            theOtherPanel.setVisible(true);
            thePanel.setVisible(false);
        }else{
            thePanel.setVisible(true);
            theOtherPanel.setVisible(false);
            generateTable();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        thePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ordenarPor = new javax.swing.JComboBox();
        deForma = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        theOtherPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        restart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/cerrar.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios registrados");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        thePanel.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setGridColor(new java.awt.Color(255, 255, 255));
        tabla.setSelectionBackground(new java.awt.Color(204, 204, 0));
        jScrollPane1.setViewportView(tabla);

        jLabel2.setText("En caso de haber olvidado su contraseña, favor de comunicarse con su jefe inmediato.");

        ordenarPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Número de usuario", "Nombre", "Tipo de usuario" }));
        ordenarPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarPorActionPerformed(evt);
            }
        });

        deForma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendiente", "Descendiente" }));
        deForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deFormaActionPerformed(evt);
            }
        });

        jLabel5.setText("Ordenar por:");

        jLabel6.setText("De forma:");

        javax.swing.GroupLayout thePanelLayout = new javax.swing.GroupLayout(thePanel);
        thePanel.setLayout(thePanelLayout);
        thePanelLayout.setHorizontalGroup(
            thePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thePanelLayout.createSequentialGroup()
                .addGroup(thePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thePanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(thePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(thePanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(deForma, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(thePanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        thePanelLayout.setVerticalGroup(
            thePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thePanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(thePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ordenarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        theOtherPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("¡Vaya! Tal parece que no estás conectado a la base de datos.");

        jLabel4.setText(" Haz clic en el siguiente botón para reiniciar la conexión:");

        restart.setBackground(new java.awt.Color(255, 255, 255));
        restart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesEmpresa/rest.png"))); // NOI18N
        restart.setText("Reiniciar la conexión");
        restart.setBorderPainted(false);
        restart.setContentAreaFilled(false);
        restart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout theOtherPanelLayout = new javax.swing.GroupLayout(theOtherPanel);
        theOtherPanel.setLayout(theOtherPanelLayout);
        theOtherPanelLayout.setHorizontalGroup(
            theOtherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(theOtherPanelLayout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(theOtherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(theOtherPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addGroup(theOtherPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(restart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        theOtherPanelLayout.setVerticalGroup(
            theOtherPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, theOtherPanelLayout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(restart)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(thePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(theOtherPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(theOtherPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordenarPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarPorActionPerformed
        generateTable();
    }//GEN-LAST:event_ordenarPorActionPerformed

    private void deFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deFormaActionPerformed
        generateTable();
    }//GEN-LAST:event_deFormaActionPerformed

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        pan.getRegistro();
        if (ProyectoParcial3.getConnection()!=null){
            thePanel.setVisible(true);
            theOtherPanel.setVisible(false);
            generateTable();
            JOptionPane.showMessageDialog(null,"Conexión establecida");
        }else{
            
        }
    }//GEN-LAST:event_restartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contraPrincipal launcher = new contraPrincipal();
        this.setVisible(false);
        this.dispose();
        launcher.setVisible(true);
        if(ProyectoParcial3.getConnection()!=null){
            contraPrincipal.setTextEstado("Conectado");
        }else{
           contraPrincipal.setTextEstado("Desconectado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    private void generateTable(){
        DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
           //all cells false
           return false;
        }
        };
        modelo.addColumn("Número de usuario");
        modelo.addColumn("Nombre");
        modelo.addColumn("Tipo de usuario");    
        String por="numEmpleado";
        int q= ordenarPor.getSelectedIndex();
        switch (q){
            case 0: por= "numEmpleado"; break;
            case 1: por= "nombre"; break;
            case 2: por= "tipoUsuario"; break;
        }
        String order;
        if(deForma.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try{
            ResultSet rs=ProyectoParcial3.getConexion().getUsuarios (por, order);
             while(rs.next()){
                 Object []ob=new Object[3];
                 ob[0]=(rs.getInt(3));
                 ob[1]=(rs.getString(5) + rs.getString(6));
                 ob[2]=(rs.getString(1));
                 modelo.addRow(ob);       
             }
             rs.close();      
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA O SALIDA DE DATOS  " + a, null, JOptionPane.ERROR_MESSAGE);   
        }
        tabla.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox deForma;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox ordenarPor;
    private javax.swing.JPanel panel;
    private javax.swing.JButton restart;
    private javax.swing.JTable tabla;
    private javax.swing.JPanel theOtherPanel;
    private javax.swing.JPanel thePanel;
    // End of variables declaration//GEN-END:variables
}
