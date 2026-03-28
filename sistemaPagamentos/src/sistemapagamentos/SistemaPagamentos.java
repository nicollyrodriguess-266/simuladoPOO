/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapagamentos;

/**
 *
 * @author Admin
 */
public class SistemaPagamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pagamento p1 = new pagamento ("Pendente", 48);
        p1.exibirStatus();
        p1.processarPagamento();
        
        pagamentoCartao pc1 = new pagamentoCartao ("Concluido", 48, "4526-8");
        pc1.exibirStatus();
        pc1.processarPagamento();
    }
    
}
