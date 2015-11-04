/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej6;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Artigo {
    private String nombre;
    private int ventas;
    
    public void pedirArtigo(){
        this.nombre = JOptionPane.showInputDialog("Nombre artigo");
        this.ventas = Integer.parseInt(JOptionPane.showInputDialog("Numero ventas"));
        if(ventas<=100)
            JOptionPane.showMessageDialog(null, "Artigo baixo");
        else if(ventas>100 && ventas <=500)
            JOptionPane.showMessageDialog(null, "Artigo medio");
        else if(ventas>500 && ventas<=1000)
            JOptionPane.showMessageDialog(null, "Artigo alto");
        else
            JOptionPane.showMessageDialog(null, "primeira necesidade");
    }
    
    
        
        
        
        
        
        
        
    }

