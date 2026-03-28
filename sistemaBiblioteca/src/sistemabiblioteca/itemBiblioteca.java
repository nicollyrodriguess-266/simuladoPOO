/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabiblioteca;

/**
 *
 * @author Admin
 */
public class itemBiblioteca {
    String nomeLivro;
    String autorLivro;
    
    public itemBiblioteca(String nomeLivro, String autorLivro){
    this.nomeLivro = nomeLivro;
    this.autorLivro = autorLivro;
    }
    
    public void exbirDetalhes(){
    System.out.println("o nome do livro é: " + this.nomeLivro);
    System.out.println("o autor do livro é: " + this.autorLivro);
    }
}
