/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej1;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Numero {
    
    public static int pedirNumero(){
        return Integer.parseInt(JOptionPane.showInputDialog("Numero"));
    }
    
    public static void validarNumero(int n){
        if(n>0)
            JOptionPane.showMessageDialog(null, n + " es positivo");      
}
}
