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
public class Mayor {

    private static int n1;
    private static int n2;
    private static int n3;
    
    public static void comparar(int n1,int n2,int n3){
        if(n1>n2 && n1>n3)
            JOptionPane.showMessageDialog(null, "O número maior é o " + n1);
        else if(n2>n1 && n2>n3)
            JOptionPane.showMessageDialog(null, "O número maior é o " + n2);
        else if(n3>n1 && n3>n2)
            JOptionPane.showMessageDialog(null, "O número maior é o " + n3);
        else
            JOptionPane.showMessageDialog(null, "O número maior está repetido");
    }
    
    public static void setN1(int n1) {
        Mayor.n1 = n1;
    }

    public static void setN2(int n2) {
        Mayor.n2 = n2;
    }

    public static void setN3(int n3) {
        Mayor.n3 = n3;
    }
    
    public static int getN1() {
        return n1;
    }

    public static int getN2() {
        return n2;
    }

    public static int getN3() {
        return n3;
    }
}
