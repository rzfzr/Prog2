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
public class Caminhao extends Veiculo {

    @Override
    public double calcularIPVA() {
        if(ano<2002){
            return 0;      
            
        }else{            
            return (valor*0.035);
        }
    }
    
}
