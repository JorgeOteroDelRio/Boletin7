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
public class Triangulo {
    private float base;
    private float altura;
    
    public void introducirBaseAltura(){
        base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura"));
    }
    
    public void calcularArea(){
        JOptionPane.showMessageDialog(null, "El area del triangulo es " + base*altura/2);
    }
}
