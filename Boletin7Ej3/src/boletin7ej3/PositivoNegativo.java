/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej3;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class PositivoNegativo {
    
    public static int pedirNumero(){
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        return n;
    }
    
    public static void comprobarAmbito(int n){
        if(n>0)
            JOptionPane.showMessageDialog(null,"El número es positivo");
        else if(n<0)
            JOptionPane.showMessageDialog(null,"El número es negativo");
        else
            JOptionPane.showMessageDialog(null,"El número es igual a 0");
    }
}
