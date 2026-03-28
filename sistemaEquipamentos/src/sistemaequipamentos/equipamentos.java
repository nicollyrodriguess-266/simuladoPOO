/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaequipamentos;

/**
 *
 * @author Admin
 */
public class equipamentos {
    String nome;
    String modelo;
    
    public equipamentos (String nome, String modelo){
    
        this.nome = nome;
        this.modelo = modelo;
        
    }
    
    public void exibirDados(){
    System.out.println("O nome do equipamento é " + this.nome);
    System.out.println("O modelo do equipamento é " + this.modelo);
    }
            
            
}
