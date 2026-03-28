/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemanotificacoes;

/**
 *
 * @author ander
 */
public class SistemaNotificacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Email email = new Email("nicolly@gmail.com", "Seu cadastro foi realizado com sucesso.");
    SMS sms = new SMS("11940028922", "Olá! Seu código foi enviado com sucesso.");

    System.out.println("=== EMAIL ===");
    email.Enviar();

    System.out.println("\n=== SMS ===");
    sms.Enviar();
    }    
}
    

