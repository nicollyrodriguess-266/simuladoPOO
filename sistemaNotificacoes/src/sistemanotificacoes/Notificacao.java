/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemanotificacoes;

/**
 *
 * @author ander
 */
public class Notificacao {
    String destinatario;
    String mensagem;
    
    public Notificacao (String destinatario, String mensagem){
    this.destinatario = destinatario;
    this.mensagem = mensagem;
    }
    
    public void Enviar(){
    System.out.println("Enviado para " + this.destinatario);
    System.out.println("Mensagem: " + this.mensagem);
    }
}
