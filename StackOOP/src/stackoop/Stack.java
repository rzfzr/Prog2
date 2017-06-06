/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackoop;

import java.util.ArrayList;

/**
 *
 * @author rzfzr
 */
public class Stack<T> {
    
    ArrayList<Element> list;
    
    
    Stack(){
    
    list = new ArrayList();
    
    }
    
    public void stackUp(Element e){
        list.add(e);
    }
    public void stackDown(){
        if(!list.isEmpty()){
            list.remove(list.size());
        }  
    }
    public void printAll(){
        
        System.out.println("Elemento n0 : "+list.get(0));
    }
    
    
}
