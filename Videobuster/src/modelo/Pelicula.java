/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author cetecom
 */
public class Pelicula {
 private int codigo;
 private int precio;
 private String formato4K;
 private String nombre;
 private int idCategoria;

    public Pelicula(int codigo, int precio, String formato4K, String nombre, int idCategoria) {
        setCodigo(codigo);
        setPrecio(precio);
        setFormato4K(formato4K);
        setNombre(nombre);
        setIdCategoria(idCategoria);
    }

 
 
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
        if(codigo>=10000 && codigo<=99999)
        {
            this.codigo = codigo;
        }
        else
        {
            System.out.println("Ingrese un codigo entre 10000 y 99999");
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
        if(precio>=1000)
        {
           this.precio = precio; 
        }
        else
        {
            System.out.println("El monto debe ser mayor a 1000");
        }
    }

    public String getFormato4K() {
        return formato4K;
    }

    public void setFormato4K(String formato4K) {
        this.formato4K = formato4K;
        if(formato4K.equals("S")||formato4K.equals("N"))
        {
          this.formato4K = formato4K;  
        }
        else
        {
            System.out.println("Ingrese (S) si es 4K /(N) si no lo es ");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        if(nombre.length()>=3)
        {
           this.nombre = nombre; 
        }
        else
        {
            System.out.println("el nombre de la pelicula debe tener al menos 3 caracteres");
        }
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
 
 
}
