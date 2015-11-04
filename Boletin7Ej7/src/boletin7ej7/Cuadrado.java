/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej7;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Cuadrado {
    
    private float lado;
    
    public void introducirLado(){
        lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado"));
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del cuadrado es " + Math.pow(lado,2));
    }
    
}
