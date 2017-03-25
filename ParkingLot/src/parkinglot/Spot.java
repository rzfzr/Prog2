/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkinglot;


public class Spot {//vaga
    
 /**
 *
 * @author rzfzr
 */

    boolean isUsed;//ocupado
    char block;//bloco, lado
    int id;//numero vaga
    Car car;//objeto carro
    
    Spot(){
        isUsed = false;
        block = ' ';
        id = 0;
        car = new Car();
    }
    
    void use(){//ocupa
        isUsed = true;
    }
    void unUse(){//desocupa
        isUsed = true;
    }
    String getSpotstate(){
        if(isUsed){
        return " ## |";
        }else{
        return "    |";
        }
        
    }
    
    @Override//override de toString
    public String toString(){
        return this.getSpotstate();
    }
    
}