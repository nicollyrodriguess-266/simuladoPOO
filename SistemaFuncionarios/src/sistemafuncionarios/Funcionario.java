/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author ander
 */
public class Funcionario {
    String nome;
    double salario;
    
    public Funcionario(String nome,double salario){
    this.nome = nome;
    this.salario = salario;
    }
    
    public void exibirDados(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Salario: " + this.salario);
    }
}
