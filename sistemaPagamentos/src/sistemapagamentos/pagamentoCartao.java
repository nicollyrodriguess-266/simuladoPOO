/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagamentos;

/**
 *
 * @author Admin
 */
public class pagamentoCartao extends pagamento{
    
    String numCartao;
    
    public pagamentoCartao(String status, int valor, String numCartao) {
        super(status, valor);
        this.numCartao = numCartao;
    }
    
    @Override
     public void processarPagamento(){
    System.out.println("Status de pagamento: " + this.status);
    System.out.println("Valor pendente: " + this.valor);
    }
    
    @Override
    public void exibirStatus(){
    System.out.println("O status do pagamento é: " + this.status);
    System.out.println("O numero do cartao é: " + this.numCartao);
    } 
}
