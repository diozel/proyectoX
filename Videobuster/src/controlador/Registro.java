/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Pelicula;
import sql.Conexion;

/**
 *
 * @author cetecom
 */
public class Registro {

    public static boolean agregarPelicula(Pelicula pelicula) {
        try {
            Connection conexion = Conexion.getConexion();
            //String query = "INSERT INTO datos(rut,nombreUsuario, apellidoUsuario,numdeptoUsuario,montoGastos,tipoUsuario) VALUES (?,?,?,?,?,?)";
            String query = "INSERT INTO VM_PELICULA (codigo, precio, formato4K, nombre, idcategoria) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertar = conexion.prepareStatement(query);
            insertar.setInt(1, pelicula.getCodigo());
            insertar.setInt(2, pelicula.getPrecio());
            insertar.setString(3, pelicula.getFormato4K());
            insertar.setString(4, pelicula.getNombre());
            insertar.setInt(5, pelicula.getIdCategoria());

            insertar.execute();
            insertar.close();
            conexion.close();
            return true;
        } catch (SQLException s) {
            System.out.println("Error SQL al agregar pelicula" + s.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al agregar pelicula" + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarPelicula(int codigoAEliminar) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "DELETE FROM VM_PELICULA WHERE codigo=?";
            PreparedStatement eliminar = conexion.prepareStatement(query);
            eliminar.setInt(1, codigoAEliminar);

            eliminar.execute();
            eliminar.close();
            conexion.close();
            return true;
        } catch (SQLException s) {
            System.out.println("Error SQL al eliminar semilla" + s.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error al eliminar semilla" + e.getMessage());
            return false;
        }
    }
    
    
    public static boolean eliminarPelicula(Pelicula peli){
        
        
        
       try{
           Connection conexion = Conexion.getConexion();
           //String query = "INSERT INTO datos(rut,nombreUsuario, apellidoUsuario,numdeptoUsuario,montoGastos,tipoUsuario) VALUES (?,?,?,?,?,?)";
           //String query = "INSERT INTO semilla (nombre, precio, esFlor, alturaMaxima, codigo) VALUES (?, ?, ?, ?, ?)";
           int modCod = peli.getCodigo();
           String query = "UPDATE PELICULA SET PRECIO=?, FORMATO4K=?, NOMBRE=?, IDCATEGORIA=? WHERE CODIGO="+modCod+"";
           PreparedStatement insertar = conexion.prepareStatement(query);
           insertar.setInt(1, peli.getPrecio());
           insertar.setString(2, peli.getFormato4K());
           insertar.setString(3, peli.getNombre()); //0 porque es arbol
           insertar.setInt(4, peli.getIdCategoria());
           
           insertar.execute();
           insertar.close();
           conexion.close();
           return true;
       }catch(SQLException s){
           System.out.println("Error SQL al agregar arbol"+s.getMessage());
           return false;
       }catch(Exception e){
           System.out.println("Error al agregar arbol"+e.getMessage());
           return false;
       }

    }
    
    

 
}
