/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagamentos;

/**
 *
 * @author Admin
 */
public class pagamento {
    String status;
    int valor;
    
    public pagamento(String status, int valor){
        this.status = status;
        this.valor = valor;
    }
    
    public void processarPagamento(){
    System.out.println("Status de pagamento: " + this.status);
    System.out.println("Valor pendente: " + this.valor);
    }
    
    public void exibirStatus(){
    System.out.println("O status do pagamento é: " + this.status);
    }
}
