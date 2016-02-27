/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.gym;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Mensualidad extends javax.swing.JInternalFrame {
    DefaultListModel lista=new DefaultListModel();
    public Mensualidad() {
        initComponents();
         this.jListNombres.setModel(lista);
    }
     SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");//una clase para agregarle el formato de la fecha
     Conexion obj=new Conexion();
        //Declarar objetos de conexion
        Connection Conexion;
        //Realizar el lenguaje sql
        PreparedStatement consulta;
        //Almacena los datos de nuestra consulta
        ResultSet datos;
        int i,cantidad,cont;
        String nom,Id,Fecha,FechaHoy;
        
        public void limpiarLista()
        {
            ListId.clear();//Limpiar la lista que esta oculta
            lista.clear();//Limpiar la lista que se muestra
        }
        public void AbilitaDesa(boolean res)
        {
           lbTipo.setEnabled(res);
           lbCant.setEnabled(res);
           lbCom.setEnabled(res);
           rdbtnDia.setEnabled(res);
           rdbtnMes.setEnabled(res);
           spnCant.setEnabled(res);
           dateChoFecha.setEnabled(res);
           btnGuardar.setEnabled(res);
           spnCant.setValue(1);
           dateChoFecha.setDate(null);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupPago = new javax.swing.ButtonGroup();
        txtNombre = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListNombres = new javax.swing.JList();
        ListId = new java.awt.List();
        lbTipo = new javax.swing.JLabel();
        rdbtnDia = new javax.swing.JRadioButton();
        rdbtnMes = new javax.swing.JRadioButton();
        lbCant = new javax.swing.JLabel();
        spnCant = new javax.swing.JSpinner();
        lbCom = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        dateChoFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);

        txtNombre.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Ingrese Nombre");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jListNombres.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jListNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListNombresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListNombres);

        ListId.setVisible(false);

        lbTipo.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        lbTipo.setText("Tipo de Pago");
        lbTipo.setEnabled(false);

        btnGrupPago.add(rdbtnDia);
        rdbtnDia.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rdbtnDia.setSelected(true);
        rdbtnDia.setText("Dias");
        rdbtnDia.setEnabled(false);

        btnGrupPago.add(rdbtnMes);
        rdbtnMes.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        rdbtnMes.setText("Meses");
        rdbtnMes.setEnabled(false);

        lbCant.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        lbCant.setText("Cantidad");
        lbCant.setEnabled(false);

        spnCant.setModel(new javax.swing.SpinnerNumberModel(1, 1, 29, 1));
        spnCant.setEnabled(false);

        lbCom.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        lbCom.setText("Comienza Desde la Fecha");
        lbCom.setEnabled(false);

        btnGuardar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        dateChoFecha.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addComponent(ListId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lbCom))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(lbTipo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdbtnDia)
                                        .addGap(38, 38, 38)
                                        .addComponent(rdbtnMes))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(lbCant))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(spnCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(btnGuardar)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateChoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(ListId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdbtnDia)
                                    .addComponent(rdbtnMes))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCant)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbCom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateChoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        limpiarLista();
        AbilitaDesa(false);
        i=0;
        nom=txtNombre.getText().toUpperCase();
        try {
            Conexion =(Connection) obj.getConnection("java","root","9013113479");
            consulta=Conexion.prepareStatement("SELECT * FROM java.usuarios WHERE Nombre LIKE \""+nom+"%\"");
            datos=consulta.executeQuery();
            while(datos.next())
            {
                lista.addElement(datos.getString("Nombre")+" "+datos.getString("Apellido"));
                ListId.add(datos.getString("Id"));
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
        }     
    }//GEN-LAST:event_btnBuscarActionPerformed
    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        txtNombre.setForeground(Color.BLACK);
        txtNombre.setText("");
    }//GEN-LAST:event_txtNombreMouseClicked
    private void jListNombresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListNombresMouseClicked
        if(jListNombres.getLastVisibleIndex()!=-1)
        {           
            FechaHoy=obj.select("current_date as","año");
            AbilitaDesa(true);
        }
    }//GEN-LAST:event_jListNombresMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Date dato;
        Id=ListId.getItem(jListNombres.getSelectedIndex());
        if(rdbtnMes.isSelected())        
            cantidad=Integer.parseInt(spnCant.getValue().toString())*30;                   
        else
            cantidad=Integer.parseInt(spnCant.getValue().toString());   
        try {
            dato=dateChoFecha.getDate();
            Fecha=formato.format(dato);
            System.out.println(FechaHoy+" "+Fecha);
            if(FechaHoy.equals(Fecha))
                cont=cantidad-1;
            else
                cont=cantidad;
            obj.addMensualidad(Id, cantidad, cont, Fecha);
            AbilitaDesa(false);
            limpiarLista();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingrese una fecha","Atencion",JOptionPane.INFORMATION_MESSAGE);
        }      
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            btnBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_txtNombreKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List ListId;
    private javax.swing.JButton btnBuscar;
    private javax.swing.ButtonGroup btnGrupPago;
    private javax.swing.JButton btnGuardar;
    private com.toedter.calendar.JDateChooser dateChoFecha;
    private javax.swing.JList jListNombres;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCant;
    private javax.swing.JLabel lbCom;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JRadioButton rdbtnDia;
    private javax.swing.JRadioButton rdbtnMes;
    private javax.swing.JSpinner spnCant;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
