/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author adria
 */
public class superchino {
    
public static void main(String[] args) {
    codigoSuper datos[] new codigoSuper[1];
    
    imprimecodigoSuper(datos);
    analizacodigoSuper(datos);
    
   
        
    }
 
public static void imprimecodigoSuper(codigoSuper datos[]){
    for (int i = 0; i < datos.length; i++) {
        String nombre= JOptionPane.showInputDialog("Insertar codigo super " +(i+1));
        datos[i]=new codigo super(nombre,null,codigo);
        
        
        
    }
}

public static void analizacodigoSuper(codigo Super datos[]{
        for (int i = 0; i < datos.length; i++) {
            if (datos [i].clasificacion.equals("codigoSuper")){
                JOptionPane.showMessageDialog(null, "codigo super encontrado" + datos.toStrign());
                

        
    }
        
    }
}
   
    
    
         
}  
    

