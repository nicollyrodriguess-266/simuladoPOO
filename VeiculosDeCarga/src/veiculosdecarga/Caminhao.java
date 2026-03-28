/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veiculosdecarga;

/**
 *
 * @author ander
 */
public class Caminhao extends Veiculo{
    int numEixos;
    
    public Caminhao(String marca, double capacidadeCarga, int numEixos) {
        super(marca, capacidadeCarga);
        this.numEixos = numEixos;
    }
    
    @Override
    public void exibirInfo(){
    System.out.println("A marca do veiculo e: " + this.marca);
    System.out.println("A capacidade de carga do veiculo e: " + this.capacidadeCarga);
    System.out.println("O numero de eixos do veiculo e: " + this.numEixos);
    }
}
