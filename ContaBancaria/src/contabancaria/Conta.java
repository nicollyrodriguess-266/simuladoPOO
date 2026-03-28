/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contabancaria;

/**
 *
 * @author ander
 */
public class Conta {
    int saldo;
    
    public Conta(int saldo){
    this.saldo=saldo;
    }
    
    public void depositar(double valor){
    saldo+=valor;
    System.out.println("O deposito foi de R$ " + valor);
    }
    
    public void sacar(double valor){
    if(valor<=saldo){
    saldo-=valor;
    System.out.println("Saque de R$ " + valor + " foi realizado realizado");
    }else{
        System.out.println("Saldo insuficiente para saque.");
    } 
    }
    public void exibirSaldo(){
    System.out.println("Saldo atual: R$ " + saldo);
    }
}
    