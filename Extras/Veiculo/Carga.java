/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ALUNO
 */
public class Carga extends Veiculo {
    private int capacidade;
    
    public Carga(){
        super();
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade; 
    }
    
    public int getCapacidade(){
        return capacidade;
    }
}
