/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.gym;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class Eliminar_Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Eliminar_Usuario
     */
    DefaultListModel lista=new DefaultListModel();
    public Eliminar_Usuario()
    {
        initComponents();
        this.jlistNombres.setModel(lista);
    }
    Conexion obj=new Conexion();
        //Declarar objetos de conexion
        Connection Conexion;
        //Realizar el lenguaje sql
        PreparedStatement consulta;
        //Almacena los datos de nuestra consulta
        ResultSet datos;
        String nom,Id;
        int i;
        OpcEliminar Opcion=new OpcEliminar();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jlistNombres = new javax.swing.JList();
        txtEliNombre = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        listaId = new java.awt.List();
        btnElimiBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Usuario");

        jlistNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlistNombresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jlistNombres);

        txtEliNombre.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtEliNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtEliNombre.setText("Ingrese Nombre");
        txtEliNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEliNombreMouseClicked(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        listaId.setVisible(false);

        btnElimiBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnElimiBuscar.setText("Buscar");
        btnElimiBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtEliNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnElimiBuscar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(69, 69, 69)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addComponent(listaId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(listaId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElimiBuscar)
                    .addComponent(txtEliNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void limpiarLista()
        {
            listaId.clear();//Limpiar la lista que esta oculta
            lista.clear();//Limpiar la lista que se muestra
        }
    private void jlistNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistNombresMouseClicked
        if(jlistNombres.getLastVisibleIndex()==-1)
        {
            btnEliminar.setEnabled(false);
        }else
        btnEliminar.setEnabled(true);
    }//GEN-LAST:event_jlistNombresMouseClicked

    private void txtEliNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEliNombreMouseClicked
        txtEliNombre.setText("");
        txtEliNombre.setForeground(Color.BLACK);
    }//GEN-LAST:event_txtEliNombreMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(jlistNombres.getSelectedIndex()<0)
        {
            JOptionPane.showMessageDialog(null,"Seleccione Uno Para Eliminarlo",null,JOptionPane.INFORMATION_MESSAGE);
        }else{         
            Id=listaId.getItem(jlistNombres.getSelectedIndex());
            nom=String.valueOf(jlistNombres.getSelectedValue());
            
        }
                
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnElimiBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiBuscarActionPerformed
        limpiarLista();
        i=0;
        nom=txtEliNombre.getText().toUpperCase();
        try {
            Conexion =(Connection) obj.getConnection("java","root","9013113479");
            consulta=Conexion.prepareStatement("SELECT * FROM java.usuarios WHERE Nombre LIKE \""+nom+"%\"");
            datos=consulta.executeQuery();
            while(datos.next())
            {

                lista.addElement(datos.getString("Nombre")+" "+datos.getString("Apellido"));
                listaId.add(datos.getString("Id"));
                i+=1;

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE);
        }finally
        {
            try {
                obj.Conexion.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex,"Error Conexion",JOptionPane.ERROR_MESSAGE);
            }
        }
        if(i==0)
        {
            JOptionPane.showMessageDialog(null,"Nombre No Encontrado",null,JOptionPane.INFORMATION_MESSAGE);
            btnEliminar.setEnabled(false);
        }
        txtEliNombre.setText("Ingrese Nombre");
        txtEliNombre.setForeground(Color.GRAY);
    }//GEN-LAST:event_btnElimiBuscarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElimiBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList jlistNombres;
    private java.awt.List listaId;
    private javax.swing.JTextField txtEliNombre;
    // End of variables declaration//GEN-END:variables
}
