/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackoop;

/**
 *
 * @author rzfzr
 */
public class Element<T> {
    
    public T data;
    
    Element(T d){
        data=d;     
        
    }
    
    @Override
    public String toString(){
        
     
        return data.toString();
    }
}
