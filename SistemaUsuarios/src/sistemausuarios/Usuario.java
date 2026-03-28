/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemausuarios;

/**
 *
 * @author ander
 */
public class Usuario {
    String login;
    String senha;
    String nivelAcesso;
    boolean ativo;
    
   public Usuario(String login, String senha, String nivelAcesso, boolean ativo){
   this.login = login;
   this.senha = senha;
   this.nivelAcesso = nivelAcesso;
   this.ativo = ativo;
   }
   
   public void info(){
   System.out.println("Login: " + this.login);
   System.out.println("Nivel de acesso: " + this.nivelAcesso);
   }
   
    public boolean autenticar(String senhaInformada) {
    return senha.equals(senhaInformada) && ativo;
    }
   
   public void desativar(){
   ativo = false;
   }
   
   public void mostrarNivelAcesso(){
    System.out.println("Nivel de acesso: " + this.nivelAcesso);
   }
   
}
