/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej4;

/**
 *
 * @author joterodelrio
 */
public class Boletin7Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persoa persoa1 = new Persoa();
        Persoa persoa2 = new Persoa();
        persoa1.pedirPersoa();
        persoa2.pedirPersoa();
        Persoa.mayorPeso(persoa1, persoa2);
    }
    
}
