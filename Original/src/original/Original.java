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
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        Random random = new Random();

        // Se generan 10 números aleatorios entre 1 y 100
        for (int i = 0; i < 10; i++) {
            int valorAleatorio = random.nextInt(100) + 1; // genera un entero entre 1 y 100
            listaEnteros.add(valorAleatorio);
        }
        
        // Se muestran los números en la consola
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
    }
    
}
