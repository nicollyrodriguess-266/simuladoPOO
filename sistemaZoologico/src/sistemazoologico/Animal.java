/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemazoologico;

/**
 *
 * @author ander
 */
public class Animal {
    String nome;
    int idade;
    String habitat;
    
    public Animal(String nome, int idade, String habitat){
    this.nome = nome;
    this.idade = idade;
    this.habitat = habitat;
    }
    
    public void emitirSom(){
    System.out.println("O animal emitiu esse som: " );
    }
    
    public void exibirInfo(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Tem " + this.idade + " anos");
    System.out.println("O habitat natural é " + this.habitat);
    }
}
