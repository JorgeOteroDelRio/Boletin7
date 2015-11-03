/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej2;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class SumaResta {
    
    private short n1;
    private short n2;
    
    public void pedirNumeros(){
        n1 = Short.parseShort(JOptionPane.showInputDialog("Introduce un número de tipo short:"));
        n2 = Short.parseShort(JOptionPane.showInputDialog("Introduce un número de tipo short:"));
    }
    
    public void comparar(){
        if(n1>=n2)
            JOptionPane.showMessageDialog(null, "El primer número es mayor por lo tanto la resta es: " + (n1-n2));
        
        JOptionPane.showMessageDialog(null, "La suma es " + (n1+n2));
    }
    
}
