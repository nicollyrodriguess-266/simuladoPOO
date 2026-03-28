/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemazoologico;

/**
 *
 * @author ander
 */
public class SistemaZoologico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Leao l1 = new Leao("Simba", 5, "Savana");
        Arara a1 = new Arara("Luna", 2, "Floresta");

        System.out.println("=== LEÃO ===");
        l1.exibirInfo();
        l1.emitirSom();

        System.out.println("\n=== ARARA ===");
        a1.exibirInfo();
        a1.emitirSom();
    }
}
    
