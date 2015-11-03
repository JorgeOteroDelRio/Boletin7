/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7ej4;
import javax.swing.JOptionPane;
/**
 *
 * @author joterodelrio
 */
public class Persoa {


    private String nombre;
    private float peso;
    
    public Persoa(){}
    public Persoa(String nombre,float peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    
    public void pedirPersoa(){
        this.nombre = JOptionPane.showInputDialog("Introduce el nombre de la persona");
        this.peso =   Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso de la persona"));
    }
    
    public static void mayorPeso(Persoa persoa1,Persoa persoa2){
        if(persoa1.getPeso()>persoa2.getPeso()){
            JOptionPane.showMessageDialog(null, "La persona que tiene mayor peso es: " + persoa1.getNombre());
            JOptionPane.showMessageDialog(null, "La diferencia de peso es de " + (persoa1.getPeso()-persoa2.getPeso()) + " kg");
        }
        else if(persoa1.getPeso()<persoa2.getPeso()){
            JOptionPane.showMessageDialog(null, "La persona que tiene mayor peso es: " + persoa2.getNombre());
            JOptionPane.showMessageDialog(null, "La diferencia de peso es de " + (persoa2.getPeso()-persoa1.getPeso()) + " kg");
        }
        else
            JOptionPane.showMessageDialog(null, "Las dos personas pesan lo mismo");
            
    }
    
    public float getPeso() {
        return peso;
    }
    
    public String getNombre() {
        return nombre;
    }
    
}
