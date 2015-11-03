/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej5;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Boletin7Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mayor.setN1(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
        Mayor.setN2(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
        Mayor.setN3(Integer.parseInt(JOptionPane.showInputDialog("Numero")));
        Mayor.comparar(Mayor.getN1(),Mayor.getN2(),Mayor.getN3());
    }
    
}
