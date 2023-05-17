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
public class Veiculo {
    private String placa, marca;
    private int ano, kmInicial, kmFinal;
    private double modelo, valorKmRodado;
    
    public Veiculo(){
        
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(double modelo){
        this.modelo = modelo;
    }
    
    public void setValorKmRodado(double valorKmRodado){
        this.valorKmRodado = valorKmRodado;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public void setKmInicial(int kmInicial){
        this.kmInicial = kmInicial;
    }
    
    public void setKmFinal(int kmFinal){
        this.kmFinal = kmFinal;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public double getModelo(){
        return modelo;
    }
    
    public double getValorKmRodado(){
        return valorKmRodado;
    }
    
    public int getAno(){
        return ano;
    }
    
    public int getKmInicial(){
        return kmInicial;
    }
    
    public int getKmFinal(){
        return kmFinal;
    }
}
