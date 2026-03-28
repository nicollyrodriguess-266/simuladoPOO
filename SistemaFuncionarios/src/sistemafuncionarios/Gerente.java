/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafuncionarios;

/**
 *
 * @author ander
 */
public class Gerente extends Funcionario {
    String departamento;
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    @Override
    public void exibirDados(){
    System.out.println("Nome: " + this.nome);
    System.out.println("Salario: " + this.salario);
    System.out.println("Departamento: " + this.departamento);
    } 
}
