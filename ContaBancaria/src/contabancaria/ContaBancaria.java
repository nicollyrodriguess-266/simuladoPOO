/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabancaria;

/**
 *
 * @author ander
 */
public class ContaBancaria {
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente cc1 = new ContaCorrente((int) 1100.0, 800.0);

        System.out.println("=== DADOS INICIAIS ===");
        cc1.exibirSaldo();
        cc1.exibirLimite();

        System.out.println("\n=== TENTANDO SACAR R$ 100,00 ===");
        cc1.sacar(100.0); 

        System.out.println("\n=== DADOS DO SAQUE ===");
        cc1.exibirSaldo();
    }
        
    }
    
