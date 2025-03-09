/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package original;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author pedro
 */
public class Original {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> listaEnteros = new ArrayList <>();
        for (int i=0;i<10;i++){
            listaEnteros.add(i+1);
        }
        for (int i=0;i<10;i++){
            System.out.println(listaEnteros.get(i));
        }
    }
    
}
