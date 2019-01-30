
package Ventanas;

import AdministracionTotal.Conexion;
import AreaDeRecursosHumanos.EmpleadosLista;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class ListaEmpleados extends javax.swing.JFrame {

    private Conexion conexion= new Conexion();
    public ListaEmpleados() {
        initComponents();
        tableBusqueda();
    }

    public void tableBusqueda(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NO.");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellidos");
        modelo.addColumn("Puesto");
        modelo.addColumn("Antiguedad");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Sexo");
        modelo.addColumn("Edad");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Email");
        String por= comboOrdenar.getSelectedItem().toString();
        String order;
        if(comboAsc.getSelectedIndex()==0){
            order="asc";
        }else order="desc";
        try {
            ResultSet rs=conexion.getBusquedaEmp(por, order);
            while(rs.next()){
                Object []ob=new Object[11];//Crea un vector
            //para almacenar los valores del ResultSet
            ob[0]=(rs.getInt(1));
            ob[1]=(rs.getString(2));
            ob[2]=(rs.getString(3));
            ob[3]=(rs.getString(4));
            ob[4]=(rs.getString(5));
            ob[5]=(rs.getString(6));
            ob[6]=(rs.getString(7));
            ob[7]=(rs.getString(8));
            ob[8]=(rs.getString(9));
            ob[9]=(rs.getString(10));
            ob[10]=(rs.getString(11));
            //añado el modelo a la tabla
            modelo.addRow(ob);
            ob=null;//limpia los datos de el vector de la memoria
            }
            rs.close();//Cierra el ResultSet
        } catch (Exception ex) {
            Logger.getLogger(EmpleadosLista.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        Empleados.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboOrdenar = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        comboAsc = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        Empleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Lista de Empleados");

        comboOrdenar.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        comboOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NúmeroEmpleado", "nombre", "apellidos", "puesto", "antigüedad", "sueldo", "sexo", "edad", "domicilio", "e_mail" }));
        comboOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrdenarActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel17.setText("Ordenar Por:");

        jLabel18.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        jLabel18.setText("De Forma:");

        comboAsc.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        comboAsc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ascendente", "Descendente" }));
        comboAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAscActionPerformed(evt);
            }
        });

        Empleados.setForeground(new java.awt.Color(0, 51, 102));
        Empleados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(Empleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(869, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel17)
                            .addGap(4, 4, 4)
                            .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4)
                            .addComponent(jLabel18)
                            .addGap(4, 4, 4)
                            .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(450, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(79, 79, 79)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(comboOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel18))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(comboAsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(11, 11, 11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrdenarActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboOrdenarActionPerformed

    private void comboAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAscActionPerformed
        tableBusqueda();
    }//GEN-LAST:event_comboAscActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Empleados;
    private javax.swing.JComboBox comboAsc;
    private javax.swing.JComboBox comboOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
