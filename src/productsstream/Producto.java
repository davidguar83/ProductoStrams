/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsstream;

/**
 *
 * @author david
 */
public class Producto {
    
    private String codigo="";
    
   private String descricion="";
    
   private double prezo=0;

    public Producto() {
    }
     
     
     public Producto(String c, String d,int p) {
         
         codigo=c;
         descricion=d;
         prezo=p;
         
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "codigo= " + codigo + ", descricion= " + descricion + ", prezo= " + prezo ;
    }
    
     
     
     
    
}
    
    
    
