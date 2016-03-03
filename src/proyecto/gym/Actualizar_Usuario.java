/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto.gym;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author SONY
 */
public class Actualizar_Usuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Actualizar_Usuario
     */
    public Actualizar_Usuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd");//clase para formato de fecha
        Conexion obj=new Conexion();
        //Declarar objetos de conexion
        Connection Conexion;
        //Realizar el lenguaje sql
        PreparedStatement Consulta;
        //Almacena los datos de nuestra consulta
        ResultSet Datos;
        Date date;
        String Id,nom,ape,edad,sexo,fecha;        
        int peso;        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        txtSexo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtAId = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        dateChoFecha = new com.toedter.calendar.JDateChooser();
        lbFecha = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modificar Datos");

        btnActualizar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        txtSexo.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtSexo.setEnabled(false);
        txtSexo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSexoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSexoKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel16.setText("Sexo");

        jLabel15.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel15.setText("Fecha Inicio");

        jLabel14.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel14.setText("Peso");

        txtPeso.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtPeso.setEnabled(false);
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        txtEdad.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtEdad.setEnabled(false);
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel13.setText("Edad");

        jLabel12.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel12.setText("Apellidos");

        txtApellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtApellido.setEnabled(false);

        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNombre.setEnabled(false);
        txtNombre.setMinimumSize(new java.awt.Dimension(6, 25));
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel6.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel4.setText("N° ID");

        txtIdBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtIdBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdBuscarKeyTyped(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtAId.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        txtAId.setEnabled(false);
        txtAId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAIdKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jLabel17.setText("Id");

        dateChoFecha.setEnabled(false);
        dateChoFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dateChoFecha.setMinSelectableDate(new java.util.Date(946706468000L));

        lbFecha.setForeground(new java.awt.Color(204, 0, 0));
        lbFecha.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateChoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAId, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel4)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel17)
                        .addComponent(txtAId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(dateChoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void validarNumeros(java.awt.event.KeyEvent evt)//validacion solo numeros
    {
        String le= String.valueOf(evt.getKeyChar());

        if (le.matches("[a-zA-Z]"))//Validar solo los Numeros
        {
            evt.consume();//Le decimos que no los muestre
            getToolkit().beep();//Utilizamos para hacer escuchar un sonido
        }
    }
     public void conectar()
     {
         Conexion =(Connection) obj.getConnection("gimnasio","root","");
     }
     public void desconectar()
     {
        try {
            Conexion.close();
            Consulta.close();
            Datos=null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
     }
     public void LimpiarActualizacion()
    {
        txtIdBuscar.setEnabled(true);
        btnBuscar.setEnabled(true);                
        btnActualizar.setEnabled(false);
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtAId.setEnabled(false);
        txtEdad.setEnabled(false);
        txtPeso.setEnabled(false);
        txtSexo.setEnabled(false);
        dateChoFecha.setEnabled(false);
        dateChoFecha.setDate(null);
        txtNombre.setText("");
        txtApellido.setText("");
        txtAId.setText("");
        txtEdad.setText("");        
        txtPeso.setText("");
        txtSexo.setText("");        
        txtIdBuscar.requestFocus();
    }
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        nom=txtNombre.getText().toUpperCase();
        ape=txtApellido.getText().toUpperCase();
        Id=txtAId.getText();
        edad=txtEdad.getText();
        peso=Integer.parseInt(txtPeso.getText());
        sexo=txtSexo.getText().toUpperCase();
        if(dateChoFecha.getDate()==null)
            fecha=lbFecha.getText();
        else
            fecha=formato.format(dateChoFecha.getDate());
        try {
            conectar();
            String Query="UPDATE usuarios SET Id = \""+Id+"\", Nombre = \""+nom+"\", Apellido = \""+
            ape+"\", Edad = \""+edad+"\", Sexo = \""+sexo+"\", Edad = "+edad+
            ", Fech = \""+fecha+"\" WHERE Id =\""+txtIdBuscar.getText()+"\"";
            Statement st= Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"Datos Actualizados",null,JOptionPane.INFORMATION_MESSAGE);            
            txtIdBuscar.setText(txtAId.getText());
            LimpiarActualizacion();
            Conexion.close();
        } catch (SQLException e) {
            if(e.toString().contains("Duplicate entry"))            
                JOptionPane.showMessageDialog(null,"Ya Existe un Usuario Con El Mismo N° Id",null,JOptionPane.WARNING_MESSAGE);                 
            if(e.toString().contains("Incorrect date value"))
            {
                JOptionPane.showMessageDialog(null,"Para la Fecha de Inicio Debes Ingresar \n Ej: 2016-01-01 ",null,JOptionPane.WARNING_MESSAGE);
            }   
            else
                JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE); 
        }finally{
            desconectar();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtSexoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyTyped
        String le= String.valueOf(evt.getKeyChar());
        if(txtSexo.getText().length()>=1)
        {
            evt.consume();//Le decimos que no los muestre
            getToolkit().beep();
        }
        if (le.matches("[MmfF]"))//Validar solo los Numeros
        {}
        else
        {
            evt.consume();//Le decimos que no los muestre
            getToolkit().beep();//Utilizamos para hacer escuchar un sonido
        }
    }//GEN-LAST:event_txtSexoKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
         validarNumeros(evt);
        if(txtPeso.getText().length()>=3)
        {
            evt.consume();//Le decimos que no los muestre
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        validarNumeros(evt);
        if(txtEdad.getText().length()>=3)
        {
            evt.consume();//Le decimos que no los muestre
            getToolkit().beep();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtIdBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBuscarKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtIdBuscarKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Id=txtIdBuscar.getText();
        boolean res=false;
        try
        {
            conectar();
            Consulta=Conexion.prepareStatement("SELECT * FROM java.usuarios WHERE Id LIKE \""+Id+"\"");
            Datos=Consulta.executeQuery();
            while(Datos.next())
            {
                txtAId.setText(Datos.getString("Id"));
                txtNombre.setText(Datos.getString("Nombre"));
                txtApellido.setText(Datos.getString("Apellido"));
                txtEdad.setText(Datos.getString("Edad"));
                txtSexo.setText(Datos.getString("Sexo"));
                txtPeso.setText(Datos.getString("Peso"));
                lbFecha.setText(Datos.getString("Fech"));
                txtIdBuscar.setEnabled(false);
                btnBuscar.setEnabled(false);
                btnActualizar.setEnabled(true);
                txtNombre.setEnabled(true);
                txtApellido.setEnabled(true);
                txtAId.setEnabled(true);
                txtEdad.setEnabled(true);
                txtPeso.setEnabled(true);
                txtSexo.setEnabled(true);
                dateChoFecha.setEnabled(true);
                res=true;
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE);
        }finally
        {
            desconectar();
        }
        if (res==false)
        JOptionPane.showMessageDialog(null,"No Se Encontro Informacion  ","Error",JOptionPane.YES_OPTION);
        txtIdBuscar.requestFocus();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarActualizacion();
        txtIdBuscar.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtAIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAIdKeyTyped
        validarNumeros(evt);
    }//GEN-LAST:event_txtAIdKeyTyped

    private void txtIdBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdBuscarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            btnBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_txtIdBuscarKeyPressed
    private void txtSexoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSexoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            btnActualizarActionPerformed(null);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtSexoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser dateChoFecha;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JTextField txtAId;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtIdBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
