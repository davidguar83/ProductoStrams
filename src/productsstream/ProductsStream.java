
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class ProductsStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Producto producto1 = new Producto("cod1", "parafusos", 3);
          Producto producto2 = new Producto("cod2", "cravos", 4);
          Producto po3 = new Producto();
          
        try {
            DataInputStream ler = new DataInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/productos.txt"));
            
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/productos.txt"));
            
            escribir.writeUTF(producto1.getCodigo());
            escribir.writeUTF(producto1.getDescricion());
            escribir.writeDouble(producto1.getPrezo());
            
             escribir.writeUTF(producto2.getCodigo());
            escribir.writeUTF(producto2.getDescricion());
            escribir.writeDouble(producto2.getPrezo());
            
            escribir.close();
           
            for (int i =0;i<2;i++){
            
            System.out.print(ler.readUTF()+ " ");
            
            }
            System.out.println(ler.readDouble());
            
            for (int j =0;j<2;j++){
                
                
                System.out.print(ler.readUTF()+ " ");
                
               
            }
            
             System.out.println(ler.readDouble());
                    
            
             ler.close();
             
             
        } catch (IOException e) {
            System.out.println("Error");
        }
            
           
            
        try {  
            DataInputStream lerpo3 = new DataInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/productos.txt"));
        
        po3.setCodigo(lerpo3.readUTF());
           po3.setDescricion(lerpo3.readUTF());
            po3.setPrezo(lerpo3.readDouble());
            
            System.out.print("po3 = "+po3.getCodigo()+ " ");
            System.out.print(po3.getDescricion()+ " ");
            System.out.println(po3.getPrezo());
            
            po3.setCodigo(lerpo3.readUTF());
           po3.setDescricion(lerpo3.readUTF());
            po3.setPrezo(lerpo3.readDouble());
            
            System.out.print("po3 = "+po3.getCodigo()+" ");
            System.out.print(po3.getDescricion()+" ");
            System.out.println(po3.getPrezo());
            
        
        } catch (IOException ex) {
            System.out.println("Error 2");;
        }
      
           
            
            
            
            
            
      
        
        
        
        
        
        
    }
    
}



    
   


