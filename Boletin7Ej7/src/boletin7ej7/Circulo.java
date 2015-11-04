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
public class Circulo {
    private float radio;
    
    public void introducirRadio(){
        radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio"));
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del circulo es " + radio*2*3.1416);
    }
}
