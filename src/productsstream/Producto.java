/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsstream;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author david
 */
public class Producto {
    
    private String codigo="";
    
   private String descripcion="";
    
   private double prezo=0;

    public Producto() {
    }
     
     
     public Producto(String c, String d,double p) {
         
         codigo=c;
         descripcion=d;
         prezo=p;
         
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descricion) {
        this.descripcion = descricion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Codigo:\t\t" + codigo + "\nDescripcion:\t" + descripcion + "\nPrezo:\t\t"
                + NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-ES")).format(prezo);
        //Formateo o atributo 'prezo' a euros (en español)
    }
    
     
     
     
    
}
    
    
    

