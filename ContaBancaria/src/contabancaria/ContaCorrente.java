/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author ander
 */
public class ContaCorrente extends Conta {
    
    double limite;
    
    public ContaCorrente(int saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }
    
   
    
    @Override
     public void depositar(double valor){
    saldo+=valor;
    System.out.println("O deposito foi de R$ " + valor);
    }
   

    @Override
    public void exibirSaldo(){
    System.out.println("Saldo atual: R$ " + saldo);
    }
    
    public void exibirLimite() {
    System.out.println("Limite disponivel: R$ " + limite); 
    }
    
    @Override
    public void sacar(double valor) { 
    if (valor <= saldo + limite) 
    { saldo -= valor; 
    System.out.println("Saque de R$ " + valor + " realizado com sucesso."); 
    } else { 
    System.out.println("Saque não permitido. Limite excedido."); 
    } 
    }
}
