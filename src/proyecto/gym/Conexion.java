/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.gym;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author SONY
 */
public class Conexion {
    //Declarar objetos de conexion
    public Connection Conexion;
    //Realizar el lenguaje sql
    public PreparedStatement consulta; 
    //Almacena los datos de nuestra consulta
    public ResultSet datos;
    
    public Connection getConnection(String DB,String User,String Pwd)
    {
        try {
            //lamar a la clase de jdbc
            Class.forName("com.mysql.jdbc.Driver");
            String servidor="jdbc:mysql://localhost/"+DB;//hacer la conexion a la base de datos
            Conexion=DriverManager.getConnection(servidor,User,Pwd);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,e,"Error",JOptionPane.PLAIN_MESSAGE);
            Conexion=null;
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex,"Error Conexion DB",JOptionPane.ERROR_MESSAGE);
            Conexion=null;
        }
        return Conexion;       
    }
    public String select(String dato,String campo)
    {
         try {
            Conexion=(Connection) this.getConnection("gimnasio","root","");
            consulta=Conexion.prepareStatement("SELECT "+dato+" "+campo);
            datos=consulta.executeQuery();
            while(datos.next())
            {                
                dato=(datos.getString(campo));
            }
            Conexion.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return dato;
    }
    public boolean addAsistencia(String id,String fech,String pago)
    {
        boolean resp=true;
        try {
            Conexion=(Connection) this.getConnection("gimnasio","root","");
            String Query="INSERT INTO asistencia VALUES(\""+id+"\",\""+fech+"\",\""+pago+"\")";
            Statement st= Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"Datos Ingresados",null,JOptionPane.INFORMATION_MESSAGE);
            Conexion.close();
        } catch (SQLException e) { 
            if(e.toString().contains("Duplicate"))
            {
                JOptionPane.showMessageDialog(null, "El usuario Ya esta registrado",null,JOptionPane.WARNING_MESSAGE);
                resp=false;
            }
            else
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE); 
        }
        return resp;
        
    }
    public void addMensualidad(String Id,int dias,int cont,String FechIn)
    {
        try {
            Conexion=(Connection) this.getConnection("gimnasio","root","");
            String Query="INSERT INTO mensualidad VALUES(\""+Id+"\","+dias+","+cont+",\""+FechIn+"\")";
            Statement st= Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"Datos Ingresados",null,JOptionPane.INFORMATION_MESSAGE);
            Conexion.close();
        } catch (SQLException e) { 
            if(e.toString().contains("Duplicate"))
            {
                JOptionPane.showMessageDialog(null, "El usuario Ya esta registrado",null,JOptionPane.WARNING_MESSAGE);
            }
            else
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE); 
        }
    }
    public void agregar(String nom,String ape,String Id,String edad,String sexo,Integer peso,String fech)
    {
        try {
            Conexion=(Connection) this.getConnection("gimnasio","root","");
            String Query="INSERT INTO usuarios VALUES(\""+Id+"\",\""+nom+"\",\""+ape+"\",\""+edad
                    +"\",\""+sexo+"\","+peso+",\""+fech+"\")";
            Statement st= Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null,"Datos Ingresados");
            Conexion.close();
        } catch (SQLException e) {
            if(e.toString().contains("Duplicate entry"))            
                JOptionPane.showMessageDialog(null,"Ya Existe un Usuario Con El Mismo N° Id",null,JOptionPane.WARNING_MESSAGE);                 
            else
                JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE); 
        }
    }
    public String[] consulta()
    {
        String res[]=new String[6];       
        
        try {
            Conexion=(Connection) this.getConnection("gimnasio","root","");
            consulta=Conexion.prepareStatement("SELECT * FROM java.usuarios");
            datos=consulta.executeQuery();
            while(datos.next())
            {
                res[0]=datos.getString("Id");
                System.out.println(res[0]);
                res[1]=datos.getString("Nombre");
                System.out.println(res[1]);
                res[2]=datos.getString("Apellido");
                System.out.println(res[2]);
                res[3]=datos.getString("Edad");
                System.out.println(res[3]);
                res[4]=datos.getString("Peso");
                System.out.println(res[4]);
                res[5]=datos.getString("Fech");
                System.out.println(res[5]);                     
                /**System.out.println("Nombre = "+datos.getString("Nombre")+"\n"
                +"Apellido = "+datos.getString("Apellido")+"\n"
                +"Clave = "+datos.getString("Id"));**/
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e,"Error Conexion",JOptionPane.ERROR_MESSAGE);
        }finally
        {
            this.desconectar();
        }       
        return res;
    }
    public void desconectar()
    {
        try {
            Conexion.close();
            consulta.close();
            datos=null;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}