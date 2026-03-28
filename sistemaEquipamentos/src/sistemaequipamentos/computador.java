/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaequipamentos;

/**
 *
 * @author Admin
 */
public class computador extends equipamentos{
    String processador;
    
    public computador(String nome, String modelo, String processador) {
        super(nome, modelo);
        
        this.processador = processador;
    }
    
    @Override
    public void exibirDados(){
    System.out.println("O nome do equipamento é " + this.nome);
    System.out.println("O modelo do equipamento é " + this.modelo);
    System.out.println("O tipo do processador é: " + this.processador);
}
}
