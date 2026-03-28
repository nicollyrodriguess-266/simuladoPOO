/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemausuarios;

/**
 *
 * @author ander
 */
public class SistemaUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Usuario user1 = new Usuario("admin", "1234", "Administrador", true);

    if (user1.autenticar("1234")) {
    System.out.println("Usuário autenticado com sucesso!");
    } else {
        System.out.println("Falha na autenticação.");
    }

    user1.mostrarNivelAcesso();
    }
    
}
