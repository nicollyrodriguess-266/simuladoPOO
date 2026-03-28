/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculosdecarga;

/**
 *
 * @author ander
 */
public class Veiculo {
    String marca;
    double capacidadeCarga;
    
    public Veiculo(String marca, double capacidadeCarga){
    this.marca = marca;
    this.capacidadeCarga = capacidadeCarga;
    }
    
    public void exibirInfo(){
    System.out.println("A marca do veiculo e: " + this.marca);
    System.out.println("A capacidade de carga do veiculo e: " + this.capacidadeCarga);
    }
}
