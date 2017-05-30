/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rzfzr
 */
public interface Teste {
    
    public static void main(String args[]){
        
        ArrayList<Veiculo> frota = new ArrayList();
        
        int j=1;
        for(int i = 0;i<4;i++){
        
            if(i%2==0){
                frota.add(new Carro());
                System.out.print("Carro ano ");
            }else{
                frota.add(new Caminhao());
                System.out.print("Caminhao ano ");
                j++;
            }
        frota.get(i).ano = 2001*j;
        frota.get(i).valor=10000f*j;
        
        System.out.print(frota.get(i).ano+" de valor "+frota.get(i).valor+", IPVA sera de ");
        System.out.println(Double.toString(frota.get(i).calcularIPVA()));
            
        }
        
    }
}
