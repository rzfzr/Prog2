/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author rzfzr
 */
public abstract class  Veiculo {
    String marca;
    String modelo;
    Float valor;
    int ano;
    
    
    
    
    public abstract double calcularIPVA();
    
    
    
}
